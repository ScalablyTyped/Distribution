package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersAddEmailsResponseItem extends js.Object {
  var email: String
  var primary: Boolean
  var verified: Boolean
  var visibility: String | Null
}

object UsersAddEmailsResponseItem {
  @scala.inline
  def apply(email: String, primary: Boolean, verified: Boolean, visibility: String = null): UsersAddEmailsResponseItem = {
    val __obj = js.Dynamic.literal(email = email, primary = primary, verified = verified)
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[UsersAddEmailsResponseItem]
  }
}

