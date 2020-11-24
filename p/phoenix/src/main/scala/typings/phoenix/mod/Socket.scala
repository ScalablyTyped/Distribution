package typings.phoenix.mod

import typings.phoenix.anon.PartialSocketConnectOptio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("phoenix", "Socket")
@js.native
class Socket protected () extends js.Object {
  def this(endPoint: String) = this()
  def this(endPoint: String, opts: PartialSocketConnectOptio) = this()
  
  def channel(topic: String): Channel = js.native
  def channel(topic: String, chanParams: js.Object): Channel = js.native
  
  def connect(): Unit = js.native
  def connect(params: js.Any): Unit = js.native
  
  def connectionState(): ConnectionState = js.native
  
  def disconnect(): Unit = js.native
  def disconnect(callback: js.UndefOr[scala.Nothing], code: js.UndefOr[scala.Nothing], reason: String): Unit = js.native
  def disconnect(callback: js.UndefOr[scala.Nothing], code: Double): Unit = js.native
  def disconnect(callback: js.UndefOr[scala.Nothing], code: Double, reason: String): Unit = js.native
  def disconnect(callback: js.Function0[Unit]): Unit = js.native
  def disconnect(callback: js.Function0[Unit], code: js.UndefOr[scala.Nothing], reason: String): Unit = js.native
  def disconnect(callback: js.Function0[Unit], code: Double): Unit = js.native
  def disconnect(callback: js.Function0[Unit], code: Double, reason: String): Unit = js.native
  
  def endPointURL(): String = js.native
  
  def hasLogger(): Boolean = js.native
  
  def isConnected(): Boolean = js.native
  
  def log(kind: String, message: String, data: js.Any): Unit = js.native
  
  def makeRef(): MessageRef = js.native
  
  def off(refs: js.Array[MessageRef]): Unit = js.native
  
  def onClose(callback: js.Function1[/* cb */ js.Any, Unit]): MessageRef = js.native
  
  def onError(callback: js.Function1[/* cb */ js.Any, Unit]): MessageRef = js.native
  
  def onMessage(callback: js.Function1[/* cb */ js.Any, Unit]): MessageRef = js.native
  
  def onOpen(callback: js.Function1[/* cb */ js.Any, Unit]): MessageRef = js.native
  
  def protocol(): String = js.native
  
  def push(data: js.Object): Unit = js.native
  
  def remove(channel: Channel): Unit = js.native
}
