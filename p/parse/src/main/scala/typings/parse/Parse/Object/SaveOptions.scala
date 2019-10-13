package typings.parse.Parse.Object

import typings.parse.Parse.CascadeSaveOption
import typings.parse.Parse.ErrorOption
import typings.parse.Parse.SessionTokenOption
import typings.parse.Parse.SilentOption
import typings.parse.Parse.SuccessOption
import typings.parse.Parse.UseMasterKeyOption
import typings.parse.Parse.WaitOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveOptions
  extends CascadeSaveOption
     with SuccessOption
     with ErrorOption
     with SilentOption
     with SessionTokenOption
     with UseMasterKeyOption
     with WaitOption

object SaveOptions {
  @scala.inline
  def apply(
    cascadeSave: js.UndefOr[Boolean] = js.undefined,
    error: js.Function = null,
    sessionToken: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    success: js.Function = null,
    useMasterKey: js.UndefOr[Boolean] = js.undefined,
    wait: js.UndefOr[Boolean] = js.undefined
  ): SaveOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cascadeSave)) __obj.updateDynamic("cascadeSave")(cascadeSave)
    if (error != null) __obj.updateDynamic("error")(error)
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (success != null) __obj.updateDynamic("success")(success)
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey)
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[SaveOptions]
  }
}

