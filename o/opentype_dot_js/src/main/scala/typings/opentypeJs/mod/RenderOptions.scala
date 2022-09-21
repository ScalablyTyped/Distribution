package typings.opentypeJs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderOptions extends StObject {
  
  var features: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  
  var kerning: js.UndefOr[Boolean] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var letterSpacing: js.UndefOr[Double] = js.undefined
  
  var script: js.UndefOr[String] = js.undefined
  
  var tracking: js.UndefOr[Double] = js.undefined
  
  var xScale: js.UndefOr[Double] = js.undefined
  
  var yScale: js.UndefOr[Double] = js.undefined
}
object RenderOptions {
  
  inline def apply(): RenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderOptions]
  }
  
  extension [Self <: RenderOptions](x: Self) {
    
    inline def setFeatures(value: StringDictionary[Boolean]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setKerning(value: Boolean): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
    
    inline def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setTracking(value: Double): Self = StObject.set(x, "tracking", value.asInstanceOf[js.Any])
    
    inline def setTrackingUndefined: Self = StObject.set(x, "tracking", js.undefined)
    
    inline def setXScale(value: Double): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
    
    inline def setXScaleUndefined: Self = StObject.set(x, "xScale", js.undefined)
    
    inline def setYScale(value: Double): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
    
    inline def setYScaleUndefined: Self = StObject.set(x, "yScale", js.undefined)
  }
}
