package typings.officeJsPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "documentView.toJSON()". */
@js.native
trait DocumentViewData extends js.Object {
  
  /**
    *
    * Disable Hyperlinks.
    *
    * [Api set:  1.1]
    */
  var disableHyperlinks: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Disable Pan.
    *
    * [Api set:  1.1]
    */
  var disablePan: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Disable PanZoomWindow.
    *
    * [Api set:  1.1]
    */
  var disablePanZoomWindow: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Disable Zoom.
    *
    * [Api set:  1.1]
    */
  var disableZoom: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Hide Diagram Boundary.
    *
    * [Api set:  1.1]
    */
  var hideDiagramBoundary: js.UndefOr[Boolean] = js.native
}
object DocumentViewData {
  
  @scala.inline
  def apply(): DocumentViewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentViewData]
  }
  
  @scala.inline
  implicit class DocumentViewDataOps[Self <: DocumentViewData] (val x: Self) extends AnyVal {
    
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
    def setDisableHyperlinks(value: Boolean): Self = this.set("disableHyperlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableHyperlinks: Self = this.set("disableHyperlinks", js.undefined)
    
    @scala.inline
    def setDisablePan(value: Boolean): Self = this.set("disablePan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePan: Self = this.set("disablePan", js.undefined)
    
    @scala.inline
    def setDisablePanZoomWindow(value: Boolean): Self = this.set("disablePanZoomWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePanZoomWindow: Self = this.set("disablePanZoomWindow", js.undefined)
    
    @scala.inline
    def setDisableZoom(value: Boolean): Self = this.set("disableZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableZoom: Self = this.set("disableZoom", js.undefined)
    
    @scala.inline
    def setHideDiagramBoundary(value: Boolean): Self = this.set("hideDiagramBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideDiagramBoundary: Self = this.set("hideDiagramBoundary", js.undefined)
  }
}
