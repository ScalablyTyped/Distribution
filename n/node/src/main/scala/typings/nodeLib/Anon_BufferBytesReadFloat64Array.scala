package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesReadFloat64Array extends js.Object {
  var buffer: stdLib.Float64Array
  var bytesRead: scala.Double
}

object Anon_BufferBytesReadFloat64Array {
  @scala.inline
  def apply(buffer: stdLib.Float64Array, bytesRead: scala.Double): Anon_BufferBytesReadFloat64Array = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesRead = bytesRead)
  
    __obj.asInstanceOf[Anon_BufferBytesReadFloat64Array]
  }
}

