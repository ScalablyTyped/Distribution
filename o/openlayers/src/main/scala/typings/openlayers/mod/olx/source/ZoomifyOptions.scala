package typings.openlayers.mod.olx.source

import typings.openlayers.mod.Attribution
import typings.openlayers.mod.AttributionLike
import typings.openlayers.mod.Size
import typings.openlayers.mod.olx.LogoOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoomifyOptions extends StObject {
  
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  
  var cacheSize: js.UndefOr[Double] = js.undefined
  
  var crossOrigin: js.UndefOr[String] = js.undefined
  
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  
  var size: Size
  
  var tierSizeCalculation: js.UndefOr[String] = js.undefined
  
  var url: String
}
object ZoomifyOptions {
  
  @scala.inline
  def apply(size: Size, url: String): ZoomifyOptions = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomifyOptions]
  }
  
  @scala.inline
  implicit class ZoomifyOptionsMutableBuilder[Self <: ZoomifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
    
    @scala.inline
    def setAttributionsVarargs(value: (Attribution | String)*): Self = StObject.set(x, "attributions", js.Array(value :_*))
    
    @scala.inline
    def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setLogo(value: String | LogoOptions): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierSizeCalculation(value: String): Self = StObject.set(x, "tierSizeCalculation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierSizeCalculationUndefined: Self = StObject.set(x, "tierSizeCalculation", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
