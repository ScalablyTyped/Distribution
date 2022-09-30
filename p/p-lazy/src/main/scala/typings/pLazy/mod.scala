package typings.pLazy

import typings.std.Promise
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-lazy", JSImport.Default)
  @js.native
  open class default[ValueType] ()
    extends StObject
       with Promise[ValueType]
  /* static members */
  object default {
    
    @JSImport("p-lazy", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Create a `PLazy` promise from a promise-returning or async function.
    	@example
    	```
    	import PLazy from 'p-lazy';
    	const lazyPromise = new PLazy(resolve => {
    		someHeavyOperation(resolve);
    	});
    	// `someHeavyOperation` is not yet called
    	await doSomethingFun;
    	// `someHeavyOperation` is called
    	console.log(await lazyPromise);
    	```
    	*/
    inline def from[ValueType](function_ : js.Function0[ValueType | PromiseLike[ValueType]]): js.Promise[ValueType] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(function_.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ValueType]]
  }
  
  type PLazy[ValueType] = js.Promise[ValueType]
}
