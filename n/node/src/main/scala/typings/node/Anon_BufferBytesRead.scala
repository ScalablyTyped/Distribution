package typings.node

import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesRead extends js.Object {
  var buffer: DataView
  var bytesRead: Double
}

object Anon_BufferBytesRead {
  @scala.inline
  def apply(buffer: DataView, bytesRead: Double): Anon_BufferBytesRead = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesRead = bytesRead)
  
    __obj.asInstanceOf[Anon_BufferBytesRead]
  }
}

