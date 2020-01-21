package typings.nodemailer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComment extends js.Object {
  var comment: String
  var url: String
}

object AnonComment {
  @scala.inline
  def apply(comment: String, url: String): AnonComment = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonComment]
  }
}

