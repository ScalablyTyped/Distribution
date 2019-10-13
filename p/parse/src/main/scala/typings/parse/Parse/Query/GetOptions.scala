package typings.parse.Parse.Query

import typings.parse.Parse.ErrorOption
import typings.parse.Parse.SessionTokenOption
import typings.parse.Parse.SuccessOption
import typings.parse.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOptions
  extends SuccessOption
     with ErrorOption
     with SessionTokenOption
     with UseMasterKeyOption

object GetOptions {
  @scala.inline
  def apply(
    error: js.Function = null,
    sessionToken: String = null,
    success: js.Function = null,
    useMasterKey: js.UndefOr[Boolean] = js.undefined
  ): GetOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    if (success != null) __obj.updateDynamic("success")(success)
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey)
    __obj.asInstanceOf[GetOptions]
  }
}

