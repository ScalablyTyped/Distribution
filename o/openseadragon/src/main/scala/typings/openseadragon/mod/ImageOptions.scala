package typings.openseadragon.mod

import typings.std.CanvasGradient
import typings.std.CanvasPattern
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageOptions extends StObject {
  
  var ajaxHeaders: js.UndefOr[js.Object] = js.undefined
  
  var ajaxWithCredentials: js.UndefOr[Boolean] = js.undefined
  
  var clip: js.UndefOr[Rect] = js.undefined
  
  var collectionImmediately: js.UndefOr[Boolean] = js.undefined
  
  var compositeOperation: js.UndefOr[String] = js.undefined
  
  var crossOriginPolicy: js.UndefOr[String] = js.undefined
  
  var degrees: js.UndefOr[Double] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  
  var fitBounds: js.UndefOr[Rect] = js.undefined
  
  var fitBoundsPlacement: js.UndefOr[Placement] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var loadTilesWithAjax: js.UndefOr[Boolean] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var placeholderFillStyle: js.UndefOr[String | CanvasGradient | CanvasPattern] = js.undefined
  
  var preload: js.UndefOr[Boolean] = js.undefined
  
  var replace: js.UndefOr[Boolean] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object ImageOptions {
  
  inline def apply(): ImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageOptions]
  }
  
  extension [Self <: ImageOptions](x: Self) {
    
    inline def setAjaxHeaders(value: js.Object): Self = StObject.set(x, "ajaxHeaders", value.asInstanceOf[js.Any])
    
    inline def setAjaxHeadersUndefined: Self = StObject.set(x, "ajaxHeaders", js.undefined)
    
    inline def setAjaxWithCredentials(value: Boolean): Self = StObject.set(x, "ajaxWithCredentials", value.asInstanceOf[js.Any])
    
    inline def setAjaxWithCredentialsUndefined: Self = StObject.set(x, "ajaxWithCredentials", js.undefined)
    
    inline def setClip(value: Rect): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setCollectionImmediately(value: Boolean): Self = StObject.set(x, "collectionImmediately", value.asInstanceOf[js.Any])
    
    inline def setCollectionImmediatelyUndefined: Self = StObject.set(x, "collectionImmediately", js.undefined)
    
    inline def setCompositeOperation(value: String): Self = StObject.set(x, "compositeOperation", value.asInstanceOf[js.Any])
    
    inline def setCompositeOperationUndefined: Self = StObject.set(x, "compositeOperation", js.undefined)
    
    inline def setCrossOriginPolicy(value: String): Self = StObject.set(x, "crossOriginPolicy", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginPolicyUndefined: Self = StObject.set(x, "crossOriginPolicy", js.undefined)
    
    inline def setDegrees(value: Double): Self = StObject.set(x, "degrees", value.asInstanceOf[js.Any])
    
    inline def setDegreesUndefined: Self = StObject.set(x, "degrees", js.undefined)
    
    inline def setError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFitBounds(value: Rect): Self = StObject.set(x, "fitBounds", value.asInstanceOf[js.Any])
    
    inline def setFitBoundsPlacement(value: Placement): Self = StObject.set(x, "fitBoundsPlacement", value.asInstanceOf[js.Any])
    
    inline def setFitBoundsPlacementUndefined: Self = StObject.set(x, "fitBoundsPlacement", js.undefined)
    
    inline def setFitBoundsUndefined: Self = StObject.set(x, "fitBounds", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLoadTilesWithAjax(value: Boolean): Self = StObject.set(x, "loadTilesWithAjax", value.asInstanceOf[js.Any])
    
    inline def setLoadTilesWithAjaxUndefined: Self = StObject.set(x, "loadTilesWithAjax", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPlaceholderFillStyle(value: String | CanvasGradient | CanvasPattern): Self = StObject.set(x, "placeholderFillStyle", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderFillStyleUndefined: Self = StObject.set(x, "placeholderFillStyle", js.undefined)
    
    inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setSuccess(value: /* event */ Event => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
