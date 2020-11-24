package typings.mqttPacket.mod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mqtt-packet", "writeToStream")
@js.native
object writeToStream extends js.Object {
  
  def apply(`object`: Packet, stream: WritableStream): Unit = js.native
  def apply(`object`: Packet, stream: WritableStream, opts: js.Object): Unit = js.native
  
  var cacheNumbers: Boolean = js.native
}
