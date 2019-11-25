package typings.mendixmodelsdk.distSdkInternalTransportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILockData extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var lockId: js.UndefOr[String] = js.undefined
  var lockType: LockType
  var requestedBy: String
  var timestamp: Double
}

object ILockData {
  @scala.inline
  def apply(
    lockType: LockType,
    requestedBy: String,
    timestamp: Double,
    duration: Int | Double = null,
    lockId: String = null
  ): ILockData = {
    val __obj = js.Dynamic.literal(lockType = lockType.asInstanceOf[js.Any], requestedBy = requestedBy.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (lockId != null) __obj.updateDynamic("lockId")(lockId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILockData]
  }
}

