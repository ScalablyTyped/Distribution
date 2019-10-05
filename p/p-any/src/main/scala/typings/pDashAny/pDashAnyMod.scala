package typings.pDashAny

import typings.pDashAny.pDashAnyMod.CancelablePromise
import typings.pDashAny.pDashAnyMod.Options
import typings.pDashAny.pDashAnyMod.Value
import typings.pDashAny.pDashAnyStrings.count
import typings.pDashCancelable.pDashCancelableMod.^
import typings.std.Iterable
import typings.typeDashFest.typeDashFestMod.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-any", JSImport.Namespace)
@js.native
object pDashAnyMod extends js.Object {
  var AggregateError: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PSomeAggregateError */ js.Any = js.native
  // TODO: Remove this for the next major release
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pAny */ js.Any = js.native
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
  type AggregateError = typings.pDashSome.pDashSomeMod.AggregateError
  type CancelablePromise[ValueType] = ^[ValueType]
  type Options[ValueType] = Omit[typings.pDashSome.pDashSomeMod.Options[ValueType], count]
  type Value[ValueType] = ValueType | js.Thenable[ValueType]
}

