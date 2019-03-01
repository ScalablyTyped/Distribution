package typings
package nodeLib.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// interfaces
trait ClusterSettings extends js.Object {
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
   // default: process.execArgv
  var exec: js.UndefOr[java.lang.String] = js.undefined
  var execArgv: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var gid: js.UndefOr[scala.Double] = js.undefined
  var inspectPort: js.UndefOr[scala.Double | js.Function0[scala.Double]] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  var stdio: js.UndefOr[js.Array[_]] = js.undefined
  var uid: js.UndefOr[scala.Double] = js.undefined
}

object ClusterSettings {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String] = null,
    exec: java.lang.String = null,
    execArgv: js.Array[java.lang.String] = null,
    gid: scala.Int | scala.Double = null,
    inspectPort: scala.Double | js.Function0[scala.Double] = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    stdio: js.Array[_] = null,
    uid: scala.Int | scala.Double = null
  ): ClusterSettings = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (exec != null) __obj.updateDynamic("exec")(exec)
    if (execArgv != null) __obj.updateDynamic("execArgv")(execArgv)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (inspectPort != null) __obj.updateDynamic("inspectPort")(inspectPort.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (stdio != null) __obj.updateDynamic("stdio")(stdio)
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterSettings]
  }
}

