package typings.node

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferBytesWrittenFloat32Array extends js.Object {
  var buffer: Float32Array
  var bytesWritten: Double
}

object AnonBufferBytesWrittenFloat32Array {
  @scala.inline
  def apply(buffer: Float32Array, bytesWritten: Double): AnonBufferBytesWrittenFloat32Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferBytesWrittenFloat32Array]
  }
}

