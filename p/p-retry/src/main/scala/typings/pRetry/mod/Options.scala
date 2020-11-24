package typings.pRetry.mod

import typings.retry.mod.OperationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  val onFailedAttempt: js.UndefOr[js.Function1[/* error */ FailedAttemptError, Unit | js.Promise[Unit]]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnFailedAttempt(value: /* error */ FailedAttemptError => Unit | js.Promise[Unit]): Self = this.set("onFailedAttempt", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFailedAttempt: Self = this.set("onFailedAttempt", js.undefined)
  }
}
