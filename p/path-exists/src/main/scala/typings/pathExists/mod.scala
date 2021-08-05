package typings.pathExists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Check if a path exists.
  	@returns Whether the path exists.
  	@example
  	```
  	// foo.ts
  	import pathExists = require('path-exists');
  	(async () => {
  		console.log(await pathExists('foo.ts'));
  		//=> true
  	})();
  	```
  	*/
  inline def apply(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  @JSImport("path-exists", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Synchronously check if a path exists.
  	@returns Whether the path exists.
  	*/
  inline def sync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
