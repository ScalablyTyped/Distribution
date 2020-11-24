package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IServerManagementOperations extends js.Object {
  
  def BackupMasterDB(
    BackupFile: String,
    OverwriteExistingFiles: Boolean,
    FileSizeLimitInMB: Double,
    Impersonation: IImpersonation
  ): Unit = js.native
  
  def ConfigureWebAccessToDefaultWebSite(): Unit = js.native
  
  def ConfigureWebAccessToExistingWebSite(WebSite: String): Unit = js.native
  
  def ConfigureWebAccessToNewVirtualDirectory(WebSite: String, VirtualDirectory: String): Unit = js.native
  
  def ConfigureWebAccessToNewWebSite(WebSite: String, Port: String): Unit = js.native
  
  def GetEventHandlers(): IEventHandlers = js.native
  
  def RestoreMasterDB(BackupFile: String, Impersonation: IImpersonation): Unit = js.native
  
  def SetEventHandlers(EventHandlers: IEventHandlers): Unit = js.native
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
  
  @scala.inline
  implicit class IServerManagementOperationsOps[Self <: IServerManagementOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackupMasterDB(value: (String, Boolean, Double, IImpersonation) => Unit): Self = this.set("BackupMasterDB", js.Any.fromFunction4(value))
    
    @scala.inline
    def setConfigureWebAccessToDefaultWebSite(value: () => Unit): Self = this.set("ConfigureWebAccessToDefaultWebSite", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConfigureWebAccessToExistingWebSite(value: String => Unit): Self = this.set("ConfigureWebAccessToExistingWebSite", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConfigureWebAccessToNewVirtualDirectory(value: (String, String) => Unit): Self = this.set("ConfigureWebAccessToNewVirtualDirectory", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConfigureWebAccessToNewWebSite(value: (String, String) => Unit): Self = this.set("ConfigureWebAccessToNewWebSite", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetEventHandlers(value: () => IEventHandlers): Self = this.set("GetEventHandlers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRestoreMasterDB(value: (String, IImpersonation) => Unit): Self = this.set("RestoreMasterDB", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetEventHandlers(value: IEventHandlers => Unit): Self = this.set("SetEventHandlers", js.Any.fromFunction1(value))
  }
}
