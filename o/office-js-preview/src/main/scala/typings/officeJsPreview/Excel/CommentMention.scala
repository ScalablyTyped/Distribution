package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the entity that is mentioned in comments.
  *
  * [Api set: ExcelApiOnline 1.1]
  */
trait CommentMention extends js.Object {
  /**
    *
    * Gets or sets the email address of the entity that is mentioned in comment.
    *
    * [Api set: ExcelApiOnline 1.1]
    */
  var email: String
  /**
    *
    * Gets or sets the id of the entity. The id matches one of the ids in `CommentRichContent.richContent`.
    *
    * [Api set: ExcelApiOnline 1.1]
    */
  var id: Double
  /**
    *
    * Gets or sets the name of the entity that is mentioned in comment.
    *
    * [Api set: ExcelApiOnline 1.1]
    */
  var name: String
}

object CommentMention {
  @scala.inline
  def apply(email: String, id: Double, name: String): CommentMention = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentMention]
  }
}

