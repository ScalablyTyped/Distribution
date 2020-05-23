package typings.nextServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: js.UndefOr[typings.std.Error | Null] = js.undefined
  var isLoading: js.UndefOr[Boolean] = js.undefined
  var pastDelay: js.UndefOr[Boolean] = js.undefined
  var timedOut: js.UndefOr[Boolean] = js.undefined
}

object Error {
  @scala.inline
  def apply(
    error: js.UndefOr[Null | typings.std.Error] = js.undefined,
    isLoading: js.UndefOr[Boolean] = js.undefined,
    pastDelay: js.UndefOr[Boolean] = js.undefined,
    timedOut: js.UndefOr[Boolean] = js.undefined
  ): Error = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pastDelay)) __obj.updateDynamic("pastDelay")(pastDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timedOut)) __obj.updateDynamic("timedOut")(timedOut.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

