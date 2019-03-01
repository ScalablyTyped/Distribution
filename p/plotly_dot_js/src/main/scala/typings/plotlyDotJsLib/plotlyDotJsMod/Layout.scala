package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  var annotations: js.Array[stdLib.Partial[Annotations]]
  var autosize: scala.Boolean
  var barmode: plotlyDotJsLib.plotlyDotJsLibStrings.stack | plotlyDotJsLib.plotlyDotJsLibStrings.group | plotlyDotJsLib.plotlyDotJsLibStrings.overlay | plotlyDotJsLib.plotlyDotJsLibStrings.relative
  var calendar: Calendar
   // TODO
  var direction: plotlyDotJsLib.plotlyDotJsLibStrings.clockwise | plotlyDotJsLib.plotlyDotJsLibStrings.counterclockwise
  var dragmode: plotlyDotJsLib.plotlyDotJsLibStrings.zoom | plotlyDotJsLib.plotlyDotJsLibStrings.pan | plotlyDotJsLib.plotlyDotJsLibStrings.select | plotlyDotJsLib.plotlyDotJsLibStrings.lasso | plotlyDotJsLib.plotlyDotJsLibStrings.orbit | plotlyDotJsLib.plotlyDotJsLibStrings.turntable
  var font: stdLib.Partial[Font]
  var height: scala.Double
  var hidesources: scala.Boolean
  var hoverlabel: stdLib.Partial[Label]
  var hovermode: plotlyDotJsLib.plotlyDotJsLibStrings.closest | plotlyDotJsLib.plotlyDotJsLibStrings.x | plotlyDotJsLib.plotlyDotJsLibStrings.y | plotlyDotJsLib.plotlyDotJsLibNumbers.`false`
  var images: js.Array[stdLib.Partial[Image]]
  var legend: stdLib.Partial[Legend]
  var margin: stdLib.Partial[Margin]
  var orientation: scala.Double
  var paper_bgcolor: Color
  var plot_bgcolor: Color
   // TODO
  var radialaxis: stdLib.Partial[Axis]
  var scene: stdLib.Partial[Scene]
  var separators: java.lang.String
  var shapes: js.Array[stdLib.Partial[Shape]]
  var showlegend: scala.Boolean
   // TODO
  var sliders: js.Array[stdLib.Partial[Slider]]
  var title: java.lang.String | stdLib.Partial[plotlyDotJsLib.Anon_Auto]
  var titlefont: stdLib.Partial[Font]
  var width: scala.Double
  var xaxis: stdLib.Partial[LayoutAxis]
  var `xaxis.autorange`: scala.Boolean
  var `xaxis.range`: js.Tuple2[Datum, Datum]
  var `xaxis.range[0]`: Datum
  var `xaxis.range[1]`: Datum
  var `xaxis.type`: AxisType
  var xaxis2: stdLib.Partial[LayoutAxis]
  var xaxis3: stdLib.Partial[LayoutAxis]
  var xaxis4: stdLib.Partial[LayoutAxis]
  var xaxis5: stdLib.Partial[LayoutAxis]
  var xaxis6: stdLib.Partial[LayoutAxis]
  var xaxis7: stdLib.Partial[LayoutAxis]
  var xaxis8: stdLib.Partial[LayoutAxis]
  var xaxis9: stdLib.Partial[LayoutAxis]
  var yaxis: stdLib.Partial[LayoutAxis]
  var `yaxis.autorange`: scala.Boolean
  var `yaxis.range`: js.Tuple2[Datum, Datum]
  var `yaxis.range[0]`: Datum
  var `yaxis.range[1]`: Datum
  var `yaxis.type`: AxisType
  var yaxis2: stdLib.Partial[LayoutAxis]
  var yaxis3: stdLib.Partial[LayoutAxis]
  var yaxis4: stdLib.Partial[LayoutAxis]
  var yaxis5: stdLib.Partial[LayoutAxis]
  var yaxis6: stdLib.Partial[LayoutAxis]
  var yaxis7: stdLib.Partial[LayoutAxis]
  var yaxis8: stdLib.Partial[LayoutAxis]
  var yaxis9: stdLib.Partial[LayoutAxis]
}

