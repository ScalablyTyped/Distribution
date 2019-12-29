package typings.parse.parseMod._Global_.Parse.Object

import typings.parse.parseMod._Global_.Parse.ErrorOption
import typings.parse.parseMod._Global_.Parse.SessionTokenOption
import typings.parse.parseMod._Global_.Parse.SuccessOption
import typings.parse.parseMod._Global_.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchAllOptions
  extends SuccessOption
     with ErrorOption
     with SessionTokenOption
     with UseMasterKeyOption

object FetchAllOptions {
  @scala.inline
  def apply(
    error: js.Function = null,
    sessionToken: String = null,
    success: js.Function = null,
    useMasterKey: js.UndefOr[Boolean] = js.undefined
  ): FetchAllOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchAllOptions]
  }
}

