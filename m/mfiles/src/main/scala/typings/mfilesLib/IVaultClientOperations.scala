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

