package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.Anon_Auto
import typings.plotlyDotJs.plotlyDotJsNumbers.`false`
import typings.plotlyDotJs.plotlyDotJsStrings.any
import typings.plotlyDotJs.plotlyDotJsStrings.clockwise
import typings.plotlyDotJs.plotlyDotJsStrings.closest
import typings.plotlyDotJs.plotlyDotJsStrings.counterclockwise
import typings.plotlyDotJs.plotlyDotJsStrings.d
import typings.plotlyDotJs.plotlyDotJsStrings.group
import typings.plotlyDotJs.plotlyDotJsStrings.h
import typings.plotlyDotJs.plotlyDotJsStrings.lasso
import typings.plotlyDotJs.plotlyDotJsStrings.orbit
import typings.plotlyDotJs.plotlyDotJsStrings.overlay
import typings.plotlyDotJs.plotlyDotJsStrings.pan
import typings.plotlyDotJs.plotlyDotJsStrings.relative
import typings.plotlyDotJs.plotlyDotJsStrings.select
import typings.plotlyDotJs.plotlyDotJsStrings.stack
import typings.plotlyDotJs.plotlyDotJsStrings.turntable
import typings.plotlyDotJs.plotlyDotJsStrings.v
import typings.plotlyDotJs.plotlyDotJsStrings.x
import typings.plotlyDotJs.plotlyDotJsStrings.y
import typings.plotlyDotJs.plotlyDotJsStrings.zoom
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  var annotations: js.Array[Partial[Annotations]]
  var autosize: Boolean
  var bargap: Double
  var bargroupgap: Double
  var barmode: stack | group | overlay | relative
  var calendar: Calendar
   // TODO
  var direction: clockwise | counterclockwise
  var dragmode: zoom | pan | select | lasso | orbit | turntable
  var font: Partial[Font]
  var height: Double
  var hiddenlabels: js.Array[String]
  var hidesources: Boolean
  var hoverlabel: Partial[HoverLabel]
  var hovermode: closest | x | y | `false`
  var images: js.Array[Partial[Image]]
  var legend: Partial[Legend]
  var margin: Partial[Margin]
  var orientation: Double
  var paper_bgcolor: Color
  var plot_bgcolor: Color
   // TODO
  var radialaxis: Partial[Axis]
  var scene: Partial[Scene]
  var selectdirection: h | v | d | any
  var separators: String
  var shapes: js.Array[Partial[Shape]]
  var showlegend: Boolean
   // TODO
  var sliders: js.Array[Partial[Slider]]
  var title: String | Partial[Anon_Auto]
  var titlefont: Partial[Font]
  var width: Double
  var xaxis: Partial[LayoutAxis]
  var `xaxis.autorange`: Boolean
  var `xaxis.range`: js.Tuple2[Datum, Datum]
  var `xaxis.range[0]`: Datum
  var `xaxis.range[1]`: Datum
  var `xaxis.type`: AxisType
  var xaxis2: Partial[LayoutAxis]
  var xaxis3: Partial[LayoutAxis]
  var xaxis4: Partial[LayoutAxis]
  var xaxis5: Partial[LayoutAxis]
  var xaxis6: Partial[LayoutAxis]
  var xaxis7: Partial[LayoutAxis]
  var xaxis8: Partial[LayoutAxis]
  var xaxis9: Partial[LayoutAxis]
  var yaxis: Partial[LayoutAxis]
  var `yaxis.autorange`: Boolean
  var `yaxis.range`: js.Tuple2[Datum, Datum]
  var `yaxis.range[0]`: Datum
  var `yaxis.range[1]`: Datum
  var `yaxis.type`: AxisType
  var yaxis2: Partial[LayoutAxis]
  var yaxis3: Partial[LayoutAxis]
  var yaxis4: Partial[LayoutAxis]
  var yaxis5: Partial[LayoutAxis]
  var yaxis6: Partial[LayoutAxis]
  var yaxis7: Partial[LayoutAxis]
  var yaxis8: Partial[LayoutAxis]
  var yaxis9: Partial[LayoutAxis]
}

