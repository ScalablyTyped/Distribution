package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentidOwnerRepoQuery extends StObject {
  
  var path: CommentidOwnerRepo
  
  var query: js.UndefOr[`627`] = js.undefined
}
object PathCommentidOwnerRepoQuery {
  
  inline def apply(path: CommentidOwnerRepo): PathCommentidOwnerRepoQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentidOwnerRepoQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCommentidOwnerRepoQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: CommentidOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `627`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
