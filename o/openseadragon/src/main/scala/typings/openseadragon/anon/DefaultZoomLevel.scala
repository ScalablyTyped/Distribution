package typings.openseadragon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultZoomLevel extends StObject {
  
  var animationTime: js.UndefOr[Double] = js.native
  
  var defaultZoomLevel: js.UndefOr[Double] = js.native
  
  var degrees: js.UndefOr[Double] = js.native
  
  var homeFillsViewer: js.UndefOr[Boolean] = js.native
  
  var margins: js.Object = js.native
  
  var maxZoomLevel: js.UndefOr[Double] = js.native
  
  var maxZoomPixelRatio: js.UndefOr[Double] = js.native
  
  var minZoomImageRatio: js.UndefOr[Double] = js.native
  
  var minZoomLevel: js.UndefOr[Double] = js.native
  
  var springStiffness: js.UndefOr[Double] = js.native
  
  var visibilityRatio: js.UndefOr[Double] = js.native
  
  var wrapHorizontal: js.UndefOr[Boolean] = js.native
  
  var wrapVertical: js.UndefOr[Boolean] = js.native
}
object DefaultZoomLevel {
  
  @scala.inline
  def apply(margins: js.Object): DefaultZoomLevel = {
    val __obj = js.Dynamic.literal(margins = margins.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultZoomLevel]
  }
  
  @scala.inline
  implicit class DefaultZoomLevelMutableBuilder[Self <: DefaultZoomLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationTime(value: Double): Self = StObject.set(x, "animationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationTimeUndefined: Self = StObject.set(x, "animationTime", js.undefined)
    
    @scala.inline
    def setDefaultZoomLevel(value: Double): Self = StObject.set(x, "defaultZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultZoomLevelUndefined: Self = StObject.set(x, "defaultZoomLevel", js.undefined)
    
    @scala.inline
    def setDegrees(value: Double): Self = StObject.set(x, "degrees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDegreesUndefined: Self = StObject.set(x, "degrees", js.undefined)
    
    @scala.inline
    def setHomeFillsViewer(value: Boolean): Self = StObject.set(x, "homeFillsViewer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeFillsViewerUndefined: Self = StObject.set(x, "homeFillsViewer", js.undefined)
    
    @scala.inline
    def setMargins(value: js.Object): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomLevel(value: Double): Self = StObject.set(x, "maxZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomLevelUndefined: Self = StObject.set(x, "maxZoomLevel", js.undefined)
    
    @scala.inline
    def setMaxZoomPixelRatio(value: Double): Self = StObject.set(x, "maxZoomPixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomPixelRatioUndefined: Self = StObject.set(x, "maxZoomPixelRatio", js.undefined)
    
    @scala.inline
    def setMinZoomImageRatio(value: Double): Self = StObject.set(x, "minZoomImageRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomImageRatioUndefined: Self = StObject.set(x, "minZoomImageRatio", js.undefined)
    
    @scala.inline
    def setMinZoomLevel(value: Double): Self = StObject.set(x, "minZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomLevelUndefined: Self = StObject.set(x, "minZoomLevel", js.undefined)
    
    @scala.inline
    def setSpringStiffness(value: Double): Self = StObject.set(x, "springStiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpringStiffnessUndefined: Self = StObject.set(x, "springStiffness", js.undefined)
    
    @scala.inline
    def setVisibilityRatio(value: Double): Self = StObject.set(x, "visibilityRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityRatioUndefined: Self = StObject.set(x, "visibilityRatio", js.undefined)
    
    @scala.inline
    def setWrapHorizontal(value: Boolean): Self = StObject.set(x, "wrapHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapHorizontalUndefined: Self = StObject.set(x, "wrapHorizontal", js.undefined)
    
    @scala.inline
    def setWrapVertical(value: Boolean): Self = StObject.set(x, "wrapVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapVerticalUndefined: Self = StObject.set(x, "wrapVertical", js.undefined)
  }
}
