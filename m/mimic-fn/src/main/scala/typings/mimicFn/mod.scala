package typings.mimicFn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mimic-fn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ArgumentsType /* <: js.Array[Any] */, ReturnType, FunctionType /* <: js.Function1[/* arguments */ ArgumentsType, ReturnType] */](to: js.Function1[/* arguments */ ArgumentsType, ReturnType], from: FunctionType): FunctionType = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[FunctionType]
  inline def default[ArgumentsType /* <: js.Array[Any] */, ReturnType, FunctionType /* <: js.Function1[/* arguments */ ArgumentsType, ReturnType] */](to: js.Function1[/* arguments */ ArgumentsType, ReturnType], from: FunctionType, options: Options): FunctionType = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FunctionType]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setIgnoreNonConfigurable(value: Boolean): Self = StObject.set(x, "ignoreNonConfigurable", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNonConfigurableUndefined: Self = StObject.set(x, "ignoreNonConfigurable", js.undefined)
    }
  }
}
