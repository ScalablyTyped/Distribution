package typings.node

import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferBytesReadDataView extends js.Object {
  var buffer: DataView
  var bytesRead: Double
}

object AnonBufferBytesReadDataView {
  @scala.inline
  def apply(buffer: DataView, bytesRead: Double): AnonBufferBytesReadDataView = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferBytesReadDataView]
  }
}

