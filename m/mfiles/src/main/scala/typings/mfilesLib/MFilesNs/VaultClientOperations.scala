package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultClientOperations")
@js.native
class VaultClientOperations ()
  extends mfilesLib.IVaultClientOperations {
  /* CompleteClass */
  override def DisableCheckInReminderForCallingProcess(): scala.Unit = js.native
  /* CompleteClass */
  override def EnableCheckInReminderForCallingProcess(): scala.Unit = js.native
  /* CompleteClass */
  override def IsOffline(): scala.Boolean = js.native
  /* CompleteClass */
  override def IsOnline(): scala.Boolean = js.native
  /* CompleteClass */
  override def SetVaultToOffline(ParentWindow: scala.Double): MFOfflineTransitionResultFlags = js.native
  /* CompleteClass */
  override def SetVaultToOnline(ParentWindow: scala.Double): MFOnlineTransitionResultFlags = js.native
}

