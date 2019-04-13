package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersTogglePrimaryEmailVisibilityResponseItem extends js.Object {
  var email: java.lang.String
  var primary: scala.Boolean
  var verified: scala.Boolean
  var visibility: java.lang.String
}

object UsersTogglePrimaryEmailVisibilityResponseItem {
  @scala.inline
  def apply(
    email: java.lang.String,
    primary: scala.Boolean,
    verified: scala.Boolean,
    visibility: java.lang.String
  ): UsersTogglePrimaryEmailVisibilityResponseItem = {
    val __obj = js.Dynamic.literal(email = email, primary = primary, verified = verified, visibility = visibility)
  
    __obj.asInstanceOf[UsersTogglePrimaryEmailVisibilityResponseItem]
  }
}

