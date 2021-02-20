package typings.pathExists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("path-exists", JSImport.Namespace)
  @js.native
  def apply(path: String): js.Promise[Boolean] = js.native
  
  /**
  	Synchronously check if a path exists.
  	@returns Whether the path exists.
  	*/
  @JSImport("path-exists", "sync")
  @js.native
  def sync(path: String): Boolean = js.native
}
