package typings
package nesLib.nesMod.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var socket: nesLib.nesMod.nesNs.Socket
}

object Request {
  @scala.inline
  def apply(socket: nesLib.nesMod.nesNs.Socket): Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("socket")(socket)
    __obj.asInstanceOf[Request]
  }
}

