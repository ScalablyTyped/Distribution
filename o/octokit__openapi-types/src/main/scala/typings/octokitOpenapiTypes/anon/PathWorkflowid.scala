package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathWorkflowid extends StObject {
  
  var path: Workflowid
}
object PathWorkflowid {
  
  inline def apply(path: Workflowid): PathWorkflowid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathWorkflowid]
  }
  
  extension [Self <: PathWorkflowid](x: Self) {
    
    inline def setPath(value: Workflowid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
