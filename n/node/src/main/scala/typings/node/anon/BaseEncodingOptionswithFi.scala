package typings.node.anon

import typings.node.BufferEncoding
import typings.node.nodeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined node.fs.BaseEncodingOptions & {  withFileTypes :false | undefined} */
@js.native
trait BaseEncodingOptionswithFi extends js.Object {
  var encoding: js.UndefOr[BufferEncoding | Null] = js.native
  var withFileTypes: js.UndefOr[`false`] = js.native
}

object BaseEncodingOptionswithFi {
  @scala.inline
  def apply(): BaseEncodingOptionswithFi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseEncodingOptionswithFi]
  }
  @scala.inline
  implicit class BaseEncodingOptionswithFiOps[Self <: BaseEncodingOptionswithFi] (val x: Self) extends AnyVal {
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
    def setWithFileTypes(value: `false`): Self = this.set("withFileTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithFileTypes: Self = this.set("withFileTypes", js.undefined)
  }
  
}

