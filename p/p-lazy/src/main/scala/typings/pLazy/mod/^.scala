package typings.pLazy.mod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p-lazy", JSImport.Namespace)
@js.native
class ^[ValueType] () extends Promise[ValueType]
@JSImport("p-lazy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  	Create a `PLazy` promise from a promise-returning or async function.
  	@example
  	```
  	import PLazy = require('p-lazy');
  	const lazyPromise = new PLazy(resolve => {
  		someHeavyOperation(resolve);
  	});
  	// `someHeavyOperation` is not yet called
  	(async () => {
  		await doSomethingFun;
  		// `someHeavyOperation` is called
  		console.log(await lazyPromise);
  	})();
  	```
  	*/
  def from[ValueType](fn: js.Function0[ValueType | js.Thenable[ValueType]]): PLazy[ValueType] = js.native
}
