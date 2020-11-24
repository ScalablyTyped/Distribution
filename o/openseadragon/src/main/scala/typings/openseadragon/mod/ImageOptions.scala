package typings.openseadragon.mod

import typings.std.CanvasGradient
import typings.std.CanvasPattern
import typings.std.Error
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageOptions extends js.Object {
  
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
  implicit class ImageOptionsOps[Self <: ImageOptions] (val x: Self) extends AnyVal {
    
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
    def setAjaxHeaders(value: js.Object): Self = this.set("ajaxHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxHeaders: Self = this.set("ajaxHeaders", js.undefined)
    
    @scala.inline
    def setAjaxWithCredentials(value: Boolean): Self = this.set("ajaxWithCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxWithCredentials: Self = this.set("ajaxWithCredentials", js.undefined)
    
    @scala.inline
    def setClip(value: Rect): Self = this.set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    
    @scala.inline
    def setCollectionImmediately(value: Boolean): Self = this.set("collectionImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectionImmediately: Self = this.set("collectionImmediately", js.undefined)
    
    @scala.inline
    def setCompositeOperation(value: String): Self = this.set("compositeOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompositeOperation: Self = this.set("compositeOperation", js.undefined)
    
    @scala.inline
    def setCrossOriginPolicy(value: String): Self = this.set("crossOriginPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOriginPolicy: Self = this.set("crossOriginPolicy", js.undefined)
    
    @scala.inline
    def setDegrees(value: Double): Self = this.set("degrees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDegrees: Self = this.set("degrees", js.undefined)
    
    @scala.inline
    def setError(value: /* error */ Error => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFitBounds(value: Rect): Self = this.set("fitBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFitBounds: Self = this.set("fitBounds", js.undefined)
    
    @scala.inline
    def setFitBoundsPlacement(value: Placement): Self = this.set("fitBoundsPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFitBoundsPlacement: Self = this.set("fitBoundsPlacement", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setLoadTilesWithAjax(value: Boolean): Self = this.set("loadTilesWithAjax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadTilesWithAjax: Self = this.set("loadTilesWithAjax", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPlaceholderFillStyle(value: String | CanvasGradient | CanvasPattern): Self = this.set("placeholderFillStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderFillStyle: Self = this.set("placeholderFillStyle", js.undefined)
    
    @scala.inline
    def setPreload(value: Boolean): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* event */ Event => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
