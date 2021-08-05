package typings.officeJs.Visio.Interfaces

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
  
  inline def apply(): DocumentViewUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentViewUpdateData]
  }
  
  extension [Self <: DocumentViewUpdateData](x: Self) {
    
    inline def setDisableHyperlinks(value: Boolean): Self = StObject.set(x, "disableHyperlinks", value.asInstanceOf[js.Any])
    
    inline def setDisableHyperlinksUndefined: Self = StObject.set(x, "disableHyperlinks", js.undefined)
    
    inline def setDisablePan(value: Boolean): Self = StObject.set(x, "disablePan", value.asInstanceOf[js.Any])
    
    inline def setDisablePanUndefined: Self = StObject.set(x, "disablePan", js.undefined)
    
    inline def setDisablePanZoomWindow(value: Boolean): Self = StObject.set(x, "disablePanZoomWindow", value.asInstanceOf[js.Any])
    
    inline def setDisablePanZoomWindowUndefined: Self = StObject.set(x, "disablePanZoomWindow", js.undefined)
    
    inline def setDisableZoom(value: Boolean): Self = StObject.set(x, "disableZoom", value.asInstanceOf[js.Any])
    
    inline def setDisableZoomUndefined: Self = StObject.set(x, "disableZoom", js.undefined)
    
    inline def setHideDiagramBoundary(value: Boolean): Self = StObject.set(x, "hideDiagramBoundary", value.asInstanceOf[js.Any])
    
    inline def setHideDiagramBoundaryUndefined: Self = StObject.set(x, "hideDiagramBoundary", js.undefined)
  }
}
