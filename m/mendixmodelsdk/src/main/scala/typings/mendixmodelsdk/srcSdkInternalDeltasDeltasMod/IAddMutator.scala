package typings.mendixmodelsdk.srcSdkInternalDeltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.ADD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAddMutator
  extends StObject
     with Mutator {
  
  var insertionIndex: js.UndefOr[Double] = js.undefined
  
  var mutatorType: ADD
  
  var value: PrimitiveValue
}
object IAddMutator {
  
  inline def apply(value: PrimitiveValue): IAddMutator = {
    val __obj = js.Dynamic.literal(mutatorType = "ADD", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddMutator]
  }
  
  extension [Self <: IAddMutator](x: Self) {
    
    inline def setInsertionIndex(value: Double): Self = StObject.set(x, "insertionIndex", value.asInstanceOf[js.Any])
    
    inline def setInsertionIndexUndefined: Self = StObject.set(x, "insertionIndex", js.undefined)
    
    inline def setMutatorType(value: ADD): Self = StObject.set(x, "mutatorType", value.asInstanceOf[js.Any])
    
    inline def setValue(value: PrimitiveValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