object Layout {
  @scala.inline
  def apply(
    annotations: js.Array[stdLib.Partial[Annotations]],
    autosize: scala.Boolean,
    barmode: plotlyDotJsLib.plotlyDotJsLibStrings.stack | plotlyDotJsLib.plotlyDotJsLibStrings.group | plotlyDotJsLib.plotlyDotJsLibStrings.overlay | plotlyDotJsLib.plotlyDotJsLibStrings.relative,
    calendar: Calendar,
    direction: plotlyDotJsLib.plotlyDotJsLibStrings.clockwise | plotlyDotJsLib.plotlyDotJsLibStrings.counterclockwise,
    dragmode: plotlyDotJsLib.plotlyDotJsLibStrings.zoom | plotlyDotJsLib.plotlyDotJsLibStrings.pan | plotlyDotJsLib.plotlyDotJsLibStrings.select | plotlyDotJsLib.plotlyDotJsLibStrings.lasso | plotlyDotJsLib.plotlyDotJsLibStrings.orbit | plotlyDotJsLib.plotlyDotJsLibStrings.turntable,
    font: stdLib.Partial[Font],
    height: scala.Double,
    hidesources: scala.Boolean,
    hoverlabel: stdLib.Partial[Label],
    hovermode: plotlyDotJsLib.plotlyDotJsLibStrings.closest | plotlyDotJsLib.plotlyDotJsLibStrings.x | plotlyDotJsLib.plotlyDotJsLibStrings.y | plotlyDotJsLib.plotlyDotJsLibNumbers.`false`,
    images: js.Array[stdLib.Partial[Image]],
    legend: stdLib.Partial[Legend],
    margin: stdLib.Partial[Margin],
    orientation: scala.Double,
    paper_bgcolor: Color,
    plot_bgcolor: Color,
    radialaxis: stdLib.Partial[Axis],
    scene: stdLib.Partial[Scene],
    separators: java.lang.String,
    shapes: js.Array[stdLib.Partial[Shape]],
    showlegend: scala.Boolean,
    sliders: js.Array[stdLib.Partial[Slider]],
    title: java.lang.String | stdLib.Partial[plotlyDotJsLib.Anon_Auto],
    titlefont: stdLib.Partial[Font],
    width: scala.Double,
    xaxis: stdLib.Partial[LayoutAxis],
    `xaxis.autorange`: scala.Boolean,
    `xaxis.range`: js.Tuple2[Datum, Datum],
    `xaxis.range[0]`: Datum,
    `xaxis.range[1]`: Datum,
    `xaxis.type`: AxisType,
    xaxis2: stdLib.Partial[LayoutAxis],
    xaxis3: stdLib.Partial[LayoutAxis],
    xaxis4: stdLib.Partial[LayoutAxis],
    xaxis5: stdLib.Partial[LayoutAxis],
    xaxis6: stdLib.Partial[LayoutAxis],
    xaxis7: stdLib.Partial[LayoutAxis],
    xaxis8: stdLib.Partial[LayoutAxis],
    xaxis9: stdLib.Partial[LayoutAxis],
    yaxis: stdLib.Partial[LayoutAxis],
    `yaxis.autorange`: scala.Boolean,
    `yaxis.range`: js.Tuple2[Datum, Datum],
    `yaxis.range[0]`: Datum,
    `yaxis.range[1]`: Datum,
    `yaxis.type`: AxisType,
    yaxis2: stdLib.Partial[LayoutAxis],
    yaxis3: stdLib.Partial[LayoutAxis],
    yaxis4: stdLib.Partial[LayoutAxis],
    yaxis5: stdLib.Partial[LayoutAxis],
    yaxis6: stdLib.Partial[LayoutAxis],
    yaxis7: stdLib.Partial[LayoutAxis],
    yaxis8: stdLib.Partial[LayoutAxis],
    yaxis9: stdLib.Partial[LayoutAxis]
  ): Layout = {
    val __obj = js.Dynamic.literal(`xaxis.autorange` = `xaxis.autorange`, `xaxis.range` = `xaxis.range`, `xaxis.range[0]` = `xaxis.range[0]`.asInstanceOf[js.Any], `xaxis.range[1]` = `xaxis.range[1]`.asInstanceOf[js.Any], `xaxis.type` = `xaxis.type`, `yaxis.autorange` = `yaxis.autorange`, `yaxis.range` = `yaxis.range`, `yaxis.range[0]` = `yaxis.range[0]`.asInstanceOf[js.Any], `yaxis.range[1]` = `yaxis.range[1]`.asInstanceOf[js.Any], `yaxis.type` = `yaxis.type`)
    __obj.updateDynamic("annotations")(annotations)
    __obj.updateDynamic("autosize")(autosize)
    __obj.updateDynamic("barmode")(barmode.asInstanceOf[js.Any])
    __obj.updateDynamic("calendar")(calendar)
    __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.updateDynamic("dragmode")(dragmode.asInstanceOf[js.Any])
    __obj.updateDynamic("font")(font)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("hidesources")(hidesources)
    __obj.updateDynamic("hoverlabel")(hoverlabel)
    __obj.updateDynamic("hovermode")(hovermode.asInstanceOf[js.Any])
    __obj.updateDynamic("images")(images)
    __obj.updateDynamic("legend")(legend)
    __obj.updateDynamic("margin")(margin)
    __obj.updateDynamic("orientation")(orientation)
    __obj.updateDynamic("paper_bgcolor")(paper_bgcolor.asInstanceOf[js.Any])
    __obj.updateDynamic("plot_bgcolor")(plot_bgcolor.asInstanceOf[js.Any])
    __obj.updateDynamic("radialaxis")(radialaxis)
    __obj.updateDynamic("scene")(scene)
    __obj.updateDynamic("separators")(separators)
    __obj.updateDynamic("shapes")(shapes)
    __obj.updateDynamic("showlegend")(showlegend)
    __obj.updateDynamic("sliders")(sliders)
    __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.updateDynamic("titlefont")(titlefont)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("xaxis")(xaxis)
    __obj.updateDynamic("xaxis2")(xaxis2)
    __obj.updateDynamic("xaxis3")(xaxis3)
    __obj.updateDynamic("xaxis4")(xaxis4)
    __obj.updateDynamic("xaxis5")(xaxis5)
    __obj.updateDynamic("xaxis6")(xaxis6)
    __obj.updateDynamic("xaxis7")(xaxis7)
    __obj.updateDynamic("xaxis8")(xaxis8)
    __obj.updateDynamic("xaxis9")(xaxis9)
    __obj.updateDynamic("yaxis")(yaxis)
    __obj.updateDynamic("yaxis2")(yaxis2)
    __obj.updateDynamic("yaxis3")(yaxis3)
    __obj.updateDynamic("yaxis4")(yaxis4)
    __obj.updateDynamic("yaxis5")(yaxis5)
    __obj.updateDynamic("yaxis6")(yaxis6)
    __obj.updateDynamic("yaxis7")(yaxis7)
    __obj.updateDynamic("yaxis8")(yaxis8)
    __obj.updateDynamic("yaxis9")(yaxis9)
    __obj.asInstanceOf[Layout]
  }
}

