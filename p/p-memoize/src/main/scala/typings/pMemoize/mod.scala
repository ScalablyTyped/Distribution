package typings.pMemoize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	[Memoize](https://en.wikipedia.org/wiki/Memoization) promise-returning & async functions.
  	@param fn - Promise-returning or async function to be memoized.
  	@param options - See the [`p-memoize` options](https://github.com/sindresorhus/p-memoize#options).
  	@returns A memoized version of the `input` function.
  	@example
  	```
  	import pMemoize = require('p-memoize');
  	import got = require('got');
  	const memGot = pMemoize(got, {maxAge: 1000});
  	(async () => {
  		memGot('https://sindresorhus.com');
  		// This call is cached
  		memGot('https://sindresorhus.com');
  		setTimeout(() => {
  			// This call is not cached as the cache has expired
  			memGot('https://sindresorhus.com');
  		}, 2000);
  	})();
  	```
  	*/
  inline def apply[ArgumentsType /* <: js.Array[js.Any] */, ReturnType, CacheKeyType](fn: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType]]): js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]]]
  inline def apply[ArgumentsType /* <: js.Array[js.Any] */, ReturnType, CacheKeyType](
    fn: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType]],
    options: Options[ArgumentsType, CacheKeyType, ReturnType]
  ): js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]]]
  
  @JSImport("p-memoize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Clear all cached data of a memoized function.
  	@param memoized - A function that was previously memoized. Will throw if passed a non-memoized function.
  	*/
  inline def clear(memoized: js.Function1[/* repeated */ js.Any, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(memoized.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options[ArgumentsType /* <: js.Array[js.Any] */, CacheKeyType, ReturnType]
    extends StObject
       with typings.mem.mod.Options[ArgumentsType, CacheKeyType] {
    
    /**
    		Cache rejected promises.
    		@default false
    		*/
    val cachePromiseRejection: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply[ArgumentsType /* <: js.Array[js.Any] */, CacheKeyType, ReturnType](): Options[ArgumentsType, CacheKeyType, ReturnType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[ArgumentsType, CacheKeyType, ReturnType]]
    }
    
    extension [Self <: Options[?, ?, ?], ArgumentsType /* <: js.Array[js.Any] */, CacheKeyType, ReturnType](x: Self & (Options[ArgumentsType, CacheKeyType, ReturnType])) {
      
      inline def setCachePromiseRejection(value: Boolean): Self = StObject.set(x, "cachePromiseRejection", value.asInstanceOf[js.Any])
      
      inline def setCachePromiseRejectionUndefined: Self = StObject.set(x, "cachePromiseRejection", js.undefined)
    }
  }
}
