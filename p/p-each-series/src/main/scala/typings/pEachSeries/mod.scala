package typings.pEachSeries

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @scala.inline
  def apply[ValueType](
    input: Iterable[js.Thenable[ValueType] | ValueType],
    iterator: js.Function2[/* element */ ValueType, /* index */ Double, StopSymbol | js.Any]
  ): js.Promise[js.Array[ValueType]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ValueType]]]
  
  @JSImport("p-each-series", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release
  @JSImport("p-each-series", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pEachSeries */ js.Any = js.native
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pEachSeries */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
  	Stop iterating through items by returning `pEachSeries.stop` from the iterator function.
  	@example
  	```
  	const pEachSeries = require('p-each-series');
  	// Logs `a` and `b`.
  	const result = await pEachSeries(['a', 'b', 'c'], value => {
  		console.log(value);
  		if (value === 'b') {
  			return pEachSeries.stop;
  		}
  	});
  	console.log(result);
  	//=> ['a', 'b', 'c']
  	```
  	*/
  @JSImport("p-each-series", "stop")
  @js.native
  val stop: StopSymbol = js.native
  
  type StopSymbol = js.Symbol
}
