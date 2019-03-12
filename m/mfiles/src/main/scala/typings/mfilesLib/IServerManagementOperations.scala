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

object IServerManagementOperations {
  @scala.inline
  def apply(
    BackupMasterDB: (java.lang.String, scala.Boolean, scala.Double, IImpersonation) => scala.Unit,
    ConfigureWebAccessToDefaultWebSite: () => scala.Unit,
    ConfigureWebAccessToExistingWebSite: java.lang.String => scala.Unit,
    ConfigureWebAccessToNewVirtualDirectory: (java.lang.String, java.lang.String) => scala.Unit,
    ConfigureWebAccessToNewWebSite: (java.lang.String, java.lang.String) => scala.Unit,
    GetEventHandlers: () => IEventHandlers,
    RestoreMasterDB: (java.lang.String, IImpersonation) => scala.Unit,
    SetEventHandlers: IEventHandlers => scala.Unit
  ): IServerManagementOperations = {
    val __obj = js.Dynamic.literal(BackupMasterDB = js.Any.fromFunction4(BackupMasterDB), ConfigureWebAccessToDefaultWebSite = js.Any.fromFunction0(ConfigureWebAccessToDefaultWebSite), ConfigureWebAccessToExistingWebSite = js.Any.fromFunction1(ConfigureWebAccessToExistingWebSite), ConfigureWebAccessToNewVirtualDirectory = js.Any.fromFunction2(ConfigureWebAccessToNewVirtualDirectory), ConfigureWebAccessToNewWebSite = js.Any.fromFunction2(ConfigureWebAccessToNewWebSite), GetEventHandlers = js.Any.fromFunction0(GetEventHandlers), RestoreMasterDB = js.Any.fromFunction2(RestoreMasterDB), SetEventHandlers = js.Any.fromFunction1(SetEventHandlers))
  
    __obj.asInstanceOf[IServerManagementOperations]
  }
}

