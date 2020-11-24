package typings.npmEmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Call extends js.Object {
    
    /**
    	Get the email of an npm user.
    	@param username - npm username to look up.
    	@returns The user's email address.
    	@example
    	```
    	import npmEmail = require('npm-email');
    	(async () => {
    		console.log(await npmEmail('sindresorhus'));
    		//=> 'sindresorhus@gmail.com'
    	})();
    	```
    	*/
    def apply(username: String): js.Promise[String] = js.native
  }
}
