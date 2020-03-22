package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferString extends js.Object {
  var buffer: java.lang.String
  var bytesWritten: Double
}

object AnonBufferString {
  @scala.inline
  def apply(buffer: java.lang.String, bytesWritten: Double): AnonBufferString = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferString]
  }
}

