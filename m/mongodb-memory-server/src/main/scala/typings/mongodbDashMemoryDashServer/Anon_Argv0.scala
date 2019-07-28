package typings.mongodbDashMemoryDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Argv0 extends js.Object {
  var argv0: js.UndefOr[String] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var detached: js.UndefOr[Boolean] = js.undefined
  var env: js.UndefOr[js.Object] = js.undefined
  var gid: js.UndefOr[Double] = js.undefined
  var shell: js.UndefOr[Boolean | String] = js.undefined
  var stdio: js.UndefOr[String | js.Array[_]] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
}

object Anon_Argv0 {
  @scala.inline
  def apply(
    argv0: String = null,
    cwd: String = null,
    detached: js.UndefOr[Boolean] = js.undefined,
    env: js.Object = null,
    gid: Int | Double = null,
    shell: Boolean | String = null,
    stdio: String | js.Array[_] = null,
    uid: Int | Double = null
  ): Anon_Argv0 = {
    val __obj = js.Dynamic.literal()
    if (argv0 != null) __obj.updateDynamic("argv0")(argv0)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    if (env != null) __obj.updateDynamic("env")(env)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Argv0]
  }
}

