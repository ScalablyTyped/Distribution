package typings.parse.mod._Global_.Parse.Object

import typings.parse.mod._Global_.Parse.ErrorOption
import typings.parse.mod._Global_.Parse.SessionTokenOption
import typings.parse.mod._Global_.Parse.SuccessOption
import typings.parse.mod._Global_.Parse.UseMasterKeyOption
import typings.parse.mod._Global_.Parse.WaitOption
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
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestroyOptions]
  }
}

