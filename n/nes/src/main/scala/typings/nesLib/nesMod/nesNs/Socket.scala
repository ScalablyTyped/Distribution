package typings
package nesLib.nesMod.nesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Socket extends js.Object {
  var app: js.Object
  var auth: SocketAuthObject
  var id: java.lang.String
  def disconnect(): js.Promise[_]
  def publish(path: java.lang.String, message: js.Any): js.Promise[_]
  def revoke(path: java.lang.String, message: js.Any): js.Promise[_]
  def send(message: js.Any): js.Promise[_]
}

object Socket {
  @scala.inline
  def apply(
    app: js.Object,
    auth: SocketAuthObject,
    disconnect: () => js.Promise[_],
    id: java.lang.String,
    publish: (java.lang.String, js.Any) => js.Promise[_],
    revoke: (java.lang.String, js.Any) => js.Promise[_],
    send: js.Any => js.Promise[_]
  ): Socket = {
    val __obj = js.Dynamic.literal(app = app, auth = auth, disconnect = js.Any.fromFunction0(disconnect), id = id, publish = js.Any.fromFunction2(publish), revoke = js.Any.fromFunction2(revoke), send = js.Any.fromFunction1(send))
  
    __obj.asInstanceOf[Socket]
  }
}

