package typings
package pDashAnyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AggregateError extends js.Object {
  /**
  	Wait for any promise to be fulfilled.
  	@param input - An `Iterable` collection of promises/values to wait for.
  	@returns A [cancelable `Promise`](https://github.com/sindresorhus/p-cancelable) that is fulfilled when any promise from `input` is fulfilled. If all the input promises reject, it will reject with an [`AggregateError`](https://github.com/sindresorhus/aggregate-error) error.
  	@example
  	```
  	import got = require('got');
  	import pAny = require('p-any');
  	(async () => {
  		const first = await pAny([
  			got.head('https://github.com').then(() => 'github'),
  			got.head('https://google.com').then(() => 'google'),
  			got.head('https://twitter.com').then(() => 'twitter'),
  		]);
  		console.log(first);
  		//=> 'google'
  	})();
  	```
  	 */
  def apply[ValueType](input: stdLib.Iterable[pDashAnyLib.pDashAnyMod.pAnyNs.Value[ValueType]]): pDashAnyLib.pDashAnyMod.pAnyNs.CancelablePromise[ValueType] = js.native
  def apply[ValueType](
    input: stdLib.Iterable[pDashAnyLib.pDashAnyMod.pAnyNs.Value[ValueType]],
    options: pDashAnyLib.pDashAnyMod.pAnyNs.Options[ValueType]
  ): pDashAnyLib.pDashAnyMod.pAnyNs.CancelablePromise[ValueType] = js.native
}

