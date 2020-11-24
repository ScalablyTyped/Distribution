package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Runtime object, for use in `runtime.set({ ... })`. */
@js.native
trait RuntimeUpdateData extends js.Object {
  
  /**
    *
    * Toggle JavaScript events in the current task pane or content add-in.
    *
    * [Api set: ExcelApi 1.8]
    */
  var enableEvents: js.UndefOr[Boolean] = js.native
}
object RuntimeUpdateData {
  
  @scala.inline
  def apply(): RuntimeUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeUpdateData]
  }
  
  @scala.inline
  implicit class RuntimeUpdateDataOps[Self <: RuntimeUpdateData] (val x: Self) extends AnyVal {
    
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
