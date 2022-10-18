package typings.openui5.anon

import typings.openui5.sapUiWebcFioriLibraryMod.FCLLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowsUsed extends StObject {
  
  /**
    * Indicates if the layout is changed via the arrows
    */
  var arrowsUsed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The effective column layout, f.e [67%, 33%, 0]
    */
  var columnLayout: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Indicates if the end column is currently visible
    */
  var endColumnVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current layout
    */
  var layout: js.UndefOr[FCLLayout] = js.undefined
  
  /**
    * Indicates if the middle column is currently visible
    */
  var midColumnVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if the layout is changed via resizing
    */
  var resize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if the start column is currently visible
    */
  var startColumnVisible: js.UndefOr[Boolean] = js.undefined
}
object ArrowsUsed {
  
  inline def apply(): ArrowsUsed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrowsUsed]
  }
  
  extension [Self <: ArrowsUsed](x: Self) {
    
    inline def setArrowsUsed(value: Boolean): Self = StObject.set(x, "arrowsUsed", value.asInstanceOf[js.Any])
    
    inline def setArrowsUsedUndefined: Self = StObject.set(x, "arrowsUsed", js.undefined)
    
    inline def setColumnLayout(value: js.Array[Any]): Self = StObject.set(x, "columnLayout", value.asInstanceOf[js.Any])
    
    inline def setColumnLayoutUndefined: Self = StObject.set(x, "columnLayout", js.undefined)
    
    inline def setColumnLayoutVarargs(value: Any*): Self = StObject.set(x, "columnLayout", js.Array(value*))
    
    inline def setEndColumnVisible(value: Boolean): Self = StObject.set(x, "endColumnVisible", value.asInstanceOf[js.Any])
    
    inline def setEndColumnVisibleUndefined: Self = StObject.set(x, "endColumnVisible", js.undefined)
    
    inline def setLayout(value: FCLLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMidColumnVisible(value: Boolean): Self = StObject.set(x, "midColumnVisible", value.asInstanceOf[js.Any])
    
    inline def setMidColumnVisibleUndefined: Self = StObject.set(x, "midColumnVisible", js.undefined)
    
    inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setStartColumnVisible(value: Boolean): Self = StObject.set(x, "startColumnVisible", value.asInstanceOf[js.Any])
    
    inline def setStartColumnVisibleUndefined: Self = StObject.set(x, "startColumnVisible", js.undefined)
  }
}
