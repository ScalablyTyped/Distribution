package typings
package paralleljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallelOptions extends js.Object {
  /**
  	* This is the path to the file eval.js.  This is required when running in node, and required for some browsers (IE 10) in order to work around cross-domain restrictions for web workers.  Defaults to the same location as parallel.js in node environments, and null in the browser.
  	**/
  var evalPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* The maximum number of permitted worker threads.  This will default to 4, or the number of cpus on your computer if you're running node.
  	**/
  var maxWorkers: js.UndefOr[scala.Double] = js.undefined
  /**
  	* If webworkers are not available, whether or not to fall back to synchronous processing using setTimeout.  Defaults to true.
  	**/
  var synchronous: js.UndefOr[scala.Boolean] = js.undefined
}

