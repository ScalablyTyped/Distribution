package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersListGpgKeysForUserResponseItemEmailsItem extends js.Object {
  var email: String
  var verified: Boolean
}

object UsersListGpgKeysForUserResponseItemEmailsItem {
  @scala.inline
  def apply(email: String, verified: Boolean): UsersListGpgKeysForUserResponseItemEmailsItem = {
    val __obj = js.Dynamic.literal(email = email, verified = verified)
  
    __obj.asInstanceOf[UsersListGpgKeysForUserResponseItemEmailsItem]
  }
}