object Layout {
  @scala.inline
  def apply(
    annotations: js.Array[Partial[Annotations]],
    autosize: Boolean,
    bargap: Double,
    bargroupgap: Double,
    barmode: stack | group | overlay | relative,
    calendar: Calendar,
    direction: clockwise | counterclockwise,
    dragmode: zoom | pan | select | lasso | orbit | turntable,
    font: Partial[Font],
    height: Double,
    hiddenlabels: js.Array[String],
    hidesources: Boolean,
    hoverlabel: Partial[HoverLabel],
    hovermode: closest | x | y | `false`,
    images: js.Array[Partial[Image]],
    legend: Partial[Legend],
    margin: Partial[Margin],
    orientation: Double,
    paper_bgcolor: Color,
    plot_bgcolor: Color,
    radialaxis: Partial[Axis],
    scene: Partial[Scene],
    selectdirection: h | v | d | any,
    separators: String,
    shapes: js.Array[Partial[Shape]],
    showlegend: Boolean,
    sliders: js.Array[Partial[Slider]],
    title: String | Partial[Anon_Auto],
    titlefont: Partial[Font],
    width: Double,
    xaxis: Partial[LayoutAxis],
    `xaxis.autorange`: Boolean,
    `xaxis.range`: js.Tuple2[Datum, Datum],
    `xaxis.type`: AxisType,
    xaxis2: Partial[LayoutAxis],
    xaxis3: Partial[LayoutAxis],
    xaxis4: Partial[LayoutAxis],
    xaxis5: Partial[LayoutAxis],
    xaxis6: Partial[LayoutAxis],
    xaxis7: Partial[LayoutAxis],
    xaxis8: Partial[LayoutAxis],
    xaxis9: Partial[LayoutAxis],
    yaxis: Partial[LayoutAxis],
    `yaxis.autorange`: Boolean,
    `yaxis.range`: js.Tuple2[Datum, Datum],
    `yaxis.type`: AxisType,
    yaxis2: Partial[LayoutAxis],
    yaxis3: Partial[LayoutAxis],
    yaxis4: Partial[LayoutAxis],
    yaxis5: Partial[LayoutAxis],
    yaxis6: Partial[LayoutAxis],
    yaxis7: Partial[LayoutAxis],
    yaxis8: Partial[LayoutAxis],
    yaxis9: Partial[LayoutAxis],
    `xaxis.range[0]`: Datum = null,
    `xaxis.range[1]`: Datum = null,
    `yaxis.range[0]`: Datum = null,
    `yaxis.range[1]`: Datum = null
  ): Layout = {
    val __obj = js.Dynamic.literal(annotations = annotations, autosize = autosize, bargap = bargap, bargroupgap = bargroupgap, barmode = barmode.asInstanceOf[js.Any], calendar = calendar, direction = direction.asInstanceOf[js.Any], dragmode = dragmode.asInstanceOf[js.Any], font = font, height = height, hiddenlabels = hiddenlabels, hidesources = hidesources, hoverlabel = hoverlabel, hovermode = hovermode.asInstanceOf[js.Any], images = images, legend = legend, margin = margin, orientation = orientation, paper_bgcolor = paper_bgcolor.asInstanceOf[js.Any], plot_bgcolor = plot_bgcolor.asInstanceOf[js.Any], radialaxis = radialaxis, scene = scene, selectdirection = selectdirection.asInstanceOf[js.Any], separators = separators, shapes = shapes, showlegend = showlegend, sliders = sliders, title = title.asInstanceOf[js.Any], titlefont = titlefont, width = width, xaxis = xaxis, xaxis2 = xaxis2, xaxis3 = xaxis3, xaxis4 = xaxis4, xaxis5 = xaxis5, xaxis6 = xaxis6, xaxis7 = xaxis7, xaxis8 = xaxis8, xaxis9 = xaxis9, yaxis = yaxis, yaxis2 = yaxis2, yaxis3 = yaxis3, yaxis4 = yaxis4, yaxis5 = yaxis5, yaxis6 = yaxis6, yaxis7 = yaxis7, yaxis8 = yaxis8, yaxis9 = yaxis9)
    __obj.updateDynamic("xaxis.autorange")(`xaxis.autorange`)
    __obj.updateDynamic("xaxis.range")(`xaxis.range`)
    __obj.updateDynamic("xaxis.type")(`xaxis.type`)
    __obj.updateDynamic("yaxis.autorange")(`yaxis.autorange`)
    __obj.updateDynamic("yaxis.range")(`yaxis.range`)
    __obj.updateDynamic("yaxis.type")(`yaxis.type`)
    if (`xaxis.range[0]` != null) __obj.updateDynamic("xaxis.range[0]")(`xaxis.range[0]`.asInstanceOf[js.Any])
    if (`xaxis.range[1]` != null) __obj.updateDynamic("xaxis.range[1]")(`xaxis.range[1]`.asInstanceOf[js.Any])
    if (`yaxis.range[0]` != null) __obj.updateDynamic("yaxis.range[0]")(`yaxis.range[0]`.asInstanceOf[js.Any])
    if (`yaxis.range[1]` != null) __obj.updateDynamic("yaxis.range[1]")(`yaxis.range[1]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
}

