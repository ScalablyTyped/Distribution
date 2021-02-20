package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.ADD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAddMutator extends Mutator {
  
  var insertionIndex: js.UndefOr[Double] = js.native
  
  var mutatorType: ADD = js.native
  
  var value: PrimitiveValue = js.native
}
object IAddMutator {
  
  @scala.inline
  def apply(mutatorType: ADD, value: PrimitiveValue): IAddMutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddMutator]
  }
  
  @scala.inline
  implicit class IAddMutatorMutableBuilder[Self <: IAddMutator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertionIndex(value: Double): Self = StObject.set(x, "insertionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertionIndexUndefined: Self = StObject.set(x, "insertionIndex", js.undefined)
    
    @scala.inline
    def setMutatorType(value: ADD): Self = StObject.set(x, "mutatorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: PrimitiveValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
