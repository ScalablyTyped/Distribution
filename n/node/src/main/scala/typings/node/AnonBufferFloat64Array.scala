package typings.node

import typings.std.Float64Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferFloat64Array extends js.Object {
  var buffer: Float64Array
  var bytesWritten: Double
}

object AnonBufferFloat64Array {
  @scala.inline
  def apply(buffer: Float64Array, bytesWritten: Double): AnonBufferFloat64Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBufferFloat64Array]
  }
}

