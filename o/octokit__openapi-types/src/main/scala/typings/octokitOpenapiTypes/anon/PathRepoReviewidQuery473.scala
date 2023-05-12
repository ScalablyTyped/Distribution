package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoReviewidQuery473 extends StObject {
  
  var path: RepoReviewid
  
  var query: `473`
}
object PathRepoReviewidQuery473 {
  
  inline def apply(path: RepoReviewid, query: `473`): PathRepoReviewidQuery473 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoReviewidQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepoReviewidQuery473] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoReviewid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `473`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
