package typings.pTimeout

import org.scalablytyped.runtime.Instantiable1
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Timeout a promise after a specified amount of time.
  	If you pass in a cancelable promise, specifically a promise with a `.cancel()` method, that method will be called when the `pTimeout` promise times out.
  	@param input - Promise to decorate.
  	@param milliseconds - Milliseconds before timing out.
  	@param message - Specify a custom error message or error. If you do a custom error, it's recommended to sub-class `pTimeout.TimeoutError`. Default: `'Promise timed out after 50 milliseconds'`.
  	@returns A decorated `input` that times out after `milliseconds` time.
  	@example
  	```
  	import delay = require('delay');
  	import pTimeout = require('p-timeout');
  	const delayedPromise = delay(200);
  	pTimeout(delayedPromise, 50).then(() => 'foo');
  	//=> [TimeoutError: Promise timed out after 50 milliseconds]
  	```
  	*/
  @scala.inline
  def apply[ValueType](input: js.Thenable[ValueType], milliseconds: Double): js.Promise[ValueType] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ValueType]]
  @scala.inline
  def apply[ValueType](input: js.Thenable[ValueType], milliseconds: Double, message: String): js.Promise[ValueType] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ValueType]]
  @scala.inline
  def apply[ValueType](input: js.Thenable[ValueType], milliseconds: Double, message: Error): js.Promise[ValueType] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ValueType]]
  /**
  	Timeout a promise after a specified amount of time.
  	If you pass in a cancelable promise, specifically a promise with a `.cancel()` method, that method will be called when the `pTimeout` promise times out.
  	@param input - Promise to decorate.
  	@param milliseconds - Milliseconds before timing out. Passing `Infinity` will cause it to never time out.
  	@param fallback - Do something other than rejecting with an error on timeout. You could for example retry.
  	@returns A decorated `input` that times out after `milliseconds` time.
  	@example
  	```
  	import delay = require('delay');
  	import pTimeout = require('p-timeout');
  	const delayedPromise = () => delay(200);
  	pTimeout(delayedPromise(), 50, () => {
  		return pTimeout(delayedPromise(), 300);
  	});
  	```
  	*/
  @scala.inline
  def apply[ValueType, ReturnType](
    input: js.Thenable[ValueType],
    milliseconds: Double,
    fallback: js.Function0[ReturnType | js.Promise[ReturnType]]
  ): js.Promise[ValueType | ReturnType] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ValueType | ReturnType]]
  
  @JSImport("p-timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release
  @JSImport("p-timeout", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pTimeout */ js.Any = js.native
  
  @JSImport("p-timeout", "TimeoutError")
  @js.native
  def TimeoutError: Instantiable1[/* message */ js.UndefOr[String], TimeoutErrorClass] = js.native
  type TimeoutError = TimeoutErrorClass
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("p-timeout", "TimeoutError")
  @js.native
  class TimeoutErrorCls ()
    extends StObject
       with TimeoutErrorClass {
    def this(message: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override val name_TimeoutErrorClass: typings.pTimeout.pTimeoutStrings.TimeoutError = js.native
  }
  
  @scala.inline
  def TimeoutError_=(x: Instantiable1[/* message */ js.UndefOr[String], TimeoutErrorClass]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TimeoutError")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pTimeout */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait TimeoutErrorClass
    extends StObject
       with Error {
    
    @JSName("name")
    val name_TimeoutErrorClass: typings.pTimeout.pTimeoutStrings.TimeoutError
  }
  object TimeoutErrorClass {
    
    @scala.inline
    def apply(message: String): TimeoutErrorClass = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = "TimeoutError")
      __obj.asInstanceOf[TimeoutErrorClass]
    }
    
    @scala.inline
    implicit class TimeoutErrorClassMutableBuilder[Self <: TimeoutErrorClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.pTimeout.pTimeoutStrings.TimeoutError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
