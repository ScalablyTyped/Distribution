package typings.node

import typings.std.Int16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferInt16ArrayBytesReadNumber extends js.Object {
  var buffer: Int16Array
  var bytesRead: Double
}

object AnonBufferInt16ArrayBytesReadNumber {
  @scala.inline
  def apply(buffer: Int16Array, bytesRead: Double): AnonBufferInt16ArrayBytesReadNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBufferInt16ArrayBytesReadNumber]
  }
}

