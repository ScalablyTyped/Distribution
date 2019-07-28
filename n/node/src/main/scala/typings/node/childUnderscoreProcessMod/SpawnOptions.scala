package typings.node.childUnderscoreProcessMod

import typings.node.NodeJSNs.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnOptions extends CommonOptions {
  var argv0: js.UndefOr[java.lang.String] = js.undefined
  var detached: js.UndefOr[Boolean] = js.undefined
  var shell: js.UndefOr[Boolean | java.lang.String] = js.undefined
  var stdio: js.UndefOr[StdioOptions] = js.undefined
  var windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
}

object SpawnOptions {
  @scala.inline
  def apply(
    argv0: java.lang.String = null,
    cwd: java.lang.String = null,
    detached: js.UndefOr[Boolean] = js.undefined,
    env: ProcessEnv = null,
    gid: Int | Double = null,
    shell: Boolean | java.lang.String = null,
    stdio: StdioOptions = null,
    timeout: Int | Double = null,
    uid: Int | Double = null,
    windowsHide: js.UndefOr[Boolean] = js.undefined,
    windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  ): SpawnOptions = {
    val __obj = js.Dynamic.literal()
    if (argv0 != null) __obj.updateDynamic("argv0")(argv0)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    if (env != null) __obj.updateDynamic("env")(env)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide)
    if (!js.isUndefined(windowsVerbatimArguments)) __obj.updateDynamic("windowsVerbatimArguments")(windowsVerbatimArguments)
    __obj.asInstanceOf[SpawnOptions]
  }
}

