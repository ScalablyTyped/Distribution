package typings.plotlyJs.mod

import typings.plotlyJs.anon.Colorsrc
import typings.plotlyJs.anon.PartialColorBar
import typings.plotlyJs.anon.PartialPadding
import typings.plotlyJs.anon.PartialScatterMarkerLine
import typings.plotlyJs.plotlyJsStrings.area
import typings.plotlyJs.plotlyJsStrings.diameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotMarker extends js.Object {
  var autocolorscale: Boolean = js.native
  var cauto: Boolean = js.native
  var cmax: Double = js.native
  var cmin: Double = js.native
  var color: Color | js.Array[Color] = js.native
  var colorbar: PartialColorBar = js.native
  var colors: js.Array[Color] = js.native
  var colorscale: ColorScale = js.native
  var gradient: Colorsrc = js.native
  var line: PartialScatterMarkerLine = js.native
  var maxdisplayed: Double = js.native
  var opacity: Double | js.Array[Double] = js.native
  var pad: PartialPadding = js.native
  var reversescale: Boolean = js.native
  var showscale: Boolean = js.native
  var size: Double | js.Array[Double] = js.native
  var sizemax: Double = js.native
  var sizemin: Double = js.native
  var sizemode: diameter | area = js.native
  var sizeref: Double = js.native
  var symbol: MarkerSymbol = js.native
  var width: Double = js.native
}

object PlotMarker {
  @scala.inline
  def apply(
    autocolorscale: Boolean,
    cauto: Boolean,
    cmax: Double,
    cmin: Double,
    color: Color | js.Array[Color],
    colorbar: PartialColorBar,
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
  @scala.inline
  implicit class PlotMarkerOps[Self <: PlotMarker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutocolorscale(value: Boolean): Self = this.set("autocolorscale", value.asInstanceOf[js.Any])
    @scala.inline
    def setCauto(value: Boolean): Self = this.set("cauto", value.asInstanceOf[js.Any])
    @scala.inline
    def setCmax(value: Double): Self = this.set("cmax", value.asInstanceOf[js.Any])
    @scala.inline
    def setCmin(value: Double): Self = this.set("cmin", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorVarargs(
      value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Color | Double | Null | String])*
    ): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: Color | js.Array[Color]): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorbar(value: PartialColorBar): Self = this.set("colorbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorsVarargs(value: Color*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[Color]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorscaleVarargs(value: (String | (js.Tuple2[Double, String]))*): Self = this.set("colorscale", js.Array(value :_*))
    @scala.inline
    def setColorscale(value: ColorScale): Self = this.set("colorscale", value.asInstanceOf[js.Any])
    @scala.inline
    def setGradient(value: Colorsrc): Self = this.set("gradient", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: PartialScatterMarkerLine): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxdisplayed(value: Double): Self = this.set("maxdisplayed", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpacityVarargs(value: Double*): Self = this.set("opacity", js.Array(value :_*))
    @scala.inline
    def setOpacity(value: Double | js.Array[Double]): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setPad(value: PartialPadding): Self = this.set("pad", value.asInstanceOf[js.Any])
    @scala.inline
    def setReversescale(value: Boolean): Self = this.set("reversescale", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowscale(value: Boolean): Self = this.set("showscale", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizeVarargs(value: Double*): Self = this.set("size", js.Array(value :_*))
    @scala.inline
    def setSize(value: Double | js.Array[Double]): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizemax(value: Double): Self = this.set("sizemax", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizemin(value: Double): Self = this.set("sizemin", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizemode(value: diameter | area): Self = this.set("sizemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizeref(value: Double): Self = this.set("sizeref", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbolVarargs(value: (String | Double)*): Self = this.set("symbol", js.Array(value :_*))
    @scala.inline
    def setSymbol(value: MarkerSymbol): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

