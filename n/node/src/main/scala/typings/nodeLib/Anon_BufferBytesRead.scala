package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesRead extends js.Object {
  var buffer: stdLib.DataView
  var bytesRead: scala.Double
}

object Anon_BufferBytesRead {
  @scala.inline
  def apply(buffer: stdLib.DataView, bytesRead: scala.Double): Anon_BufferBytesRead = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesRead = bytesRead)
  
    __obj.asInstanceOf[Anon_BufferBytesRead]
  }
}

