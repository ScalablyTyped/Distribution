package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IVaultClientOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultClientOperations")
@js.native
class VaultClientOperations () extends IVaultClientOperations {
  /* CompleteClass */
  override def DisableCheckInReminderForCallingProcess(): Unit = js.native
  /* CompleteClass */
  override def EnableCheckInReminderForCallingProcess(): Unit = js.native
  /* CompleteClass */
  override def IsOffline(): Boolean = js.native
  /* CompleteClass */
  override def IsOnline(): Boolean = js.native
  /* CompleteClass */
  override def SetVaultToOffline(ParentWindow: Double): MFOfflineTransitionResultFlags = js.native
  /* CompleteClass */
  override def SetVaultToOnline(ParentWindow: Double): MFOnlineTransitionResultFlags = js.native
}

@JSGlobal("MFiles.VaultClientOperations")
@js.native
object VaultClientOperations extends Instantiable0[IVaultClientOperations]

