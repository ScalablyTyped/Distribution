package typings
package oraLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Action extends js.Object {
  /**
  	Elegant terminal spinner.
  	@param options - If a string is provided, it is treated as a shortcut for `options.text`.
  	@example
  	```
  	import ora = require('ora');
  	const spinner = ora('Loading unicorns').start();
  	setTimeout(() => {
  		spinner.color = 'yellow';
  		spinner.text = 'Loading rainbows';
  	}, 1000);
  	```
  	*/
  def apply(): oraLib.oraMod.oraNs.Ora = js.native
  def apply(options: java.lang.String): oraLib.oraMod.oraNs.Ora = js.native
  def apply(options: oraLib.oraMod.oraNs.Options): oraLib.oraMod.oraNs.Ora = js.native
  /**
  	Starts a spinner for a promise. The spinner is stopped with `.succeed()` if the promise fulfills or with `.fail()` if it rejects.
  	@param action - The promise to start the spinner for.
  	@param options - If a string is provided, it is treated as a shortcut for `options.text`.
  	@returns The spinner instance.
  	*/
  def promise(action: js.Thenable[_]): oraLib.oraMod.oraNs.Ora = js.native
  def promise(action: js.Thenable[_], options: java.lang.String): oraLib.oraMod.oraNs.Ora = js.native
  def promise(action: js.Thenable[_], options: oraLib.oraMod.oraNs.Options): oraLib.oraMod.oraNs.Ora = js.native
}

