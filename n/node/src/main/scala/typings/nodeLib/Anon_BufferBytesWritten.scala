package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesWritten extends js.Object {
  var buffer: stdLib.DataView
  var bytesWritten: scala.Double
}

object Anon_BufferBytesWritten {
  @scala.inline
  def apply(buffer: stdLib.DataView, bytesWritten: scala.Double): Anon_BufferBytesWritten = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesWritten = bytesWritten)
  
    __obj.asInstanceOf[Anon_BufferBytesWritten]
  }
}

