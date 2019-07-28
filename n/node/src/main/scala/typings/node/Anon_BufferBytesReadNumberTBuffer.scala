package typings.node

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesReadNumberTBuffer[TBuffer /* <: Uint8Array */] extends js.Object {
  var buffer: TBuffer
  var bytesRead: Double
}

object Anon_BufferBytesReadNumberTBuffer {
  @scala.inline
  def apply[TBuffer /* <: Uint8Array */](buffer: TBuffer, bytesRead: Double): Anon_BufferBytesReadNumberTBuffer[TBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead)
  
    __obj.asInstanceOf[Anon_BufferBytesReadNumberTBuffer[TBuffer]]
  }
}

