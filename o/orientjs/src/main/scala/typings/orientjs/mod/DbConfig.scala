package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbConfig extends js.Object {
  var name: String
  var password: js.UndefOr[String] = js.undefined
  var storage: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object DbConfig {
  @scala.inline
  def apply(
    name: String,
    password: String = null,
    storage: String = null,
    `type`: String = null,
    username: String = null
  ): DbConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbConfig]
  }
}

