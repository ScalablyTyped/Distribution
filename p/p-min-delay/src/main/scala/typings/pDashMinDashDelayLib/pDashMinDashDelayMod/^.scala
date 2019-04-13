package typings
package pDashMinDashDelayLib.pDashMinDashDelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-min-delay", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pMinDelay<ValueType>(
  // 	promise: PromiseLike<ValueType>,
  // 	minimumDelay: number,
  // 	options?: pMinDelay.Options
  // ): Promise<ValueType>;
  // export = pMinDelay;
  @JSName("default")
  var default_Original: pDashMinDashDelayLib.Anon_Default = js.native
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
  def apply[ValueType](promise: js.Thenable[ValueType], minimumDelay: scala.Double): js.Promise[ValueType] = js.native
  def apply[ValueType](promise: js.Thenable[ValueType], minimumDelay: scala.Double, options: Options): js.Promise[ValueType] = js.native
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
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pMinDelay<ValueType>(
  // 	promise: PromiseLike<ValueType>,
  // 	minimumDelay: number,
  // 	options?: pMinDelay.Options
  // ): Promise<ValueType>;
  // export = pMinDelay;
  def default[ValueType](promise: js.Thenable[ValueType], minimumDelay: scala.Double): js.Promise[ValueType] = js.native
  def default[ValueType](promise: js.Thenable[ValueType], minimumDelay: scala.Double, options: Options): js.Promise[ValueType] = js.native
}

