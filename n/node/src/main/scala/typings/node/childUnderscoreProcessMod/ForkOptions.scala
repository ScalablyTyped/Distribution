package typings.node.childUnderscoreProcessMod

import typings.node.NodeJSNs.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForkOptions extends ProcessEnvOptions {
  var detached: js.UndefOr[Boolean] = js.undefined
  var execArgv: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var execPath: js.UndefOr[java.lang.String] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var stdio: js.UndefOr[StdioOptions] = js.undefined
  var windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
}

object ForkOptions {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    detached: js.UndefOr[Boolean] = js.undefined,
    env: ProcessEnv = null,
    execArgv: js.Array[java.lang.String] = null,
    execPath: java.lang.String = null,
    gid: Int | Double = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    stdio: StdioOptions = null,
    uid: Int | Double = null,
    windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  ): ForkOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    if (env != null) __obj.updateDynamic("env")(env)
    if (execArgv != null) __obj.updateDynamic("execArgv")(execArgv)
    if (execPath != null) __obj.updateDynamic("execPath")(execPath)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsVerbatimArguments)) __obj.updateDynamic("windowsVerbatimArguments")(windowsVerbatimArguments)
    __obj.asInstanceOf[ForkOptions]
  }
}

