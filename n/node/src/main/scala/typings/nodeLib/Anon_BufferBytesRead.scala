package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesRead[TBuffer /* <: nodeLib.fsMod.BinaryData */] extends js.Object {
  var buffer: TBuffer
  var bytesRead: scala.Double
}

object Anon_BufferBytesRead {
  @scala.inline
  def apply[TBuffer /* <: nodeLib.fsMod.BinaryData */](buffer: TBuffer, bytesRead: scala.Double): Anon_BufferBytesRead[TBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead)
  
    __obj.asInstanceOf[Anon_BufferBytesRead[TBuffer]]
  }
}

