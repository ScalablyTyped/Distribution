package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoWorkflowidQueryCreated extends StObject {
  
  var path: RepoWorkflowid
  
  var query: Created
}
object PathRepoWorkflowidQueryCreated {
  
  inline def apply(path: RepoWorkflowid, query: Created): PathRepoWorkflowidQueryCreated = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoWorkflowidQueryCreated]
  }
  
  extension [Self <: PathRepoWorkflowidQueryCreated](x: Self) {
    
    inline def setPath(value: RepoWorkflowid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Created): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
