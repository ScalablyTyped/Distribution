package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPullnumberRepoQueryPerpageSinceSort extends StObject {
  
  var path: PullnumberRepo
  
  var query: PerpageSinceSort
}
object PathPullnumberRepoQueryPerpageSinceSort {
  
  inline def apply(path: PullnumberRepo, query: PerpageSinceSort): PathPullnumberRepoQueryPerpageSinceSort = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPullnumberRepoQueryPerpageSinceSort]
  }
  
  extension [Self <: PathPullnumberRepoQueryPerpageSinceSort](x: Self) {
    
    inline def setPath(value: PullnumberRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageSinceSort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
