package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorBar extends js.Object {
  var bgcolor: Color
  var bordercolor: Color
  var borderwidth: Color
  var dtick: scala.Double | java.lang.String
  var exponentformat: plotlyDotJsLib.plotlyDotJsLibStrings.none | plotlyDotJsLib.plotlyDotJsLibStrings.e | plotlyDotJsLib.plotlyDotJsLibStrings.E | plotlyDotJsLib.plotlyDotJsLibStrings.power | plotlyDotJsLib.plotlyDotJsLibStrings.SI | plotlyDotJsLib.plotlyDotJsLibStrings.B
  var len: scala.Double
  var lenmode: plotlyDotJsLib.plotlyDotJsLibStrings.fraction | plotlyDotJsLib.plotlyDotJsLibStrings.pixels
  var nticks: scala.Double
  var outlinecolor: Color
  var outlinewidth: scala.Double
  var separatethousands: scala.Boolean
  var showexponent: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last | plotlyDotJsLib.plotlyDotJsLibStrings.none
  var showticklabels: scala.Boolean
  var showtickprefix: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last | plotlyDotJsLib.plotlyDotJsLibStrings.none
  var showticksuffix: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last | plotlyDotJsLib.plotlyDotJsLibStrings.none
  var thickness: scala.Double
  var thicknessmode: plotlyDotJsLib.plotlyDotJsLibStrings.fraction | plotlyDotJsLib.plotlyDotJsLibStrings.pixels
  var tick0: scala.Double | java.lang.String
  var tickangle: scala.Double
  var tickcolor: Color
  var tickfont: Font
  var tickformat: java.lang.String
  var tickformatstops: plotlyDotJsLib.Anon_Dtickrange
  var ticklen: scala.Double
  var tickmode: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.linear | plotlyDotJsLib.plotlyDotJsLibStrings.array
  var tickprefix: java.lang.String
  var ticks: plotlyDotJsLib.plotlyDotJsLibStrings.outside | plotlyDotJsLib.plotlyDotJsLibStrings.inside | plotlyDotJsLib.plotlyDotJsLibStrings.Empty
  var ticksuffix: java.lang.String
  var ticktext: js.Array[Datum] | js.Array[js.Array[Datum]] | js.Array[js.Array[js.Array[Datum]]] | TypedArray
  var ticktextsrc: js.Any
  var tickvals: js.Array[Datum] | js.Array[js.Array[Datum]] | js.Array[js.Array[js.Array[Datum]]] | TypedArray
  var tickvalssrc: js.Any
  var tickwidth: scala.Double
  var title: java.lang.String
  var titlefont: Font
  var titleside: plotlyDotJsLib.plotlyDotJsLibStrings.right | plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.bottom
  var x: scala.Double
  var xanchor: plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.center | plotlyDotJsLib.plotlyDotJsLibStrings.right
  var xpad: scala.Double
  var y: scala.Double
  var yanchor: plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.middle | plotlyDotJsLib.plotlyDotJsLibStrings.bottom
  var ypad: scala.Double
}

