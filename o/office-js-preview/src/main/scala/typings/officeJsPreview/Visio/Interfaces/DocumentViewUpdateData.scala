package typings.officeJsPreview.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the DocumentView object, for use in "documentView.set({ ... })". */
trait DocumentViewUpdateData extends StObject {
  
  /**
    *
    * Disable Hyperlinks.
    *
    * [Api set:  1.1]
    */
  var disableHyperlinks: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Disable Pan.
    *
    * [Api set:  1.1]
    */
  var disablePan: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Disable PanZoomWindow.
    *
    * [Api set:  1.1]
    */
  var disablePanZoomWindow: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Disable Zoom.
    *
    * [Api set:  1.1]
    */
  var disableZoom: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Hide Diagram Boundary.
    *
    * [Api set:  1.1]
    */
  var hideDiagramBoundary: js.UndefOr[Boolean] = js.undefined
}
object DocumentViewUpdateData {
  
  @scala.inline
  def apply(): DocumentViewUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentViewUpdateData]
  }
  
  @scala.inline
  implicit class DocumentViewUpdateDataMutableBuilder[Self <: DocumentViewUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableHyperlinks(value: Boolean): Self = StObject.set(x, "disableHyperlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableHyperlinksUndefined: Self = StObject.set(x, "disableHyperlinks", js.undefined)
    
    @scala.inline
    def setDisablePan(value: Boolean): Self = StObject.set(x, "disablePan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisablePanUndefined: Self = StObject.set(x, "disablePan", js.undefined)
    
    @scala.inline
    def setDisablePanZoomWindow(value: Boolean): Self = StObject.set(x, "disablePanZoomWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisablePanZoomWindowUndefined: Self = StObject.set(x, "disablePanZoomWindow", js.undefined)
    
    @scala.inline
    def setDisableZoom(value: Boolean): Self = StObject.set(x, "disableZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableZoomUndefined: Self = StObject.set(x, "disableZoom", js.undefined)
    
    @scala.inline
    def setHideDiagramBoundary(value: Boolean): Self = StObject.set(x, "hideDiagramBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDiagramBoundaryUndefined: Self = StObject.set(x, "hideDiagramBoundary", js.undefined)
  }
}
