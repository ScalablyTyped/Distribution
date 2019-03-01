package typings
package nodeLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends js.Object {
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var env: js.UndefOr[nodeLib.NodeJSNs.ProcessEnv] = js.undefined
  var gid: js.UndefOr[scala.Double] = js.undefined
  /**
    * @default 0
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var uid: js.UndefOr[scala.Double] = js.undefined
  /**
    * @default true
    */
  var windowsHide: js.UndefOr[scala.Boolean] = js.undefined
}

object CommonOptions {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    env: nodeLib.NodeJSNs.ProcessEnv = null,
    gid: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null,
    uid: scala.Int | scala.Double = null,
    windowsHide: js.UndefOr[scala.Boolean] = js.undefined
  ): CommonOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (env != null) __obj.updateDynamic("env")(env)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide)
    __obj.asInstanceOf[CommonOptions]
  }
}

