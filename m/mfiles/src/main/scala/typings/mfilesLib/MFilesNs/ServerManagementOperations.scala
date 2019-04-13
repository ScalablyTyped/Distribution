package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ServerManagementOperations")
@js.native
class ServerManagementOperations ()
  extends mfilesLib.IServerManagementOperations {
  /* CompleteClass */
  override def BackupMasterDB(
    BackupFile: java.lang.String,
    OverwriteExistingFiles: scala.Boolean,
    FileSizeLimitInMB: scala.Double,
    Impersonation: mfilesLib.IImpersonation
  ): scala.Unit = js.native
  /* CompleteClass */
  override def ConfigureWebAccessToDefaultWebSite(): scala.Unit = js.native
  /* CompleteClass */
  override def ConfigureWebAccessToExistingWebSite(WebSite: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def ConfigureWebAccessToNewVirtualDirectory(WebSite: java.lang.String, VirtualDirectory: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def ConfigureWebAccessToNewWebSite(WebSite: java.lang.String, Port: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def GetEventHandlers(): mfilesLib.IEventHandlers = js.native
  /* CompleteClass */
  override def RestoreMasterDB(BackupFile: java.lang.String, Impersonation: mfilesLib.IImpersonation): scala.Unit = js.native
  /* CompleteClass */
  override def SetEventHandlers(EventHandlers: mfilesLib.IEventHandlers): scala.Unit = js.native
}

@JSGlobal("MFiles.ServerManagementOperations")
@js.native
object ServerManagementOperations
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IServerManagementOperations]

