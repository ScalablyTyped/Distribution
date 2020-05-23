package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IEventHandlers
import typings.mfiles.IImpersonation
import typings.mfiles.IServerManagementOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ServerManagementOperations")
@js.native
class ServerManagementOperations () extends IServerManagementOperations {
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

@JSGlobal("MFiles.ServerManagementOperations")
@js.native
object ServerManagementOperations extends Instantiable0[IServerManagementOperations]

