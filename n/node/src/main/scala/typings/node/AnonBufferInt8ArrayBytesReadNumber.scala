package typings.node

import typings.std.Int8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferInt8ArrayBytesReadNumber extends js.Object {
  var buffer: Int8Array
  var bytesRead: Double
}

object AnonBufferInt8ArrayBytesReadNumber {
  @scala.inline
  def apply(buffer: Int8Array, bytesRead: Double): AnonBufferInt8ArrayBytesReadNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBufferInt8ArrayBytesReadNumber]
  }
}

