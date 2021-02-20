package typings.plotlyJs.anon

import typings.plotlyJs.mod.ColorScale
import typings.plotlyJs.mod.MarkerSymbol
import typings.plotlyJs.plotlyJsStrings.area
import typings.plotlyJs.plotlyJsStrings.diameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.PlotMarker> */
@js.native
trait PartialPlotMarkerAutocolorscale extends StObject {
  
  var autocolorscale: js.UndefOr[Boolean] = js.native
  
  var cauto: js.UndefOr[Boolean] = js.native
  
  var cmax: js.UndefOr[Double] = js.native
  
  var cmin: js.UndefOr[Double] = js.native
  
  var color: js.UndefOr[typings.plotlyJs.mod.Color | js.Array[typings.plotlyJs.mod.Color]] = js.native
  
  var colorbar: js.UndefOr[PartialColorBar] = js.native
  
  var colors: js.UndefOr[js.Array[typings.plotlyJs.mod.Color]] = js.native
  
  var colorscale: js.UndefOr[ColorScale] = js.native
  
  var gradient: js.UndefOr[Colorsrc] = js.native
  
  var line: js.UndefOr[PartialScatterMarkerLine] = js.native
  
  var maxdisplayed: js.UndefOr[Double] = js.native
  
  var opacity: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var pad: js.UndefOr[PartialPadding] = js.native
  
  var reversescale: js.UndefOr[Boolean] = js.native
  
  var showscale: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var sizemax: js.UndefOr[Double] = js.native
  
  var sizemin: js.UndefOr[Double] = js.native
  
  var sizemode: js.UndefOr[diameter | area] = js.native
  
  var sizeref: js.UndefOr[Double] = js.native
  
  var symbol: js.UndefOr[MarkerSymbol] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PartialPlotMarkerAutocolorscale {
  
  @scala.inline
  def apply(): PartialPlotMarkerAutocolorscale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPlotMarkerAutocolorscale]
  }
  
  @scala.inline
  implicit class PartialPlotMarkerAutocolorscaleMutableBuilder[Self <: PartialPlotMarkerAutocolorscale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutocolorscale(value: Boolean): Self = StObject.set(x, "autocolorscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutocolorscaleUndefined: Self = StObject.set(x, "autocolorscale", js.undefined)
    
    @scala.inline
    def setCauto(value: Boolean): Self = StObject.set(x, "cauto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCautoUndefined: Self = StObject.set(x, "cauto", js.undefined)
    
    @scala.inline
    def setCmax(value: Double): Self = StObject.set(x, "cmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmaxUndefined: Self = StObject.set(x, "cmax", js.undefined)
    
    @scala.inline
    def setCmin(value: Double): Self = StObject.set(x, "cmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCminUndefined: Self = StObject.set(x, "cmin", js.undefined)
    
    @scala.inline
    def setColor(value: typings.plotlyJs.mod.Color | js.Array[typings.plotlyJs.mod.Color]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(
      value: (js.UndefOr[
          (js.Array[js.UndefOr[String | Double | Null]]) | typings.plotlyJs.mod.Color | Double | Null | String
        ])*
    ): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setColorbar(value: PartialColorBar): Self = StObject.set(x, "colorbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorbarUndefined: Self = StObject.set(x, "colorbar", js.undefined)
    
    @scala.inline
    def setColors(value: js.Array[typings.plotlyJs.mod.Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: typings.plotlyJs.mod.Color*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setColorscale(value: ColorScale): Self = StObject.set(x, "colorscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorscaleUndefined: Self = StObject.set(x, "colorscale", js.undefined)
    
    @scala.inline
    def setColorscaleVarargs(value: (String | (js.Tuple2[Double, String]))*): Self = StObject.set(x, "colorscale", js.Array(value :_*))
    
    @scala.inline
    def setGradient(value: Colorsrc): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
    
    @scala.inline
    def setLine(value: PartialScatterMarkerLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setMaxdisplayed(value: Double): Self = StObject.set(x, "maxdisplayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxdisplayedUndefined: Self = StObject.set(x, "maxdisplayed", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double | js.Array[Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOpacityVarargs(value: Double*): Self = StObject.set(x, "opacity", js.Array(value :_*))
    
    @scala.inline
    def setPad(value: PartialPadding): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    @scala.inline
    def setReversescale(value: Boolean): Self = StObject.set(x, "reversescale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversescaleUndefined: Self = StObject.set(x, "reversescale", js.undefined)
    
    @scala.inline
    def setShowscale(value: Boolean): Self = StObject.set(x, "showscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowscaleUndefined: Self = StObject.set(x, "showscale", js.undefined)
    
    @scala.inline
    def setSize(value: Double | js.Array[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value :_*))
    
    @scala.inline
    def setSizemax(value: Double): Self = StObject.set(x, "sizemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizemaxUndefined: Self = StObject.set(x, "sizemax", js.undefined)
    
    @scala.inline
    def setSizemin(value: Double): Self = StObject.set(x, "sizemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeminUndefined: Self = StObject.set(x, "sizemin", js.undefined)
    
    @scala.inline
    def setSizemode(value: diameter | area): Self = StObject.set(x, "sizemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizemodeUndefined: Self = StObject.set(x, "sizemode", js.undefined)
    
    @scala.inline
    def setSizeref(value: Double): Self = StObject.set(x, "sizeref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizerefUndefined: Self = StObject.set(x, "sizeref", js.undefined)
    
    @scala.inline
    def setSymbol(value: MarkerSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    @scala.inline
    def setSymbolVarargs(value: (String | Double)*): Self = StObject.set(x, "symbol", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
