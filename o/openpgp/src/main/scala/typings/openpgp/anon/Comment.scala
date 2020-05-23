package typings.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  var comment: String
  var email: String
  var name: String
}

object Comment {
  @scala.inline
  def apply(comment: String, email: String, name: String): Comment = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

