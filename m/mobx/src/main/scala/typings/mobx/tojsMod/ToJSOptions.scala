package typings.mobx.tojsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToJSOptions extends js.Object {
  var detectCycles: js.UndefOr[Boolean] = js.native
  var exportMapsAsObjects: js.UndefOr[Boolean] = js.native
  var recurseEverything: js.UndefOr[Boolean] = js.native
}

object ToJSOptions {
  @scala.inline
  def apply(): ToJSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToJSOptions]
  }
  @scala.inline
  implicit class ToJSOptionsOps[Self <: ToJSOptions] (val x: Self) extends AnyVal {
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
    def setDetectCycles(value: Boolean): Self = this.set("detectCycles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectCycles: Self = this.set("detectCycles", js.undefined)
    @scala.inline
    def setExportMapsAsObjects(value: Boolean): Self = this.set("exportMapsAsObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportMapsAsObjects: Self = this.set("exportMapsAsObjects", js.undefined)
    @scala.inline
    def setRecurseEverything(value: Boolean): Self = this.set("recurseEverything", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurseEverything: Self = this.set("recurseEverything", js.undefined)
  }
  
}

