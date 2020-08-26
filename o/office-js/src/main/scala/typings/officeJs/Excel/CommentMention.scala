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
@js.native
trait CommentMention extends js.Object {
  /**
    *
    * The email address of the entity that is mentioned in comment.
    *
    * [Api set: ExcelApi 1.11]
    */
  var email: String = js.native
  /**
    *
    * The id of the entity. The id matches one of the ids in `CommentRichContent.richContent`.
    *
    * [Api set: ExcelApi 1.11]
    */
  var id: Double = js.native
  /**
    *
    * The name of the entity that is mentioned in comment.
    *
    * [Api set: ExcelApi 1.11]
    */
  var name: String = js.native
}

object CommentMention {
  @scala.inline
  def apply(email: String, id: Double, name: String): CommentMention = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentMention]
  }
  @scala.inline
  implicit class CommentMentionOps[Self <: CommentMention] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

