package typings.node.childUnderscoreProcessMod

import typings.node.NodeJSNs.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecFileOptions extends CommonOptions {
  var killSignal: js.UndefOr[java.lang.String] = js.undefined
  var maxBuffer: js.UndefOr[Double] = js.undefined
  var shell: js.UndefOr[Boolean | java.lang.String] = js.undefined
  var windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
}

object ExecFileOptions {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    env: ProcessEnv = null,
    gid: Int | Double = null,
    killSignal: java.lang.String = null,
    maxBuffer: Int | Double = null,
    shell: Boolean | java.lang.String = null,
    timeout: Int | Double = null,
    uid: Int | Double = null,
    windowsHide: js.UndefOr[Boolean] = js.undefined,
    windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  ): ExecFileOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (env != null) __obj.updateDynamic("env")(env)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal)
    if (maxBuffer != null) __obj.updateDynamic("maxBuffer")(maxBuffer.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide)
    if (!js.isUndefined(windowsVerbatimArguments)) __obj.updateDynamic("windowsVerbatimArguments")(windowsVerbatimArguments)
    __obj.asInstanceOf[ExecFileOptions]
  }
}

