package typings.officeJsPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Application object, for use in "application.set({ ... })". */
@js.native
trait ApplicationUpdateData extends js.Object {
  
  /**
    *
    * Show or hide the iFrame application borders.
    *
    * [Api set:  1.1]
    */
  var showBorders: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Show or hide the standard toolbars.
    *
    * [Api set:  1.1]
    */
  var showToolbars: js.UndefOr[Boolean] = js.native
}
object ApplicationUpdateData {
  
  @scala.inline
  def apply(): ApplicationUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationUpdateData]
  }
  
  @scala.inline
  implicit class ApplicationUpdateDataOps[Self <: ApplicationUpdateData] (val x: Self) extends AnyVal {
    
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
    def setShowBorders(value: Boolean): Self = this.set("showBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowBorders: Self = this.set("showBorders", js.undefined)
    
    @scala.inline
    def setShowToolbars(value: Boolean): Self = this.set("showToolbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowToolbars: Self = this.set("showToolbars", js.undefined)
  }
}
