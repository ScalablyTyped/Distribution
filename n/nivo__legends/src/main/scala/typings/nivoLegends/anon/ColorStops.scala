package typings.nivoLegends.anon

import typings.nivoLegends.nivoLegendsStrings.alphabetic
import typings.nivoLegends.nivoLegendsStrings.end
import typings.nivoLegends.nivoLegendsStrings.hanging
import typings.nivoLegends.nivoLegendsStrings.middle
import typings.nivoLegends.nivoLegendsStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorStops extends StObject {
  
  var colorStops: js.Array[Key]
  
  var gradientX1: Double
  
  var gradientX2: Double
  
  var gradientY1: Double
  
  var gradientY2: Double
  
  var height: Double
  
  var ticks: js.Array[Text]
  
  var titleHorizontalAlign: start | middle | end
  
  var titleRotation: Double
  
  var titleText: js.UndefOr[String] = js.undefined
  
  var titleVerticalAlign: alphabetic | hanging
  
  var titleX: Double
  
  var titleY: Double
  
  var width: Double
}
object ColorStops {
  
  inline def apply(
    colorStops: js.Array[Key],
    gradientX1: Double,
    gradientX2: Double,
    gradientY1: Double,
    gradientY2: Double,
    height: Double,
    ticks: js.Array[Text],
    titleHorizontalAlign: start | middle | end,
    titleRotation: Double,
    titleVerticalAlign: alphabetic | hanging,
    titleX: Double,
    titleY: Double,
    width: Double
  ): ColorStops = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any], gradientX1 = gradientX1.asInstanceOf[js.Any], gradientX2 = gradientX2.asInstanceOf[js.Any], gradientY1 = gradientY1.asInstanceOf[js.Any], gradientY2 = gradientY2.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], titleHorizontalAlign = titleHorizontalAlign.asInstanceOf[js.Any], titleRotation = titleRotation.asInstanceOf[js.Any], titleVerticalAlign = titleVerticalAlign.asInstanceOf[js.Any], titleX = titleX.asInstanceOf[js.Any], titleY = titleY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStops]
  }
  
  extension [Self <: ColorStops](x: Self) {
    
    inline def setColorStops(value: js.Array[Key]): Self = StObject.set(x, "colorStops", value.asInstanceOf[js.Any])
    
    inline def setColorStopsVarargs(value: Key*): Self = StObject.set(x, "colorStops", js.Array(value*))
    
    inline def setGradientX1(value: Double): Self = StObject.set(x, "gradientX1", value.asInstanceOf[js.Any])
    
    inline def setGradientX2(value: Double): Self = StObject.set(x, "gradientX2", value.asInstanceOf[js.Any])
    
    inline def setGradientY1(value: Double): Self = StObject.set(x, "gradientY1", value.asInstanceOf[js.Any])
    
    inline def setGradientY2(value: Double): Self = StObject.set(x, "gradientY2", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setTicks(value: js.Array[Text]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksVarargs(value: Text*): Self = StObject.set(x, "ticks", js.Array(value*))
    
    inline def setTitleHorizontalAlign(value: start | middle | end): Self = StObject.set(x, "titleHorizontalAlign", value.asInstanceOf[js.Any])
    
    inline def setTitleRotation(value: Double): Self = StObject.set(x, "titleRotation", value.asInstanceOf[js.Any])
    
    inline def setTitleText(value: String): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
    
    inline def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
    
    inline def setTitleVerticalAlign(value: alphabetic | hanging): Self = StObject.set(x, "titleVerticalAlign", value.asInstanceOf[js.Any])
    
    inline def setTitleX(value: Double): Self = StObject.set(x, "titleX", value.asInstanceOf[js.Any])
    
    inline def setTitleY(value: Double): Self = StObject.set(x, "titleY", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
