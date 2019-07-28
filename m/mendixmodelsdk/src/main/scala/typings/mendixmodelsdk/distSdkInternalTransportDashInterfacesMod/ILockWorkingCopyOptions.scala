package typings.mendixmodelsdk.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILockWorkingCopyOptions extends js.Object {
  /**
    * The duration in seconds after which the lock will expire. Only applicable for lock type "edit".
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Locks the working copy, regardless if it is locked by another user. Only applicable for lock type "edit".
    */
  var force: js.UndefOr[Boolean] = js.undefined
  /**
    * The lock ID to use. Only applicable for lock type "edit".
    */
  var lockId: js.UndefOr[String] = js.undefined
  /**
    * The lock type, which indicates the purpose for which the working copy is locked.
    */
  var lockType: LockType
}

object ILockWorkingCopyOptions {
  @scala.inline
  def apply(
    lockType: LockType,
    duration: Int | Double = null,
    force: js.UndefOr[Boolean] = js.undefined,
    lockId: String = null
  ): ILockWorkingCopyOptions = {
    val __obj = js.Dynamic.literal(lockType = lockType)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (lockId != null) __obj.updateDynamic("lockId")(lockId)
    __obj.asInstanceOf[ILockWorkingCopyOptions]
  }
}

