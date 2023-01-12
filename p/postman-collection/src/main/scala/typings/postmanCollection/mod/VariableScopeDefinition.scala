package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableScopeDefinition
  extends StObject
     with PropertyDefinition {
  
  var values: js.UndefOr[js.Array[VariableDefinition]] = js.undefined
}
object VariableScopeDefinition {
  
  inline def apply(): VariableScopeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariableScopeDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VariableScopeDefinition] (val x: Self) extends AnyVal {
    
    inline def setValues(value: js.Array[VariableDefinition]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: VariableDefinition*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
