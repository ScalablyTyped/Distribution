package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the content contained within a comment or comment reply. Rich content incudes the text string and any other objects contained within the comment body, such as mentions.
  *
  * [Api set: ExcelApi 1.11]
  */
@js.native
trait CommentRichContent extends StObject {
  
  /**
    *
    * An array containing all the entities (e.g., people) mentioned within the comment.
    *
    * [Api set: ExcelApi 1.11]
    */
  var mentions: js.UndefOr[js.Array[CommentMention]] = js.native
  
  /**
    *
    * Specifies the rich content of the comment (e.g., comment content with mentions, the first mentioned entity has an id attribute of 0, and the second mentioned entity has an id attribute of 1).
    *
    * [Api set: ExcelApi 1.11]
    */
  var richContent: String = js.native
}
object CommentRichContent {
  
  @scala.inline
  def apply(richContent: String): CommentRichContent = {
    val __obj = js.Dynamic.literal(richContent = richContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentRichContent]
  }
  
  @scala.inline
  implicit class CommentRichContentMutableBuilder[Self <: CommentRichContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMentions(value: js.Array[CommentMention]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    @scala.inline
    def setMentionsVarargs(value: CommentMention*): Self = StObject.set(x, "mentions", js.Array(value :_*))
    
    @scala.inline
    def setRichContent(value: String): Self = StObject.set(x, "richContent", value.asInstanceOf[js.Any])
  }
}
