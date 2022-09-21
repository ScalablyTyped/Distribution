package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentidOwnerRepo extends StObject {
  
  var path: CommentidOwnerRepo
}
object PathCommentidOwnerRepo {
  
  inline def apply(path: CommentidOwnerRepo): PathCommentidOwnerRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentidOwnerRepo]
  }
  
  extension [Self <: PathCommentidOwnerRepo](x: Self) {
    
    inline def setPath(value: CommentidOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
