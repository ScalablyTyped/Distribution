package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the content contained within a comment or comment reply. Rich content incudes the text string and any other objects contained within the comment body, such as mentions.
  *
  * [Api set: ExcelApi 1.11]
  */
trait CommentRichContent extends StObject {
  
  /**
    *
    * An array containing all the entities (e.g., people) mentioned within the comment.
    *
    * [Api set: ExcelApi 1.11]
    */
  var mentions: js.UndefOr[js.Array[CommentMention]] = js.undefined
  
  /**
    *
    * Specifies the rich content of the comment (e.g., comment content with mentions, the first mentioned entity has an id attribute of 0, and the second mentioned entity has an id attribute of 1).
    *
    * [Api set: ExcelApi 1.11]
    */
  var richContent: String
}
object CommentRichContent {
  
  inline def apply(richContent: String): CommentRichContent = {
    val __obj = js.Dynamic.literal(richContent = richContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentRichContent]
  }
  
  extension [Self <: CommentRichContent](x: Self) {
    
    inline def setMentions(value: js.Array[CommentMention]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    inline def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    inline def setMentionsVarargs(value: CommentMention*): Self = StObject.set(x, "mentions", js.Array(value :_*))
    
    inline def setRichContent(value: String): Self = StObject.set(x, "richContent", value.asInstanceOf[js.Any])
  }
}
