package typings
package parseLib.ParseNs.ObjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveOptions
  extends parseLib.ParseNs.SuccessFailureOptions
     with parseLib.ParseNs.SilentOption
     with parseLib.ParseNs.ScopeOptions
     with parseLib.ParseNs.WaitOption

object SaveOptions {
  @scala.inline
  def apply(
    error: js.Function = null,
    sessionToken: java.lang.String = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    success: js.Function = null,
    useMasterKey: js.UndefOr[scala.Boolean] = js.undefined,
    wait: js.UndefOr[scala.Boolean] = js.undefined
  ): SaveOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (success != null) __obj.updateDynamic("success")(success)
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey)
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[SaveOptions]
  }
}

