package typings
package pDashReduceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
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
  def apply[ValueType, ReducedValueType](
    input: stdLib.Iterable[js.Thenable[ValueType] | ValueType],
    reducer: pDashReduceLib.pDashReduceMod.ReducerFunction[ValueType, ReducedValueType]
  ): js.Promise[ReducedValueType] = js.native
  def apply[ValueType, ReducedValueType](
    input: stdLib.Iterable[js.Thenable[ValueType] | ValueType],
    reducer: pDashReduceLib.pDashReduceMod.ReducerFunction[ValueType, ReducedValueType],
    initialValue: ReducedValueType
  ): js.Promise[ReducedValueType] = js.native
}

