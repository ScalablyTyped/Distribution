package typings.node.anon

import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferUint8ClampedArray extends js.Object {
  var buffer: Uint8ClampedArray
  var bytesWritten: Double
}

object BufferUint8ClampedArray {
  @scala.inline
  def apply(buffer: Uint8ClampedArray, bytesWritten: Double): BufferUint8ClampedArray = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferUint8ClampedArray]
  }
}

