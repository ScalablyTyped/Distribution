package typings.plotlyJs.mod

import typings.plotlyJs.anon.Colorsrc
import typings.plotlyJs.anon.PartialColorBarBgcolor
import typings.plotlyJs.anon.PartialPadding
import typings.plotlyJs.anon.PartialPattern
import typings.plotlyJs.anon.PartialScatterMarkerLine
import typings.plotlyJs.plotlyJsStrings.area
import typings.plotlyJs.plotlyJsStrings.diameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotMarker extends StObject {
  
  var autocolorscale: js.UndefOr[Boolean] = js.undefined
  
  var cauto: js.UndefOr[Boolean] = js.undefined
  
  var cmax: js.UndefOr[Double] = js.undefined
  
  var cmin: js.UndefOr[Double] = js.undefined
  
  var color: js.UndefOr[Color | js.Array[Color]] = js.undefined
  
  var colorbar: js.UndefOr[PartialColorBarBgcolor] = js.undefined
  
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  
  var colorscale: js.UndefOr[ColorScale] = js.undefined
  
  var gradient: js.UndefOr[Colorsrc] = js.undefined
  
  var line: PartialScatterMarkerLine
  
  var maxdisplayed: js.UndefOr[Double] = js.undefined
  
  var opacity: Double | js.Array[Double]
  
  var pad: js.UndefOr[PartialPadding] = js.undefined
  
  var pattern: js.UndefOr[PartialPattern] = js.undefined
  
  var reversescale: js.UndefOr[Boolean] = js.undefined
  
  var showscale: js.UndefOr[Boolean] = js.undefined
  
  var size: Double | js.Array[Double]
  
  var sizemax: js.UndefOr[Double] = js.undefined
  
  var sizemin: js.UndefOr[Double] = js.undefined
  
  var sizemode: js.UndefOr[diameter | area] = js.undefined
  
  var sizeref: js.UndefOr[Double] = js.undefined
  
  var symbol: MarkerSymbol
  
  var width: js.UndefOr[Double] = js.undefined
}
object PlotMarker {
  
  inline def apply(
    line: PartialScatterMarkerLine,
    opacity: Double | js.Array[Double],
    size: Double | js.Array[Double],
    symbol: MarkerSymbol
  ): PlotMarker = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMarker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotMarker] (val x: Self) extends AnyVal {
    
    inline def setAutocolorscale(value: Boolean): Self = StObject.set(x, "autocolorscale", value.asInstanceOf[js.Any])
    
    inline def setAutocolorscaleUndefined: Self = StObject.set(x, "autocolorscale", js.undefined)
    
    inline def setCauto(value: Boolean): Self = StObject.set(x, "cauto", value.asInstanceOf[js.Any])
    
    inline def setCautoUndefined: Self = StObject.set(x, "cauto", js.undefined)
    
    inline def setCmax(value: Double): Self = StObject.set(x, "cmax", value.asInstanceOf[js.Any])
    
    inline def setCmaxUndefined: Self = StObject.set(x, "cmax", js.undefined)
    
    inline def setCmin(value: Double): Self = StObject.set(x, "cmin", value.asInstanceOf[js.Any])
    
    inline def setCminUndefined: Self = StObject.set(x, "cmin", js.undefined)
    
    inline def setColor(value: Color | js.Array[Color]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(
      value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Color | Double | Null | String])*
    ): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setColorbar(value: PartialColorBarBgcolor): Self = StObject.set(x, "colorbar", value.asInstanceOf[js.Any])
    
    inline def setColorbarUndefined: Self = StObject.set(x, "colorbar", js.undefined)
    
    inline def setColors(value: js.Array[Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: Color*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setColorscale(value: ColorScale): Self = StObject.set(x, "colorscale", value.asInstanceOf[js.Any])
    
    inline def setColorscaleUndefined: Self = StObject.set(x, "colorscale", js.undefined)
    
    inline def setColorscaleVarargs(value: (String | (js.Tuple2[Double, String]))*): Self = StObject.set(x, "colorscale", js.Array(value*))
    
    inline def setGradient(value: Colorsrc): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
    
    inline def setLine(value: PartialScatterMarkerLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setMaxdisplayed(value: Double): Self = StObject.set(x, "maxdisplayed", value.asInstanceOf[js.Any])
    
    inline def setMaxdisplayedUndefined: Self = StObject.set(x, "maxdisplayed", js.undefined)
    
    inline def setOpacity(value: Double | js.Array[Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityVarargs(value: Double*): Self = StObject.set(x, "opacity", js.Array(value*))
    
    inline def setPad(value: PartialPadding): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    inline def setPattern(value: PartialPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setReversescale(value: Boolean): Self = StObject.set(x, "reversescale", value.asInstanceOf[js.Any])
    
    inline def setReversescaleUndefined: Self = StObject.set(x, "reversescale", js.undefined)
    
    inline def setShowscale(value: Boolean): Self = StObject.set(x, "showscale", value.asInstanceOf[js.Any])
    
    inline def setShowscaleUndefined: Self = StObject.set(x, "showscale", js.undefined)
    
    inline def setSize(value: Double | js.Array[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value*))
    
    inline def setSizemax(value: Double): Self = StObject.set(x, "sizemax", value.asInstanceOf[js.Any])
    
    inline def setSizemaxUndefined: Self = StObject.set(x, "sizemax", js.undefined)
    
    inline def setSizemin(value: Double): Self = StObject.set(x, "sizemin", value.asInstanceOf[js.Any])
    
    inline def setSizeminUndefined: Self = StObject.set(x, "sizemin", js.undefined)
    
    inline def setSizemode(value: diameter | area): Self = StObject.set(x, "sizemode", value.asInstanceOf[js.Any])
    
    inline def setSizemodeUndefined: Self = StObject.set(x, "sizemode", js.undefined)
    
    inline def setSizeref(value: Double): Self = StObject.set(x, "sizeref", value.asInstanceOf[js.Any])
    
    inline def setSizerefUndefined: Self = StObject.set(x, "sizeref", js.undefined)
    
    inline def setSymbol(value: MarkerSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolVarargs(value: (String | Double)*): Self = StObject.set(x, "symbol", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
