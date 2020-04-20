package typings.node

import typings.std.Int8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferInt8Array extends js.Object {
  var buffer: Int8Array
  var bytesWritten: Double
}

object AnonBufferInt8Array {
  @scala.inline
  def apply(buffer: Int8Array, bytesWritten: Double): AnonBufferInt8Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBufferInt8Array]
  }
}

