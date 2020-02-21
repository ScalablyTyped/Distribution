package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

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
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UsersListGpgKeysResponseItemEmailsItem]
  }
}

