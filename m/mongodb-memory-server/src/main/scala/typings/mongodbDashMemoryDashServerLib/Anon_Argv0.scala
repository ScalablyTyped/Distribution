package typings
package mongodbDashMemoryDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Argv0 extends js.Object {
  var argv0: js.UndefOr[java.lang.String] = js.undefined
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var detached: js.UndefOr[scala.Boolean] = js.undefined
  var env: js.UndefOr[js.Object] = js.undefined
  var gid: js.UndefOr[scala.Double] = js.undefined
  var shell: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var stdio: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
  var uid: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Argv0 {
  @scala.inline
  def apply(
    argv0: java.lang.String = null,
    cwd: java.lang.String = null,
    detached: js.UndefOr[scala.Boolean] = js.undefined,
    env: js.Object = null,
    gid: scala.Int | scala.Double = null,
    shell: scala.Boolean | java.lang.String = null,
    stdio: java.lang.String | js.Array[_] = null,
    uid: scala.Int | scala.Double = null
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

