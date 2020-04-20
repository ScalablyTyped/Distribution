package typings.nyaapi.mod.pantsu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginData extends js.Object {
  var password: String
  var username: String
}

object LoginData {
  @scala.inline
  def apply(password: String, username: String): LoginData = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginData]
  }
}

