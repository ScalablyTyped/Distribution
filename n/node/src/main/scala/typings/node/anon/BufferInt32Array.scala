package typings.node.anon

import typings.std.Int32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferInt32Array extends js.Object {
  var buffer: Int32Array = js.native
  var bytesRead: Double = js.native
}

object BufferInt32Array {
  @scala.inline
  def apply(buffer: Int32Array, bytesRead: Double): BufferInt32Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt32Array]
  }
  @scala.inline
  implicit class BufferInt32ArrayOps[Self <: BufferInt32Array] (val x: Self) extends AnyVal {
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
    def setBuffer(value: Int32Array): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytesRead(value: Double): Self = this.set("bytesRead", value.asInstanceOf[js.Any])
  }
  
}

