package typings.node

import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesReadNumber extends js.Object {
  var buffer: Uint8ClampedArray
  var bytesRead: Double
}

object Anon_BufferBytesReadNumber {
  @scala.inline
  def apply(buffer: Uint8ClampedArray, bytesRead: Double): Anon_BufferBytesReadNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BufferBytesReadNumber]
  }
}

