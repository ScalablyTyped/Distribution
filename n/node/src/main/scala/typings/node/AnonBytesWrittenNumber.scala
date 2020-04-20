package typings.node

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBytesWrittenNumber[TBuffer /* <: Uint8Array */] extends js.Object {
  var buffer: TBuffer
  var bytesWritten: Double
}

object AnonBytesWrittenNumber {
  @scala.inline
  def apply[TBuffer /* <: Uint8Array */](buffer: TBuffer, bytesWritten: Double): AnonBytesWrittenNumber[TBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBytesWrittenNumber[TBuffer]]
  }
}

