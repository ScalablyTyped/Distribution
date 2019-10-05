package typings.pathDashKey.pathDashKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path-key", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pathKey(options?: pathKey.Options): string;
  // export = pathKey;
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pathKey */ js.Any = js.native
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
  def apply(): String = js.native
  def apply(options: Options): String = js.native
}

