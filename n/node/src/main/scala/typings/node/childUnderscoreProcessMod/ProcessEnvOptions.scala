package typings.node.childUnderscoreProcessMod

import typings.node.NodeJSNs.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessEnvOptions extends js.Object {
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var env: js.UndefOr[ProcessEnv] = js.undefined
  var gid: js.UndefOr[Double] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
}

object ProcessEnvOptions {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    env: ProcessEnv = null,
    gid: Int | Double = null,
    uid: Int | Double = null
  ): ProcessEnvOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (env != null) __obj.updateDynamic("env")(env)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessEnvOptions]
  }
}

