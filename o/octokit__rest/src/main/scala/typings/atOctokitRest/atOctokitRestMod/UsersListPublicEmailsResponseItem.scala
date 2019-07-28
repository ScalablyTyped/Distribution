package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersListPublicEmailsResponseItem extends js.Object {
  var email: String
  var primary: Boolean
  var verified: Boolean
  var visibility: String
}

object UsersListPublicEmailsResponseItem {
  @scala.inline
  def apply(email: String, primary: Boolean, verified: Boolean, visibility: String): UsersListPublicEmailsResponseItem = {
    val __obj = js.Dynamic.literal(email = email, primary = primary, verified = verified, visibility = visibility)
  
    __obj.asInstanceOf[UsersListPublicEmailsResponseItem]
  }
}

