package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultServerDataPushOperationsAsync extends js.Object {
  def CloneVaultForServerDataPush(ServerDataPushSink: IServerDataPushSink): scala.Unit = js.native
  def CloneVaultForServerDataPush(
    ServerDataPushSink: IServerDataPushSink,
    successCallback: js.Function1[/* result */ IVault, scala.Unit]
  ): scala.Unit = js.native
  def CloneVaultForServerDataPush(
    ServerDataPushSink: IServerDataPushSink,
    successCallback: js.Function1[/* result */ IVault, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def CloneVaultForServerDataPush(
    ServerDataPushSink: IServerDataPushSink,
    successCallback: js.Function1[/* result */ IVault, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SendCancel(RequestID: scala.Double): scala.Unit = js.native
  def SendCancel(RequestID: scala.Double, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def SendCancel(
    RequestID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SendCancel(
    RequestID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SendError(RequestID: scala.Double, Error: java.lang.String): scala.Unit = js.native
  def SendError(RequestID: scala.Double, Error: java.lang.String, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def SendError(
    RequestID: scala.Double,
    Error: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SendError(
    RequestID: scala.Double,
    Error: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SendHeartbeat(RequestID: scala.Double): scala.Unit = js.native
  def SendHeartbeat(RequestID: scala.Double, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def SendHeartbeat(
    RequestID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SendHeartbeat(
    RequestID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SendResponse(RequestID: scala.Double, JsonResponseContent: java.lang.String): scala.Unit = js.native
  def SendResponse(
    RequestID: scala.Double,
    JsonResponseContent: java.lang.String,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SendResponse(
    RequestID: scala.Double,
    JsonResponseContent: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SendResponse(
    RequestID: scala.Double,
    JsonResponseContent: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetServerDataPushSink(ServerDataPushSink: IServerDataPushSink): scala.Unit = js.native
  def SetServerDataPushSink(ServerDataPushSink: IServerDataPushSink, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def SetServerDataPushSink(
    ServerDataPushSink: IServerDataPushSink,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetServerDataPushSink(
    ServerDataPushSink: IServerDataPushSink,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

