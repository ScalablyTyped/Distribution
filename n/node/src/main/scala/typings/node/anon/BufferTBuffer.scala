package typings.node.anon

import typings.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferTBuffer[TBuffer /* <: ArrayBufferView */] extends js.Object {
  var buffer: TBuffer = js.native
  var bytesWritten: Double = js.native
}

object BufferTBuffer {
  @scala.inline
  def apply[/* <: typings.node.NodeJS.ArrayBufferView */ TBuffer](buffer: TBuffer, bytesWritten: Double): BufferTBuffer[TBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferTBuffer[TBuffer]]
  }
  @scala.inline
  implicit class BufferTBufferOps[Self <: BufferTBuffer[_], /* <: typings.node.NodeJS.ArrayBufferView */ TBuffer] (val x: Self with BufferTBuffer[TBuffer]) extends AnyVal {
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
    def setBuffer(value: TBuffer): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytesWritten(value: Double): Self = this.set("bytesWritten", value.asInstanceOf[js.Any])
  }
  
}

