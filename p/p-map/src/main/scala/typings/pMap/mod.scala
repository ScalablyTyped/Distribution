package typings.pMap

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  @param input - Iterated over concurrently in the `mapper` function.
  @param mapper - Function which is called for every item in `input`. Expected to return a `Promise` or value.
  @returns A `Promise` that is fulfilled when all promises in `input` and ones returned from `mapper` are fulfilled, or rejects if any of the promises reject. The fulfilled value is an `Array` of the fulfilled values returned from `mapper` in `input` order.
  @example
  ```
  import pMap = require('p-map');
  import got = require('got');
  const sites = [
  	getWebsiteFromUsername('https://sindresorhus'), //=> Promise
  	'https://ava.li',
  	'https://github.com'
  ];
  (async () => {
  	const mapper = async site => {
  		const {requestUrl} = await got.head(site);
  		return requestUrl;
  	};
  	const result = await pMap(sites, mapper, {concurrency: 2});
  	console.log(result);
  	//=> ['https://sindresorhus.com/', 'https://ava.li/', 'https://github.com/']
  })();
  ```
  */
  @JSImport("p-map", JSImport.Namespace)
  @js.native
  def apply[Element, NewElement](input: Iterable[Element], mapper: Mapper[Element, NewElement]): js.Promise[js.Array[NewElement]] = js.native
  @JSImport("p-map", JSImport.Namespace)
  @js.native
  def apply[Element, NewElement](input: Iterable[Element], mapper: Mapper[Element, NewElement], options: Options): js.Promise[js.Array[NewElement]] = js.native
  
  /**
  	Function which is called for every item in `input`. Expected to return a `Promise` or value.
  	@param element - Iterated element.
  	@param index - Index of the element in the source array.
  	*/
  type Mapper[Element, NewElement] = js.Function2[/* element */ Element, /* index */ Double, NewElement | js.Promise[NewElement]]
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Number of concurrently pending promises returned by `mapper`.
    		Must be an integer from 1 and up or `Infinity`.
    		@default Infinity
    		*/
    val concurrency: js.UndefOr[Double] = js.native
    
    /**
    		When set to `false`, instead of stopping when a promise rejects, it will wait for all the promises to settle and then reject with an [aggregated error](https://github.com/sindresorhus/aggregate-error) containing all the errors from the rejected promises.
    		@default true
    		*/
    val stopOnError: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      @scala.inline
      def setStopOnError(value: Boolean): Self = StObject.set(x, "stopOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopOnErrorUndefined: Self = StObject.set(x, "stopOnError", js.undefined)
    }
  }
}
