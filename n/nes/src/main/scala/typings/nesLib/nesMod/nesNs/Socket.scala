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
    disconnect: js.Function0[js.Promise[_]],
    id: java.lang.String,
    publish: js.Function2[java.lang.String, js.Any, js.Promise[_]],
    revoke: js.Function2[java.lang.String, js.Any, js.Promise[_]],
    send: js.Function1[js.Any, js.Promise[_]]
  ): Socket = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app")(app)
    __obj.updateDynamic("auth")(auth)
    __obj.updateDynamic("disconnect")(disconnect)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("publish")(publish)
    __obj.updateDynamic("revoke")(revoke)
    __obj.updateDynamic("send")(send)
    __obj.asInstanceOf[Socket]
  }
}

