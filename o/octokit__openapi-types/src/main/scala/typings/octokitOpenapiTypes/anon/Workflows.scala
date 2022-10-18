package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workflows extends StObject {
  
  var total_count: Double
  
  var workflows: js.Array[Badgeurl]
}
object Workflows {
  
  inline def apply(total_count: Double, workflows: js.Array[Badgeurl]): Workflows = {
    val __obj = js.Dynamic.literal(total_count = total_count.asInstanceOf[js.Any], workflows = workflows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workflows]
  }
  
  extension [Self <: Workflows](x: Self) {
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setWorkflows(value: js.Array[Badgeurl]): Self = StObject.set(x, "workflows", value.asInstanceOf[js.Any])
    
    inline def setWorkflowsVarargs(value: Badgeurl*): Self = StObject.set(x, "workflows", js.Array(value*))
  }
}
