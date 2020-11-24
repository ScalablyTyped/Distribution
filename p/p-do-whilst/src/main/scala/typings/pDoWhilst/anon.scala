package typings.pDoWhilst

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Call extends js.Object {
    
    /**
    	Executes `action` repeatedly while `condition` returns `true` and then resolves the promise. Rejects if `action` returns a promise that rejects or if an error is thrown anywhere.
    	@param action - Action to run for each iteration. You can return a promise and it will be handled.
    	@param condition - Expected to return a boolean of whether to continue.
    	@example
    	```
    	import pDoWhilst = require('p-do-whilst');
    	(async () => {
    		let count = 0;
    		await pDoWhilst(
    			() => count++,
    			() => count < 5
    		);
    		console.log(count);
    		//=> 5
    	})();
    	```
    	*/
    def apply[ValueType](
      action: js.Function0[ValueType | js.Thenable[ValueType]],
      condition: js.Function1[/* value */ ValueType, Boolean]
    ): js.Promise[Unit] = js.native
  }
}
