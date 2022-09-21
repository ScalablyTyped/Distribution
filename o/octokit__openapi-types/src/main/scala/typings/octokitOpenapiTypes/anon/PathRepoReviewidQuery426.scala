package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoReviewidQuery426 extends StObject {
  
  var path: RepoReviewid
  
  var query: `426`
}
object PathRepoReviewidQuery426 {
  
  inline def apply(path: RepoReviewid, query: `426`): PathRepoReviewidQuery426 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoReviewidQuery426]
  }
  
  extension [Self <: PathRepoReviewidQuery426](x: Self) {
    
    inline def setPath(value: RepoReviewid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
