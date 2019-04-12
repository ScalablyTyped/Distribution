package typings
package pDashDeferLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
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
}

