package typings.mfiles.MFilesNs

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IServerDataPushSink
import typings.mfiles.IVault
import typings.mfiles.IVaultServerDataPushOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultServerDataPushOperations")
@js.native
class VaultServerDataPushOperations () extends IVaultServerDataPushOperations {
  /* CompleteClass */
  override def CloneVaultForServerDataPush(ServerDataPushSink: IServerDataPushSink): IVault = js.native
  /* CompleteClass */
  override def SendCancel(RequestID: Double): Unit = js.native
  /* CompleteClass */
  override def SendError(RequestID: Double, Error: String): Unit = js.native
  /* CompleteClass */
  override def SendHeartbeat(RequestID: Double): Unit = js.native
  /* CompleteClass */
  override def SendResponse(RequestID: Double, JsonResponseContent: String): Unit = js.native
  /* CompleteClass */
  override def SetServerDataPushSink(ServerDataPushSink: IServerDataPushSink): Unit = js.native
}

@JSGlobal("MFiles.VaultServerDataPushOperations")
@js.native
object VaultServerDataPushOperations extends Instantiable0[IVaultServerDataPushOperations]

