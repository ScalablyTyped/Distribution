package typings.node.childUnderscoreProcessMod

import typings.node.NodeJSNs.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends ProcessEnvOptions {
  /**
    * @default 0
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * @default true
    */
  var windowsHide: js.UndefOr[Boolean] = js.undefined
}

object CommonOptions {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    env: ProcessEnv = null,
    gid: Int | Double = null,
    timeout: Int | Double = null,
    uid: Int | Double = null,
    windowsHide: js.UndefOr[Boolean] = js.undefined
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

