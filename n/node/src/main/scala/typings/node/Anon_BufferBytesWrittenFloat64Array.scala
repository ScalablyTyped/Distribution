package typings.node

import typings.std.Float64Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesWrittenFloat64Array extends js.Object {
  var buffer: Float64Array
  var bytesWritten: Double
}

object Anon_BufferBytesWrittenFloat64Array {
  @scala.inline
  def apply(buffer: Float64Array, bytesWritten: Double): Anon_BufferBytesWrittenFloat64Array = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesWritten = bytesWritten)
  
    __obj.asInstanceOf[Anon_BufferBytesWrittenFloat64Array]
  }
}

