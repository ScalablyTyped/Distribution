package typings.pendoDashIoDashBrowser.pendoNs

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
    val __obj = js.Dynamic.literal(first = first, id = id, last = last, role = role, userType = userType, username = username)
  
    __obj.asInstanceOf[User]
  }
}

