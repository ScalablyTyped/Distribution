package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the entity that is mentioned in comments.
  *
  * [Api set: ExcelApi 1.11]
  */
trait CommentMention extends js.Object {
  /**
    *
    * The email address of the entity that is mentioned in comment.
    *
    * [Api set: ExcelApi 1.11]
    */
  var email: String
  /**
    *
    * The id of the entity. The id matches one of the ids in `CommentRichContent.richContent`.
    *
    * [Api set: ExcelApi 1.11]
    */
  var id: Double
  /**
    *
    * The name of the entity that is mentioned in comment.
    *
    * [Api set: ExcelApi 1.11]
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

