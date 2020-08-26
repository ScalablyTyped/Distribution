package typings.mz.childProcessMod

import typings.node.childProcessMod.ExecFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecFileOptionsWithOtherEncoding extends ExecFileOptions {
  var encoding: js.UndefOr[String | Null] = js.native
}

object ExecFileOptionsWithOtherEncoding {
  @scala.inline
  def apply(): ExecFileOptionsWithOtherEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecFileOptionsWithOtherEncoding]
  }
  @scala.inline
  implicit class ExecFileOptionsWithOtherEncodingOps[Self <: ExecFileOptionsWithOtherEncoding] (val x: Self) extends AnyVal {
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
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
  }
  
}

