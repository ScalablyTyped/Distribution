package typings.pDashTimes

import typings.pDashTimes.pDashTimesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Count extends js.Object {
  /**
  	Run promise-returning & async functions a specific number of times concurrently.
  	@param count - Number of times to call `mapper`.
  	@param mapper - Expected to return a `Promise` or value.
  	@returns Fulfills when all promises returned from `mapper` are fulfilled, or rejects if any of the promises reject. The fulfilled value is an `Array` of the fulfilled values returned from `mapper` in order.
  	@example
  	```
  	import pTimes = require('p-times');
  	(async () => {
  		const result = await pTimes(5, i => createFixture(`🦄-${i + 1}`));
  		console.log(`Created fixtures: ${result.join(' ')}`);
  		//=> 'Created fixtures: 🦄-1 🦄-2 🦄-3 🦄-4 🦄-5'
  	})();
  	```
  	*/
  def apply[ValueType](count: Double, mapper: js.Function1[/* index */ Double, ValueType | js.Thenable[ValueType]]): js.Promise[js.Array[ValueType]] = js.native
  def apply[ValueType](
    count: Double,
    mapper: js.Function1[/* index */ Double, ValueType | js.Thenable[ValueType]],
    options: Options
  ): js.Promise[js.Array[ValueType]] = js.native
}

