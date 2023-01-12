package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoReviewidQuery407 extends StObject {
  
  var path: RepoReviewid
  
  var query: `407`
}
object PathRepoReviewidQuery407 {
  
  inline def apply(path: RepoReviewid, query: `407`): PathRepoReviewidQuery407 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoReviewidQuery407]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepoReviewidQuery407] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoReviewid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `407`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
