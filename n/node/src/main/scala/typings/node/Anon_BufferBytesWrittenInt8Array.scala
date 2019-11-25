package typings.node

import typings.std.Int8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesWrittenInt8Array extends js.Object {
  var buffer: Int8Array
  var bytesWritten: Double
}

object Anon_BufferBytesWrittenInt8Array {
  @scala.inline
  def apply(buffer: Int8Array, bytesWritten: Double): Anon_BufferBytesWrittenInt8Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BufferBytesWrittenInt8Array]
  }
}

