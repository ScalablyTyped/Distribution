package typings.node

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesWrittenNumber extends js.Object {
  var buffer: Uint8Array
  var bytesWritten: Double
}

object Anon_BufferBytesWrittenNumber {
  @scala.inline
  def apply(buffer: Uint8Array, bytesWritten: Double): Anon_BufferBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesWritten = bytesWritten)
  
    __obj.asInstanceOf[Anon_BufferBytesWrittenNumber]
  }
}

