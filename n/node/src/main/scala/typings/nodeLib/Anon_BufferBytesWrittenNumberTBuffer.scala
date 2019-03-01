package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesWrittenNumberTBuffer[TBuffer /* <: Buffer | stdLib.Uint8Array */] extends js.Object {
  var buffer: TBuffer
  var bytesWritten: scala.Double
}

object Anon_BufferBytesWrittenNumberTBuffer {
  @scala.inline
  def apply[TBuffer /* <: Buffer | stdLib.Uint8Array */](buffer: TBuffer, bytesWritten: scala.Double): Anon_BufferBytesWrittenNumberTBuffer[TBuffer] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    __obj.updateDynamic("bytesWritten")(bytesWritten)
    __obj.asInstanceOf[Anon_BufferBytesWrittenNumberTBuffer[TBuffer]]
  }
}

