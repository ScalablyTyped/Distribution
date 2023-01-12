package typings.pMap

import typings.std.AbortSignal
import typings.std.AsyncIterable
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Element, NewElement](input: js.Iterable[Element | js.Promise[Element]], mapper: Mapper[Element, NewElement]): js.Promise[js.Array[Exclude[NewElement, js.Symbol]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Exclude[NewElement, js.Symbol]]]]
  inline def default[Element, NewElement](
    input: js.Iterable[Element | js.Promise[Element]],
    mapper: Mapper[Element, NewElement],
    options: Options
  ): js.Promise[js.Array[Exclude[NewElement, js.Symbol]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Exclude[NewElement, js.Symbol]]]]
  inline def default[Element, NewElement](input: AsyncIterable[Element | js.Promise[Element]], mapper: Mapper[Element, NewElement]): js.Promise[js.Array[Exclude[NewElement, js.Symbol]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Exclude[NewElement, js.Symbol]]]]
  inline def default[Element, NewElement](
    input: AsyncIterable[Element | js.Promise[Element]],
    mapper: Mapper[Element, NewElement],
    options: Options
  ): js.Promise[js.Array[Exclude[NewElement, js.Symbol]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Exclude[NewElement, js.Symbol]]]]
  
  @JSImport("p-map", "pMapSkip")
  @js.native
  val pMapSkip: js.Symbol = js.native
  
  type Mapper[Element, NewElement] = js.Function2[/* element */ Element, /* index */ Double, MaybePromise[NewElement | js.Symbol]]
  
  type MaybePromise[T] = T | js.Promise[T]
  
  trait Options extends StObject {
    
    /**
    	Number of concurrently pending promises returned by `mapper`.
    	Must be an integer from 1 and up or `Infinity`.
    	@default Infinity
    	*/
    val concurrency: js.UndefOr[Double] = js.undefined
    
    /**
    	You can abort the promises using [`AbortController`](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    	**Requires Node.js 16 or later.*
    	@example
    	```
    	import pMap from 'p-map';
    	import delay from 'delay';
    	const abortController = new AbortController();
    	setTimeout(() => {
    		abortController.abort();
    	}, 500);
    	const mapper = async value => value;
    	await pMap([delay(1000), delay(1000)], mapper, {signal: abortController.signal});
    	// Throws AbortError (DOMException) after 500 ms.
    	```
    	*/
    val signal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
    	When `true`, the first mapper rejection will be rejected back to the consumer.
    	When `false`, instead of stopping when a promise rejects, it will wait for all the promises to settle and then reject with an [aggregated error](https://github.com/sindresorhus/aggregate-error) containing all the errors from the rejected promises.
    	Caveat: When `true`, any already-started async mappers will continue to run until they resolve or reject. In the case of infinite concurrency with sync iterables, *all* mappers are invoked on startup and will continue after the first rejection. [Issue #51](https://github.com/sindresorhus/p-map/issues/51) can be implemented for abort control.
    	@default true
    	*/
    val stopOnError: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setStopOnError(value: Boolean): Self = StObject.set(x, "stopOnError", value.asInstanceOf[js.Any])
      
      inline def setStopOnErrorUndefined: Self = StObject.set(x, "stopOnError", js.undefined)
    }
  }
}
