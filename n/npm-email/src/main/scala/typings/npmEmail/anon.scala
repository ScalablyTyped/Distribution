package typings.npmEmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
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
