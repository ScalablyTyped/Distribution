package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequiredworkflowsArray extends StObject {
  
  var required_workflows: js.Array[NamePath]
  
  var total_count: Double
}
object RequiredworkflowsArray {
  
  inline def apply(required_workflows: js.Array[NamePath], total_count: Double): RequiredworkflowsArray = {
    val __obj = js.Dynamic.literal(required_workflows = required_workflows.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredworkflowsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredworkflowsArray] (val x: Self) extends AnyVal {
    
    inline def setRequired_workflows(value: js.Array[NamePath]): Self = StObject.set(x, "required_workflows", value.asInstanceOf[js.Any])
    
    inline def setRequired_workflowsVarargs(value: NamePath*): Self = StObject.set(x, "required_workflows", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
