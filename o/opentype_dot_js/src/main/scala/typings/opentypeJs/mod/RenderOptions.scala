package typings.opentypeJs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderOptions extends StObject {
  
  var features: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  
  var kerning: js.UndefOr[Boolean] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var script: js.UndefOr[String] = js.undefined
  
  var xScale: js.UndefOr[Double] = js.undefined
  
  var yScale: js.UndefOr[Double] = js.undefined
}
object RenderOptions {
  
  @scala.inline
  def apply(): RenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderOptions]
  }
  
  @scala.inline
  implicit class RenderOptionsMutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatures(value: StringDictionary[Boolean]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setKerning(value: Boolean): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    @scala.inline
    def setXScale(value: Double): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXScaleUndefined: Self = StObject.set(x, "xScale", js.undefined)
    
    @scala.inline
    def setYScale(value: Double): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYScaleUndefined: Self = StObject.set(x, "yScale", js.undefined)
  }
}
