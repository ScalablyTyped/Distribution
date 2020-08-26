package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferBytesWritten extends js.Object {
  var buffer: String = js.native
  var bytesWritten: Double = js.native
}

object BufferBytesWritten {
  @scala.inline
  def apply(buffer: String, bytesWritten: Double): BufferBytesWritten = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferBytesWritten]
  }
  @scala.inline
  implicit class BufferBytesWrittenOps[Self <: BufferBytesWritten] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuffer(value: String): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytesWritten(value: Double): Self = this.set("bytesWritten", value.asInstanceOf[js.Any])
  }
  
}

