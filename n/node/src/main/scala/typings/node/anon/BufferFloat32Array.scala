package typings.node.anon

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferFloat32Array extends js.Object {
  var buffer: Float32Array
  var bytesWritten: Double
}

object BufferFloat32Array {
  @scala.inline
  def apply(buffer: Float32Array, bytesWritten: Double): BufferFloat32Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferFloat32Array]
  }
}

