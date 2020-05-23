package typings.node.childProcessMod

import typings.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessEnvOptions extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[ProcessEnv] = js.undefined
  var gid: js.UndefOr[Double] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
}

object ProcessEnvOptions {
  @scala.inline
  def apply(
    cwd: String = null,
    env: ProcessEnv = null,
    gid: js.UndefOr[Double] = js.undefined,
    uid: js.UndefOr[Double] = js.undefined
  ): ProcessEnvOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(gid)) __obj.updateDynamic("gid")(gid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uid)) __obj.updateDynamic("uid")(uid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessEnvOptions]
  }
}

