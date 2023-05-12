package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariablesArray extends StObject {
  
  var total_count: Double
  
  var variables: js.Array[NameSelectedrepositoriesurl]
}
object VariablesArray {
  
  inline def apply(total_count: Double, variables: js.Array[NameSelectedrepositoriesurl]): VariablesArray = {
    val __obj = js.Dynamic.literal(total_count = total_count.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariablesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VariablesArray] (val x: Self) extends AnyVal {
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: js.Array[NameSelectedrepositoriesurl]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(value: NameSelectedrepositoriesurl*): Self = StObject.set(x, "variables", js.Array(value*))
  }
}
