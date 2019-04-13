package typings
package pathDashKeyLib.pathDashKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path-key", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pathKey(options?: pathKey.Options): string;
  // export = pathKey;
  @JSName("default")
  var default_Original: pathDashKeyLib.Anon_Default = js.native
  /**
  	Get the [PATH](https://en.wikipedia.org/wiki/PATH_(variable)) environment variable key cross-platform.
  	@example
  	```
  	import pathKey = require('path-key');
  	const key = pathKey();
  	//=> 'PATH'
  	const PATH = process.env[key];
  	//=> '/usr/local/bin:/usr/bin:/bin'
  	```
  	*/
  def apply(): java.lang.String = js.native
  def apply(options: Options): java.lang.String = js.native
  /**
  	Get the [PATH](https://en.wikipedia.org/wiki/PATH_(variable)) environment variable key cross-platform.
  	@example
  	```
  	import pathKey = require('path-key');
  	const key = pathKey();
  	//=> 'PATH'
  	const PATH = process.env[key];
  	//=> '/usr/local/bin:/usr/bin:/bin'
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pathKey(options?: pathKey.Options): string;
  // export = pathKey;
  def default(): java.lang.String = js.native
  def default(options: Options): java.lang.String = js.native
}

