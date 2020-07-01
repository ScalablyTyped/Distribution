package typings.node.anon

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BytesWritten[TBuffer /* <: Uint8Array */] extends js.Object {
  var buffer: TBuffer
  var bytesWritten: Double
}

object BytesWritten {
  @scala.inline
  def apply[/* <: typings.std.Uint8Array */ TBuffer](buffer: TBuffer, bytesWritten: Double): BytesWritten[TBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesWritten[TBuffer]]
  }
}

