package typings.pSome

import typings.aggregateError.mod.default
import typings.std.Error
import typings.std.PromiseLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-some", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](values: js.Iterable[Value[T]], options: Options[T]): CancelablePromise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[js.Array[T]]]
  
  @JSImport("p-some", "AggregateError")
  @js.native
  open class AggregateError[T /* <: js.Error */] protected () extends default[T] {
    /**
    	@param errors - If a string, a new `Error` is created with the string as the error message. If a non-Error object, a new `Error` is created with all properties from the object copied over.
    	@example
    	```
    	import AggregateError from 'aggregate-error';
    	const error = new AggregateError([new Error('foo'), 'bar', {message: 'baz'}]);
    	throw error;
    	// AggregateError:
    	//	Error: foo
    	//		at Object.<anonymous> (/Users/sindresorhus/dev/aggregate-error/example.js:3:33)
    	//	Error: bar
    	//		at Object.<anonymous> (/Users/sindresorhus/dev/aggregate-error/example.js:3:13)
    	//	Error: baz
    	//		at Object.<anonymous> (/Users/sindresorhus/dev/aggregate-error/example.js:3:13)
    	//	at AggregateError (/Users/sindresorhus/dev/aggregate-error/index.js:19:3)
    	//	at Object.<anonymous> (/Users/sindresorhus/dev/aggregate-error/example.js:3:13)
    	//	at Module._compile (module.js:556:32)
    	//	at Object.Module._extensions..js (module.js:565:10)
    	//	at Module.load (module.js:473:32)
    	//	at tryModuleLoad (module.js:432:12)
    	//	at Function.Module._load (module.js:424:3)
    	//	at Module.runMain (module.js:590:10)
    	//	at run (bootstrap_node.js:394:7)
    	//	at startup (bootstrap_node.js:149:9)
    	for (const individualError of error.errors) {
    		console.log(individualError);
    	}
    	//=> [Error: foo]
    	//=> [Error: bar]
    	//=> [Error: baz]
    	```
    	*/
    def this(errors: js.Array[T | (Record[String, Any]) | String]) = this()
  }
  
  @JSImport("p-some", "FilterError")
  @js.native
  open class FilterError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  type CancelablePromise[T] = typings.pCancelable.mod.default[T]
  
  trait Options[T] extends StObject {
    
    /**
    	Number of promises from `input` that have to be fulfilled until the returned promise is fulfilled. Minimum: `1`.
    	*/
    val count: Double
    
    /**
    	Used to filter out values that don't satisfy a condition.
    	@param value - The value resolved by the promise.
    	*/
    val filter: js.UndefOr[js.Function1[/* value */ T, Boolean]] = js.undefined
  }
  object Options {
    
    inline def apply[T](count: Double): Options[T] = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], T] (val x: Self & Options[T]) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: /* value */ T => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
  
  type Value[T] = T | PromiseLike[T]
}
