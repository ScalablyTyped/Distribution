package typings.node.childProcessMod

import typings.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnOptionsWithStdioTuple[Stdin /* <: StdioNull | StdioPipe */, Stdout /* <: StdioNull | StdioPipe */, Stderr /* <: StdioNull | StdioPipe */] extends SpawnOptions {
  @JSName("stdio")
  var stdio_SpawnOptionsWithStdioTuple: js.Tuple3[Stdin, Stdout, Stderr]
}

object SpawnOptionsWithStdioTuple {
  @scala.inline
  def apply[Stdin /* <: StdioNull | StdioPipe */, Stdout /* <: StdioNull | StdioPipe */, Stderr /* <: StdioNull | StdioPipe */](
    stdio: js.Tuple3[Stdin, Stdout, Stderr],
    argv0: String = null,
    cwd: String = null,
    detached: js.UndefOr[Boolean] = js.undefined,
    env: ProcessEnv = null,
    gid: Int | Double = null,
    serialization: SerializationType = null,
    shell: Boolean | String = null,
    timeout: Int | Double = null,
    uid: Int | Double = null,
    windowsHide: js.UndefOr[Boolean] = js.undefined,
    windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  ): SpawnOptionsWithStdioTuple[Stdin, Stdout, Stderr] = {
    val __obj = js.Dynamic.literal(stdio = stdio.asInstanceOf[js.Any])
    if (argv0 != null) __obj.updateDynamic("argv0")(argv0.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (serialization != null) __obj.updateDynamic("serialization")(serialization.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsVerbatimArguments)) __obj.updateDynamic("windowsVerbatimArguments")(windowsVerbatimArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnOptionsWithStdioTuple[Stdin, Stdout, Stderr]]
  }
}

