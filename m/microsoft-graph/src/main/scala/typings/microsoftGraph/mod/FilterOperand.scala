package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterOperand extends StObject {
  
  var values: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object FilterOperand {
  
  inline def apply(): FilterOperand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOperand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterOperand] (val x: Self) extends AnyVal {
    
    inline def setValues(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
