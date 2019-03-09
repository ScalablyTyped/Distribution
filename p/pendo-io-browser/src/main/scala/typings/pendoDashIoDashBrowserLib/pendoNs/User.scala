package typings
package pendoDashIoDashBrowserLib.pendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var first: java.lang.String
  var id: java.lang.String
  var last: java.lang.String
  var role: scala.Double
  var userType: java.lang.String
  var username: java.lang.String
}

object User {
  @scala.inline
  def apply(
    first: java.lang.String,
    id: java.lang.String,
    last: java.lang.String,
    role: scala.Double,
    userType: java.lang.String,
    username: java.lang.String
  ): User = {
    val __obj = js.Dynamic.literal(first = first, id = id, last = last, role = role, userType = userType, username = username)
  
    __obj.asInstanceOf[User]
  }
}

