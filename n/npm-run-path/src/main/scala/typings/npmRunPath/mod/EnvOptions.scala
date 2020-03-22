package typings.npmRunPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvOptions extends js.Object {
  /**
  		Working directory.
  		@default process.cwd()
  		*/
  val cwd: js.UndefOr[String] = js.undefined
  /**
  		Accepts an object of environment variables, like `process.env`, and modifies the PATH using the correct [PATH key](https://github.com/sindresorhus/path-key). Use this if you're modifying the PATH for use in the `child_process` options.
  		*/
  val env: js.UndefOr[ProcessEnv] = js.undefined
  /**
  		Path to the current Node.js executable. Its directory is pushed to the front of PATH.
  		This can be either an absolute path or a path relative to the `cwd` option.
  		@default process.execPath
  		*/
  val execPath: js.UndefOr[String] = js.undefined
}

object EnvOptions {
  @scala.inline
  def apply(cwd: String = null, env: ProcessEnv = null, execPath: String = null): EnvOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (execPath != null) __obj.updateDynamic("execPath")(execPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvOptions]
  }
}

