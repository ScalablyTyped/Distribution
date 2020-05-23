package typings.mz.anon

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer extends js.Object {
  var buffer: Uint8Array
  var bytesRead: Double
}

object Buffer {
  @scala.inline
  def apply(buffer: Uint8Array, bytesRead: Double): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
}

