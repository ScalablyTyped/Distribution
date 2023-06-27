package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPullnumberRepoQuery extends StObject {
  
  var path: PullnumberRepo
  
  var query: js.UndefOr[PerpageSinceSort] = js.undefined
}
object PathPullnumberRepoQuery {
  
  inline def apply(path: PullnumberRepo): PathPullnumberRepoQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPullnumberRepoQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPullnumberRepoQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: PullnumberRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageSinceSort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
