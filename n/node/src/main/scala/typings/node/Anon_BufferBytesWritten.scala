package typings.node

import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesWritten extends js.Object {
  var buffer: DataView
  var bytesWritten: Double
}

object Anon_BufferBytesWritten {
  @scala.inline
  def apply(buffer: DataView, bytesWritten: Double): Anon_BufferBytesWritten = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesWritten = bytesWritten)
  
    __obj.asInstanceOf[Anon_BufferBytesWritten]
  }
}

