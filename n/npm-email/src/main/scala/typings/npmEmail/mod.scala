package typings.npmEmail

import typings.npmEmail.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  inline def apply(username: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(username.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @JSImport("npm-email", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function npmEmail(username: string): Promise<string>;
  // export = npmEmail;
  @JSImport("npm-email", "default")
  @js.native
  def default: Call = js.native
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
  inline def default(username: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(username.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
