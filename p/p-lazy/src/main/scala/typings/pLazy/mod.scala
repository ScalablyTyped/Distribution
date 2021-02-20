package typings.pLazy

import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-lazy", JSImport.Namespace)
  @js.native
  class ^[ValueType] () extends Promise[ValueType]
  
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
  /* static member */
  @JSImport("p-lazy", "from")
  @js.native
  def from[ValueType](fn: js.Function0[ValueType | js.Thenable[ValueType]]): PLazy[ValueType] = js.native
  
  type PLazy[ValueType] = js.Promise[ValueType]
}
