package typings.pThrottle.mod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-throttle", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var AbortError: Instantiable0[AbortErrorClass] = js.native
  // TODO: Remove this for the next major release
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pThrottle */ js.Any = js.native
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
    limit: Double,
    interval: Double
  ): ThrottledFunction[Arguments, Return] = js.native
}

