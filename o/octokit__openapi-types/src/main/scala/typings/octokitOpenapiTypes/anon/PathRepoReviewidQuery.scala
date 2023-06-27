package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoReviewidQuery extends StObject {
  
  var path: RepoReviewid
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathRepoReviewidQuery {
  
  inline def apply(path: RepoReviewid): PathRepoReviewidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoReviewidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepoReviewidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoReviewid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
