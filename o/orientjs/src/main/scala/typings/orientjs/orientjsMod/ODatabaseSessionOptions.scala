package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ODatabaseSessionOptions extends js.Object {
  var name: String
  var password: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object ODatabaseSessionOptions {
  @scala.inline
  def apply(name: String, password: String = null, username: String = null): ODatabaseSessionOptions = {
    val __obj = js.Dynamic.literal(name = name)
    if (password != null) __obj.updateDynamic("password")(password)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[ODatabaseSessionOptions]
  }
}

