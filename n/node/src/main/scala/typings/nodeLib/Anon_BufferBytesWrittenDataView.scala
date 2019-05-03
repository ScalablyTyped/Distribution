package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesWrittenDataView extends js.Object {
  var buffer: stdLib.DataView
  var bytesWritten: scala.Double
}

object Anon_BufferBytesWrittenDataView {
  @scala.inline
  def apply(buffer: stdLib.DataView, bytesWritten: scala.Double): Anon_BufferBytesWrittenDataView = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesWritten = bytesWritten)
  
    __obj.asInstanceOf[Anon_BufferBytesWrittenDataView]
  }
}

