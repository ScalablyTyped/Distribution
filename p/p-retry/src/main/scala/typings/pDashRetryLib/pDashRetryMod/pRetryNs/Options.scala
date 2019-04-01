package typings
package pDashRetryLib.pDashRetryMod.pRetryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends retryLib.retryMod.OperationOptions {
  /**
  		Callback invoked on each retry. Receives the error thrown by `input` as the first argument with properties `attemptNumber` and `retriesLeft` which indicate the current attempt number and the number of attempts left, respectively.
  		*/
  val onFailedAttempt: js.UndefOr[js.Function1[/* error */ FailedAttemptError, scala.Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    factor: scala.Int | scala.Double = null,
    forever: js.UndefOr[scala.Boolean] = js.undefined,
    maxRetryTime: scala.Int | scala.Double = null,
    maxTimeout: scala.Int | scala.Double = null,
    minTimeout: scala.Int | scala.Double = null,
    onFailedAttempt: /* error */ FailedAttemptError => scala.Unit = null,
    randomize: js.UndefOr[scala.Boolean] = js.undefined,
    retries: scala.Int | scala.Double = null,
    unref: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (!js.isUndefined(forever)) __obj.updateDynamic("forever")(forever)
    if (maxRetryTime != null) __obj.updateDynamic("maxRetryTime")(maxRetryTime.asInstanceOf[js.Any])
    if (maxTimeout != null) __obj.updateDynamic("maxTimeout")(maxTimeout.asInstanceOf[js.Any])
    if (minTimeout != null) __obj.updateDynamic("minTimeout")(minTimeout.asInstanceOf[js.Any])
    if (onFailedAttempt != null) __obj.updateDynamic("onFailedAttempt")(js.Any.fromFunction1(onFailedAttempt))
    if (!js.isUndefined(randomize)) __obj.updateDynamic("randomize")(randomize)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (!js.isUndefined(unref)) __obj.updateDynamic("unref")(unref)
    __obj.asInstanceOf[Options]
  }
}

