package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesReadInt32Array extends js.Object {
  var buffer: stdLib.Int32Array
  var bytesRead: scala.Double
}

object Anon_BufferBytesReadInt32Array {
  @scala.inline
  def apply(buffer: stdLib.Int32Array, bytesRead: scala.Double): Anon_BufferBytesReadInt32Array = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesRead = bytesRead)
  
    __obj.asInstanceOf[Anon_BufferBytesReadInt32Array]
  }
}

