package typings.parse.Parse.Cloud

import typings.parse.Parse.ScopeOptions
import typings.parse.Parse.SuccessFailureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunOptions
  extends SuccessFailureOptions
     with ScopeOptions

object RunOptions {
  @scala.inline
  def apply(
    error: js.Function = null,
    sessionToken: String = null,
    success: js.Function = null,
    useMasterKey: js.UndefOr[Boolean] = js.undefined
  ): RunOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    if (success != null) __obj.updateDynamic("success")(success)
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey)
    __obj.asInstanceOf[RunOptions]
  }
}

