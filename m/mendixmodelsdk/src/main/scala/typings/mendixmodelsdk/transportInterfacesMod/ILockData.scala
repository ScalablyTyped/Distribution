package typings.mendixmodelsdk.transportInterfacesMod

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
    duration: js.UndefOr[Double] = js.undefined,
    lockId: String = null
  ): ILockData = {
    val __obj = js.Dynamic.literal(lockType = lockType.asInstanceOf[js.Any], requestedBy = requestedBy.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (lockId != null) __obj.updateDynamic("lockId")(lockId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILockData]
  }
}

