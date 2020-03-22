package typings.pgPacketStream.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Packet extends js.Object {
  var code: Double
  var packet: Buffer
}

object Packet {
  @scala.inline
  def apply(code: Double, packet: Buffer): Packet = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], packet = packet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Packet]
  }
}

