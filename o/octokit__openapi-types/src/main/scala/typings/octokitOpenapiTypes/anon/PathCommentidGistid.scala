package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentidGistid extends StObject {
  
  var path: CommentidGistid
}
object PathCommentidGistid {
  
  inline def apply(path: CommentidGistid): PathCommentidGistid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentidGistid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCommentidGistid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: CommentidGistid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
