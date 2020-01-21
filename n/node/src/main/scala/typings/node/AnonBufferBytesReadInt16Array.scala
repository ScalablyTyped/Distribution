package typings.node

import typings.std.Int16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferBytesReadInt16Array extends js.Object {
  var buffer: Int16Array
  var bytesRead: Double
}

object AnonBufferBytesReadInt16Array {
  @scala.inline
  def apply(buffer: Int16Array, bytesRead: Double): AnonBufferBytesReadInt16Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferBytesReadInt16Array]
  }
}

