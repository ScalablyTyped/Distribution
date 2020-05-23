package typings.pRetry.mod

import typings.retry.mod.OperationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends OperationOptions {
  /**
  		Callback invoked on each retry. Receives the error thrown by `input` as the first argument with properties `attemptNumber` and `retriesLeft` which indicate the current attempt number and the number of attempts left, respectively.
  		The `onFailedAttempt` function can return a promise. For example, to add a [delay](https://github.com/sindresorhus/delay):
  		```
  		import pRetry = require('p-retry');
  		import delay = require('delay');
  		const run = async () => { ... };
  		(async () => {
  			const result = await pRetry(run, {
  				onFailedAttempt: async error => {
  					console.log('Waiting for 1 second before retrying');
  					await delay(1000);
  				}
  			});
  		})();
  		```
  		If the `onFailedAttempt` function throws, all retries will be aborted and the original promise will reject with the thrown error.
  		*/
  val onFailedAttempt: js.UndefOr[js.Function1[/* error */ FailedAttemptError, Unit | js.Promise[Unit]]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    factor: js.UndefOr[Double] = js.undefined,
    forever: js.UndefOr[Boolean] = js.undefined,
    maxRetryTime: js.UndefOr[Double] = js.undefined,
    maxTimeout: js.UndefOr[Double] = js.undefined,
    minTimeout: js.UndefOr[Double] = js.undefined,
    onFailedAttempt: /* error */ FailedAttemptError => Unit | js.Promise[Unit] = null,
    randomize: js.UndefOr[Boolean] = js.undefined,
    retries: js.UndefOr[Double] = js.undefined,
    unref: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(factor)) __obj.updateDynamic("factor")(factor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forever)) __obj.updateDynamic("forever")(forever.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetryTime)) __obj.updateDynamic("maxRetryTime")(maxRetryTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTimeout)) __obj.updateDynamic("maxTimeout")(maxTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minTimeout)) __obj.updateDynamic("minTimeout")(minTimeout.get.asInstanceOf[js.Any])
    if (onFailedAttempt != null) __obj.updateDynamic("onFailedAttempt")(js.Any.fromFunction1(onFailedAttempt))
    if (!js.isUndefined(randomize)) __obj.updateDynamic("randomize")(randomize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unref)) __obj.updateDynamic("unref")(unref.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

