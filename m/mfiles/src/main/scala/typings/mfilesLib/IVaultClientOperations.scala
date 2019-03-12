package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultClientOperations extends js.Object {
  def DisableCheckInReminderForCallingProcess(): scala.Unit
  def EnableCheckInReminderForCallingProcess(): scala.Unit
  def IsOffline(): scala.Boolean
  def IsOnline(): scala.Boolean
  def SetVaultToOffline(ParentWindow: scala.Double): mfilesLib.MFilesNs.MFOfflineTransitionResultFlags
  def SetVaultToOnline(ParentWindow: scala.Double): mfilesLib.MFilesNs.MFOnlineTransitionResultFlags
}

object IVaultClientOperations {
  @scala.inline
  def apply(
    DisableCheckInReminderForCallingProcess: () => scala.Unit,
    EnableCheckInReminderForCallingProcess: () => scala.Unit,
    IsOffline: () => scala.Boolean,
    IsOnline: () => scala.Boolean,
    SetVaultToOffline: scala.Double => mfilesLib.MFilesNs.MFOfflineTransitionResultFlags,
    SetVaultToOnline: scala.Double => mfilesLib.MFilesNs.MFOnlineTransitionResultFlags
  ): IVaultClientOperations = {
    val __obj = js.Dynamic.literal(DisableCheckInReminderForCallingProcess = js.Any.fromFunction0(DisableCheckInReminderForCallingProcess), EnableCheckInReminderForCallingProcess = js.Any.fromFunction0(EnableCheckInReminderForCallingProcess), IsOffline = js.Any.fromFunction0(IsOffline), IsOnline = js.Any.fromFunction0(IsOnline), SetVaultToOffline = js.Any.fromFunction1(SetVaultToOffline), SetVaultToOnline = js.Any.fromFunction1(SetVaultToOnline))
  
    __obj.asInstanceOf[IVaultClientOperations]
  }
}

