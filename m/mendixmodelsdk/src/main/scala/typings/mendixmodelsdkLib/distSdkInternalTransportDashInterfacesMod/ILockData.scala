package typings
package mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILockData extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var lockId: js.UndefOr[java.lang.String] = js.undefined
  var lockType: LockType
  var requestedBy: java.lang.String
  var timestamp: scala.Double
}

object ILockData {
  @scala.inline
  def apply(
    lockType: LockType,
    requestedBy: java.lang.String,
    timestamp: scala.Double,
    duration: scala.Int | scala.Double = null,
    lockId: java.lang.String = null
  ): ILockData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lockType")(lockType)
    __obj.updateDynamic("requestedBy")(requestedBy)
    __obj.updateDynamic("timestamp")(timestamp)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (lockId != null) __obj.updateDynamic("lockId")(lockId)
    __obj.asInstanceOf[ILockData]
  }
}

