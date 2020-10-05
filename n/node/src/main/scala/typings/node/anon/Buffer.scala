package typings.node.anon

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buffer[TBuffer /* <: Uint8Array */] extends js.Object {
  var buffer: TBuffer = js.native
  var bytesRead: Double = js.native
}

object Buffer {
  @scala.inline
  def apply[/* <: typings.std.Uint8Array */ TBuffer](buffer: TBuffer, bytesRead: Double): Buffer[TBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer[TBuffer]]
  }
  @scala.inline
  implicit class BufferOps[Self <: Buffer[_], /* <: typings.std.Uint8Array */ TBuffer] (val x: Self with Buffer[TBuffer]) extends AnyVal {
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
    def setBytesRead(value: Double): Self = this.set("bytesRead", value.asInstanceOf[js.Any])
  }
  
}

