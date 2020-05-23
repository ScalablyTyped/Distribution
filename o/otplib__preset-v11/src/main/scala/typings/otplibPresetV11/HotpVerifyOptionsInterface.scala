package typings.otplibPresetV11

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotpVerifyOptionsInterface extends js.Object {
  var counter: js.UndefOr[Double] = js.undefined
  var secret: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
}

object HotpVerifyOptionsInterface {
  @scala.inline
  def apply(counter: js.UndefOr[Double] = js.undefined, secret: String = null, token: String = null): HotpVerifyOptionsInterface = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(counter)) __obj.updateDynamic("counter")(counter.get.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotpVerifyOptionsInterface]
  }
}

