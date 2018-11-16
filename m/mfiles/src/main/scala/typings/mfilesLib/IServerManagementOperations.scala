package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IServerManagementOperations extends js.Object {
  def BackupMasterDB(
    BackupFile: java.lang.String,
    OverwriteExistingFiles: scala.Boolean,
    FileSizeLimitInMB: scala.Double,
    Impersonation: IImpersonation
  ): scala.Unit
  def ConfigureWebAccessToDefaultWebSite(): scala.Unit
  def ConfigureWebAccessToExistingWebSite(WebSite: java.lang.String): scala.Unit
  def ConfigureWebAccessToNewVirtualDirectory(WebSite: java.lang.String, VirtualDirectory: java.lang.String): scala.Unit
  def ConfigureWebAccessToNewWebSite(WebSite: java.lang.String, Port: java.lang.String): scala.Unit
  def GetEventHandlers(): IEventHandlers
  def RestoreMasterDB(BackupFile: java.lang.String, Impersonation: IImpersonation): scala.Unit
  def SetEventHandlers(EventHandlers: IEventHandlers): scala.Unit
}

