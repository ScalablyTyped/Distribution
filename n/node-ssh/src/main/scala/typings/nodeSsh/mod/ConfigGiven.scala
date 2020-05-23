package typings.nodeSsh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigGiven extends js.Object {
  var host: String
  var onKeyboardInteractive: js.UndefOr[js.Function0[Unit | Boolean]] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var privateKey: js.UndefOr[String] = js.undefined
  var username: String
}

object ConfigGiven {
  @scala.inline
  def apply(
    host: String,
    username: String,
    onKeyboardInteractive: () => Unit | Boolean = null,
    password: String = null,
    port: js.UndefOr[Double] = js.undefined,
    privateKey: String = null
  ): ConfigGiven = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (onKeyboardInteractive != null) __obj.updateDynamic("onKeyboardInteractive")(js.Any.fromFunction0(onKeyboardInteractive))
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigGiven]
  }
}

