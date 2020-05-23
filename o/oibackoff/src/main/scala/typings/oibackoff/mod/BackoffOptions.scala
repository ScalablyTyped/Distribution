package typings.oibackoff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackoffOptions extends js.Object {
  var algorithm: js.UndefOr[
    typings.oibackoff.oibackoffStrings.incremental | typings.oibackoff.oibackoffStrings.exponential | typings.oibackoff.oibackoffStrings.fibonacci
  ] = js.undefined
  var delayRatio: js.UndefOr[Double] = js.undefined
  var maxDelay: js.UndefOr[Double] = js.undefined
  var maxTries: js.UndefOr[Double] = js.undefined
}

object BackoffOptions {
  @scala.inline
  def apply(
    algorithm: typings.oibackoff.oibackoffStrings.incremental | typings.oibackoff.oibackoffStrings.exponential | typings.oibackoff.oibackoffStrings.fibonacci = null,
    delayRatio: js.UndefOr[Double] = js.undefined,
    maxDelay: js.UndefOr[Double] = js.undefined,
    maxTries: js.UndefOr[Double] = js.undefined
  ): BackoffOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(delayRatio)) __obj.updateDynamic("delayRatio")(delayRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDelay)) __obj.updateDynamic("maxDelay")(maxDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTries)) __obj.updateDynamic("maxTries")(maxTries.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackoffOptions]
  }
}

