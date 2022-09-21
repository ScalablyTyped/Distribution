package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentidOwnerRepoQuery481 extends StObject {
  
  var path: CommentidOwnerRepo
  
  var query: `481`
}
object PathCommentidOwnerRepoQuery481 {
  
  inline def apply(path: CommentidOwnerRepo, query: `481`): PathCommentidOwnerRepoQuery481 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentidOwnerRepoQuery481]
  }
  
  extension [Self <: PathCommentidOwnerRepoQuery481](x: Self) {
    
    inline def setPath(value: CommentidOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `481`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
