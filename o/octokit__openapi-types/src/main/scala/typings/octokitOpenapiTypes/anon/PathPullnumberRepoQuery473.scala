package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPullnumberRepoQuery473 extends StObject {
  
  var path: PullnumberRepo
  
  var query: `473`
}
object PathPullnumberRepoQuery473 {
  
  inline def apply(path: PullnumberRepo, query: `473`): PathPullnumberRepoQuery473 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPullnumberRepoQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPullnumberRepoQuery473] (val x: Self) extends AnyVal {
    
    inline def setPath(value: PullnumberRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `473`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
