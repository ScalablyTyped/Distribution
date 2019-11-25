package typings.node

import typings.std.Float64Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesReadFloat64Array extends js.Object {
  var buffer: Float64Array
  var bytesRead: Double
}

object Anon_BufferBytesReadFloat64Array {
  @scala.inline
  def apply(buffer: Float64Array, bytesRead: Double): Anon_BufferBytesReadFloat64Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BufferBytesReadFloat64Array]
  }
}

