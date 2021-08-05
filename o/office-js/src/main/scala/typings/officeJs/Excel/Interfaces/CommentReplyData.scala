package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.CommentMention
import typings.officeJs.Excel.ContentType
import typings.officeJs.officeJsStrings.Mention
import typings.officeJs.officeJsStrings.Plain
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `commentReply.toJSON()`. */
trait CommentReplyData extends StObject {
  
  /**
    *
    * Gets the email of the comment reply's author.
    *
    * [Api set: ExcelApi 1.10]
    */
  var authorEmail: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets the name of the comment reply's author.
    *
    * [Api set: ExcelApi 1.10]
    */
  var authorName: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The comment reply's content. The string is plain text.
    *
    * [Api set: ExcelApi 1.10]
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The content type of the reply.
    *
    * [Api set: ExcelApi 1.12]
    */
  var contentType: js.UndefOr[ContentType | Plain | Mention] = js.undefined
  
  /**
    *
    * Gets the creation time of the comment reply.
    *
    * [Api set: ExcelApi 1.10]
    */
  var creationDate: js.UndefOr[Date] = js.undefined
  
  /**
    *
    * Specifies the comment reply identifier.
    *
    * [Api set: ExcelApi 1.10]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The entities (e.g., people) that are mentioned in comments.
    *
    * [Api set: ExcelApi 1.11]
    */
  var mentions: js.UndefOr[js.Array[CommentMention]] = js.undefined
  
  /**
    *
    * The comment reply status. A value of "true" means the reply is in the resolved state.
    *
    * [Api set: ExcelApi 1.11]
    */
  var resolved: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The rich comment content (e.g., mentions in comments). This string is not meant to be displayed to end-users. Your add-in should only use this to parse rich comment content.
    *
    * [Api set: ExcelApi 1.11]
    */
  var richContent: js.UndefOr[String] = js.undefined
}
object CommentReplyData {
  
  inline def apply(): CommentReplyData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentReplyData]
  }
  
  extension [Self <: CommentReplyData](x: Self) {
    
    inline def setAuthorEmail(value: String): Self = StObject.set(x, "authorEmail", value.asInstanceOf[js.Any])
    
    inline def setAuthorEmailUndefined: Self = StObject.set(x, "authorEmail", js.undefined)
    
    inline def setAuthorName(value: String): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
    
    inline def setAuthorNameUndefined: Self = StObject.set(x, "authorName", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: ContentType | Plain | Mention): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCreationDate(value: Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMentions(value: js.Array[CommentMention]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    inline def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    inline def setMentionsVarargs(value: CommentMention*): Self = StObject.set(x, "mentions", js.Array(value :_*))
    
    inline def setResolved(value: Boolean): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
    
    inline def setRichContent(value: String): Self = StObject.set(x, "richContent", value.asInstanceOf[js.Any])
    
    inline def setRichContentUndefined: Self = StObject.set(x, "richContent", js.undefined)
  }
}
