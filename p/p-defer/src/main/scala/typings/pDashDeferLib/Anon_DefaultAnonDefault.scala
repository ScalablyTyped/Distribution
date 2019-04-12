package typings
package pDashDeferLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefaultAnonDefault extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pDefer<ValueType = unknown>(): pDefer.DeferredPromise<
  // 	ValueType
  // >;
  // export = pDefer;
  @JSName("default")
  var default_Original: Anon_Default = js.native
  /**
  	Create a deferred promise.
  	@example
  	```
  	import pDefer = require('p-defer');
  	function delay(ms) {
  		const deferred = pDefer();
  		setTimeout(deferred.resolve, ms, '🦄');
  		return deferred.promise;
  	}
  	(async () => {
  		console.log(await delay(100));
  		//=> '🦄'
  	})();
  	```
  	*/
  def apply[ValueType](): pDashDeferLib.pDashDeferMod.pDeferNs.DeferredPromise[ValueType] = js.native
  /**
  	Create a deferred promise.
  	@example
  	```
  	import pDefer = require('p-defer');
  	function delay(ms) {
  		const deferred = pDefer();
  		setTimeout(deferred.resolve, ms, '🦄');
  		return deferred.promise;
  	}
  	(async () => {
  		console.log(await delay(100));
  		//=> '🦄'
  	})();
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pDefer<ValueType = unknown>(): pDefer.DeferredPromise<
  // 	ValueType
  // >;
  // export = pDefer;
  def default[ValueType](): pDashDeferLib.pDashDeferMod.pDeferNs.DeferredPromise[ValueType] = js.native
}

