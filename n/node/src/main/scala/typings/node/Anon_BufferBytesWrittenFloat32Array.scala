package typings.node

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesWrittenFloat32Array extends js.Object {
  var buffer: Float32Array
  var bytesWritten: Double
}

object Anon_BufferBytesWrittenFloat32Array {
  @scala.inline
  def apply(buffer: Float32Array, bytesWritten: Double): Anon_BufferBytesWrittenFloat32Array = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesWritten = bytesWritten)
  
    __obj.asInstanceOf[Anon_BufferBytesWrittenFloat32Array]
  }
}

