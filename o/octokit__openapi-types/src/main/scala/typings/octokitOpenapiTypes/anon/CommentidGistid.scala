package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentidGistid extends StObject {
  
  var comment_id: Double
  
  var gist_id: String
}
object CommentidGistid {
  
  inline def apply(comment_id: Double, gist_id: String): CommentidGistid = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentidGistid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentidGistid] (val x: Self) extends AnyVal {
    
    inline def setComment_id(value: Double): Self = StObject.set(x, "comment_id", value.asInstanceOf[js.Any])
    
    inline def setGist_id(value: String): Self = StObject.set(x, "gist_id", value.asInstanceOf[js.Any])
  }
}
