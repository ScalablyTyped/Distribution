package typings.nodemailer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Comment extends js.Object {
  var comment: String
  var url: String
}

object Anon_Comment {
  @scala.inline
  def apply(comment: String, url: String): Anon_Comment = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Comment]
  }
}

