package typings.node

import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesWrittenDataView extends js.Object {
  var buffer: DataView
  var bytesWritten: Double
}

object Anon_BufferBytesWrittenDataView {
  @scala.inline
  def apply(buffer: DataView, bytesWritten: Double): Anon_BufferBytesWrittenDataView = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BufferBytesWrittenDataView]
  }
}

