package typings.openpgp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComment extends js.Object {
  var comment: String
  var email: String
  var name: String
}

object AnonComment {
  @scala.inline
  def apply(comment: String, email: String, name: String): AnonComment = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComment]
  }
}

