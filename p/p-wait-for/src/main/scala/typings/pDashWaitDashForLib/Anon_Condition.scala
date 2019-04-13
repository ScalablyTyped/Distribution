package typings
package pDashWaitDashForLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Condition extends js.Object {
  /**
  	Wait for a condition to be true.
  	@returns A promise that resolves when `condition` returns `true`. Rejects if `condition` throws or returns a `Promise` that rejects.
  	@example
  	```
  	import pWaitFor = require('p-wait-for');
  	import pathExists = require('path-exists');
  	(async () => {
  		await pWaitFor(() => pathExists('unicorn.png'));
  		console.log('Yay! The file now exists.');
  	})();
  	```
  	*/
  def apply(condition: js.Function0[js.Thenable[scala.Boolean] | scala.Boolean]): js.Promise[scala.Unit] = js.native
  def apply(
    condition: js.Function0[js.Thenable[scala.Boolean] | scala.Boolean],
    options: pDashWaitDashForLib.pDashWaitDashForMod.Options
  ): js.Promise[scala.Unit] = js.native
}

