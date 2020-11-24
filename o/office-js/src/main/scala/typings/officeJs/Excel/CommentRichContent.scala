package typings.officeJs.Excel

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
trait CommentRichContent extends js.Object {
  
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
  implicit class CommentRichContentOps[Self <: CommentRichContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRichContent(value: String): Self = this.set("richContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMentionsVarargs(value: CommentMention*): Self = this.set("mentions", js.Array(value :_*))
    
    @scala.inline
    def setMentions(value: js.Array[CommentMention]): Self = this.set("mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMentions: Self = this.set("mentions", js.undefined)
  }
}
