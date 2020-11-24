package typings.npmEmail

import typings.npmEmail.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("npm-email", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
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
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function npmEmail(username: string): Promise<string>;
  // export = npmEmail;
  def default(username: String): js.Promise[String] = js.native
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function npmEmail(username: string): Promise<string>;
  // export = npmEmail;
  @JSName("default")
  var default_Original: Call = js.native
}
