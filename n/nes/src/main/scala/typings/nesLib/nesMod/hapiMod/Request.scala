package typings
package nesLib.nesMod.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var socket: nesLib.nesMod.Socket
}

object Request {
  @scala.inline
  def apply(socket: nesLib.nesMod.Socket): Request = {
    val __obj = js.Dynamic.literal(socket = socket)
  
    __obj.asInstanceOf[Request]
  }
}

