package typings.pLazy

import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-lazy", JSImport.Namespace)
  @js.native
  class ^[ValueType] ()
    extends StObject
       with Promise[ValueType]
  @JSImport("p-lazy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @scala.inline
  def from[ValueType](fn: js.Function0[ValueType | js.Thenable[ValueType]]): PLazy[ValueType] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(fn.asInstanceOf[js.Any]).asInstanceOf[PLazy[ValueType]]
  
  type PLazy[ValueType] = js.Promise[ValueType]
}
