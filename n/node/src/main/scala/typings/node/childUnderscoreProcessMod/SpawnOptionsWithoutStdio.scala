package typings.node.childUnderscoreProcessMod

import typings.node.NodeJSNs.ProcessEnv
import typings.node.nodeStrings.pipe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnOptionsWithoutStdio extends SpawnOptions {
  @JSName("stdio")
  var stdio_SpawnOptionsWithoutStdio: js.UndefOr[pipe | (js.Array[js.UndefOr[Null | pipe]])] = js.undefined
}

object SpawnOptionsWithoutStdio {
  @scala.inline
  def apply(
    argv0: java.lang.String = null,
    cwd: java.lang.String = null,
    detached: js.UndefOr[Boolean] = js.undefined,
    env: ProcessEnv = null,
    gid: Int | Double = null,
    shell: Boolean | java.lang.String = null,
    stdio: pipe | (js.Array[js.UndefOr[Null | pipe]]) = null,
    timeout: Int | Double = null,
    uid: Int | Double = null,
    windowsHide: js.UndefOr[Boolean] = js.undefined,
    windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  ): SpawnOptionsWithoutStdio = {
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
    __obj.asInstanceOf[SpawnOptionsWithoutStdio]
  }
}

