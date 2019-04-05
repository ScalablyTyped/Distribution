package typings
package pDashLocateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefaultElement extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pLocate<ValueType>(
  // 	input: Iterable<PromiseLike<ValueType> | ValueType>,
  // 	tester: (element: ValueType) => PromiseLike<boolean> | boolean,
  // 	options?: pLocate.Options
  // ): Promise<ValueType | undefined>;
  // export = pLocate;
  @JSName("default")
  var default_Original: Anon_Default = js.native
  /**
  	Get the first fulfilled promise that satisfies the provided testing function.
  	@param input - An iterable of promises/values to test.
  	@param tester - This function will receive resolved values from `input` and is expected to return a `Promise<boolean>` or `boolean`.
  	@returns A `Promise` that is fulfilled when `tester` resolves to `true` or the iterable is done, or rejects if any of the promises reject. The fulfilled value is the current iterable value or `undefined` if `tester` never resolved to `true`.
  	@example
  	```
  	import pathExists = require('path-exists');
  	import pLocate = require('p-locate');
  	const files = [
  		'unicorn.png',
  		'rainbow.png', // Only this one actually exists on disk
  		'pony.png'
  	];
  	(async () => {
  		const foundPath = await pLocate(files, file => pathExists(file));
  		console.log(foundPath);
  		//=> 'rainbow'
  	})();
  	```
  	*/
  def apply[ValueType](
    input: stdLib.Iterable[js.Thenable[ValueType] | ValueType],
    tester: js.Function1[/* element */ ValueType, js.Thenable[scala.Boolean] | scala.Boolean]
  ): js.Promise[js.UndefOr[ValueType]] = js.native
  def apply[ValueType](
    input: stdLib.Iterable[js.Thenable[ValueType] | ValueType],
    tester: js.Function1[/* element */ ValueType, js.Thenable[scala.Boolean] | scala.Boolean],
    options: pDashLocateLib.pDashLocateMod.pLocateNs.Options
  ): js.Promise[js.UndefOr[ValueType]] = js.native
  /**
  	Get the first fulfilled promise that satisfies the provided testing function.
  	@param input - An iterable of promises/values to test.
  	@param tester - This function will receive resolved values from `input` and is expected to return a `Promise<boolean>` or `boolean`.
  	@returns A `Promise` that is fulfilled when `tester` resolves to `true` or the iterable is done, or rejects if any of the promises reject. The fulfilled value is the current iterable value or `undefined` if `tester` never resolved to `true`.
  	@example
  	```
  	import pathExists = require('path-exists');
  	import pLocate = require('p-locate');
  	const files = [
  		'unicorn.png',
  		'rainbow.png', // Only this one actually exists on disk
  		'pony.png'
  	];
  	(async () => {
  		const foundPath = await pLocate(files, file => pathExists(file));
  		console.log(foundPath);
  		//=> 'rainbow'
  	})();
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pLocate<ValueType>(
  // 	input: Iterable<PromiseLike<ValueType> | ValueType>,
  // 	tester: (element: ValueType) => PromiseLike<boolean> | boolean,
  // 	options?: pLocate.Options
  // ): Promise<ValueType | undefined>;
  // export = pLocate;
  def default[ValueType](
    input: stdLib.Iterable[js.Thenable[ValueType] | ValueType],
    tester: js.Function1[/* element */ ValueType, js.Thenable[scala.Boolean] | scala.Boolean]
  ): js.Promise[js.UndefOr[ValueType]] = js.native
  def default[ValueType](
    input: stdLib.Iterable[js.Thenable[ValueType] | ValueType],
    tester: js.Function1[/* element */ ValueType, js.Thenable[scala.Boolean] | scala.Boolean],
    options: pDashLocateLib.pDashLocateMod.pLocateNs.Options
  ): js.Promise[js.UndefOr[ValueType]] = js.native
}

