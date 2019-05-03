package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesReadFloat32Array extends js.Object {
  var buffer: stdLib.Float32Array
  var bytesRead: scala.Double
}

object Anon_BufferBytesReadFloat32Array {
  @scala.inline
  def apply(buffer: stdLib.Float32Array, bytesRead: scala.Double): Anon_BufferBytesReadFloat32Array = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesRead = bytesRead)
  
    __obj.asInstanceOf[Anon_BufferBytesReadFloat32Array]
  }
}

