package typings.node.anon

import typings.std.Int8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferInt8Array extends js.Object {
  var buffer: Int8Array
  var bytesWritten: Double
}

object BufferInt8Array {
  @scala.inline
  def apply(buffer: Int8Array, bytesWritten: Double): BufferInt8Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt8Array]
  }
}

