package typings.node

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferBytesReadFloat32Array extends js.Object {
  var buffer: Float32Array
  var bytesRead: Double
}

object AnonBufferBytesReadFloat32Array {
  @scala.inline
  def apply(buffer: Float32Array, bytesRead: Double): AnonBufferBytesReadFloat32Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferBytesReadFloat32Array]
  }
}

