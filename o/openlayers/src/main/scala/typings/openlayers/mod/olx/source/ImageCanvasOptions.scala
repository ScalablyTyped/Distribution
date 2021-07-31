package typings.openlayers.mod.olx.source

import typings.openlayers.mod.Attribution
import typings.openlayers.mod.AttributionLike
import typings.openlayers.mod.CanvasFunctionType
import typings.openlayers.mod.Extent_
import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.Size
import typings.openlayers.mod.olx.LogoOptions
import typings.openlayers.mod.proj.Projection
import typings.openlayers.mod.source.State
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageCanvasOptions extends StObject {
  
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  
  def canvasFunction(extent: Extent_, resolution: Double, pixelRatio: Double, size: Size, proj: Projection): HTMLCanvasElement
  @JSName("canvasFunction")
  var canvasFunction_Original: CanvasFunctionType
  
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  
  var projection: ProjectionLike
  
  var ratio: js.UndefOr[Double] = js.undefined
  
  var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
  
  var state: js.UndefOr[State] = js.undefined
}
object ImageCanvasOptions {
  
  @scala.inline
  def apply(
    canvasFunction: (/* extent */ Extent_, /* resolution */ Double, /* pixelRatio */ Double, /* size */ Size, /* proj */ Projection) => HTMLCanvasElement
  ): ImageCanvasOptions = {
    val __obj = js.Dynamic.literal(canvasFunction = js.Any.fromFunction5(canvasFunction))
    __obj.asInstanceOf[ImageCanvasOptions]
  }
  
  @scala.inline
  implicit class ImageCanvasOptionsMutableBuilder[Self <: ImageCanvasOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
    
    @scala.inline
    def setAttributionsVarargs(value: (Attribution | String)*): Self = StObject.set(x, "attributions", js.Array(value :_*))
    
    @scala.inline
    def setCanvasFunction(
      value: (/* extent */ Extent_, /* resolution */ Double, /* pixelRatio */ Double, /* size */ Size, /* proj */ Projection) => HTMLCanvasElement
    ): Self = StObject.set(x, "canvasFunction", js.Any.fromFunction5(value))
    
    @scala.inline
    def setLogo(value: String | LogoOptions): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    @scala.inline
    def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
    
    @scala.inline
    def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value :_*))
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
