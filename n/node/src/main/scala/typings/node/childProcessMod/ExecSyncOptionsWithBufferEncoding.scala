package typings.node.childProcessMod

import typings.node.nodeStrings.buffer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecSyncOptionsWithBufferEncoding extends ExecSyncOptions {
  @JSName("encoding")
  var encoding_ExecSyncOptionsWithBufferEncoding: js.UndefOr[buffer_ | Null] = js.native
}

object ExecSyncOptionsWithBufferEncoding {
  @scala.inline
  def apply(): ExecSyncOptionsWithBufferEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecSyncOptionsWithBufferEncoding]
  }
  @scala.inline
  implicit class ExecSyncOptionsWithBufferEncodingOps[Self <: ExecSyncOptionsWithBufferEncoding] (val x: Self) extends AnyVal {
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
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
  }
  
}

