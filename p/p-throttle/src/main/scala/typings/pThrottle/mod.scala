package typings.pThrottle

import org.scalablytyped.runtime.Instantiable0
import typings.pThrottle.anon.Abort
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	[Throttle](https://css-tricks.com/debouncing-throttling-explained-examples/) promise-returning/async/normal functions.
  	@param fn - Promise-returning/async function or a normal function.
  	@param limit - Maximum number of calls within an `interval`.
  	@param interval - Timespan for `limit` in milliseconds.
  	@returns A throttled version of `fn`.
  	@example
  	```
  	import pThrottle from 'p-throttle';
  	const throttled = pThrottle(async index => {
  		return index * 2;
  	}, 2, 1000);
  	for (let i = 1; i <= 6; i++) {
  		throttled(i).then(console.log);
  	}
  	```
  	*/
  @JSImport("p-throttle", JSImport.Namespace)
  @js.native
  def apply[Arguments /* <: js.Array[_] */, Return](
    fn: js.Function1[/* arguments */ Arguments, js.Thenable[Return] | Return],
    limit: Double,
    interval: Double
  ): ThrottledFunction[Arguments, Return] = js.native
  
  @JSImport("p-throttle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release
  @JSImport("p-throttle", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pThrottle */ js.Any = js.native
  
  @JSImport("p-throttle", "AbortError")
  @js.native
  def AbortError: Instantiable0[AbortErrorClass] = js.native
  type AbortError = AbortErrorClass
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("p-throttle", "AbortError")
  @js.native
  /**
  	Abort pending execution. All unresolved promised are rejected with a `AbortError` error.
  	*/
  class AbortErrorCls () extends AbortErrorClass
  
  @scala.inline
  def AbortError_=(x: Instantiable0[AbortErrorClass]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AbortError")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pThrottle */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @js.native
  trait AbortErrorClass extends Error {
    
    @JSName("name")
    val name_AbortErrorClass: typings.pThrottle.pThrottleStrings.AbortError = js.native
  }
  object AbortErrorClass {
    
    @scala.inline
    def apply(message: String, name: typings.pThrottle.pThrottleStrings.AbortError): AbortErrorClass = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbortErrorClass]
    }
    
    @scala.inline
    implicit class AbortErrorClassMutableBuilder[Self <: AbortErrorClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.pThrottle.pThrottleStrings.AbortError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ThrottledFunction[Arguments /* <: js.Array[_] */, Return] = (js.Function1[/* arguments */ Arguments, js.Promise[Return]]) with Abort
}
