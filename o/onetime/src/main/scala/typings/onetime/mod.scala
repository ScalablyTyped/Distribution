package typings.onetime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Ensure a function is only called once. When called multiple times it will return the return value from the first call.
  	@param fn - Function that should only be called once.
  	@returns A function that only calls `fn` once.
  	@example
  	```
  	import onetime = require('onetime');
  	let i = 0;
  	const foo = onetime(() => ++i);
  	foo(); //=> 1
  	foo(); //=> 1
  	foo(); //=> 1
  	onetime.callCount(foo); //=> 3
  	```
  	*/
  inline def apply[ArgumentsType /* <: js.Array[js.Any] */, ReturnType](fn: js.Function1[/* arguments */ ArgumentsType, ReturnType]): js.Function1[/* arguments */ ArgumentsType, ReturnType] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arguments */ ArgumentsType, ReturnType]]
  inline def apply[ArgumentsType /* <: js.Array[js.Any] */, ReturnType](fn: js.Function1[/* arguments */ ArgumentsType, ReturnType], options: Options): js.Function1[/* arguments */ ArgumentsType, ReturnType] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arguments */ ArgumentsType, ReturnType]]
  
  @JSImport("onetime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release
  @JSImport("onetime", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof onetime */ js.Any = js.native
  
  /**
  	Get the number of times `fn` has been called.
  	@param fn - Function to get call count from.
  	@returns A number representing how many times `fn` has been called.
  	@example
  	```
  	import onetime = require('onetime');
  	const foo = onetime(() => {});
  	foo();
  	foo();
  	foo();
  	console.log(onetime.callCount(foo));
  	//=> 3
  	```
  	*/
  inline def callCount(fn: js.Function1[/* repeated */ js.Any, js.Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("callCount")(fn.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof onetime */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait Options extends StObject {
    
    /**
    		Throw an error when called more than once.
    		@default false
    		*/
    var `throw`: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setThrow(value: Boolean): Self = StObject.set(x, "throw", value.asInstanceOf[js.Any])
      
      inline def setThrowUndefined: Self = StObject.set(x, "throw", js.undefined)
    }
  }
}
