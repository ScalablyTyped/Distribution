package typings.mfiles

import typings.mfiles.MFiles.MFOfflineTransitionResultFlags
import typings.mfiles.MFiles.MFOnlineTransitionResultFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultClientOperations extends js.Object {
  def DisableCheckInReminderForCallingProcess(): Unit
  def EnableCheckInReminderForCallingProcess(): Unit
  def IsOffline(): Boolean
  def IsOnline(): Boolean
  def SetVaultToOffline(ParentWindow: Double): MFOfflineTransitionResultFlags
  def SetVaultToOnline(ParentWindow: Double): MFOnlineTransitionResultFlags
}

object IVaultClientOperations {
  @scala.inline
  def apply(
    DisableCheckInReminderForCallingProcess: () => Unit,
    EnableCheckInReminderForCallingProcess: () => Unit,
    IsOffline: () => Boolean,
    IsOnline: () => Boolean,
    SetVaultToOffline: Double => MFOfflineTransitionResultFlags,
    SetVaultToOnline: Double => MFOnlineTransitionResultFlags
  ): IVaultClientOperations = {
    val __obj = js.Dynamic.literal(DisableCheckInReminderForCallingProcess = js.Any.fromFunction0(DisableCheckInReminderForCallingProcess), EnableCheckInReminderForCallingProcess = js.Any.fromFunction0(EnableCheckInReminderForCallingProcess), IsOffline = js.Any.fromFunction0(IsOffline), IsOnline = js.Any.fromFunction0(IsOnline), SetVaultToOffline = js.Any.fromFunction1(SetVaultToOffline), SetVaultToOnline = js.Any.fromFunction1(SetVaultToOnline))
    __obj.asInstanceOf[IVaultClientOperations]
  }
}

