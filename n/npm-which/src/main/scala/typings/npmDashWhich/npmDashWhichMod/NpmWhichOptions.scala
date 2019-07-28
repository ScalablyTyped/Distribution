package typings.npmDashWhich.npmDashWhichMod

import typings.node.NodeJSNs.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for the `npmwhich`-module.
  */
trait NpmWhichOptions extends js.Object {
  /**
    * The directory to find the binary for.
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * The environment to use for resolving the binary.
    */
  var env: js.UndefOr[ProcessEnv] = js.undefined
}

object NpmWhichOptions {
  @scala.inline
  def apply(cwd: String = null, env: ProcessEnv = null): NpmWhichOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (env != null) __obj.updateDynamic("env")(env)
    __obj.asInstanceOf[NpmWhichOptions]
  }
}

