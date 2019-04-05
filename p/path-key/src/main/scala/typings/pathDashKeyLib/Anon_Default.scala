package typings
package pathDashKeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
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
  def apply(options: pathDashKeyLib.pathDashKeyMod.pathKeyNs.Options): java.lang.String = js.native
}

