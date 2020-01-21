package typings.node

import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferBytesWrittenDataView extends js.Object {
  var buffer: DataView
  var bytesWritten: Double
}

object AnonBufferBytesWrittenDataView {
  @scala.inline
  def apply(buffer: DataView, bytesWritten: Double): AnonBufferBytesWrittenDataView = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferBytesWrittenDataView]
  }
}

