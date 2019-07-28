package typings.pDashDefer.pDashDeferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-defer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
}

