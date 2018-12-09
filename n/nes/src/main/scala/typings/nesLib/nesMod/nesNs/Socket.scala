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

