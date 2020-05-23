package typings.mz.anon

import typings.std.Int16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferInt16Array extends js.Object {
  var buffer: Int16Array
  var bytesRead: Double
}

object BufferInt16Array {
  @scala.inline
  def apply(buffer: Int16Array, bytesRead: Double): BufferInt16Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt16Array]
  }
}

