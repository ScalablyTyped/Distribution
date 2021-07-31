package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentThreadReplies extends StObject {
  
  /** A limited number of replies. Unless the number of replies returned equals total_reply_count in the snippet the returned replies are only a subset of the total number of replies. */
  var comments: js.UndefOr[js.Array[Comment]] = js.undefined
}
object CommentThreadReplies {
  
  @scala.inline
  def apply(): CommentThreadReplies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentThreadReplies]
  }
  
  @scala.inline
  implicit class CommentThreadRepliesMutableBuilder[Self <: CommentThreadReplies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[Comment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: Comment*): Self = StObject.set(x, "comments", js.Array(value :_*))
  }
}
