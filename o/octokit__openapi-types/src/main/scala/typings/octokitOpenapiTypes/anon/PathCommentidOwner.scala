package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentidOwner extends StObject {
  
  var path: CommentidOwner
}
object PathCommentidOwner {
  
  inline def apply(path: CommentidOwner): PathCommentidOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCommentidOwner] (val x: Self) extends AnyVal {
    
    inline def setPath(value: CommentidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
