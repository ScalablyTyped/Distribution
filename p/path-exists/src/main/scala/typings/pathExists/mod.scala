package typings.pathExists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path-exists", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
  def apply(path: String): js.Promise[Boolean] = js.native
  /**
  	Synchronously check if a path exists.
  	@returns Whether the path exists.
  	*/
  def sync(path: String): Boolean = js.native
}

