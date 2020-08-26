package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultServerDataPushOperations extends js.Object {
  def CloneVaultForServerDataPush(ServerDataPushSink: IServerDataPushSink): IVault = js.native
  def SendCancel(RequestID: Double): Unit = js.native
  def SendError(RequestID: Double, Error: String): Unit = js.native
  def SendHeartbeat(RequestID: Double): Unit = js.native
  def SendResponse(RequestID: Double, JsonResponseContent: String): Unit = js.native
  def SetServerDataPushSink(ServerDataPushSink: IServerDataPushSink): Unit = js.native
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
  @scala.inline
  implicit class IVaultServerDataPushOperationsOps[Self <: IVaultServerDataPushOperations] (val x: Self) extends AnyVal {
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
    def setCloneVaultForServerDataPush(value: IServerDataPushSink => IVault): Self = this.set("CloneVaultForServerDataPush", js.Any.fromFunction1(value))
    @scala.inline
    def setSendCancel(value: Double => Unit): Self = this.set("SendCancel", js.Any.fromFunction1(value))
    @scala.inline
    def setSendError(value: (Double, String) => Unit): Self = this.set("SendError", js.Any.fromFunction2(value))
    @scala.inline
    def setSendHeartbeat(value: Double => Unit): Self = this.set("SendHeartbeat", js.Any.fromFunction1(value))
    @scala.inline
    def setSendResponse(value: (Double, String) => Unit): Self = this.set("SendResponse", js.Any.fromFunction2(value))
    @scala.inline
    def setSetServerDataPushSink(value: IServerDataPushSink => Unit): Self = this.set("SetServerDataPushSink", js.Any.fromFunction1(value))
  }
  
}

