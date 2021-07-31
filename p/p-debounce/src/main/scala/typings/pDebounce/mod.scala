package typings.pDebounce

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	[Debounce](https://css-tricks.com/debouncing-throttling-explained-examples/) promise-returning & async functions.
  	@param fn - Promise-returning/async function to debounce.
  	@param wait - Milliseconds to wait before calling `fn`.
  	@returns A function that delays calling `fn` until after `wait` milliseconds have elapsed since the last time it was called.
  	@example
  	```
  	import pDebounce = require('p-debounce');
  	const expensiveCall = async input => input;
  	const debouncedFn = pDebounce(expensiveCall, 200);
  	for (const i of [1, 2, 3]) {
  		debouncedFn(i).then(console.log);
  	}
  	//=> 3
  	//=> 3
  	//=> 3
  	```
  	*/
  @scala.inline
  def apply[ArgumentsType /* <: js.Array[js.Any] */, ReturnType](
    fn: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType] | ReturnType],
    wait: Double
  ): js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]]]
  @scala.inline
  def apply[ArgumentsType /* <: js.Array[js.Any] */, ReturnType](
    fn: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType] | ReturnType],
    wait: Double,
    options: Options
  ): js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]]]
  
  @JSImport("p-debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pDebounce<ArgumentsType extends unknown[], ReturnType>(
  // 	fn: (...arguments: ArgumentsType) => PromiseLike<ReturnType> | ReturnType,
  // 	wait: number,
  // 	options?: pDebounce.Options
  // ): (...arguments: ArgumentsType) => Promise<ReturnType>;
  // export = pDebounce;
  @JSImport("p-debounce", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pDebounce */ js.Any = js.native
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pDebounce */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait Options extends StObject {
    
    /**
    		Call the `fn` on the [leading edge of the timeout](https://css-tricks.com/debouncing-throttling-explained-examples/#article-header-id-1). Meaning immediately, instead of waiting for `wait` milliseconds.
    		@default false
    		*/
    val leading: js.UndefOr[Boolean] = js.undefined
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
      def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
    }
  }
}
