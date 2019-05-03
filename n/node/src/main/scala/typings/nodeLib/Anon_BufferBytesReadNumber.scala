package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesReadNumber extends js.Object {
  var buffer: stdLib.Uint8Array
  var bytesRead: scala.Double
}

object Anon_BufferBytesReadNumber {
  @scala.inline
  def apply(buffer: stdLib.Uint8Array, bytesRead: scala.Double): Anon_BufferBytesReadNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesRead = bytesRead)
  
    __obj.asInstanceOf[Anon_BufferBytesReadNumber]
  }
}

