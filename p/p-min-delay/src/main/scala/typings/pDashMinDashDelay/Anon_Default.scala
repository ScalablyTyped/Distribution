package typings.pDashMinDashDelay

import typings.pDashMinDashDelay.pDashMinDashDelayMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
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
  def apply[ValueType](promise: js.Thenable[ValueType], minimumDelay: Double): js.Promise[ValueType] = js.native
  def apply[ValueType](promise: js.Thenable[ValueType], minimumDelay: Double, options: Options): js.Promise[ValueType] = js.native
}

