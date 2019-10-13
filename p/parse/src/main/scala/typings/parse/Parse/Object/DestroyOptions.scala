package typings.parse.Parse.Object

import typings.parse.Parse.ErrorOption
import typings.parse.Parse.SessionTokenOption
import typings.parse.Parse.SuccessOption
import typings.parse.Parse.UseMasterKeyOption
import typings.parse.Parse.WaitOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestroyOptions
  extends SuccessOption
     with ErrorOption
     with WaitOption
     with SessionTokenOption
     with UseMasterKeyOption

object DestroyOptions {
  @scala.inline
  def apply(
    error: js.Function = null,
    sessionToken: String = null,
    success: js.Function = null,
    useMasterKey: js.UndefOr[Boolean] = js.undefined,
    wait: js.UndefOr[Boolean] = js.undefined
  ): DestroyOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    if (success != null) __obj.updateDynamic("success")(success)
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey)
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[DestroyOptions]
  }
}

