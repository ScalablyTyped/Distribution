package typings.pWaitFor

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
    	Wait for a condition to be true.
    	@returns A promise that resolves when `condition` returns `true`. Rejects if `condition` throws or returns a `Promise` that rejects.
    	@example
    	```
    	import pWaitFor from 'p-wait-for';
    	import {pathExists} from 'path-exists';
    	await pWaitFor(() => pathExists('unicorn.png'));
    	console.log('Yay! The file now exists.');
    	```
    	*/
    inline def apply[ResolveValueType](
      condition: js.Function0[
          (PromiseLike[Boolean | ResolveValue[ResolveValueType]]) | Boolean | ResolveValue[ResolveValueType]
        ]
    ): js.Promise[ResolveValueType] = ^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResolveValueType]]
    inline def apply[ResolveValueType](
      condition: js.Function0[
          (PromiseLike[Boolean | ResolveValue[ResolveValueType]]) | Boolean | ResolveValue[ResolveValueType]
        ],
      options: Options[ResolveValueType]
    ): js.Promise[ResolveValueType] = (^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResolveValueType]]
    
    @JSImport("p-wait-for", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Resolve the main promise with a custom value.
    	@example
    	```
    	import pWaitFor from 'p-wait-for';
    	import pathExists from 'path-exists';
    	const path = await pWaitFor(async () => {
    		const path = getPath();
    		return await pathExists(path) && pWaitFor.resolveWith(path);
    	});
    	console.log(path);
    	```
    	*/
    inline def resolveWith[ValueType](value: ValueType): ResolveValue[ValueType] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveWith")(value.asInstanceOf[js.Any]).asInstanceOf[ResolveValue[ValueType]]
  }
  
  @JSImport("p-wait-for", "TimeoutError")
  @js.native
  open class TimeoutError ()
    extends typings.pTimeout.mod.TimeoutError {
    def this(message: String) = this()
  }
  
  trait Options[ResolveValueType] extends StObject {
    
    // eslint-disable-line @typescript-eslint/no-redundant-type-constituents
    /**
    	Whether to run the check immediately rather than starting by waiting `interval` milliseconds.
    	Useful for when the check, if run immediately, would likely return `false`. In this scenario, set `before` to `false`.
    	@default true
    	*/
    val before: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Number of milliseconds to wait after `condition` resolves to `false` before calling it again.
    	@default 20
    	*/
    val interval: js.UndefOr[Double] = js.undefined
    
    /**
    	Number of milliseconds to wait before automatically rejecting with a `TimeoutError`.
    	You can customize the timeout `Error` by specifying `TimeoutOptions`.
    	@default Infinity
    	@example
    	```
    	import pWaitFor from 'p-wait-for';
    	import {pathExists} from 'path-exists';
    	const originalSetTimeout = setTimeout;
    	const originalClearTimeout = clearTimeout;
    	sinon.useFakeTimers();
    	await pWaitFor(() => pathExists('unicorn.png'), {
    		timeout: {
    			milliseconds: 100,
    			message: new MyError('Time’s up!'),
    			customTimers: {
    				setTimeout: originalSetTimeout,
    				clearTimeout: originalClearTimeout
    			}
    		}
    	});
    	console.log('Yay! The file now exists.');
    	```
    	*/
    val timeout: js.UndefOr[Double | typings.pTimeout.mod.Options[ResolveValueType]] = js.undefined
  }
  object Options {
    
    inline def apply[ResolveValueType](): Options[ResolveValueType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[ResolveValueType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], ResolveValueType] (val x: Self & Options[ResolveValueType]) extends AnyVal {
      
      inline def setBefore(value: Boolean): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setTimeout(value: Double | typings.pTimeout.mod.Options[ResolveValueType]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait ResolveValue[ResolveValueType] extends StObject
}
