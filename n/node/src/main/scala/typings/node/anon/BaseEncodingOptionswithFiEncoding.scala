package typings.node.anon

import typings.node.BufferEncoding
import typings.node.nodeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined node.fs.BaseEncodingOptions & {  withFileTypes :true} */
@js.native
trait BaseEncodingOptionswithFiEncoding extends js.Object {
  var encoding: js.UndefOr[BufferEncoding | Null] = js.native
  var withFileTypes: `true` = js.native
}

object BaseEncodingOptionswithFiEncoding {
  @scala.inline
  def apply(withFileTypes: `true`): BaseEncodingOptionswithFiEncoding = {
    val __obj = js.Dynamic.literal(withFileTypes = withFileTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEncodingOptionswithFiEncoding]
  }
  @scala.inline
  implicit class BaseEncodingOptionswithFiEncodingOps[Self <: BaseEncodingOptionswithFiEncoding] (val x: Self) extends AnyVal {
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
    def setWithFileTypes(value: `true`): Self = this.set("withFileTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
  }
  
}

