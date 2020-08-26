package typings.pgProtocol.serializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecOpts extends js.Object {
  var portal: js.UndefOr[String] = js.native
  var rows: js.UndefOr[Double] = js.native
}

object ExecOpts {
  @scala.inline
  def apply(): ExecOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecOpts]
  }
  @scala.inline
  implicit class ExecOptsOps[Self <: ExecOpts] (val x: Self) extends AnyVal {
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
    def setPortal(value: String): Self = this.set("portal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortal: Self = this.set("portal", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
  
}

