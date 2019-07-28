package typings.parse.ParseNs.ObjectNs

import typings.parse.ParseNs.ScopeOptions
import typings.parse.ParseNs.SilentOption
import typings.parse.ParseNs.SuccessFailureOptions
import typings.parse.ParseNs.WaitOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveOptions
  extends SuccessFailureOptions
     with SilentOption
     with ScopeOptions
     with WaitOption

object SaveOptions {
  @scala.inline
  def apply(
    error: js.Function = null,
    sessionToken: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    success: js.Function = null,
    useMasterKey: js.UndefOr[Boolean] = js.undefined,
    wait: js.UndefOr[Boolean] = js.undefined
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

