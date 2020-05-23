package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the content contained within a comment or comment reply. Rich content incudes the text string and any other objects contained within the comment body, such as mentions.
  *
  * [Api set: ExcelApi 1.11]
  */
trait CommentRichContent extends js.Object {
  /**
    *
    * An array containing all the entities (e.g., people) mentioned within the comment.
    *
    * [Api set: ExcelApi 1.11]
    */
  var mentions: js.UndefOr[js.Array[CommentMention]] = js.undefined
  /**
    *
    * Specifies the rich content of the comment (e.g., comment content with mentions, the first mentioned entity has an id attribute of 0, and the second mentioned entity has an id attribute of 1.
    *
    * [Api set: ExcelApi 1.11]
    */
  var richContent: String
}

object CommentRichContent {
  @scala.inline
  def apply(richContent: String, mentions: js.Array[CommentMention] = null): CommentRichContent = {
    val __obj = js.Dynamic.literal(richContent = richContent.asInstanceOf[js.Any])
    if (mentions != null) __obj.updateDynamic("mentions")(mentions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentRichContent]
  }
}

