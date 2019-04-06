package typings
package npmDashUserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefaultName extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function npmUser(name: string): Promise<npmUser.UserInfo>;
  // export = npmUser;
  @JSName("default")
  var default_Original: Anon_Default = js.native
  /**
  	Get user info of an npm user.
  	@param name - User's username on npm.
  	@example
  	```
  	import npmUser = require('npm-user');
  	(async () => {
  		console.log(await npmUser('sindresorhus'));
  		// {
  		// 	name: 'Sindre Sorhus',
  		// 	avatar: 'https://gravatar.com/avatar/d36a92237c75c5337c17b60d90686bf9?size=496',
  		// 	email: 'sindresorhus@gmail.com',
  		// 	github: 'sindresorhus',
  		// 	twitter: 'sindresorhus'
  		// }
  	})();
  	```
  	*/
  def apply(name: java.lang.String): js.Promise[npmDashUserLib.npmDashUserMod.npmUserNs.UserInfo] = js.native
  /**
  	Get user info of an npm user.
  	@param name - User's username on npm.
  	@example
  	```
  	import npmUser = require('npm-user');
  	(async () => {
  		console.log(await npmUser('sindresorhus'));
  		// {
  		// 	name: 'Sindre Sorhus',
  		// 	avatar: 'https://gravatar.com/avatar/d36a92237c75c5337c17b60d90686bf9?size=496',
  		// 	email: 'sindresorhus@gmail.com',
  		// 	github: 'sindresorhus',
  		// 	twitter: 'sindresorhus'
  		// }
  	})();
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function npmUser(name: string): Promise<npmUser.UserInfo>;
  // export = npmUser;
  def default(name: java.lang.String): js.Promise[npmDashUserLib.npmDashUserMod.npmUserNs.UserInfo] = js.native
}

