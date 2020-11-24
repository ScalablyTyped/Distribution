package typings.plotlyJs.anon

import typings.plotlyJs.mod.ColorScale
import typings.plotlyJs.mod.MarkerSymbol
import typings.plotlyJs.plotlyJsStrings.area
import typings.plotlyJs.plotlyJsStrings.diameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.PlotMarker> */
@js.native
trait PartialPlotMarkerAutocolorscale extends js.Object {
  
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
  implicit class PartialPlotMarkerAutocolorscaleOps[Self <: PartialPlotMarkerAutocolorscale] (val x: Self) extends AnyVal {
    
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
    def deleteAutocolorscale: Self = this.set("autocolorscale", js.undefined)
    
    @scala.inline
    def setCauto(value: Boolean): Self = this.set("cauto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCauto: Self = this.set("cauto", js.undefined)
    
    @scala.inline
    def setCmax(value: Double): Self = this.set("cmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmax: Self = this.set("cmax", js.undefined)
    
    @scala.inline
    def setCmin(value: Double): Self = this.set("cmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmin: Self = this.set("cmin", js.undefined)
    
    @scala.inline
    def setColorVarargs(
      value: (js.UndefOr[
          (js.Array[js.UndefOr[String | Double | Null]]) | typings.plotlyJs.mod.Color | Double | Null | String
        ])*
    ): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: typings.plotlyJs.mod.Color | js.Array[typings.plotlyJs.mod.Color]): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorbar(value: PartialColorBar): Self = this.set("colorbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorbar: Self = this.set("colorbar", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: typings.plotlyJs.mod.Color*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[typings.plotlyJs.mod.Color]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setColorscaleVarargs(value: (String | (js.Tuple2[Double, String]))*): Self = this.set("colorscale", js.Array(value :_*))
    
    @scala.inline
    def setColorscale(value: ColorScale): Self = this.set("colorscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorscale: Self = this.set("colorscale", js.undefined)
    
    @scala.inline
    def setGradient(value: Colorsrc): Self = this.set("gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradient: Self = this.set("gradient", js.undefined)
    
    @scala.inline
    def setLine(value: PartialScatterMarkerLine): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setMaxdisplayed(value: Double): Self = this.set("maxdisplayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxdisplayed: Self = this.set("maxdisplayed", js.undefined)
    
    @scala.inline
    def setOpacityVarargs(value: Double*): Self = this.set("opacity", js.Array(value :_*))
    
    @scala.inline
    def setOpacity(value: Double | js.Array[Double]): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPad(value: PartialPadding): Self = this.set("pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    
    @scala.inline
    def setReversescale(value: Boolean): Self = this.set("reversescale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReversescale: Self = this.set("reversescale", js.undefined)
    
    @scala.inline
    def setShowscale(value: Boolean): Self = this.set("showscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowscale: Self = this.set("showscale", js.undefined)
    
    @scala.inline
    def setSizeVarargs(value: Double*): Self = this.set("size", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: Double | js.Array[Double]): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSizemax(value: Double): Self = this.set("sizemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizemax: Self = this.set("sizemax", js.undefined)
    
    @scala.inline
    def setSizemin(value: Double): Self = this.set("sizemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizemin: Self = this.set("sizemin", js.undefined)
    
    @scala.inline
    def setSizemode(value: diameter | area): Self = this.set("sizemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizemode: Self = this.set("sizemode", js.undefined)
    
    @scala.inline
    def setSizeref(value: Double): Self = this.set("sizeref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeref: Self = this.set("sizeref", js.undefined)
    
    @scala.inline
    def setSymbolVarargs(value: (String | Double)*): Self = this.set("symbol", js.Array(value :_*))
    
    @scala.inline
    def setSymbol(value: MarkerSymbol): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
