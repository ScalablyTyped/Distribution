package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesWrittenNumber extends js.Object {
  var buffer: stdLib.Uint8Array
  var bytesWritten: scala.Double
}

object Anon_BufferBytesWrittenNumber {
  @scala.inline
  def apply(buffer: stdLib.Uint8Array, bytesWritten: scala.Double): Anon_BufferBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesWritten = bytesWritten)
  
    __obj.asInstanceOf[Anon_BufferBytesWrittenNumber]
  }
}

