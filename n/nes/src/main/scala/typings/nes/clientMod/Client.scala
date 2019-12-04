package typings.nes.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var id: js.Any = js.native
  def connect(): js.Promise[_] = js.native
  def connect(options: ClientConnectOptions): js.Promise[_] = js.native
  def disconnect(): js.Promise[_] = js.native
  def message(message: js.Any): js.Promise[_] = js.native
  def onConnect(): Unit = js.native
  def onDisconnect(): Unit = js.native
  def onError(err: js.Any): Unit = js.native
  def onUpdate(message: js.Any): Unit = js.native
  def overrideReconnectionAuth(auth: js.Any): Unit = js.native
    // can be `null | number` but also the "socket" value from websocket message data.
  def request(options: String): js.Promise[_] = js.native
  def request(options: ClientRequestOptions): js.Promise[_] = js.native
  def subscribe(path: String, handler: Handler): js.Promise[_] = js.native
  def subscriptions(): js.Array[String] = js.native
  def unsubscribe(path: String, handler: Handler): js.Promise[_] = js.native
}

