package typings.openpgp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Comment extends js.Object {
  var comment: String
  var email: String
  var name: String
}

object Anon_Comment {
  @scala.inline
  def apply(comment: String, email: String, name: String): Anon_Comment = {
    val __obj = js.Dynamic.literal(comment = comment, email = email, name = name)
  
    __obj.asInstanceOf[Anon_Comment]
  }
}

