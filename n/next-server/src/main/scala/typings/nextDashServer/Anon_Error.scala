package typings.nextDashServer

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: js.UndefOr[Error | Null] = js.undefined
  var isLoading: js.UndefOr[Boolean] = js.undefined
  var pastDelay: js.UndefOr[Boolean] = js.undefined
  var timedOut: js.UndefOr[Boolean] = js.undefined
}

object Anon_Error {
  @scala.inline
  def apply(
    error: Error = null,
    isLoading: js.UndefOr[Boolean] = js.undefined,
    pastDelay: js.UndefOr[Boolean] = js.undefined,
    timedOut: js.UndefOr[Boolean] = js.undefined
  ): Anon_Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading)
    if (!js.isUndefined(pastDelay)) __obj.updateDynamic("pastDelay")(pastDelay)
    if (!js.isUndefined(timedOut)) __obj.updateDynamic("timedOut")(timedOut)
    __obj.asInstanceOf[Anon_Error]
  }
}

