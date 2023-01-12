package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the CommentReply object, for use in `commentReply.set({ ... })`. */
trait CommentReplyUpdateData extends StObject {
  
  /**
    * Gets or sets the comment reply's content. The string is plain text.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the commentReply's content range.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var contentRange: js.UndefOr[CommentContentRangeUpdateData] = js.undefined
  
  /**
    * Gets the parent comment of this reply.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var parentComment: js.UndefOr[CommentUpdateData] = js.undefined
}
object CommentReplyUpdateData {
  
  inline def apply(): CommentReplyUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentReplyUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentReplyUpdateData] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentRange(value: CommentContentRangeUpdateData): Self = StObject.set(x, "contentRange", value.asInstanceOf[js.Any])
    
    inline def setContentRangeUndefined: Self = StObject.set(x, "contentRange", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setParentComment(value: CommentUpdateData): Self = StObject.set(x, "parentComment", value.asInstanceOf[js.Any])
    
    inline def setParentCommentUndefined: Self = StObject.set(x, "parentComment", js.undefined)
  }
}