object ColorBar {
  @scala.inline
  def apply(
    bgcolor: Color,
    bordercolor: Color,
    borderwidth: Color,
    dtick: scala.Double | java.lang.String,
    exponentformat: plotlyDotJsLib.plotlyDotJsLibStrings.none | plotlyDotJsLib.plotlyDotJsLibStrings.e | plotlyDotJsLib.plotlyDotJsLibStrings.E | plotlyDotJsLib.plotlyDotJsLibStrings.power | plotlyDotJsLib.plotlyDotJsLibStrings.SI | plotlyDotJsLib.plotlyDotJsLibStrings.B,
    len: scala.Double,
    lenmode: plotlyDotJsLib.plotlyDotJsLibStrings.fraction | plotlyDotJsLib.plotlyDotJsLibStrings.pixels,
    nticks: scala.Double,
    outlinecolor: Color,
    outlinewidth: scala.Double,
    separatethousands: scala.Boolean,
    showexponent: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last | plotlyDotJsLib.plotlyDotJsLibStrings.none,
    showticklabels: scala.Boolean,
    showtickprefix: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last | plotlyDotJsLib.plotlyDotJsLibStrings.none,
    showticksuffix: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last | plotlyDotJsLib.plotlyDotJsLibStrings.none,
    thickness: scala.Double,
    thicknessmode: plotlyDotJsLib.plotlyDotJsLibStrings.fraction | plotlyDotJsLib.plotlyDotJsLibStrings.pixels,
    tick0: scala.Double | java.lang.String,
    tickangle: scala.Double,
    tickcolor: Color,
    tickfont: Font,
    tickformat: java.lang.String,
    tickformatstops: plotlyDotJsLib.Anon_Dtickrange,
    ticklen: scala.Double,
    tickmode: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.linear | plotlyDotJsLib.plotlyDotJsLibStrings.array,
    tickprefix: java.lang.String,
    ticks: plotlyDotJsLib.plotlyDotJsLibStrings.outside | plotlyDotJsLib.plotlyDotJsLibStrings.inside | plotlyDotJsLib.plotlyDotJsLibStrings.Empty,
    ticksuffix: java.lang.String,
    ticktext: js.Array[Datum] | js.Array[js.Array[Datum]] | js.Array[js.Array[js.Array[Datum]]] | TypedArray,
    ticktextsrc: js.Any,
    tickvals: js.Array[Datum] | js.Array[js.Array[Datum]] | js.Array[js.Array[js.Array[Datum]]] | TypedArray,
    tickvalssrc: js.Any,
    tickwidth: scala.Double,
    title: java.lang.String,
    titlefont: Font,
    titleside: plotlyDotJsLib.plotlyDotJsLibStrings.right | plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.bottom,
    x: scala.Double,
    xanchor: plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.center | plotlyDotJsLib.plotlyDotJsLibStrings.right,
    xpad: scala.Double,
    y: scala.Double,
    yanchor: plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.middle | plotlyDotJsLib.plotlyDotJsLibStrings.bottom,
    ypad: scala.Double
  ): ColorBar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    __obj.updateDynamic("bordercolor")(bordercolor.asInstanceOf[js.Any])
    __obj.updateDynamic("borderwidth")(borderwidth.asInstanceOf[js.Any])
    __obj.updateDynamic("dtick")(dtick.asInstanceOf[js.Any])
    __obj.updateDynamic("exponentformat")(exponentformat.asInstanceOf[js.Any])
    __obj.updateDynamic("len")(len)
    __obj.updateDynamic("lenmode")(lenmode.asInstanceOf[js.Any])
    __obj.updateDynamic("nticks")(nticks)
    __obj.updateDynamic("outlinecolor")(outlinecolor.asInstanceOf[js.Any])
    __obj.updateDynamic("outlinewidth")(outlinewidth)
    __obj.updateDynamic("separatethousands")(separatethousands)
    __obj.updateDynamic("showexponent")(showexponent.asInstanceOf[js.Any])
    __obj.updateDynamic("showticklabels")(showticklabels)
    __obj.updateDynamic("showtickprefix")(showtickprefix.asInstanceOf[js.Any])
    __obj.updateDynamic("showticksuffix")(showticksuffix.asInstanceOf[js.Any])
    __obj.updateDynamic("thickness")(thickness)
    __obj.updateDynamic("thicknessmode")(thicknessmode.asInstanceOf[js.Any])
    __obj.updateDynamic("tick0")(tick0.asInstanceOf[js.Any])
    __obj.updateDynamic("tickangle")(tickangle)
    __obj.updateDynamic("tickcolor")(tickcolor.asInstanceOf[js.Any])
    __obj.updateDynamic("tickfont")(tickfont)
    __obj.updateDynamic("tickformat")(tickformat)
    __obj.updateDynamic("tickformatstops")(tickformatstops)
    __obj.updateDynamic("ticklen")(ticklen)
    __obj.updateDynamic("tickmode")(tickmode.asInstanceOf[js.Any])
    __obj.updateDynamic("tickprefix")(tickprefix)
    __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    __obj.updateDynamic("ticksuffix")(ticksuffix)
    __obj.updateDynamic("ticktext")(ticktext.asInstanceOf[js.Any])
    __obj.updateDynamic("ticktextsrc")(ticktextsrc)
    __obj.updateDynamic("tickvals")(tickvals.asInstanceOf[js.Any])
    __obj.updateDynamic("tickvalssrc")(tickvalssrc)
    __obj.updateDynamic("tickwidth")(tickwidth)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("titlefont")(titlefont)
    __obj.updateDynamic("titleside")(titleside.asInstanceOf[js.Any])
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("xanchor")(xanchor.asInstanceOf[js.Any])
    __obj.updateDynamic("xpad")(xpad)
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("yanchor")(yanchor.asInstanceOf[js.Any])
    __obj.updateDynamic("ypad")(ypad)
    __obj.asInstanceOf[ColorBar]
  }
}

