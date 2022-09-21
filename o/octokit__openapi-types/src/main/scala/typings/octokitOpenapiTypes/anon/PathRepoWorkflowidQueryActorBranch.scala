package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoWorkflowidQueryActorBranch extends StObject {
  
  var path: RepoWorkflowid
  
  var query: ActorBranch
}
object PathRepoWorkflowidQueryActorBranch {
  
  inline def apply(path: RepoWorkflowid, query: ActorBranch): PathRepoWorkflowidQueryActorBranch = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoWorkflowidQueryActorBranch]
  }
  
  extension [Self <: PathRepoWorkflowidQueryActorBranch](x: Self) {
    
    inline def setPath(value: RepoWorkflowid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ActorBranch): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
