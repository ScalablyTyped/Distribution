package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequiredworkflowsArrayTotalcountNumber extends StObject {
  
  var required_workflows: js.Array[Sourcerepository]
  
  var total_count: Double
}
object RequiredworkflowsArrayTotalcountNumber {
  
  inline def apply(required_workflows: js.Array[Sourcerepository], total_count: Double): RequiredworkflowsArrayTotalcountNumber = {
    val __obj = js.Dynamic.literal(required_workflows = required_workflows.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredworkflowsArrayTotalcountNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredworkflowsArrayTotalcountNumber] (val x: Self) extends AnyVal {
    
    inline def setRequired_workflows(value: js.Array[Sourcerepository]): Self = StObject.set(x, "required_workflows", value.asInstanceOf[js.Any])
    
    inline def setRequired_workflowsVarargs(value: Sourcerepository*): Self = StObject.set(x, "required_workflows", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
