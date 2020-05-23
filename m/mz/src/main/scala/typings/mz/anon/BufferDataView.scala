package typings.mz.anon

import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferDataView extends js.Object {
  var buffer: DataView
  var bytesRead: Double
}

object BufferDataView {
  @scala.inline
  def apply(buffer: DataView, bytesRead: Double): BufferDataView = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferDataView]
  }
}

