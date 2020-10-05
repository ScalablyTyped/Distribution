package typings.node.anon

import typings.node.BufferEncoding
import typings.node.fsMod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.BaseEncodingOptions & {  mode :node.fs.Mode | undefined,   flag :string | undefined} */
@js.native
trait BaseEncodingOptionsmodeMoEncoding extends js.Object {
  var encoding: js.UndefOr[BufferEncoding | Null] = js.native
  var flag: js.UndefOr[String] = js.native
  var mode: js.UndefOr[Mode] = js.native
}

object BaseEncodingOptionsmodeMoEncoding {
  @scala.inline
  def apply(): BaseEncodingOptionsmodeMoEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseEncodingOptionsmodeMoEncoding]
  }
  @scala.inline
  implicit class BaseEncodingOptionsmodeMoEncodingOps[Self <: BaseEncodingOptionsmodeMoEncoding] (val x: Self) extends AnyVal {
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
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
    @scala.inline
    def setFlag(value: String): Self = this.set("flag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlag: Self = this.set("flag", js.undefined)
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

