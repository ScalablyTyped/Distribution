package typings.node.anon

import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferUint32ArrayBytesReadNumber extends js.Object {
  var buffer: Uint32Array
  var bytesRead: Double
}

object BufferUint32ArrayBytesReadNumber {
  @scala.inline
  def apply(buffer: Uint32Array, bytesRead: Double): BufferUint32ArrayBytesReadNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferUint32ArrayBytesReadNumber]
  }
}

