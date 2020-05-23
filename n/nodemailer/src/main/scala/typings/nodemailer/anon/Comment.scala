package typings.nodemailer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  var comment: String
  var url: String
}

object Comment {
  @scala.inline
  def apply(comment: String, url: String): Comment = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

