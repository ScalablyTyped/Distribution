package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.CommentMention
import typings.officeJsPreview.Excel.ContentType
import typings.officeJsPreview.officeJsPreviewStrings.Mention
import typings.officeJsPreview.officeJsPreviewStrings.Plain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `commentReply.toJSON()`. */
trait CommentReplyData extends StObject {
  
  /**
    * Gets the email of the comment reply's author.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var authorEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the name of the comment reply's author.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var authorName: js.UndefOr[String] = js.undefined
  
  /**
    * The comment reply's content. The string is plain text.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * The content type of the reply.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var contentType: js.UndefOr[ContentType | Plain | Mention] = js.undefined
  
  /**
    * Gets the creation time of the comment reply.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the comment reply identifier.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The entities (e.g., people) that are mentioned in comments.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var mentions: js.UndefOr[js.Array[CommentMention]] = js.undefined
  
  /**
    * The comment reply status. A value of `true` means the reply is in the resolved state.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var resolved: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The rich comment content (e.g., mentions in comments). This string is not meant to be displayed to end-users. Your add-in should only use this to parse rich comment content.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var richContent: js.UndefOr[String] = js.undefined
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
    
    inline def setContentType(value: ContentType | Plain | Mention): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMentions(value: js.Array[CommentMention]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    inline def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    inline def setMentionsVarargs(value: CommentMention*): Self = StObject.set(x, "mentions", js.Array(value*))
    
    inline def setResolved(value: Boolean): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
    
    inline def setRichContent(value: String): Self = StObject.set(x, "richContent", value.asInstanceOf[js.Any])
    
    inline def setRichContentUndefined: Self = StObject.set(x, "richContent", js.undefined)
  }
}
