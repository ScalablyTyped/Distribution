package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentidOwnerQueryContentPage extends StObject {
  
  var path: CommentidOwner
  
  var query: ContentPage
}
object PathCommentidOwnerQueryContentPage {
  
  inline def apply(path: CommentidOwner, query: ContentPage): PathCommentidOwnerQueryContentPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentidOwnerQueryContentPage]
  }
  
  extension [Self <: PathCommentidOwnerQueryContentPage](x: Self) {
    
    inline def setPath(value: CommentidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ContentPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
