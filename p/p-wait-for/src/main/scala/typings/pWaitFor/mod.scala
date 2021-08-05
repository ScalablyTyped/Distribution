package typings.pWaitFor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Wait for a condition to be true.
  	@returns A promise that resolves when `condition` returns `true`. Rejects if `condition` throws or returns a `Promise` that rejects.
  	@example
  	```
  	import pWaitFor = require('p-wait-for');
  	import pathExists = require('path-exists');
  	(async () => {
  		await pWaitFor(() => pathExists('unicorn.png'));
  		console.log('Yay! The file now exists.');
  	})();
  	```
  	*/
  inline def apply(condition: js.Function0[js.Thenable[Boolean] | Boolean]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def apply(condition: js.Function0[js.Thenable[Boolean] | Boolean], options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("p-wait-for", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pWaitFor(
  // 	condition: () => PromiseLike<boolean> | boolean,
  // 	options?: pWaitFor.Options
  // ): Promise<void>;
  // export = pWaitFor;
  @JSImport("p-wait-for", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pWaitFor */ js.Any = js.native
  inline def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pWaitFor */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait Options extends StObject {
    
    /**
    		Number of milliseconds to wait before retrying `condition`.
    		@default 20
    		*/
    val interval: js.UndefOr[Double] = js.undefined
    
    /**
    		Number of milliseconds to wait before automatically rejecting.
    		@default Infinity
    		*/
    val timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
