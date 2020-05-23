package typings.npmUserPackages.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Username extends js.Object {
  var email: String
  var username: String
}

object Username {
  @scala.inline
  def apply(email: String, username: String): Username = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Username]
  }
}

