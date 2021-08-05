package typings.openseadragon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultZoomLevel extends StObject {
  
  var animationTime: js.UndefOr[Double] = js.undefined
  
  var defaultZoomLevel: js.UndefOr[Double] = js.undefined
  
  var degrees: js.UndefOr[Double] = js.undefined
  
  var homeFillsViewer: js.UndefOr[Boolean] = js.undefined
  
  var margins: js.Object
  
  var maxZoomLevel: js.UndefOr[Double] = js.undefined
  
  var maxZoomPixelRatio: js.UndefOr[Double] = js.undefined
  
  var minZoomImageRatio: js.UndefOr[Double] = js.undefined
  
  var minZoomLevel: js.UndefOr[Double] = js.undefined
  
  var springStiffness: js.UndefOr[Double] = js.undefined
  
  var visibilityRatio: js.UndefOr[Double] = js.undefined
  
  var wrapHorizontal: js.UndefOr[Boolean] = js.undefined
  
  var wrapVertical: js.UndefOr[Boolean] = js.undefined
}
object DefaultZoomLevel {
  
  inline def apply(margins: js.Object): DefaultZoomLevel = {
    val __obj = js.Dynamic.literal(margins = margins.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultZoomLevel]
  }
  
  extension [Self <: DefaultZoomLevel](x: Self) {
    
    inline def setAnimationTime(value: Double): Self = StObject.set(x, "animationTime", value.asInstanceOf[js.Any])
    
    inline def setAnimationTimeUndefined: Self = StObject.set(x, "animationTime", js.undefined)
    
    inline def setDefaultZoomLevel(value: Double): Self = StObject.set(x, "defaultZoomLevel", value.asInstanceOf[js.Any])
    
    inline def setDefaultZoomLevelUndefined: Self = StObject.set(x, "defaultZoomLevel", js.undefined)
    
    inline def setDegrees(value: Double): Self = StObject.set(x, "degrees", value.asInstanceOf[js.Any])
    
    inline def setDegreesUndefined: Self = StObject.set(x, "degrees", js.undefined)
    
    inline def setHomeFillsViewer(value: Boolean): Self = StObject.set(x, "homeFillsViewer", value.asInstanceOf[js.Any])
    
    inline def setHomeFillsViewerUndefined: Self = StObject.set(x, "homeFillsViewer", js.undefined)
    
    inline def setMargins(value: js.Object): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomLevel(value: Double): Self = StObject.set(x, "maxZoomLevel", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomLevelUndefined: Self = StObject.set(x, "maxZoomLevel", js.undefined)
    
    inline def setMaxZoomPixelRatio(value: Double): Self = StObject.set(x, "maxZoomPixelRatio", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomPixelRatioUndefined: Self = StObject.set(x, "maxZoomPixelRatio", js.undefined)
    
    inline def setMinZoomImageRatio(value: Double): Self = StObject.set(x, "minZoomImageRatio", value.asInstanceOf[js.Any])
    
    inline def setMinZoomImageRatioUndefined: Self = StObject.set(x, "minZoomImageRatio", js.undefined)
    
    inline def setMinZoomLevel(value: Double): Self = StObject.set(x, "minZoomLevel", value.asInstanceOf[js.Any])
    
    inline def setMinZoomLevelUndefined: Self = StObject.set(x, "minZoomLevel", js.undefined)
    
    inline def setSpringStiffness(value: Double): Self = StObject.set(x, "springStiffness", value.asInstanceOf[js.Any])
    
    inline def setSpringStiffnessUndefined: Self = StObject.set(x, "springStiffness", js.undefined)
    
    inline def setVisibilityRatio(value: Double): Self = StObject.set(x, "visibilityRatio", value.asInstanceOf[js.Any])
    
    inline def setVisibilityRatioUndefined: Self = StObject.set(x, "visibilityRatio", js.undefined)
    
    inline def setWrapHorizontal(value: Boolean): Self = StObject.set(x, "wrapHorizontal", value.asInstanceOf[js.Any])
    
    inline def setWrapHorizontalUndefined: Self = StObject.set(x, "wrapHorizontal", js.undefined)
    
    inline def setWrapVertical(value: Boolean): Self = StObject.set(x, "wrapVertical", value.asInstanceOf[js.Any])
    
    inline def setWrapVerticalUndefined: Self = StObject.set(x, "wrapVertical", js.undefined)
  }
}
