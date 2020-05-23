package typings.node.anon

import typings.std.Int16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferInt16ArrayBytesReadNumber extends js.Object {
  var buffer: Int16Array
  var bytesRead: Double
}

object BufferInt16ArrayBytesReadNumber {
  @scala.inline
  def apply(buffer: Int16Array, bytesRead: Double): BufferInt16ArrayBytesReadNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt16ArrayBytesReadNumber]
  }
}

