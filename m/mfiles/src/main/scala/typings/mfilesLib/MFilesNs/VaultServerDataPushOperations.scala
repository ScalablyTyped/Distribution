package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultServerDataPushOperations")
@js.native
class VaultServerDataPushOperations ()
  extends mfilesLib.IVaultServerDataPushOperations {
  /* CompleteClass */
  override def CloneVaultForServerDataPush(ServerDataPushSink: mfilesLib.IServerDataPushSink): mfilesLib.IVault = js.native
  /* CompleteClass */
  override def SendCancel(RequestID: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def SendError(RequestID: scala.Double, Error: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def SendHeartbeat(RequestID: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def SendResponse(RequestID: scala.Double, JsonResponseContent: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def SetServerDataPushSink(ServerDataPushSink: mfilesLib.IServerDataPushSink): scala.Unit = js.native
}

@JSGlobal("MFiles.VaultServerDataPushOperations")
@js.native
object VaultServerDataPushOperations
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IVaultServerDataPushOperations]

