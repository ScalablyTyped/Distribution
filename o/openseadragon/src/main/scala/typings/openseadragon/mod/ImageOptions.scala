package typings.openseadragon.mod

import typings.std.CanvasGradient
import typings.std.CanvasPattern
import typings.std.Error
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageOptions extends StObject {
  
  var ajaxHeaders: js.UndefOr[js.Object] = js.native
  
  var ajaxWithCredentials: js.UndefOr[Boolean] = js.native
  
  var clip: js.UndefOr[Rect] = js.native
  
  var collectionImmediately: js.UndefOr[Boolean] = js.native
  
  var compositeOperation: js.UndefOr[String] = js.native
  
  var crossOriginPolicy: js.UndefOr[String] = js.native
  
  var degrees: js.UndefOr[Double] = js.native
  
  var error: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  
  var fitBounds: js.UndefOr[Rect] = js.native
  
  var fitBoundsPlacement: js.UndefOr[Placement] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var loadTilesWithAjax: js.UndefOr[Boolean] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var placeholderFillStyle: js.UndefOr[String | CanvasGradient | CanvasPattern] = js.native
  
  var preload: js.UndefOr[Boolean] = js.native
  
  var replace: js.UndefOr[Boolean] = js.native
  
  var success: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object ImageOptions {
  
  @scala.inline
  def apply(): ImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageOptions]
  }
  
  @scala.inline
  implicit class ImageOptionsMutableBuilder[Self <: ImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAjaxHeaders(value: js.Object): Self = StObject.set(x, "ajaxHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAjaxHeadersUndefined: Self = StObject.set(x, "ajaxHeaders", js.undefined)
    
    @scala.inline
    def setAjaxWithCredentials(value: Boolean): Self = StObject.set(x, "ajaxWithCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAjaxWithCredentialsUndefined: Self = StObject.set(x, "ajaxWithCredentials", js.undefined)
    
    @scala.inline
    def setClip(value: Rect): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    @scala.inline
    def setCollectionImmediately(value: Boolean): Self = StObject.set(x, "collectionImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionImmediatelyUndefined: Self = StObject.set(x, "collectionImmediately", js.undefined)
    
    @scala.inline
    def setCompositeOperation(value: String): Self = StObject.set(x, "compositeOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeOperationUndefined: Self = StObject.set(x, "compositeOperation", js.undefined)
    
    @scala.inline
    def setCrossOriginPolicy(value: String): Self = StObject.set(x, "crossOriginPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginPolicyUndefined: Self = StObject.set(x, "crossOriginPolicy", js.undefined)
    
    @scala.inline
    def setDegrees(value: Double): Self = StObject.set(x, "degrees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDegreesUndefined: Self = StObject.set(x, "degrees", js.undefined)
    
    @scala.inline
    def setError(value: /* error */ Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFitBounds(value: Rect): Self = StObject.set(x, "fitBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitBoundsPlacement(value: Placement): Self = StObject.set(x, "fitBoundsPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitBoundsPlacementUndefined: Self = StObject.set(x, "fitBoundsPlacement", js.undefined)
    
    @scala.inline
    def setFitBoundsUndefined: Self = StObject.set(x, "fitBounds", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setLoadTilesWithAjax(value: Boolean): Self = StObject.set(x, "loadTilesWithAjax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadTilesWithAjaxUndefined: Self = StObject.set(x, "loadTilesWithAjax", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPlaceholderFillStyle(value: String | CanvasGradient | CanvasPattern): Self = StObject.set(x, "placeholderFillStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderFillStyleUndefined: Self = StObject.set(x, "placeholderFillStyle", js.undefined)
    
    @scala.inline
    def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    @scala.inline
    def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* event */ Event => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
