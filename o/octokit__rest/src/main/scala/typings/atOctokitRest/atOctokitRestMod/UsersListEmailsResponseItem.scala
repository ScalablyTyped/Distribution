package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersListEmailsResponseItem extends js.Object {
  var email: String
  var primary: Boolean
  var verified: Boolean
  var visibility: String
}

object UsersListEmailsResponseItem {
  @scala.inline
  def apply(email: String, primary: Boolean, verified: Boolean, visibility: String): UsersListEmailsResponseItem = {
    val __obj = js.Dynamic.literal(email = email, primary = primary, verified = verified, visibility = visibility)
  
    __obj.asInstanceOf[UsersListEmailsResponseItem]
  }
}

