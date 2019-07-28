package typings.node

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesReadFloat32Array extends js.Object {
  var buffer: Float32Array
  var bytesRead: Double
}

object Anon_BufferBytesReadFloat32Array {
  @scala.inline
  def apply(buffer: Float32Array, bytesRead: Double): Anon_BufferBytesReadFloat32Array = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesRead = bytesRead)
  
    __obj.asInstanceOf[Anon_BufferBytesReadFloat32Array]
  }
}

