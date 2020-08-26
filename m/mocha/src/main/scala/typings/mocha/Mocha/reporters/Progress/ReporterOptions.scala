package typings.mocha.Mocha.reporters.Progress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReporterOptions extends js.Object {
  var close: js.UndefOr[String] = js.native
  var complete: js.UndefOr[String] = js.native
  var incomplete: js.UndefOr[String] = js.native
  var open: js.UndefOr[String] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object ReporterOptions {
  @scala.inline
  def apply(): ReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReporterOptions]
  }
  @scala.inline
  implicit class ReporterOptionsOps[Self <: ReporterOptions] (val x: Self) extends AnyVal {
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
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setComplete(value: String): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setIncomplete(value: String): Self = this.set("incomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncomplete: Self = this.set("incomplete", js.undefined)
    @scala.inline
    def setOpen(value: String): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

