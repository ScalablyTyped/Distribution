package typings
package mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ILockWorkingCopyOptions extends js.Object {
  /**
       * The duration in seconds after which the lock will expire. Only applicable for lock type "edit".
       */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
       * Locks the working copy, regardless if it is locked by another user. Only applicable for lock type "edit".
       */
  var force: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The lock ID to use. Only applicable for lock type "edit".
       */
  var lockId: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The lock type, which indicates the purpose for which the working copy is locked.
       */
  var lockType: LockType
}

