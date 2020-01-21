package typings.node

import typings.std.Int16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferBytesWrittenInt16Array extends js.Object {
  var buffer: Int16Array
  var bytesWritten: Double
}

object AnonBufferBytesWrittenInt16Array {
  @scala.inline
  def apply(buffer: Int16Array, bytesWritten: Double): AnonBufferBytesWrittenInt16Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferBytesWrittenInt16Array]
  }
}

