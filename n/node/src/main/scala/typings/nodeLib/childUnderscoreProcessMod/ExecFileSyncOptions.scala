package typings
package nodeLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecFileSyncOptions extends CommonOptions {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var input: js.UndefOr[java.lang.String | nodeLib.NodeJSNs.TypedArray | stdLib.DataView] = js.undefined
  var killSignal: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var maxBuffer: js.UndefOr[scala.Double] = js.undefined
  var shell: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var stdio: js.UndefOr[StdioOptions] = js.undefined
}

object ExecFileSyncOptions {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    encoding: java.lang.String = null,
    env: nodeLib.NodeJSNs.ProcessEnv = null,
    gid: scala.Int | scala.Double = null,
    input: java.lang.String | nodeLib.NodeJSNs.TypedArray | stdLib.DataView = null,
    killSignal: java.lang.String | scala.Double = null,
    maxBuffer: scala.Int | scala.Double = null,
    shell: scala.Boolean | java.lang.String = null,
    stdio: StdioOptions = null,
    timeout: scala.Int | scala.Double = null,
    uid: scala.Int | scala.Double = null,
    windowsHide: js.UndefOr[scala.Boolean] = js.undefined
  ): ExecFileSyncOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
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
    __obj.asInstanceOf[ExecFileSyncOptions]
  }
}

