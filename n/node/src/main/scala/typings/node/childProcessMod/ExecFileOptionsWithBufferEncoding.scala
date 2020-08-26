package typings.node.childProcessMod

import typings.node.nodeStrings.buffer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecFileOptionsWithBufferEncoding extends ExecFileOptions {
  var encoding: buffer_ | Null = js.native
}

object ExecFileOptionsWithBufferEncoding {
  @scala.inline
  def apply(): ExecFileOptionsWithBufferEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecFileOptionsWithBufferEncoding]
  }
  @scala.inline
  implicit class ExecFileOptionsWithBufferEncodingOps[Self <: ExecFileOptionsWithBufferEncoding] (val x: Self) extends AnyVal {
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
    def setEncoding(value: buffer_): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
  }
  
}

