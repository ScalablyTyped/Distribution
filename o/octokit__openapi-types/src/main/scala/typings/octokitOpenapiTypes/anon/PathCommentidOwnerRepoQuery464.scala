package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentidOwnerRepoQuery464 extends StObject {
  
  var path: CommentidOwnerRepo
  
  var query: `464`
}
object PathCommentidOwnerRepoQuery464 {
  
  inline def apply(path: CommentidOwnerRepo, query: `464`): PathCommentidOwnerRepoQuery464 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentidOwnerRepoQuery464]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCommentidOwnerRepoQuery464] (val x: Self) extends AnyVal {
    
    inline def setPath(value: CommentidOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `464`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
