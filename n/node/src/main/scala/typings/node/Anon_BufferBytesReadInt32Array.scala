package typings.node

import typings.std.Int32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesReadInt32Array extends js.Object {
  var buffer: Int32Array
  var bytesRead: Double
}

object Anon_BufferBytesReadInt32Array {
  @scala.inline
  def apply(buffer: Int32Array, bytesRead: Double): Anon_BufferBytesReadInt32Array = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesRead = bytesRead)
  
    __obj.asInstanceOf[Anon_BufferBytesReadInt32Array]
  }
}

