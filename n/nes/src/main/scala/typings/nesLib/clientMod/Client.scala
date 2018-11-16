package typings
package nesLib.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var id: js.Any = js.native
  def connect(): stdLib.Promise[_] = js.native
  def connect(options: nesLib.clientMod.ClientNs.ClientConnectOptions): stdLib.Promise[_] = js.native
  def disconnect(): stdLib.Promise[_] = js.native
  def message(message: js.Any): stdLib.Promise[_] = js.native
  def onConnect(): scala.Unit = js.native
  def onDisconnect(): scala.Unit = js.native
  def onError(err: js.Any): scala.Unit = js.native
  def onUpdate(message: js.Any): scala.Unit = js.native
  def overrideReconnectionAuth(auth: js.Any): scala.Unit = js.native
    // can be `null | number` but also the "socket" value from websocket message data.
  def request(options: java.lang.String): stdLib.Promise[_] = js.native
    // can be `null | number` but also the "socket" value from websocket message data.
  def request(options: nesLib.clientMod.ClientNs.ClientRequestOptions): stdLib.Promise[_] = js.native
  def subscribe(path: java.lang.String, handler: nesLib.clientMod.ClientNs.Handler): stdLib.Promise[_] = js.native
  def subscriptions(): js.Array[java.lang.String] = js.native
  def unsubscribe(path: java.lang.String, handler: nesLib.clientMod.ClientNs.Handler): stdLib.Promise[_] = js.native
}

