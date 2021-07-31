package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.CHANGE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChangeMutator
  extends StObject
     with Mutator {
  
  var mutatorType: CHANGE
  
  var updateIndex: js.UndefOr[Double] = js.undefined
  
  var value: PrimitiveValue | Null
}
object IChangeMutator {
  
  @scala.inline
  def apply(): IChangeMutator = {
    val __obj = js.Dynamic.literal(mutatorType = "CHANGE", value = null)
    __obj.asInstanceOf[IChangeMutator]
  }
  
  @scala.inline
  implicit class IChangeMutatorMutableBuilder[Self <: IChangeMutator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMutatorType(value: CHANGE): Self = StObject.set(x, "mutatorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateIndex(value: Double): Self = StObject.set(x, "updateIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateIndexUndefined: Self = StObject.set(x, "updateIndex", js.undefined)
    
    @scala.inline
    def setValue(value: PrimitiveValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
  }
}
