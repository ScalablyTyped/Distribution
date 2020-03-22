package typings.node

import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferDataViewBytesReadNumber extends js.Object {
  var buffer: DataView
  var bytesRead: Double
}

object AnonBufferDataViewBytesReadNumber {
  @scala.inline
  def apply(buffer: DataView, bytesRead: Double): AnonBufferDataViewBytesReadNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferDataViewBytesReadNumber]
  }
}

