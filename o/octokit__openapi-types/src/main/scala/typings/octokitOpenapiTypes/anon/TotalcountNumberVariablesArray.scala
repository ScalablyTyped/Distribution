package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalcountNumberVariablesArray extends StObject {
  
  var total_count: Double
  
  var variables: js.Array[UpdatedatValue]
}
object TotalcountNumberVariablesArray {
  
  inline def apply(total_count: Double, variables: js.Array[UpdatedatValue]): TotalcountNumberVariablesArray = {
    val __obj = js.Dynamic.literal(total_count = total_count.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotalcountNumberVariablesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TotalcountNumberVariablesArray] (val x: Self) extends AnyVal {
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: js.Array[UpdatedatValue]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(value: UpdatedatValue*): Self = StObject.set(x, "variables", js.Array(value*))
  }
}
