package typings
package oraLib.oraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ora", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: oraLib.Anon_Action = js.native
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
  def apply(): Ora = js.native
  def apply(options: java.lang.String): Ora = js.native
  def apply(options: Options): Ora = js.native
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
  // TODO: Remove this for the next major release
  def default(): Ora = js.native
  def default(options: java.lang.String): Ora = js.native
  def default(options: Options): Ora = js.native
  /**
  	Starts a spinner for a promise. The spinner is stopped with `.succeed()` if the promise fulfills or with `.fail()` if it rejects.
  	@param action - The promise to start the spinner for.
  	@param options - If a string is provided, it is treated as a shortcut for `options.text`.
  	@returns The spinner instance.
  	*/
  def promise(action: js.Thenable[_]): Ora = js.native
  def promise(action: js.Thenable[_], options: java.lang.String): Ora = js.native
  def promise(action: js.Thenable[_], options: Options): Ora = js.native
}

