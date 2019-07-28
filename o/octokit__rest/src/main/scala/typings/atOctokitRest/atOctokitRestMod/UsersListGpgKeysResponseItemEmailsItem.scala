package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersListGpgKeysResponseItemEmailsItem extends js.Object {
  var email: String
  var verified: Boolean
}

object UsersListGpgKeysResponseItemEmailsItem {
  @scala.inline
  def apply(email: String, verified: Boolean): UsersListGpgKeysResponseItemEmailsItem = {
    val __obj = js.Dynamic.literal(email = email, verified = verified)
  
    __obj.asInstanceOf[UsersListGpgKeysResponseItemEmailsItem]
  }
}

