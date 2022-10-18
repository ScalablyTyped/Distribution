package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentidOwnerRepoQuery374 extends StObject {
  
  var path: CommentidOwnerRepo
  
  var query: `374`
}
object PathCommentidOwnerRepoQuery374 {
  
  inline def apply(path: CommentidOwnerRepo, query: `374`): PathCommentidOwnerRepoQuery374 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentidOwnerRepoQuery374]
  }
  
  extension [Self <: PathCommentidOwnerRepoQuery374](x: Self) {
    
    inline def setPath(value: CommentidOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `374`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
