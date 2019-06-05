package typings
package phoenixLib.phoenixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phoenix", "Socket")
@js.native
class Socket protected () extends js.Object {
  def this(endPoint: java.lang.String) = this()
  def this(endPoint: java.lang.String, opts: stdLib.Partial[SocketConnectOption]) = this()
  def channel(topic: java.lang.String): Channel = js.native
  def channel(topic: java.lang.String, chanParams: js.Object): Channel = js.native
  def connect(): scala.Unit = js.native
  def connect(params: js.Any): scala.Unit = js.native
  def connectionState(): ConnectionState = js.native
  def disconnect(): scala.Unit = js.native
  def disconnect(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def disconnect(callback: js.Function0[scala.Unit], code: scala.Double): scala.Unit = js.native
  def disconnect(callback: js.Function0[scala.Unit], code: scala.Double, reason: java.lang.String): scala.Unit = js.native
  def endPointURL(): java.lang.String = js.native
  def hasLogger(): scala.Boolean = js.native
  def isConnected(): scala.Boolean = js.native
  def log(kind: java.lang.String, message: java.lang.String, data: js.Any): scala.Unit = js.native
  def makeRef(): java.lang.String = js.native
  def onClose(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def onError(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def onMessage(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def onOpen(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def protocol(): java.lang.String = js.native
  def push(data: js.Object): scala.Unit = js.native
  def remove(channel: Channel): scala.Unit = js.native
}

