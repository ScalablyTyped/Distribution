package typings.pReduce

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Reduce a list of values using promises into a promise for a value.
  	@param input - Iterated over serially in the `reducer` function.
  	@param reducer - Expected to return a value. If a `Promise` is returned, it's awaited before continuing with the next iteration.
  	@param initialValue - Value to use as `previousValue` in the first `reducer` invocation.
  	@returns A `Promise` that is fulfilled when all promises in `input` and ones returned from `reducer` are fulfilled, or rejects if any of the promises reject. The resolved value is the result of the reduction.
  	@example
  	```
  	import pReduce = require('p-reduce');
  	import humanInfo from 'human-info'; // Not a real module
  	(async () => {
  		const names = [
  			getUser('sindresorhus').then(info => info.name),
  			'Addy Osmani',
  			'Pascal Hartig',
  			'Stephen Sawchuk'
  		];
  		const totalAge = await pReduce(names, async (total, name) => {
  			const info = await humanInfo(name);
  			return total + info.age;
  		}, 0);
  		console.log(totalAge);
  		//=> 125
  	})();
  	```
  	*/
  @JSImport("p-reduce", JSImport.Namespace)
  @js.native
  def apply[ValueType, ReducedValueType](
    input: Iterable[js.Thenable[ValueType] | ValueType],
    reducer: ReducerFunction[ValueType, ReducedValueType]
  ): js.Promise[ReducedValueType] = js.native
  @JSImport("p-reduce", JSImport.Namespace)
  @js.native
  def apply[ValueType, ReducedValueType](
    input: Iterable[js.Thenable[ValueType] | ValueType],
    reducer: ReducerFunction[ValueType, ReducedValueType],
    initialValue: ReducedValueType
  ): js.Promise[ReducedValueType] = js.native
  
  @JSImport("p-reduce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pReduce<ValueType, ReducedValueType = ValueType>(
  // 	input: Iterable<PromiseLike<ValueType> | ValueType>,
  // 	reducer: pReduce.ReducerFunction<ValueType, ReducedValueType>,
  // 	initialValue?: ReducedValueType
  // ): Promise<ReducedValueType>;
  // export = pReduce;
  @JSImport("p-reduce", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pReduce */ js.Any = js.native
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pReduce */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  type ReducerFunction[ValueType, ReducedValueType] = js.Function3[
    /* previousValue */ ReducedValueType, 
    /* currentValue */ ValueType, 
    /* index */ Double, 
    js.Thenable[ReducedValueType] | ReducedValueType
  ]
}
