package typings.pLocate

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Get the first fulfilled promise that satisfies the provided testing function.
  @param input - An iterable of promises/values to test.
  @param tester - This function will receive resolved values from `input` and is expected to return a `Promise<boolean>` or `boolean`.
  @returns A `Promise` that is fulfilled when `tester` resolves to `true` or the iterable is done, or rejects if any of the promises reject. The fulfilled value is the current iterable value or `undefined` if `tester` never resolved to `true`.
  @example
  ```
  import pathExists = require('path-exists');
  import pLocate = require('p-locate');
  const files = [
  	'unicorn.png',
  	'rainbow.png', // Only this one actually exists on disk
  	'pony.png'
  ];
  (async () => {
  	const foundPath = await pLocate(files, file => pathExists(file));
  	console.log(foundPath);
  	//=> 'rainbow'
  })();
  ```
  */
  @scala.inline
  def apply[ValueType](
    input: Iterable[js.Thenable[ValueType] | ValueType],
    tester: js.Function1[/* element */ ValueType, js.Thenable[Boolean] | Boolean]
  ): js.Promise[js.UndefOr[ValueType]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], tester.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[ValueType]]]
  @scala.inline
  def apply[ValueType](
    input: Iterable[js.Thenable[ValueType] | ValueType],
    tester: js.Function1[/* element */ ValueType, js.Thenable[Boolean] | Boolean],
    options: Options
  ): js.Promise[js.UndefOr[ValueType]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], tester.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[ValueType]]]
  
  @JSImport("p-locate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
    		Number of concurrently pending promises returned by `tester`. Minimum: `1`.
    		@default Infinity
    		*/
    val concurrency: js.UndefOr[Double] = js.undefined
    
    /**
    		Preserve `input` order when searching.
    		Disable this to improve performance if you don't care about the order.
    		@default true
    		*/
    val preserveOrder: js.UndefOr[Boolean] = js.undefined
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
      def setPreserveOrder(value: Boolean): Self = StObject.set(x, "preserveOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveOrderUndefined: Self = StObject.set(x, "preserveOrder", js.undefined)
    }
  }
}
