package typings.pMinDelay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Delay a promise a minimum amount of time.
  	@param promise - Promise to delay.
  	@param minimumDelay - Time in milliseconds.
  	@example
  	```
  	import pMinDelay = require('p-min-delay');
  	(async () => {
  		const value = await pMinDelay(somePromise, 1000);
  		// Executed after minimum 1 second even if `somePromise` fulfills before that
  	})();
  	```
  	*/
  @scala.inline
  def apply[ValueType](promise: js.Thenable[ValueType], minimumDelay: Double): js.Promise[ValueType] = (^.asInstanceOf[js.Dynamic].apply(promise.asInstanceOf[js.Any], minimumDelay.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ValueType]]
  @scala.inline
  def apply[ValueType](promise: js.Thenable[ValueType], minimumDelay: Double, options: Options): js.Promise[ValueType] = (^.asInstanceOf[js.Dynamic].apply(promise.asInstanceOf[js.Any], minimumDelay.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ValueType]]
  
  @JSImport("p-min-delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pMinDelay<ValueType>(
  // 	promise: PromiseLike<ValueType>,
  // 	minimumDelay: number,
  // 	options?: pMinDelay.Options
  // ): Promise<ValueType>;
  // export = pMinDelay;
  @JSImport("p-min-delay", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pMinDelay */ js.Any = js.native
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pMinDelay */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait Options extends StObject {
    
    /**
    		Delay the rejection.
    		Turn this off if you want a rejected promise to fail fast.
    		@default true
    		*/
    val delayRejection: js.UndefOr[Boolean] = js.undefined
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
      def setDelayRejection(value: Boolean): Self = StObject.set(x, "delayRejection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayRejectionUndefined: Self = StObject.set(x, "delayRejection", js.undefined)
    }
  }
}
