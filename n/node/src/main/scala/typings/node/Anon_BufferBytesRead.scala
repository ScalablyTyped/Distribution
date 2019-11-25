package typings.node

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesRead extends js.Object {
  var buffer: Uint8Array
  var bytesRead: Double
}

object Anon_BufferBytesRead {
  @scala.inline
  def apply(buffer: Uint8Array, bytesRead: Double): Anon_BufferBytesRead = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BufferBytesRead]
  }
}

