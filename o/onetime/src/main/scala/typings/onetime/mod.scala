package typings.onetime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
    	Ensure a function is only called once. When called multiple times it will return the return value from the first call.
    	@param fn - Function that should only be called once.
    	@returns A function that only calls `fn` once.
    	@example
    	```
    	import onetime from 'onetime';
    	let index = 0;
    	const foo = onetime(() => ++index);
    	foo(); //=> 1
    	foo(); //=> 1
    	foo(); //=> 1
    	onetime.callCount(foo); //=> 3
    	```
    	*/
    inline def apply[ArgumentsType /* <: js.Array[Any] */, ReturnType](fn: js.Function1[/* arguments */ ArgumentsType, ReturnType]): js.Function1[/* arguments */ ArgumentsType, ReturnType] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arguments */ ArgumentsType, ReturnType]]
    inline def apply[ArgumentsType /* <: js.Array[Any] */, ReturnType](fn: js.Function1[/* arguments */ ArgumentsType, ReturnType], options: Options): js.Function1[/* arguments */ ArgumentsType, ReturnType] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arguments */ ArgumentsType, ReturnType]]
    
    @JSImport("onetime", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Get the number of times `fn` has been called.
    	@param fn - Function to get call count from.
    	@returns A number representing how many times `fn` has been called.
    	@example
    	```
    	import onetime from 'onetime';
    	const foo = onetime(() => {});
    	foo();
    	foo();
    	foo();
    	console.log(onetime.callCount(foo));
    	//=> 3
    	```
    	*/
    inline def callCount(fn: js.Function1[/* repeated */ Any, Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("callCount")(fn.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  trait Options extends StObject {
    
    /**
    	Throw an error when called more than once.
    	@default false
    	*/
    val `throw`: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setThrow(value: Boolean): Self = StObject.set(x, "throw", value.asInstanceOf[js.Any])
      
      inline def setThrowUndefined: Self = StObject.set(x, "throw", js.undefined)
    }
  }
}
