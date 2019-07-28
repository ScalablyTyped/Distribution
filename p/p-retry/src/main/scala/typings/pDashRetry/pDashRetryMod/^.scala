package typings.pDashRetry.pDashRetryMod

import org.scalablytyped.runtime.Instantiable1
import typings.pDashRetry.Anon_AbortError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-retry", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var AbortError: Instantiable1[/* message */ String | Error, AbortErrorClass] = js.native
  // TODO: remove this in the next major version
  @JSName("default")
  var default_Original: Anon_AbortError = js.native
  /**
  	Returns a `Promise` that is fulfilled when calling `input` returns a fulfilled promise. If calling `input` returns a rejected promise, `input` is called again until the max retries are reached, it then rejects with the last rejection reason.
  	It doesn't retry on `TypeError` as that's a user error.
  	@param input - Receives the number of attempts as the first argument and is expected to return a `Promise` or any value.
  	@param options - Options are passed to the [`retry`](https://github.com/tim-kos/node-retry#retryoperationoptions) module.
  	@example
  	```
  	import pRetry = require('p-retry');
  	import fetch from 'node-fetch';
  	const run = async () => {
  		const response = await fetch('https://sindresorhus.com/unicorn');
  		// Abort retrying if the resource doesn't exist
  		if (response.status === 404) {
  			throw new pRetry.AbortError(response.statusText);
  		}
  		return response.blob();
  	};
  	(async () => {
  		console.log(await pRetry(run, {retries: 5}));
  		// With the `onFailedAttempt` option:
  		const result = await pRetry(run, {
  			onFailedAttempt: error => {
  				console.log(`Attempt ${error.attemptNumber} failed. There are ${error.retriesLeft} retries left.`);
  				// 1st request => Attempt 1 failed. There are 4 retries left.
  				// 2nd request => Attempt 2 failed. There are 3 retries left.
  				// …
  			},
  			retries: 5
  		});
  		console.log(result);
  	})();
  	```
  	*/
  def apply[T](input: js.Function1[/* attemptCount */ Double, js.Thenable[T] | T]): js.Promise[T] = js.native
  def apply[T](input: js.Function1[/* attemptCount */ Double, js.Thenable[T] | T], options: Options): js.Promise[T] = js.native
  /**
  	Returns a `Promise` that is fulfilled when calling `input` returns a fulfilled promise. If calling `input` returns a rejected promise, `input` is called again until the max retries are reached, it then rejects with the last rejection reason.
  	It doesn't retry on `TypeError` as that's a user error.
  	@param input - Receives the number of attempts as the first argument and is expected to return a `Promise` or any value.
  	@param options - Options are passed to the [`retry`](https://github.com/tim-kos/node-retry#retryoperationoptions) module.
  	@example
  	```
  	import pRetry = require('p-retry');
  	import fetch from 'node-fetch';
  	const run = async () => {
  		const response = await fetch('https://sindresorhus.com/unicorn');
  		// Abort retrying if the resource doesn't exist
  		if (response.status === 404) {
  			throw new pRetry.AbortError(response.statusText);
  		}
  		return response.blob();
  	};
  	(async () => {
  		console.log(await pRetry(run, {retries: 5}));
  		// With the `onFailedAttempt` option:
  		const result = await pRetry(run, {
  			onFailedAttempt: error => {
  				console.log(`Attempt ${error.attemptNumber} failed. There are ${error.retriesLeft} retries left.`);
  				// 1st request => Attempt 1 failed. There are 4 retries left.
  				// 2nd request => Attempt 2 failed. There are 3 retries left.
  				// …
  			},
  			retries: 5
  		});
  		console.log(result);
  	})();
  	```
  	*/
  // TODO: remove this in the next major version
  def default[T](input: js.Function1[/* attemptCount */ Double, js.Thenable[T] | T]): js.Promise[T] = js.native
  def default[T](input: js.Function1[/* attemptCount */ Double, js.Thenable[T] | T], options: Options): js.Promise[T] = js.native
}

