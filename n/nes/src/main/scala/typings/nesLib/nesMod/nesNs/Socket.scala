package typings
package nesLib.nesMod.nesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Socket extends js.Object {
  var app: js.Object
  var auth: SocketAuthObject
  var id: java.lang.String
  def disconnect(): stdLib.Promise[_]
  def publish(path: java.lang.String, message: js.Any): stdLib.Promise[_]
  def revoke(path: java.lang.String, message: js.Any): stdLib.Promise[_]
  def send(message: js.Any): stdLib.Promise[_]
}

