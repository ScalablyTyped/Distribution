package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCreateGpgKeyResponseEmailsItem extends js.Object {
  var email: String
  var verified: Boolean
}

object UsersCreateGpgKeyResponseEmailsItem {
  @scala.inline
  def apply(email: String, verified: Boolean): UsersCreateGpgKeyResponseEmailsItem = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UsersCreateGpgKeyResponseEmailsItem]
  }
}

