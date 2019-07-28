package typings.node

import typings.std.Int8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesReadInt8Array extends js.Object {
  var buffer: Int8Array
  var bytesRead: Double
}

object Anon_BufferBytesReadInt8Array {
  @scala.inline
  def apply(buffer: Int8Array, bytesRead: Double): Anon_BufferBytesReadInt8Array = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesRead = bytesRead)
  
    __obj.asInstanceOf[Anon_BufferBytesReadInt8Array]
  }
}

