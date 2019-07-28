package typings.node

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesReadNumber extends js.Object {
  var buffer: Uint8Array
  var bytesRead: Double
}

object Anon_BufferBytesReadNumber {
  @scala.inline
  def apply(buffer: Uint8Array, bytesRead: Double): Anon_BufferBytesReadNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesRead = bytesRead)
  
    __obj.asInstanceOf[Anon_BufferBytesReadNumber]
  }
}

