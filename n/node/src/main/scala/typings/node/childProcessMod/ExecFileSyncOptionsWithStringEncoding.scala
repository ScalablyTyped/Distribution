package typings.node.childProcessMod

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecFileSyncOptionsWithStringEncoding extends ExecFileSyncOptions {
  @JSName("encoding")
  var encoding_ExecFileSyncOptionsWithStringEncoding: BufferEncoding = js.native
}

object ExecFileSyncOptionsWithStringEncoding {
  @scala.inline
  def apply(encoding: BufferEncoding): ExecFileSyncOptionsWithStringEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecFileSyncOptionsWithStringEncoding]
  }
  @scala.inline
  implicit class ExecFileSyncOptionsWithStringEncodingOps[Self <: ExecFileSyncOptionsWithStringEncoding] (val x: Self) extends AnyVal {
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
  }
  
}

