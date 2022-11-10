package typings.pThrottle

import typings.pThrottle.anon.Abort
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-throttle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Options): js.Function1[
    /* function_ */ js.Function1[/* arguments */ js.Array[Any], Any], 
    ThrottledFunction[js.Array[Any], Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* function_ */ js.Function1[/* arguments */ js.Array[Any], Any], 
    ThrottledFunction[js.Array[Any], Any]
  ]]
  
  @JSImport("p-throttle", "AbortError")
  @js.native
  /* private */ open class AbortError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    val name_AbortError: typings.pThrottle.pThrottleStrings.AbortError = js.native
  }
  
  trait Options extends StObject {
    
    /**
    	The timespan for `limit` in milliseconds.
    	*/
    val interval: Double
    
    /**
    	The maximum number of calls within an `interval`.
    	*/
    val limit: Double
    
    /**
    	Use a strict, more resource intensive, throttling algorithm. The default algorithm uses a windowed approach that will work correctly in most cases, limiting the total number of calls at the specified limit per interval window. The strict algorithm throttles each call individually, ensuring the limit is not exceeded for any interval.
    	@default false
    	*/
    val strict: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(interval: Double, limit: Double): Options = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  // TODO: Use the `Awaited` utility instead when targeting TS 4.5.
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    ValueType extends std.PromiseLike<infer ValueType> ? std.Promise<ValueType> : std.Promise<ValueType>
    }}}
    */
  @js.native
  trait PromiseResolve[ValueType] extends StObject
  
  type ThrottledFunction[Argument /* <: js.Array[Any] */, ReturnValue] = (js.Function1[/* arguments */ Argument, PromiseResolve[ReturnValue]]) & Abort
}
