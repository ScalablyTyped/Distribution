package typings.megajs.megajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageOptions extends js.Object {
  var autoload: js.UndefOr[Boolean] = js.undefined
  var autologin: js.UndefOr[Boolean] = js.undefined
  var email: String
  var keepalive: js.UndefOr[Boolean] = js.undefined
  var password: String
}

object StorageOptions {
  @scala.inline
  def apply(
    email: String,
    password: String,
    autoload: js.UndefOr[Boolean] = js.undefined,
    autologin: js.UndefOr[Boolean] = js.undefined,
    keepalive: js.UndefOr[Boolean] = js.undefined
  ): StorageOptions = {
    val __obj = js.Dynamic.literal(email = email, password = password)
    if (!js.isUndefined(autoload)) __obj.updateDynamic("autoload")(autoload)
    if (!js.isUndefined(autologin)) __obj.updateDynamic("autologin")(autologin)
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive)
    __obj.asInstanceOf[StorageOptions]
  }
}

