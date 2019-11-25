package typings.node

import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesReadDataView extends js.Object {
  var buffer: DataView
  var bytesRead: Double
}

object Anon_BufferBytesReadDataView {
  @scala.inline
  def apply(buffer: DataView, bytesRead: Double): Anon_BufferBytesReadDataView = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BufferBytesReadDataView]
  }
}

