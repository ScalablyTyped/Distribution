package typings
package pkgDashDirLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Cwd extends js.Object {
  /**
  	Find the root directory of a Node.js project or npm package.
  	@param cwd - Directory to start from. Default: `process.cwd()`.
  	@returns The project root path or `undefined` if it couldn't be found.
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
  	import pkgDir = require('pkg-dir');
  	(async () => {
  		const rootDir = await pkgDir(__dirname);
  		console.log(rootDir);
  		//=> '/Users/sindresorhus/foo'
  	})();
  	```
  	*/
  def apply(): js.Promise[js.UndefOr[java.lang.String]] = js.native
  def apply(cwd: java.lang.String): js.Promise[js.UndefOr[java.lang.String]] = js.native
  /**
  	Synchronously find the root directory of a Node.js project or npm package.
  	@param cwd - Directory to start from. Default: `process.cwd()`.
  	@returns The project root path or `undefined` if it couldn't be found.
  	*/
  def sync(): js.UndefOr[java.lang.String] = js.native
  def sync(cwd: java.lang.String): js.UndefOr[java.lang.String] = js.native
}

