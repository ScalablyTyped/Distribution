package typings
package milkcocoaLib.milkcocoaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var email: java.lang.String
  var id: java.lang.String
}

object User {
  @scala.inline
  def apply(email: java.lang.String, id: java.lang.String): User = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[User]
  }
}

