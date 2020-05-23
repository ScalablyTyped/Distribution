package typings.pEachSeries

import typings.pEachSeries.anon.Call
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-each-series", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pEachSeries<ValueType>(
  // 	input: Iterable<PromiseLike<ValueType> | ValueType>,
  // 	iterator: (element: ValueType, index: number) => unknown
  // ): Promise<ValueType[]>;
  // export = pEachSeries;
  @JSName("default")
  var default_Original: Call = js.native
  /**
  	Iterate over promises serially.
  	@param input - Iterated over serially in the `iterator` function.
  	@param iterator - Return value is ignored unless it's `Promise`, then it's awaited before continuing with the next iteration.
  	@returns A `Promise` that fulfills when all promises in `input` and ones returned from `iterator` are fulfilled, or rejects if any of the promises reject. The fulfillment value is the original `input`.
  	@example
  	```
  	import pEachSeries = require('p-each-series');
  	const keywords = [
  		getTopKeyword(), //=> Promise
  		'rainbow',
  		'pony'
  	];
  	const iterator = async element => saveToDiskPromise(element);
  	(async () => {
  		console.log(await pEachSeries(keywords, iterator));
  		//=> ['unicorn', 'rainbow', 'pony']
  	})();
  	```
  	*/
  def apply[ValueType](
    input: Iterable[js.Thenable[ValueType] | ValueType],
    iterator: js.Function2[/* element */ ValueType, /* index */ Double, _]
  ): js.Promise[js.Array[ValueType]] = js.native
  /**
  	Iterate over promises serially.
  	@param input - Iterated over serially in the `iterator` function.
  	@param iterator - Return value is ignored unless it's `Promise`, then it's awaited before continuing with the next iteration.
  	@returns A `Promise` that fulfills when all promises in `input` and ones returned from `iterator` are fulfilled, or rejects if any of the promises reject. The fulfillment value is the original `input`.
  	@example
  	```
  	import pEachSeries = require('p-each-series');
  	const keywords = [
  		getTopKeyword(), //=> Promise
  		'rainbow',
  		'pony'
  	];
  	const iterator = async element => saveToDiskPromise(element);
  	(async () => {
  		console.log(await pEachSeries(keywords, iterator));
  		//=> ['unicorn', 'rainbow', 'pony']
  	})();
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pEachSeries<ValueType>(
  // 	input: Iterable<PromiseLike<ValueType> | ValueType>,
  // 	iterator: (element: ValueType, index: number) => unknown
  // ): Promise<ValueType[]>;
  // export = pEachSeries;
  def default[ValueType](
    input: Iterable[js.Thenable[ValueType] | ValueType],
    iterator: js.Function2[/* element */ ValueType, /* index */ Double, _]
  ): js.Promise[js.Array[ValueType]] = js.native
}

