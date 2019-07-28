package typings.pkgDashUp.pkgDashUpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkg-up", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Find the closest `package.json` file.
  	@returns The filepath, or `null` if it couldn't be found.
  	@example
  	```
  	// /
  	// └── Users
  	//     └── sindresorhus
  	//         └── foo
  	//             ├── package.json
  	//             └── bar
  	//                 ├── baz
  	//                 └── example.js
  	// example.js
  	import pkgUp = require('pkg-up');
  	(async () => {
  		console.log(await pkgUp());
  		//=> '/Users/sindresorhus/foo/package.json'
  	})();
  	```
  	*/
  def apply(): js.Promise[String | Null] = js.native
  def apply(options: Options): js.Promise[String | Null] = js.native
  /**
  	Synchronously find the closest `package.json` file.
  	@returns The filepath, or `null` if it couldn't be found.
  	*/
  def sync(): String | Null = js.native
  def sync(options: Options): String | Null = js.native
}

