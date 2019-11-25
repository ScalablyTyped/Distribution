package typings.pendoDashIoDashBrowser.pendo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var first: String
  var id: String
  var last: String
  var role: Double
  var userType: String
  var username: String
}

object User {
  @scala.inline
  def apply(first: String, id: String, last: String, role: Double, userType: String, username: String): User = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], userType = userType.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[User]
  }
}

