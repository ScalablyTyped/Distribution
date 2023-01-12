package typings.pAny

import typings.pCancelable.mod.default
import typings.std.PromiseLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-any", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ValueType](input: js.Iterable[Value[ValueType]]): CancelablePromise[ValueType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[CancelablePromise[ValueType]]
  inline def default[ValueType](input: js.Iterable[Value[ValueType]], options: Options[ValueType]): CancelablePromise[ValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[ValueType]]
  
  @JSImport("p-any", "AggregateError")
  @js.native
  open class AggregateError[T /* <: js.Error */] protected ()
    extends typings.pSome.mod.AggregateError[T] {
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
  
  type CancelablePromise[ValueType] = default[ValueType]
  
  /* Inlined std.Omit<p-some.p-some.Options<ValueType>, 'count'> */
  trait Options[ValueType] extends StObject {
    
    var filter: js.UndefOr[js.Function1[/* value */ ValueType, Boolean]] = js.undefined
  }
  object Options {
    
    inline def apply[ValueType](): Options[ValueType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[ValueType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], ValueType] (val x: Self & Options[ValueType]) extends AnyVal {
      
      inline def setFilter(value: /* value */ ValueType => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
  
  type Value[ValueType] = ValueType | PromiseLike[ValueType]
}
