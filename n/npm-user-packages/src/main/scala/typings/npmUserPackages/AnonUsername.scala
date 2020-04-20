package typings.npmUserPackages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUsername extends js.Object {
  var email: String
  var username: String
}

object AnonUsername {
  @scala.inline
  def apply(email: String, username: String): AnonUsername = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUsername]
  }
}

