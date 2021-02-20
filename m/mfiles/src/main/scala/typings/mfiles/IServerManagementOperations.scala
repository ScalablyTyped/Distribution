package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IServerManagementOperations extends StObject {
  
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
  implicit class IServerManagementOperationsMutableBuilder[Self <: IServerManagementOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupMasterDB(value: (String, Boolean, Double, IImpersonation) => Unit): Self = StObject.set(x, "BackupMasterDB", js.Any.fromFunction4(value))
    
    @scala.inline
    def setConfigureWebAccessToDefaultWebSite(value: () => Unit): Self = StObject.set(x, "ConfigureWebAccessToDefaultWebSite", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConfigureWebAccessToExistingWebSite(value: String => Unit): Self = StObject.set(x, "ConfigureWebAccessToExistingWebSite", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConfigureWebAccessToNewVirtualDirectory(value: (String, String) => Unit): Self = StObject.set(x, "ConfigureWebAccessToNewVirtualDirectory", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConfigureWebAccessToNewWebSite(value: (String, String) => Unit): Self = StObject.set(x, "ConfigureWebAccessToNewWebSite", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetEventHandlers(value: () => IEventHandlers): Self = StObject.set(x, "GetEventHandlers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRestoreMasterDB(value: (String, IImpersonation) => Unit): Self = StObject.set(x, "RestoreMasterDB", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetEventHandlers(value: IEventHandlers => Unit): Self = StObject.set(x, "SetEventHandlers", js.Any.fromFunction1(value))
  }
}
