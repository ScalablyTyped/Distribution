package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  var annotations: js.Array[stdLib.Partial[Annotations]]
  var autosize: scala.Boolean
  var bargap: scala.Double
  var bargroupgap: scala.Double
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
    bargap: scala.Double,
    bargroupgap: scala.Double,
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
    val __obj = js.Dynamic.literal(annotations = annotations, autosize = autosize, bargap = bargap, bargroupgap = bargroupgap, barmode = barmode.asInstanceOf[js.Any], calendar = calendar, direction = direction.asInstanceOf[js.Any], dragmode = dragmode.asInstanceOf[js.Any], font = font, height = height, hidesources = hidesources, hoverlabel = hoverlabel, hovermode = hovermode.asInstanceOf[js.Any], images = images, legend = legend, margin = margin, orientation = orientation, paper_bgcolor = paper_bgcolor.asInstanceOf[js.Any], plot_bgcolor = plot_bgcolor.asInstanceOf[js.Any], radialaxis = radialaxis, scene = scene, separators = separators, shapes = shapes, showlegend = showlegend, sliders = sliders, title = title.asInstanceOf[js.Any], titlefont = titlefont, width = width, xaxis = xaxis, xaxis2 = xaxis2, xaxis3 = xaxis3, xaxis4 = xaxis4, xaxis5 = xaxis5, xaxis6 = xaxis6, xaxis7 = xaxis7, xaxis8 = xaxis8, xaxis9 = xaxis9, yaxis = yaxis, yaxis2 = yaxis2, yaxis3 = yaxis3, yaxis4 = yaxis4, yaxis5 = yaxis5, yaxis6 = yaxis6, yaxis7 = yaxis7, yaxis8 = yaxis8, yaxis9 = yaxis9)
    __obj.updateDynamic("xaxis.autorange")(`xaxis.autorange`)
    __obj.updateDynamic("xaxis.range")(`xaxis.range`)
    __obj.updateDynamic("xaxis.range[0]")(`xaxis.range[0]`.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.range[1]")(`xaxis.range[1]`.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.type")(`xaxis.type`)
    __obj.updateDynamic("yaxis.autorange")(`yaxis.autorange`)
    __obj.updateDynamic("yaxis.range")(`yaxis.range`)
    __obj.updateDynamic("yaxis.range[0]")(`yaxis.range[0]`.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.range[1]")(`yaxis.range[1]`.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.type")(`yaxis.type`)
    __obj.asInstanceOf[Layout]
  }
}

