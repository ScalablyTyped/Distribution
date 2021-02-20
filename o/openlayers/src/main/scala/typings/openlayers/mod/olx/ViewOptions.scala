package typings.openlayers.mod.olx

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.Extent_
import typings.openlayers.mod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literal with config options for the view.
  */
@js.native
trait ViewOptions extends StObject {
  
  var center: js.UndefOr[Coordinate_] = js.native
  
  var constrainRotation: js.UndefOr[Boolean | Double] = js.native
  
  var enableRotation: js.UndefOr[Boolean] = js.native
  
  var extent: js.UndefOr[Extent_] = js.native
  
  var maxResolution: js.UndefOr[Double] = js.native
  
  var maxZoom: js.UndefOr[Double] = js.native
  
  var minResolution: js.UndefOr[Double] = js.native
  
  var minZoom: js.UndefOr[Double] = js.native
  
  var projection: js.UndefOr[ProjectionLike] = js.native
  
  var resolution: js.UndefOr[Double] = js.native
  
  var resolutions: js.UndefOr[js.Array[Double]] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var zoom: js.UndefOr[Double] = js.native
  
  var zoomFactor: js.UndefOr[Double] = js.native
}
object ViewOptions {
  
  @scala.inline
  def apply(): ViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewOptions]
  }
  
  @scala.inline
  implicit class ViewOptionsMutableBuilder[Self <: ViewOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: Coordinate_): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setConstrainRotation(value: Boolean | Double): Self = StObject.set(x, "constrainRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainRotationUndefined: Self = StObject.set(x, "constrainRotation", js.undefined)
    
    @scala.inline
    def setEnableRotation(value: Boolean): Self = StObject.set(x, "enableRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableRotationUndefined: Self = StObject.set(x, "enableRotation", js.undefined)
    
    @scala.inline
    def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    @scala.inline
    def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    @scala.inline
    def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    @scala.inline
    def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
    
    @scala.inline
    def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value :_*))
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
