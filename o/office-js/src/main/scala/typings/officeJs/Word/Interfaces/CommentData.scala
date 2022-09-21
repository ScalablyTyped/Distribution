package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `comment.toJSON()`. */
trait CommentData extends StObject {
  
  /**
    * Gets the email of the comment's author.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  var authorEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the name of the comment's author.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  var authorName: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the comment's content as plain text.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the comment's content range.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  var contentRange: js.UndefOr[CommentContentRangeData] = js.undefined
  
  /**
    * Gets the creation date of the comment.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Gets the Id of the comment. Read-only.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the collection of reply objects associated with the comment.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  var replies: js.UndefOr[js.Array[CommentReplyData]] = js.undefined
  
  /**
    * Gets or sets the comment thread's status. Setting to true resolves the comment thread. Getting a value of true means that the comment thread is resolved.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  var resolved: js.UndefOr[Boolean] = js.undefined
}
object CommentData {
  
  inline def apply(): CommentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentData]
  }
  
  extension [Self <: CommentData](x: Self) {
    
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
    
    inline def setReplies(value: js.Array[CommentReplyData]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    inline def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    inline def setRepliesVarargs(value: CommentReplyData*): Self = StObject.set(x, "replies", js.Array(value*))
    
    inline def setResolved(value: Boolean): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
  }
}
