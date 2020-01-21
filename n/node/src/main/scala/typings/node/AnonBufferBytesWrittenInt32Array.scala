package typings.node

import typings.std.Int32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferBytesWrittenInt32Array extends js.Object {
  var buffer: Int32Array
  var bytesWritten: Double
}

object AnonBufferBytesWrittenInt32Array {
  @scala.inline
  def apply(buffer: Int32Array, bytesWritten: Double): AnonBufferBytesWrittenInt32Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferBytesWrittenInt32Array]
  }
}

