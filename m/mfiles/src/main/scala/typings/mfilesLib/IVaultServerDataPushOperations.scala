package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultServerDataPushOperations extends js.Object {
  def CloneVaultForServerDataPush(ServerDataPushSink: IServerDataPushSink): IVault
  def SendCancel(RequestID: scala.Double): scala.Unit
  def SendError(RequestID: scala.Double, Error: java.lang.String): scala.Unit
  def SendHeartbeat(RequestID: scala.Double): scala.Unit
  def SendResponse(RequestID: scala.Double, JsonResponseContent: java.lang.String): scala.Unit
  def SetServerDataPushSink(ServerDataPushSink: IServerDataPushSink): scala.Unit
}

object IVaultServerDataPushOperations {
  @scala.inline
  def apply(
    CloneVaultForServerDataPush: js.Function1[IServerDataPushSink, IVault],
    SendCancel: js.Function1[scala.Double, scala.Unit],
    SendError: js.Function2[scala.Double, java.lang.String, scala.Unit],
    SendHeartbeat: js.Function1[scala.Double, scala.Unit],
    SendResponse: js.Function2[scala.Double, java.lang.String, scala.Unit],
    SetServerDataPushSink: js.Function1[IServerDataPushSink, scala.Unit]
  ): IVaultServerDataPushOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CloneVaultForServerDataPush")(CloneVaultForServerDataPush)
    __obj.updateDynamic("SendCancel")(SendCancel)
    __obj.updateDynamic("SendError")(SendError)
    __obj.updateDynamic("SendHeartbeat")(SendHeartbeat)
    __obj.updateDynamic("SendResponse")(SendResponse)
    __obj.updateDynamic("SetServerDataPushSink")(SetServerDataPushSink)
    __obj.asInstanceOf[IVaultServerDataPushOperations]
  }
}

