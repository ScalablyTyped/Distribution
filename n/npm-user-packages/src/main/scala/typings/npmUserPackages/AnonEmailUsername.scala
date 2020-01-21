package typings.npmUserPackages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmailUsername extends js.Object {
  var email: String
  var username: String
}

object AnonEmailUsername {
  @scala.inline
  def apply(email: String, username: String): AnonEmailUsername = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEmailUsername]
  }
}

