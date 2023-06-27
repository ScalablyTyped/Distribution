package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentidOwnerQuery extends StObject {
  
  var path: CommentidOwner
  
  var query: js.UndefOr[ContentPage] = js.undefined
}
object PathCommentidOwnerQuery {
  
  inline def apply(path: CommentidOwner): PathCommentidOwnerQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentidOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCommentidOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: CommentidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ContentPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
