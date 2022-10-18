package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoReviewidQuery250 extends StObject {
  
  var path: RepoReviewid
  
  var query: `250`
}
object PathRepoReviewidQuery250 {
  
  inline def apply(path: RepoReviewid, query: `250`): PathRepoReviewidQuery250 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoReviewidQuery250]
  }
  
  extension [Self <: PathRepoReviewidQuery250](x: Self) {
    
    inline def setPath(value: RepoReviewid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `250`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
