package typings
package pDashThrottleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AbortError extends js.Object {
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
  def apply[Arguments /* <: js.Array[_] */, Return](
    fn: js.Function1[/* arguments */ Arguments, js.Thenable[Return] | Return],
    limit: scala.Double,
    interval: scala.Double
  ): pDashThrottleLib.pDashThrottleMod.ThrottledFunction[Arguments, Return] = js.native
}

