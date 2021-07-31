package typings.pkgDir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  @scala.inline
  def apply(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[js.UndefOr[String]]]
  @scala.inline
  def apply(cwd: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  @JSImport("pkg-dir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Synchronously find the root directory of a Node.js project or npm package.
  	@param cwd - Directory to start from. Default: `process.cwd()`.
  	@returns The project root path or `undefined` if it couldn't be found.
  	*/
  @scala.inline
  def sync(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def sync(cwd: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(cwd.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
