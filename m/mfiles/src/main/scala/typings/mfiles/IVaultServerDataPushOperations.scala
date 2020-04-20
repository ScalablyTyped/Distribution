package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultServerDataPushOperations extends js.Object {
  def CloneVaultForServerDataPush(ServerDataPushSink: IServerDataPushSink): IVault
  def SendCancel(RequestID: Double): Unit
  def SendError(RequestID: Double, Error: String): Unit
  def SendHeartbeat(RequestID: Double): Unit
  def SendResponse(RequestID: Double, JsonResponseContent: String): Unit
  def SetServerDataPushSink(ServerDataPushSink: IServerDataPushSink): Unit
}

object IVaultServerDataPushOperations {
  @scala.inline
  def apply(
    CloneVaultForServerDataPush: IServerDataPushSink => IVault,
    SendCancel: Double => Unit,
    SendError: (Double, String) => Unit,
    SendHeartbeat: Double => Unit,
    SendResponse: (Double, String) => Unit,
    SetServerDataPushSink: IServerDataPushSink => Unit
  ): IVaultServerDataPushOperations = {
    val __obj = js.Dynamic.literal(CloneVaultForServerDataPush = js.Any.fromFunction1(CloneVaultForServerDataPush), SendCancel = js.Any.fromFunction1(SendCancel), SendError = js.Any.fromFunction2(SendError), SendHeartbeat = js.Any.fromFunction1(SendHeartbeat), SendResponse = js.Any.fromFunction2(SendResponse), SetServerDataPushSink = js.Any.fromFunction1(SetServerDataPushSink))
    __obj.asInstanceOf[IVaultServerDataPushOperations]
  }
}

