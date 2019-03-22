package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserID extends js.Object {
  var email: java.lang.String
  var name: java.lang.String
}

object UserID {
  @scala.inline
  def apply(email: java.lang.String, name: java.lang.String): UserID = {
    val __obj = js.Dynamic.literal(email = email, name = name)
  
    __obj.asInstanceOf[UserID]
  }
}

