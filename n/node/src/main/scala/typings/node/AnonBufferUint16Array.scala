package typings.node

import typings.std.Uint16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferUint16Array extends js.Object {
  var buffer: Uint16Array
  var bytesRead: Double
}

object AnonBufferUint16Array {
  @scala.inline
  def apply(buffer: Uint16Array, bytesRead: Double): AnonBufferUint16Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBufferUint16Array]
  }
}

