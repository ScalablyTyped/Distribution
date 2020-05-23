package typings.node.anon

import typings.std.Int8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferInt8ArrayBytesReadNumber extends js.Object {
  var buffer: Int8Array
  var bytesRead: Double
}

object BufferInt8ArrayBytesReadNumber {
  @scala.inline
  def apply(buffer: Int8Array, bytesRead: Double): BufferInt8ArrayBytesReadNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt8ArrayBytesReadNumber]
  }
}

