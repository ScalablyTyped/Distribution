package typings.node.childUnderscoreProcessMod

import typings.node.NodeJSNs.ProcessEnv
import typings.node.NodeJSNs.TypedArray
import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecFileSyncOptionsWithBufferEncoding extends ExecFileSyncOptions {
  @JSName("encoding")
  var encoding_ExecFileSyncOptionsWithBufferEncoding: java.lang.String
}

object ExecFileSyncOptionsWithBufferEncoding {
  @scala.inline
  def apply(
    encoding: java.lang.String,
    cwd: java.lang.String = null,
    env: ProcessEnv = null,
    gid: Int | Double = null,
    input: java.lang.String | TypedArray | DataView = null,
    killSignal: java.lang.String | Double = null,
    maxBuffer: Int | Double = null,
    shell: Boolean | java.lang.String = null,
    stdio: StdioOptions = null,
    timeout: Int | Double = null,
    uid: Int | Double = null,
    windowsHide: js.UndefOr[Boolean] = js.undefined
  ): ExecFileSyncOptionsWithBufferEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (env != null) __obj.updateDynamic("env")(env)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal.asInstanceOf[js.Any])
    if (maxBuffer != null) __obj.updateDynamic("maxBuffer")(maxBuffer.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide)
    __obj.asInstanceOf[ExecFileSyncOptionsWithBufferEncoding]
  }
}

