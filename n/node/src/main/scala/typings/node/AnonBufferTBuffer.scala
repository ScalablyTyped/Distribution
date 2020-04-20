package typings.node

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferTBuffer[TBuffer /* <: Uint8Array */] extends js.Object {
  var buffer: TBuffer
  var bytesRead: Double
}

object AnonBufferTBuffer {
  @scala.inline
  def apply[TBuffer /* <: Uint8Array */](buffer: TBuffer, bytesRead: Double): AnonBufferTBuffer[TBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBufferTBuffer[TBuffer]]
  }
}

