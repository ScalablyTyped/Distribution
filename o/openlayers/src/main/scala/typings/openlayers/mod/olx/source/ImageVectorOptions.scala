package typings.openlayers.mod.olx.source

import typings.openlayers.mod.Attribution
import typings.openlayers.mod.AttributionLike
import typings.openlayers.mod.Feature
import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.StyleFunction
import typings.openlayers.mod.olx.LogoOptions
import typings.openlayers.mod.source.Vector
import typings.openlayers.mod.style.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageVectorOptions extends StObject {
  
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  
  var projection: ProjectionLike
  
  var ratio: js.UndefOr[Double] = js.undefined
  
  var renderBuffer: js.UndefOr[Double] = js.undefined
  
  var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
  
  var source: Vector
  
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.undefined
}
object ImageVectorOptions {
  
  inline def apply(source: Vector): ImageVectorOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageVectorOptions]
  }
  
  extension [Self <: ImageVectorOptions](x: Self) {
    
    inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
    
    inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
    
    inline def setAttributionsVarargs(value: (Attribution | String)*): Self = StObject.set(x, "attributions", js.Array(value*))
    
    inline def setLogo(value: String | LogoOptions): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    inline def setRenderBuffer(value: Double): Self = StObject.set(x, "renderBuffer", value.asInstanceOf[js.Any])
    
    inline def setRenderBufferUndefined: Self = StObject.set(x, "renderBuffer", js.undefined)
    
    inline def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
    
    inline def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
    
    inline def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value*))
    
    inline def setSource(value: Vector): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Style | js.Array[Style] | StyleFunction): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleFunction2(
      value: (/* feature */ Feature | typings.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
    ): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value*))
  }
}
