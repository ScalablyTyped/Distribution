package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPullnumberRepoQuery426 extends StObject {
  
  var path: PullnumberRepo
  
  var query: `426`
}
object PathPullnumberRepoQuery426 {
  
  inline def apply(path: PullnumberRepo, query: `426`): PathPullnumberRepoQuery426 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPullnumberRepoQuery426]
  }
  
  extension [Self <: PathPullnumberRepoQuery426](x: Self) {
    
    inline def setPath(value: PullnumberRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
