package typings.mfiles.global.MFiles

import typings.mfiles.IEventHandlers
import typings.mfiles.IImpersonation
import typings.mfiles.IServerManagementOperations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ServerManagementOperations")
@js.native
class ServerManagementOperations ()
  extends StObject
     with IServerManagementOperations {
  
  /* CompleteClass */
  override def BackupMasterDB(
    BackupFile: String,
    OverwriteExistingFiles: Boolean,
    FileSizeLimitInMB: Double,
    Impersonation: IImpersonation
  ): Unit = js.native
  
  /* CompleteClass */
  override def ConfigureWebAccessToDefaultWebSite(): Unit = js.native
  
  /* CompleteClass */
  override def ConfigureWebAccessToExistingWebSite(WebSite: String): Unit = js.native
  
  /* CompleteClass */
  override def ConfigureWebAccessToNewVirtualDirectory(WebSite: String, VirtualDirectory: String): Unit = js.native
  
  /* CompleteClass */
  override def ConfigureWebAccessToNewWebSite(WebSite: String, Port: String): Unit = js.native
  
  /* CompleteClass */
  override def GetEventHandlers(): IEventHandlers = js.native
  
  /* CompleteClass */
  override def RestoreMasterDB(BackupFile: String, Impersonation: IImpersonation): Unit = js.native
  
  /* CompleteClass */
  override def SetEventHandlers(EventHandlers: IEventHandlers): Unit = js.native
}
