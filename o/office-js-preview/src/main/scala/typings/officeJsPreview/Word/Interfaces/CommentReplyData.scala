package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `commentReply.toJSON()`. */
trait CommentReplyData extends StObject {
  
  /**
    * Gets the email of the comment reply's author.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var authorEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the name of the comment reply's author.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var authorName: js.UndefOr[String] = js.undefined
  
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
  var contentRange: js.UndefOr[CommentContentRangeData] = js.undefined
  
  /**
    * Gets the creation date of the comment reply.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Gets the ID of the comment reply.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the parent comment of this reply.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var parentComment: js.UndefOr[CommentData] = js.undefined
}
object CommentReplyData {
  
  inline def apply(): CommentReplyData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentReplyData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentReplyData] (val x: Self) extends AnyVal {
    
    inline def setAuthorEmail(value: String): Self = StObject.set(x, "authorEmail", value.asInstanceOf[js.Any])
    
    inline def setAuthorEmailUndefined: Self = StObject.set(x, "authorEmail", js.undefined)
    
    inline def setAuthorName(value: String): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
    
    inline def setAuthorNameUndefined: Self = StObject.set(x, "authorName", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentRange(value: CommentContentRangeData): Self = StObject.set(x, "contentRange", value.asInstanceOf[js.Any])
    
    inline def setContentRangeUndefined: Self = StObject.set(x, "contentRange", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setParentComment(value: CommentData): Self = StObject.set(x, "parentComment", value.asInstanceOf[js.Any])
    
    inline def setParentCommentUndefined: Self = StObject.set(x, "parentComment", js.undefined)
  }
}
