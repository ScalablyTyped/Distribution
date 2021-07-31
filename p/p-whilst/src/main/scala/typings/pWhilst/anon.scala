package typings.pWhilst

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    /**
    	While `condition` returns `true`, executes `action` repeatedly, and then resolves the promise. Rejects if `action` returns a promise that rejects or if an error is thrown anywhere.
    	@param condition - Expected to return a boolean of whether to execute `action`.
    	@param action - Action to run for each iteration. You can return a promise and it will be handled.
    	@example
    	```
    	import pWhilst = require('p-whilst');
    	(async () => {
    		let count = 0;
    		await pWhilst(
    			() => count < 5,
    			() => count++
    		);
    		console.log(count);
    		//=> 5
    	})();
    	```
    	*/
    def apply[ValueType](
      condition: js.Function1[/* value */ js.UndefOr[ValueType], Boolean],
      action: js.Function0[ValueType | js.Thenable[ValueType]]
    ): js.Promise[Unit] = js.native
  }
}
