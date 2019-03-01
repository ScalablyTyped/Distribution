package typings
package nodeLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecFileOptionsWithStringEncoding extends ExecFileOptions {
  var encoding: nodeLib.BufferEncoding
}

object ExecFileOptionsWithStringEncoding {
  @scala.inline
  def apply(
    encoding: nodeLib.BufferEncoding,
    cwd: java.lang.String = null,
    env: nodeLib.NodeJSNs.ProcessEnv = null,
    gid: scala.Int | scala.Double = null,
    killSignal: java.lang.String = null,
    maxBuffer: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null,
    uid: scala.Int | scala.Double = null,
    windowsHide: js.UndefOr[scala.Boolean] = js.undefined,
    windowsVerbatimArguments: js.UndefOr[scala.Boolean] = js.undefined
  ): ExecFileOptionsWithStringEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encoding")(encoding)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (env != null) __obj.updateDynamic("env")(env)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal)
    if (maxBuffer != null) __obj.updateDynamic("maxBuffer")(maxBuffer.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide)
    if (!js.isUndefined(windowsVerbatimArguments)) __obj.updateDynamic("windowsVerbatimArguments")(windowsVerbatimArguments)
    __obj.asInstanceOf[ExecFileOptionsWithStringEncoding]
  }
}

