package typings.node

import typings.std.Int8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferBytesReadInt8Array extends js.Object {
  var buffer: Int8Array
  var bytesRead: Double
}

object AnonBufferBytesReadInt8Array {
  @scala.inline
  def apply(buffer: Int8Array, bytesRead: Double): AnonBufferBytesReadInt8Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferBytesReadInt8Array]
  }
}

