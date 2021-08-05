package typings.mimicFn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Modifies the `to` function to mimic the `from` function. Returns the `to` function.
  `name`, `displayName`, and any other properties of `from` are copied. The `length` property is not copied. Prototype, class, and inherited properties are copied.
  `to.toString()` will return the same as `from.toString()` but prepended with a `Wrapped with to()` comment.
  @param to - Mimicking function.
  @param from - Function to mimic.
  @returns The modified `to` function.
  @example
  ```
  import mimicFn = require('mimic-fn');
  function foo() {}
  foo.unicorn = '🦄';
  function wrapper() {
  	return foo();
  }
  console.log(wrapper.name);
  //=> 'wrapper'
  mimicFn(wrapper, foo);
  console.log(wrapper.name);
  //=> 'foo'
  console.log(wrapper.unicorn);
  //=> '🦄'
  ```
  */
  inline def apply[ArgumentsType /* <: js.Array[js.Any] */, ReturnType, FunctionType /* <: js.Function1[/* arguments */ ArgumentsType, ReturnType] */](to: js.Function1[/* arguments */ ArgumentsType, ReturnType], from: FunctionType): FunctionType = (^.asInstanceOf[js.Dynamic].apply(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[FunctionType]
  inline def apply[ArgumentsType /* <: js.Array[js.Any] */, ReturnType, FunctionType /* <: js.Function1[/* arguments */ ArgumentsType, ReturnType] */](to: js.Function1[/* arguments */ ArgumentsType, ReturnType], from: FunctionType, options: Options): FunctionType = (^.asInstanceOf[js.Dynamic].apply(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FunctionType]
  
  @JSImport("mimic-fn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
    		Skip modifying [non-configurable properties](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/getOwnPropertyDescriptor#Description) instead of throwing an error.
    		@default false
    		*/
    val ignoreNonConfigurable: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIgnoreNonConfigurable(value: Boolean): Self = StObject.set(x, "ignoreNonConfigurable", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNonConfigurableUndefined: Self = StObject.set(x, "ignoreNonConfigurable", js.undefined)
    }
  }
}
