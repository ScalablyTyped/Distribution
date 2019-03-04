package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesReadNumber[TBuffer /* <: Buffer | stdLib.Uint8Array */] extends js.Object {
  var buffer: TBuffer
  var bytesRead: scala.Double
}

object Anon_BufferBytesReadNumber {
  @scala.inline
  def apply[TBuffer /* <: Buffer | stdLib.Uint8Array */](buffer: TBuffer, bytesRead: scala.Double): Anon_BufferBytesReadNumber[TBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead)
  
    __obj.asInstanceOf[Anon_BufferBytesReadNumber[TBuffer]]
  }
}

