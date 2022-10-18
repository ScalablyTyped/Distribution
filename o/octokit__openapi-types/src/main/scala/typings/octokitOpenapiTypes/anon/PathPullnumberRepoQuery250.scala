package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPullnumberRepoQuery250 extends StObject {
  
  var path: PullnumberRepo
  
  var query: `250`
}
object PathPullnumberRepoQuery250 {
  
  inline def apply(path: PullnumberRepo, query: `250`): PathPullnumberRepoQuery250 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPullnumberRepoQuery250]
  }
  
  extension [Self <: PathPullnumberRepoQuery250](x: Self) {
    
    inline def setPath(value: PullnumberRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `250`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
