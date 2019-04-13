package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersGetGpgKeyResponseEmailsItem extends js.Object {
  var email: java.lang.String
  var verified: scala.Boolean
}

object UsersGetGpgKeyResponseEmailsItem {
  @scala.inline
  def apply(email: java.lang.String, verified: scala.Boolean): UsersGetGpgKeyResponseEmailsItem = {
    val __obj = js.Dynamic.literal(email = email, verified = verified)
  
    __obj.asInstanceOf[UsersGetGpgKeyResponseEmailsItem]
  }
}

