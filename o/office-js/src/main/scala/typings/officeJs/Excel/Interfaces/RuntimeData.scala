package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `runtime.toJSON()`. */
@js.native
trait RuntimeData extends js.Object {
  /**
    *
    * Toggle JavaScript events in the current task pane or content add-in.
    *
    * [Api set: ExcelApi 1.8]
    */
  var enableEvents: js.UndefOr[Boolean] = js.native
}

object RuntimeData {
  @scala.inline
  def apply(): RuntimeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeData]
  }
  @scala.inline
  implicit class RuntimeDataOps[Self <: RuntimeData] (val x: Self) extends AnyVal {
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
    def setEnableEvents(value: Boolean): Self = this.set("enableEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableEvents: Self = this.set("enableEvents", js.undefined)
  }
  
}

