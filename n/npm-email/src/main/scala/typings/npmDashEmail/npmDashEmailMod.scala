package typings.npmDashEmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("npm-email", JSImport.Namespace)
@js.native
object npmDashEmailMod extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function npmEmail(username: string): Promise<string>;
  // export = npmEmail;
  @JSName("default")
  var default_Original: Anon_Default = js.native
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
}

