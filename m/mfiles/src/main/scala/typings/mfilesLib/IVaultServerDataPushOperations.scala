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

