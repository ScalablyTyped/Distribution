package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoWorkflowid extends StObject {
  
  var path: RepoWorkflowid
}
object PathRepoWorkflowid {
  
  inline def apply(path: RepoWorkflowid): PathRepoWorkflowid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoWorkflowid]
  }
  
  extension [Self <: PathRepoWorkflowid](x: Self) {
    
    inline def setPath(value: RepoWorkflowid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
