package typings.pDashWaitDashFor

import typings.pDashWaitDashFor.pDashWaitDashForMod.Options
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
  def apply(condition: js.Function0[js.Thenable[Boolean] | Boolean]): js.Promise[Unit] = js.native
  def apply(condition: js.Function0[js.Thenable[Boolean] | Boolean], options: Options): js.Promise[Unit] = js.native
}

