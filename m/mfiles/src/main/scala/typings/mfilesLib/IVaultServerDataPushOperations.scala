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
    CloneVaultForServerDataPush: IServerDataPushSink => IVault,
    SendCancel: scala.Double => scala.Unit,
    SendError: (scala.Double, java.lang.String) => scala.Unit,
    SendHeartbeat: scala.Double => scala.Unit,
    SendResponse: (scala.Double, java.lang.String) => scala.Unit,
    SetServerDataPushSink: IServerDataPushSink => scala.Unit
  ): IVaultServerDataPushOperations = {
    val __obj = js.Dynamic.literal(CloneVaultForServerDataPush = js.Any.fromFunction1(CloneVaultForServerDataPush), SendCancel = js.Any.fromFunction1(SendCancel), SendError = js.Any.fromFunction2(SendError), SendHeartbeat = js.Any.fromFunction1(SendHeartbeat), SendResponse = js.Any.fromFunction2(SendResponse), SetServerDataPushSink = js.Any.fromFunction1(SetServerDataPushSink))
  
    __obj.asInstanceOf[IVaultServerDataPushOperations]
  }
}

