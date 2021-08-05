package typings.preact.jsxCsstypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewport[TLength] extends StObject {
  
  var OOrientation: js.UndefOr[ViewportOrientationProperty] = js.undefined
  
  var height: js.UndefOr[ViewportHeightProperty[TLength]] = js.undefined
  
  var maxHeight: js.UndefOr[ViewportMaxHeightProperty[TLength]] = js.undefined
  
  var maxWidth: js.UndefOr[ViewportMaxWidthProperty[TLength]] = js.undefined
  
  var maxZoom: js.UndefOr[ViewportMaxZoomProperty] = js.undefined
  
  var minHeight: js.UndefOr[ViewportMinHeightProperty[TLength]] = js.undefined
  
  var minWidth: js.UndefOr[ViewportMinWidthProperty[TLength]] = js.undefined
  
  var minZoom: js.UndefOr[ViewportMinZoomProperty] = js.undefined
  
  var msHeight: js.UndefOr[ViewportHeightProperty[TLength]] = js.undefined
  
  var msMaxHeight: js.UndefOr[ViewportMaxHeightProperty[TLength]] = js.undefined
  
  var msMaxWidth: js.UndefOr[ViewportMaxWidthProperty[TLength]] = js.undefined
  
  var msMaxZoom: js.UndefOr[ViewportMaxZoomProperty] = js.undefined
  
  var msMinHeight: js.UndefOr[ViewportMinHeightProperty[TLength]] = js.undefined
  
  var msMinWidth: js.UndefOr[ViewportMinWidthProperty[TLength]] = js.undefined
  
  var msMinZoom: js.UndefOr[ViewportMinZoomProperty] = js.undefined
  
  var msOrientation: js.UndefOr[ViewportOrientationProperty] = js.undefined
  
  var msUserZoom: js.UndefOr[ViewportUserZoomProperty] = js.undefined
  
  var msWidth: js.UndefOr[ViewportWidthProperty[TLength]] = js.undefined
  
  var msZoom: js.UndefOr[ViewportZoomProperty] = js.undefined
  
  var orientation: js.UndefOr[ViewportOrientationProperty] = js.undefined
  
  var userZoom: js.UndefOr[ViewportUserZoomProperty] = js.undefined
  
  var width: js.UndefOr[ViewportWidthProperty[TLength]] = js.undefined
  
  var zoom: js.UndefOr[ViewportZoomProperty] = js.undefined
}
object Viewport {
  
  inline def apply[TLength](): Viewport[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Viewport[TLength]]
  }
  
  extension [Self <: Viewport[?], TLength](x: Self & Viewport[TLength]) {
    
    inline def setHeight(value: ViewportHeightProperty[TLength]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMaxHeight(value: ViewportMaxHeightProperty[TLength]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: ViewportMaxWidthProperty[TLength]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMaxZoom(value: ViewportMaxZoomProperty): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinHeight(value: ViewportMinHeightProperty[TLength]): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: ViewportMinWidthProperty[TLength]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setMinZoom(value: ViewportMinZoomProperty): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setMsHeight(value: ViewportHeightProperty[TLength]): Self = StObject.set(x, "msHeight", value.asInstanceOf[js.Any])
    
    inline def setMsHeightUndefined: Self = StObject.set(x, "msHeight", js.undefined)
    
    inline def setMsMaxHeight(value: ViewportMaxHeightProperty[TLength]): Self = StObject.set(x, "msMaxHeight", value.asInstanceOf[js.Any])
    
    inline def setMsMaxHeightUndefined: Self = StObject.set(x, "msMaxHeight", js.undefined)
    
    inline def setMsMaxWidth(value: ViewportMaxWidthProperty[TLength]): Self = StObject.set(x, "msMaxWidth", value.asInstanceOf[js.Any])
    
    inline def setMsMaxWidthUndefined: Self = StObject.set(x, "msMaxWidth", js.undefined)
    
    inline def setMsMaxZoom(value: ViewportMaxZoomProperty): Self = StObject.set(x, "msMaxZoom", value.asInstanceOf[js.Any])
    
    inline def setMsMaxZoomUndefined: Self = StObject.set(x, "msMaxZoom", js.undefined)
    
    inline def setMsMinHeight(value: ViewportMinHeightProperty[TLength]): Self = StObject.set(x, "msMinHeight", value.asInstanceOf[js.Any])
    
    inline def setMsMinHeightUndefined: Self = StObject.set(x, "msMinHeight", js.undefined)
    
    inline def setMsMinWidth(value: ViewportMinWidthProperty[TLength]): Self = StObject.set(x, "msMinWidth", value.asInstanceOf[js.Any])
    
    inline def setMsMinWidthUndefined: Self = StObject.set(x, "msMinWidth", js.undefined)
    
    inline def setMsMinZoom(value: ViewportMinZoomProperty): Self = StObject.set(x, "msMinZoom", value.asInstanceOf[js.Any])
    
    inline def setMsMinZoomUndefined: Self = StObject.set(x, "msMinZoom", js.undefined)
    
    inline def setMsOrientation(value: ViewportOrientationProperty): Self = StObject.set(x, "msOrientation", value.asInstanceOf[js.Any])
    
    inline def setMsOrientationUndefined: Self = StObject.set(x, "msOrientation", js.undefined)
    
    inline def setMsUserZoom(value: ViewportUserZoomProperty): Self = StObject.set(x, "msUserZoom", value.asInstanceOf[js.Any])
    
    inline def setMsUserZoomUndefined: Self = StObject.set(x, "msUserZoom", js.undefined)
    
    inline def setMsWidth(value: ViewportWidthProperty[TLength]): Self = StObject.set(x, "msWidth", value.asInstanceOf[js.Any])
    
    inline def setMsWidthUndefined: Self = StObject.set(x, "msWidth", js.undefined)
    
    inline def setMsZoom(value: ViewportZoomProperty): Self = StObject.set(x, "msZoom", value.asInstanceOf[js.Any])
    
    inline def setMsZoomUndefined: Self = StObject.set(x, "msZoom", js.undefined)
    
    inline def setOOrientation(value: ViewportOrientationProperty): Self = StObject.set(x, "OOrientation", value.asInstanceOf[js.Any])
    
    inline def setOOrientationUndefined: Self = StObject.set(x, "OOrientation", js.undefined)
    
    inline def setOrientation(value: ViewportOrientationProperty): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setUserZoom(value: ViewportUserZoomProperty): Self = StObject.set(x, "userZoom", value.asInstanceOf[js.Any])
    
    inline def setUserZoomUndefined: Self = StObject.set(x, "userZoom", js.undefined)
    
    inline def setWidth(value: ViewportWidthProperty[TLength]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setZoom(value: ViewportZoomProperty): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
