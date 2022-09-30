package typings.pEachSeries

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
    	Iterate over promises serially.
    	@param input - Iterated over serially in the `iterator` function.
    	@param iterator - Return value is ignored unless it's `Promise`, then it's awaited before continuing with the next iteration.
    	@returns A `Promise` that fulfills when all promises in `input` and ones returned from `iterator` are fulfilled, or rejects if any of the promises reject. The fulfillment value is the original `input`.
    	@example
    	```
    	import pEachSeries from 'p-each-series';
    	const keywords = [
    		getTopKeyword(), //=> Promise
    		'rainbow',
    		'pony'
    	];
    	const iterator = async element => saveToDiskPromise(element);
    	console.log(await pEachSeries(keywords, iterator));
    	//=> ['unicorn', 'rainbow', 'pony']
    	```
    	*/
    inline def apply[ValueType](
      input: js.Iterable[PromiseLike[ValueType] | ValueType],
      iterator: js.Function2[/* element */ ValueType, /* index */ Double, StopSymbol | Any]
    ): js.Promise[js.Array[ValueType]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ValueType]]]
    
    @JSImport("p-each-series", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Stop iterating through items by returning `pEachSeries.stop` from the iterator function.
    	@example
    	```
    	import pEachSeries from 'p-each-series';
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
    @JSImport("p-each-series", "default.stop")
    @js.native
    val stop: StopSymbol = js.native
  }
  
  type StopSymbol = js.Symbol
}
