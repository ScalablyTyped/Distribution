package typings
package nodeLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecSyncOptionsWithStringEncoding extends ExecSyncOptions {
  @JSName("encoding")
  var encoding_ExecSyncOptionsWithStringEncoding: nodeLib.BufferEncoding
}

object ExecSyncOptionsWithStringEncoding {
  @scala.inline
  def apply(
    encoding: nodeLib.BufferEncoding,
    cwd: java.lang.String = null,
    env: nodeLib.NodeJSNs.ProcessEnv = null,
    gid: scala.Int | scala.Double = null,
    input: java.lang.String | nodeLib.Buffer | stdLib.Uint8Array = null,
    killSignal: java.lang.String | scala.Double = null,
    maxBuffer: scala.Int | scala.Double = null,
    shell: java.lang.String = null,
    stdio: StdioOptions = null,
    timeout: scala.Int | scala.Double = null,
    uid: scala.Int | scala.Double = null,
    windowsHide: js.UndefOr[scala.Boolean] = js.undefined
  ): ExecSyncOptionsWithStringEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (env != null) __obj.updateDynamic("env")(env)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal.asInstanceOf[js.Any])
    if (maxBuffer != null) __obj.updateDynamic("maxBuffer")(maxBuffer.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell)
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide)
    __obj.asInstanceOf[ExecSyncOptionsWithStringEncoding]
  }
}

