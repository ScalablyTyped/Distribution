package typings.node

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferFloat32ArrayBytesReadNumber extends js.Object {
  var buffer: Float32Array
  var bytesRead: Double
}

object AnonBufferFloat32ArrayBytesReadNumber {
  @scala.inline
  def apply(buffer: Float32Array, bytesRead: Double): AnonBufferFloat32ArrayBytesReadNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferFloat32ArrayBytesReadNumber]
  }
}

