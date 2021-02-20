package typings.pkgDir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @JSImport("pkg-dir", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[js.UndefOr[String]] = js.native
  @JSImport("pkg-dir", JSImport.Namespace)
  @js.native
  def apply(cwd: String): js.Promise[js.UndefOr[String]] = js.native
  
  /**
  	Synchronously find the root directory of a Node.js project or npm package.
  	@param cwd - Directory to start from. Default: `process.cwd()`.
  	@returns The project root path or `undefined` if it couldn't be found.
  	*/
  @JSImport("pkg-dir", "sync")
  @js.native
  def sync(): js.UndefOr[String] = js.native
  @JSImport("pkg-dir", "sync")
  @js.native
  def sync(cwd: String): js.UndefOr[String] = js.native
}
