package typings.node

import typings.std.Int16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferInt16Array extends js.Object {
  var buffer: Int16Array
  var bytesWritten: Double
}

object AnonBufferInt16Array {
  @scala.inline
  def apply(buffer: Int16Array, bytesWritten: Double): AnonBufferInt16Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBufferInt16Array]
  }
}

