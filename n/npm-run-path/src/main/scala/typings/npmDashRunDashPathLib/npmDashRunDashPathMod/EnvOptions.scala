package typings
package npmDashRunDashPathLib.npmDashRunDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvOptions extends js.Object {
  /**
  		Working directory.
  		@default process.cwd()
  		*/
  val cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Accepts an object of environment variables, like `process.env`, and modifies the PATH using the correct [PATH key](https://github.com/sindresorhus/path-key). Use this if you're modifying the PATH for use in the `child_process` options.
  		*/
  val env: js.UndefOr[ProcessEnv] = js.undefined
}

object EnvOptions {
  @scala.inline
  def apply(cwd: java.lang.String = null, env: ProcessEnv = null): EnvOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (env != null) __obj.updateDynamic("env")(env)
    __obj.asInstanceOf[EnvOptions]
  }
}

