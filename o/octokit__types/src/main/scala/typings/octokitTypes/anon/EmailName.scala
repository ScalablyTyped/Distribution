package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailName extends js.Object {
  var email: String
  var name: String
}

object EmailName {
  @scala.inline
  def apply(email: String, name: String): EmailName = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailName]
  }
}

