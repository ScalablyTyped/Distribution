package typings.pDashWaitDashFor.pDashWaitDashForMod

import typings.pDashWaitDashFor.Anon_Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-wait-for", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pWaitFor(
  // 	condition: () => PromiseLike<boolean> | boolean,
  // 	options?: pWaitFor.Options
  // ): Promise<void>;
  // export = pWaitFor;
  @JSName("default")
  var default_Original: Anon_Condition = js.native
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
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pWaitFor(
  // 	condition: () => PromiseLike<boolean> | boolean,
  // 	options?: pWaitFor.Options
  // ): Promise<void>;
  // export = pWaitFor;
  def default(condition: js.Function0[js.Thenable[Boolean] | Boolean]): js.Promise[Unit] = js.native
  def default(condition: js.Function0[js.Thenable[Boolean] | Boolean], options: Options): js.Promise[Unit] = js.native
}

