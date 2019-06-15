package typings
package npmDashWhichLib.npmDashWhichMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for the `npmwhich`-module.
  */
trait StaticWhichOptions extends js.Object {
  /**
    * The directory to find the binary for.
    */
  var cwd: java.lang.String
  /**
    * The environment to use for resolving the binary.
    */
  var env: js.UndefOr[nodeLib.NodeJSNs.ProcessEnv] = js.undefined
}

object StaticWhichOptions {
  @scala.inline
  def apply(cwd: java.lang.String, env: nodeLib.NodeJSNs.ProcessEnv = null): StaticWhichOptions = {
    val __obj = js.Dynamic.literal(cwd = cwd)
    if (env != null) __obj.updateDynamic("env")(env)
    __obj.asInstanceOf[StaticWhichOptions]
  }
}

