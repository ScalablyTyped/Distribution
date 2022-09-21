package typings.officeJs.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the DocumentView class.
  *
  * [Api set:  1.1]
  */
trait DocumentViewLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
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
object DocumentViewLoadOptions {
  
  inline def apply(): DocumentViewLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentViewLoadOptions]
  }
  
  extension [Self <: DocumentViewLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
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
