package typings.parse.mod.global.Parse.Object

import typings.parse.mod.global.Parse.CascadeSaveOption
import typings.parse.mod.global.Parse.ErrorOption
import typings.parse.mod.global.Parse.SessionTokenOption
import typings.parse.mod.global.Parse.SilentOption
import typings.parse.mod.global.Parse.SuccessOption
import typings.parse.mod.global.Parse.UseMasterKeyOption
import typings.parse.mod.global.Parse.WaitOption
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
    if (!js.isUndefined(cascadeSave)) __obj.updateDynamic("cascadeSave")(cascadeSave.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveOptions]
  }
}

