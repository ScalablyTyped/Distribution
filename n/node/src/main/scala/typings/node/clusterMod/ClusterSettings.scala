package typings.node.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// interfaces
trait ClusterSettings extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
   // default: process.execArgv
  var exec: js.UndefOr[String] = js.undefined
  var execArgv: js.UndefOr[js.Array[String]] = js.undefined
  var gid: js.UndefOr[Double] = js.undefined
  var inspectPort: js.UndefOr[Double | js.Function0[Double]] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var stdio: js.UndefOr[js.Array[_]] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
}

object ClusterSettings {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    exec: String = null,
    execArgv: js.Array[String] = null,
    gid: Int | Double = null,
    inspectPort: Double | js.Function0[Double] = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    stdio: js.Array[_] = null,
    uid: Int | Double = null
  ): ClusterSettings = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(exec.asInstanceOf[js.Any])
    if (execArgv != null) __obj.updateDynamic("execArgv")(execArgv.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (inspectPort != null) __obj.updateDynamic("inspectPort")(inspectPort.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterSettings]
  }
}

