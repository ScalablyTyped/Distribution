package typings
package parseLib.ParseNs.PushNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendOptions
  extends parseLib.ParseNs.UseMasterKeyOption {
  var error: js.UndefOr[js.Function1[/* error */ parseLib.ParseNs.Error, scala.Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object SendOptions {
  @scala.inline
  def apply(
    error: js.Function1[/* error */ parseLib.ParseNs.Error, scala.Unit] = null,
    success: js.Function0[scala.Unit] = null,
    useMasterKey: js.UndefOr[scala.Boolean] = js.undefined
  ): SendOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (success != null) __obj.updateDynamic("success")(success)
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey)
    __obj.asInstanceOf[SendOptions]
  }
}

