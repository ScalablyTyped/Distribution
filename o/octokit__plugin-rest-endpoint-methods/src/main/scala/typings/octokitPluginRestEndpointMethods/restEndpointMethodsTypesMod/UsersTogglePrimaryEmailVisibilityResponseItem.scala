package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersTogglePrimaryEmailVisibilityResponseItem extends js.Object {
  var email: String
  var primary: Boolean
  var verified: Boolean
  var visibility: String
}

object UsersTogglePrimaryEmailVisibilityResponseItem {
  @scala.inline
  def apply(email: String, primary: Boolean, verified: Boolean, visibility: String): UsersTogglePrimaryEmailVisibilityResponseItem = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UsersTogglePrimaryEmailVisibilityResponseItem]
  }
}

