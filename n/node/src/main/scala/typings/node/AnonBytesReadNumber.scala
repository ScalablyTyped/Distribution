package typings.node

import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBytesReadNumber extends js.Object {
  var buffer: Uint32Array
  var bytesRead: Double
}

object AnonBytesReadNumber {
  @scala.inline
  def apply(buffer: Uint32Array, bytesRead: Double): AnonBytesReadNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBytesReadNumber]
  }
}

