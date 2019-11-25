package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersGetGpgKeyResponseEmailsItem extends js.Object {
  var email: String
  var verified: Boolean
}

object UsersGetGpgKeyResponseEmailsItem {
  @scala.inline
  def apply(email: String, verified: Boolean): UsersGetGpgKeyResponseEmailsItem = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UsersGetGpgKeyResponseEmailsItem]
  }
}

