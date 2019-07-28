package typings.node

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesWrittenNumberTBuffer[TBuffer /* <: Uint8Array */] extends js.Object {
  var buffer: TBuffer
  var bytesWritten: Double
}

object Anon_BufferBytesWrittenNumberTBuffer {
  @scala.inline
  def apply[TBuffer /* <: Uint8Array */](buffer: TBuffer, bytesWritten: Double): Anon_BufferBytesWrittenNumberTBuffer[TBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten)
  
    __obj.asInstanceOf[Anon_BufferBytesWrittenNumberTBuffer[TBuffer]]
  }
}

