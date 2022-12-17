package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPullnumberRepoQuery407 extends StObject {
  
  var path: PullnumberRepo
  
  var query: `407`
}
object PathPullnumberRepoQuery407 {
  
  inline def apply(path: PullnumberRepo, query: `407`): PathPullnumberRepoQuery407 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPullnumberRepoQuery407]
  }
  
  extension [Self <: PathPullnumberRepoQuery407](x: Self) {
    
    inline def setPath(value: PullnumberRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `407`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
