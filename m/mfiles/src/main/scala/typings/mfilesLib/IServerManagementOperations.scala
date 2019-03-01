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
    BackupMasterDB: js.Function4[java.lang.String, scala.Boolean, scala.Double, IImpersonation, scala.Unit],
    ConfigureWebAccessToDefaultWebSite: js.Function0[scala.Unit],
    ConfigureWebAccessToExistingWebSite: js.Function1[java.lang.String, scala.Unit],
    ConfigureWebAccessToNewVirtualDirectory: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    ConfigureWebAccessToNewWebSite: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    GetEventHandlers: js.Function0[IEventHandlers],
    RestoreMasterDB: js.Function2[java.lang.String, IImpersonation, scala.Unit],
    SetEventHandlers: js.Function1[IEventHandlers, scala.Unit]
  ): IServerManagementOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BackupMasterDB")(BackupMasterDB)
    __obj.updateDynamic("ConfigureWebAccessToDefaultWebSite")(ConfigureWebAccessToDefaultWebSite)
    __obj.updateDynamic("ConfigureWebAccessToExistingWebSite")(ConfigureWebAccessToExistingWebSite)
    __obj.updateDynamic("ConfigureWebAccessToNewVirtualDirectory")(ConfigureWebAccessToNewVirtualDirectory)
    __obj.updateDynamic("ConfigureWebAccessToNewWebSite")(ConfigureWebAccessToNewWebSite)
    __obj.updateDynamic("GetEventHandlers")(GetEventHandlers)
    __obj.updateDynamic("RestoreMasterDB")(RestoreMasterDB)
    __obj.updateDynamic("SetEventHandlers")(SetEventHandlers)
    __obj.asInstanceOf[IServerManagementOperations]
  }
}

