package typings.officeJs.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the DocumentView class.
  *
  * [Api set:  1.1]
  */
@js.native
trait DocumentViewLoadOptions extends StObject {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
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
object DocumentViewLoadOptions {
  
  @scala.inline
  def apply(): DocumentViewLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentViewLoadOptions]
  }
  
  @scala.inline
  implicit class DocumentViewLoadOptionsMutableBuilder[Self <: DocumentViewLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
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
