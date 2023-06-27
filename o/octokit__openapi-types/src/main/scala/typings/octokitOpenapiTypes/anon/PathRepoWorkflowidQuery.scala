package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoWorkflowidQuery extends StObject {
  
  var path: RepoWorkflowid
  
  var query: js.UndefOr[ActorBranch] = js.undefined
}
object PathRepoWorkflowidQuery {
  
  inline def apply(path: RepoWorkflowid): PathRepoWorkflowidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoWorkflowidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepoWorkflowidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoWorkflowid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ActorBranch): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
