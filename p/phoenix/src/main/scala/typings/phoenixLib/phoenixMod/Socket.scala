package typings
package phoenixLib.phoenixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phoenix", "Socket")
@js.native
class Socket protected () extends js.Object {
  def this(endPoint: java.lang.String) = this()
  def this(endPoint: java.lang.String, opts: js.Object) = this()
  def channel(topic: java.lang.String): Channel = js.native
  def channel(topic: java.lang.String, chanParams: js.Object): Channel = js.native
  def connect(): scala.Unit = js.native
  def connect(params: js.Any): scala.Unit = js.native
  def connectionState(): java.lang.String = js.native
  def disconnect(): scala.Unit = js.native
  def disconnect(callback: js.Function): scala.Unit = js.native
  def disconnect(callback: js.Function, code: java.lang.String): scala.Unit = js.native
  def disconnect(callback: js.Function, code: java.lang.String, reason: js.Any): scala.Unit = js.native
  def endPointURL(): java.lang.String = js.native
  def flushSendBuffer(): scala.Unit = js.native
  def isConnected(): scala.Boolean = js.native
  def log(kind: java.lang.String, msg: java.lang.String, data: js.Any): scala.Unit = js.native
  def makeRef(): java.lang.String = js.native
  def onClose(callback: js.Function): scala.Unit = js.native
  def onConnClose(event: js.Any): scala.Unit = js.native
  def onConnError(error: js.Any): scala.Unit = js.native
  def onConnMessage(rawMessage: js.Any): scala.Unit = js.native
  def onConnOpen(): scala.Unit = js.native
  def onError(callback: js.Function): scala.Unit = js.native
  def onMessage(callback: js.Function): scala.Unit = js.native
  def onOpen(callback: js.Function): scala.Unit = js.native
  def protocol(): java.lang.String = js.native
  def push(data: js.Any): scala.Unit = js.native
  def remove(channel: Channel): scala.Unit = js.native
  def sendHeartbeat(): scala.Unit = js.native
  def triggerChanError(): scala.Unit = js.native
}

