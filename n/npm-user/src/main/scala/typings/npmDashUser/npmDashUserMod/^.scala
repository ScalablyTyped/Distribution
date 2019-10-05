package typings.npmDashUser.npmDashUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("npm-user", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function npmUser(name: string): Promise<npmUser.UserInfo>;
  // export = npmUser;
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof npmUser */ js.Any = js.native
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
  def apply(name: String): js.Promise[UserInfo] = js.native
}

