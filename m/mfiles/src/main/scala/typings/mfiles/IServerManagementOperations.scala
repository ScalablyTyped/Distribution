package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerManagementOperations extends js.Object {
  def BackupMasterDB(
    BackupFile: String,
    OverwriteExistingFiles: Boolean,
    FileSizeLimitInMB: Double,
    Impersonation: IImpersonation
  ): Unit
  def ConfigureWebAccessToDefaultWebSite(): Unit
  def ConfigureWebAccessToExistingWebSite(WebSite: String): Unit
  def ConfigureWebAccessToNewVirtualDirectory(WebSite: String, VirtualDirectory: String): Unit
  def ConfigureWebAccessToNewWebSite(WebSite: String, Port: String): Unit
  def GetEventHandlers(): IEventHandlers
  def RestoreMasterDB(BackupFile: String, Impersonation: IImpersonation): Unit
  def SetEventHandlers(EventHandlers: IEventHandlers): Unit
}

object IServerManagementOperations {
  @scala.inline
  def apply(
    BackupMasterDB: (String, Boolean, Double, IImpersonation) => Unit,
    ConfigureWebAccessToDefaultWebSite: () => Unit,
    ConfigureWebAccessToExistingWebSite: String => Unit,
    ConfigureWebAccessToNewVirtualDirectory: (String, String) => Unit,
    ConfigureWebAccessToNewWebSite: (String, String) => Unit,
    GetEventHandlers: () => IEventHandlers,
    RestoreMasterDB: (String, IImpersonation) => Unit,
    SetEventHandlers: IEventHandlers => Unit
  ): IServerManagementOperations = {
    val __obj = js.Dynamic.literal(BackupMasterDB = js.Any.fromFunction4(BackupMasterDB), ConfigureWebAccessToDefaultWebSite = js.Any.fromFunction0(ConfigureWebAccessToDefaultWebSite), ConfigureWebAccessToExistingWebSite = js.Any.fromFunction1(ConfigureWebAccessToExistingWebSite), ConfigureWebAccessToNewVirtualDirectory = js.Any.fromFunction2(ConfigureWebAccessToNewVirtualDirectory), ConfigureWebAccessToNewWebSite = js.Any.fromFunction2(ConfigureWebAccessToNewWebSite), GetEventHandlers = js.Any.fromFunction0(GetEventHandlers), RestoreMasterDB = js.Any.fromFunction2(RestoreMasterDB), SetEventHandlers = js.Any.fromFunction1(SetEventHandlers))
  
    __obj.asInstanceOf[IServerManagementOperations]
  }
}

