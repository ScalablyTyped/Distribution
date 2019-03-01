package typings
package oibackoffLib.oibackoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackoffOptions extends js.Object {
  var algorithm: js.UndefOr[
    oibackoffLib.oibackoffLibStrings.incremental | oibackoffLib.oibackoffLibStrings.exponential | oibackoffLib.oibackoffLibStrings.fibonacci
  ] = js.undefined
  var delayRatio: js.UndefOr[scala.Double] = js.undefined
  var maxDelay: js.UndefOr[scala.Double] = js.undefined
  var maxTries: js.UndefOr[scala.Double] = js.undefined
}

object BackoffOptions {
  @scala.inline
  def apply(
    algorithm: oibackoffLib.oibackoffLibStrings.incremental | oibackoffLib.oibackoffLibStrings.exponential | oibackoffLib.oibackoffLibStrings.fibonacci = null,
    delayRatio: scala.Int | scala.Double = null,
    maxDelay: scala.Int | scala.Double = null,
    maxTries: scala.Int | scala.Double = null
  ): BackoffOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (delayRatio != null) __obj.updateDynamic("delayRatio")(delayRatio.asInstanceOf[js.Any])
    if (maxDelay != null) __obj.updateDynamic("maxDelay")(maxDelay.asInstanceOf[js.Any])
    if (maxTries != null) __obj.updateDynamic("maxTries")(maxTries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackoffOptions]
  }
}

