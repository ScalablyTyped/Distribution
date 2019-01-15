package typings
package npmDashRunDashPathLib.npmDashRunDashPathMod.npmRunPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvOptions extends js.Object {
  /**
    * Working directory.
    */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Accepts an object of environment variables, like `process.env`, and modifies the PATH using the correct
    * [PATH key](https://github.com/sindresorhus/path-key). Use this if you're modifying the PATH for use
    * in the `child_process` options.
    */
  var env: js.UndefOr[ProcessEnv] = js.undefined
}

