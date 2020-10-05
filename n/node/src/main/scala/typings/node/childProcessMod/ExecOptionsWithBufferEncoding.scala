package typings.node.childProcessMod

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecOptionsWithBufferEncoding extends ExecOptions {
  var encoding: BufferEncoding | Null = js.native
}

object ExecOptionsWithBufferEncoding {
  @scala.inline
  def apply(): ExecOptionsWithBufferEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecOptionsWithBufferEncoding]
  }
  @scala.inline
  implicit class ExecOptionsWithBufferEncodingOps[Self <: ExecOptionsWithBufferEncoding] (val x: Self) extends AnyVal {
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
    def setEncoding(value: BufferEncoding): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
  }
  
}

