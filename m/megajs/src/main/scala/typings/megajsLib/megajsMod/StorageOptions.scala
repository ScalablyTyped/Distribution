package typings
package megajsLib.megajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageOptions extends js.Object {
  var autoload: js.UndefOr[scala.Boolean] = js.undefined
  var autologin: js.UndefOr[scala.Boolean] = js.undefined
  var email: java.lang.String
  var keepalive: js.UndefOr[scala.Boolean] = js.undefined
  var password: java.lang.String
}

object StorageOptions {
  @scala.inline
  def apply(
    email: java.lang.String,
    password: java.lang.String,
    autoload: js.UndefOr[scala.Boolean] = js.undefined,
    autologin: js.UndefOr[scala.Boolean] = js.undefined,
    keepalive: js.UndefOr[scala.Boolean] = js.undefined
  ): StorageOptions = {
    val __obj = js.Dynamic.literal(email = email, password = password)
    if (!js.isUndefined(autoload)) __obj.updateDynamic("autoload")(autoload)
    if (!js.isUndefined(autologin)) __obj.updateDynamic("autologin")(autologin)
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive)
    __obj.asInstanceOf[StorageOptions]
  }
}

