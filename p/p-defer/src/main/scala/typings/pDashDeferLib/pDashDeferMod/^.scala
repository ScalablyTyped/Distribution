package typings
package pDashDeferLib.pDashDeferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-defer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pDefer<ValueType = unknown>(): pDefer.DeferredPromise<
  // 	ValueType
  // >;
  // export = pDefer;
  @JSName("default")
  var default_Original: pDashDeferLib.Anon_Default = js.native
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
  def apply[ValueType](): DeferredPromise[ValueType] = js.native
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
  def default[ValueType](): DeferredPromise[ValueType] = js.native
}

