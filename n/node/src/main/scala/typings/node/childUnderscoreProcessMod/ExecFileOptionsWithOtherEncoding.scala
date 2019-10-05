package typings.node.childUnderscoreProcessMod

import typings.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecFileOptionsWithOtherEncoding extends ExecFileOptions {
  var encoding: java.lang.String
}

object ExecFileOptionsWithOtherEncoding {
  @scala.inline
  def apply(
    encoding: java.lang.String,
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
  ): ExecFileOptionsWithOtherEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding)
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
    __obj.asInstanceOf[ExecFileOptionsWithOtherEncoding]
  }
}

