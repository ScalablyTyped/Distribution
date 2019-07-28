package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultServerDataPushOperationsAsync extends js.Object {
  def CloneVaultForServerDataPush(ServerDataPushSink: IServerDataPushSink): Unit = js.native
  def CloneVaultForServerDataPush(ServerDataPushSink: IServerDataPushSink, successCallback: js.Function1[/* result */ IVault, Unit]): Unit = js.native
  def CloneVaultForServerDataPush(
    ServerDataPushSink: IServerDataPushSink,
    successCallback: js.Function1[/* result */ IVault, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CloneVaultForServerDataPush(
    ServerDataPushSink: IServerDataPushSink,
    successCallback: js.Function1[/* result */ IVault, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SendCancel(RequestID: Double): Unit = js.native
  def SendCancel(RequestID: Double, successCallback: js.Function0[Unit]): Unit = js.native
  def SendCancel(
    RequestID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SendCancel(
    RequestID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SendError(RequestID: Double, Error: String): Unit = js.native
  def SendError(RequestID: Double, Error: String, successCallback: js.Function0[Unit]): Unit = js.native
  def SendError(
    RequestID: Double,
    Error: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SendError(
    RequestID: Double,
    Error: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SendHeartbeat(RequestID: Double): Unit = js.native
  def SendHeartbeat(RequestID: Double, successCallback: js.Function0[Unit]): Unit = js.native
  def SendHeartbeat(
    RequestID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SendHeartbeat(
    RequestID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SendResponse(RequestID: Double, JsonResponseContent: String): Unit = js.native
  def SendResponse(RequestID: Double, JsonResponseContent: String, successCallback: js.Function0[Unit]): Unit = js.native
  def SendResponse(
    RequestID: Double,
    JsonResponseContent: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SendResponse(
    RequestID: Double,
    JsonResponseContent: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetServerDataPushSink(ServerDataPushSink: IServerDataPushSink): Unit = js.native
  def SetServerDataPushSink(ServerDataPushSink: IServerDataPushSink, successCallback: js.Function0[Unit]): Unit = js.native
  def SetServerDataPushSink(
    ServerDataPushSink: IServerDataPushSink,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SetServerDataPushSink(
    ServerDataPushSink: IServerDataPushSink,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
}

