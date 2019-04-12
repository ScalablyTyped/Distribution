package typings
package pDashIsDashPromiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefaultInput extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pIsPromise(input: unknown): input is Promise<unknown>;
  // export = pIsPromise;
  @JSName("default")
  var default_Original: Anon_Default = js.native
  /**
  	Check if `input` is a ES2015 promise.
  	@param input - Value to be checked.
  	@example
  	```
  	import isPromise = require('p-is-promise');
  	isPromise(Promise.resolve('🦄'));
  	//=> true
  	```
  	*/
  def apply(input: js.Any): /* is std.Promise<unknown> */ scala.Boolean = js.native
  /**
  	Check if `input` is a ES2015 promise.
  	@param input - Value to be checked.
  	@example
  	```
  	import isPromise = require('p-is-promise');
  	isPromise(Promise.resolve('🦄'));
  	//=> true
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pIsPromise(input: unknown): input is Promise<unknown>;
  // export = pIsPromise;
  def default(input: js.Any): /* is std.Promise<unknown> */ scala.Boolean = js.native
}

