package typings.onetime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("onetime", JSImport.Namespace)
  @js.native
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType](fn: js.Function1[/* arguments */ ArgumentsType, ReturnType]): js.Function1[/* arguments */ ArgumentsType, ReturnType] = js.native
  @JSImport("onetime", JSImport.Namespace)
  @js.native
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType](fn: js.Function1[/* arguments */ ArgumentsType, ReturnType], options: Options): js.Function1[/* arguments */ ArgumentsType, ReturnType] = js.native
  
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
  @JSImport("onetime", "callCount")
  @js.native
  def callCount(fn: js.Function1[/* repeated */ js.Any, _]): Double = js.native
  
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof onetime */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Throw an error when called more than once.
    		@default false
    		*/
    var `throw`: js.UndefOr[Boolean] = js.native
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
      def setThrow(value: Boolean): Self = StObject.set(x, "throw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowUndefined: Self = StObject.set(x, "throw", js.undefined)
    }
  }
}
