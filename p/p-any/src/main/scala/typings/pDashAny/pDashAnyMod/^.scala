package typings.pDashAny.pDashAnyMod

import typings.pDashAny.Anon_AggregateError
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-any", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var AggregateError: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PSomeAggregateError */ js.Any = js.native
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: Anon_AggregateError = js.native
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
  def apply[ValueType](input: Iterable[Value[ValueType]]): CancelablePromise[ValueType] = js.native
  def apply[ValueType](input: Iterable[Value[ValueType]], options: Options[ValueType]): CancelablePromise[ValueType] = js.native
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
  // TODO: Remove this for the next major release
  def default[ValueType](input: Iterable[Value[ValueType]]): CancelablePromise[ValueType] = js.native
  def default[ValueType](input: Iterable[Value[ValueType]], options: Options[ValueType]): CancelablePromise[ValueType] = js.native
}

