package typings.plotlyJs.mod

import typings.plotlyJs.anon.Colorsrc
import typings.plotlyJs.anon.PartialColorBarBgcolor
import typings.plotlyJs.anon.PartialPadding
import typings.plotlyJs.anon.PartialScatterMarkerLine
import typings.plotlyJs.plotlyJsStrings.area
import typings.plotlyJs.plotlyJsStrings.diameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotMarker extends StObject {
  
  var autocolorscale: Boolean
  
  var cauto: Boolean
  
  var cmax: Double
  
  var cmin: Double
  
  var color: Color | js.Array[Color]
  
  var colorbar: PartialColorBarBgcolor
  
  var colors: js.Array[Color]
  
  var colorscale: ColorScale
  
  var gradient: Colorsrc
  
  var line: PartialScatterMarkerLine
  
  var maxdisplayed: Double
  
  var opacity: Double | js.Array[Double]
  
  var pad: PartialPadding
  
  var reversescale: Boolean
  
  var showscale: Boolean
  
  var size: Double | js.Array[Double]
  
  var sizemax: Double
  
  var sizemin: Double
  
  var sizemode: diameter | area
  
  var sizeref: Double
  
  var symbol: MarkerSymbol
  
  var width: Double
}
object PlotMarker {
  
  inline def apply(
    autocolorscale: Boolean,
    cauto: Boolean,
    cmax: Double,
    cmin: Double,
    color: Color | js.Array[Color],
    colorbar: PartialColorBarBgcolor,
    colors: js.Array[Color],
    colorscale: ColorScale,
    gradient: Colorsrc,
    line: PartialScatterMarkerLine,
    maxdisplayed: Double,
    opacity: Double | js.Array[Double],
    pad: PartialPadding,
    reversescale: Boolean,
    showscale: Boolean,
    size: Double | js.Array[Double],
    sizemax: Double,
    sizemin: Double,
    sizemode: diameter | area,
    sizeref: Double,
    symbol: MarkerSymbol,
    width: Double
  ): PlotMarker = {
    val __obj = js.Dynamic.literal(autocolorscale = autocolorscale.asInstanceOf[js.Any], cauto = cauto.asInstanceOf[js.Any], cmax = cmax.asInstanceOf[js.Any], cmin = cmin.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorbar = colorbar.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], colorscale = colorscale.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], maxdisplayed = maxdisplayed.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], reversescale = reversescale.asInstanceOf[js.Any], showscale = showscale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sizemax = sizemax.asInstanceOf[js.Any], sizemin = sizemin.asInstanceOf[js.Any], sizemode = sizemode.asInstanceOf[js.Any], sizeref = sizeref.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMarker]
  }
  
  extension [Self <: PlotMarker](x: Self) {
    
    inline def setAutocolorscale(value: Boolean): Self = StObject.set(x, "autocolorscale", value.asInstanceOf[js.Any])
    
    inline def setCauto(value: Boolean): Self = StObject.set(x, "cauto", value.asInstanceOf[js.Any])
    
    inline def setCmax(value: Double): Self = StObject.set(x, "cmax", value.asInstanceOf[js.Any])
    
    inline def setCmin(value: Double): Self = StObject.set(x, "cmin", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Color | js.Array[Color]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorVarargs(
      value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Color | Double | Null | String])*
    ): Self = StObject.set(x, "color", js.Array(value :_*))
    
    inline def setColorbar(value: PartialColorBarBgcolor): Self = StObject.set(x, "colorbar", value.asInstanceOf[js.Any])
    
    inline def setColors(value: js.Array[Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: Color*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    inline def setColorscale(value: ColorScale): Self = StObject.set(x, "colorscale", value.asInstanceOf[js.Any])
    
    inline def setColorscaleVarargs(value: (String | (js.Tuple2[Double, String]))*): Self = StObject.set(x, "colorscale", js.Array(value :_*))
    
    inline def setGradient(value: Colorsrc): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setLine(value: PartialScatterMarkerLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setMaxdisplayed(value: Double): Self = StObject.set(x, "maxdisplayed", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double | js.Array[Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityVarargs(value: Double*): Self = StObject.set(x, "opacity", js.Array(value :_*))
    
    inline def setPad(value: PartialPadding): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setReversescale(value: Boolean): Self = StObject.set(x, "reversescale", value.asInstanceOf[js.Any])
    
    inline def setShowscale(value: Boolean): Self = StObject.set(x, "showscale", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double | js.Array[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value :_*))
    
    inline def setSizemax(value: Double): Self = StObject.set(x, "sizemax", value.asInstanceOf[js.Any])
    
    inline def setSizemin(value: Double): Self = StObject.set(x, "sizemin", value.asInstanceOf[js.Any])
    
    inline def setSizemode(value: diameter | area): Self = StObject.set(x, "sizemode", value.asInstanceOf[js.Any])
    
    inline def setSizeref(value: Double): Self = StObject.set(x, "sizeref", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: MarkerSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolVarargs(value: (String | Double)*): Self = StObject.set(x, "symbol", js.Array(value :_*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
