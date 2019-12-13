package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.Anon_Auto
import typings.plotlyDotJs.plotlyDotJsNumbers.`false`
import typings.plotlyDotJs.plotlyDotJsStrings.any
import typings.plotlyDotJs.plotlyDotJsStrings.closest
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
  var dragmode: zoom | pan | select | lasso | orbit | turntable | `false`
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
  var `xaxis.title`: String
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
  var `yaxis.title`: String
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
    dragmode: zoom | pan | select | lasso | orbit | turntable | `false`,
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
    `xaxis.title`: String,
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
    `yaxis.title`: String,
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
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], autosize = autosize.asInstanceOf[js.Any], bargap = bargap.asInstanceOf[js.Any], bargroupgap = bargroupgap.asInstanceOf[js.Any], barmode = barmode.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], dragmode = dragmode.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hiddenlabels = hiddenlabels.asInstanceOf[js.Any], hidesources = hidesources.asInstanceOf[js.Any], hoverlabel = hoverlabel.asInstanceOf[js.Any], hovermode = hovermode.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], paper_bgcolor = paper_bgcolor.asInstanceOf[js.Any], plot_bgcolor = plot_bgcolor.asInstanceOf[js.Any], radialaxis = radialaxis.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], selectdirection = selectdirection.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any], showlegend = showlegend.asInstanceOf[js.Any], sliders = sliders.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlefont = titlefont.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], xaxis2 = xaxis2.asInstanceOf[js.Any], xaxis3 = xaxis3.asInstanceOf[js.Any], xaxis4 = xaxis4.asInstanceOf[js.Any], xaxis5 = xaxis5.asInstanceOf[js.Any], xaxis6 = xaxis6.asInstanceOf[js.Any], xaxis7 = xaxis7.asInstanceOf[js.Any], xaxis8 = xaxis8.asInstanceOf[js.Any], xaxis9 = xaxis9.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any], yaxis2 = yaxis2.asInstanceOf[js.Any], yaxis3 = yaxis3.asInstanceOf[js.Any], yaxis4 = yaxis4.asInstanceOf[js.Any], yaxis5 = yaxis5.asInstanceOf[js.Any], yaxis6 = yaxis6.asInstanceOf[js.Any], yaxis7 = yaxis7.asInstanceOf[js.Any], yaxis8 = yaxis8.asInstanceOf[js.Any], yaxis9 = yaxis9.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.autorange")(`xaxis.autorange`.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.range")(`xaxis.range`.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.title")(`xaxis.title`.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.type")(`xaxis.type`.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.autorange")(`yaxis.autorange`.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.range")(`yaxis.range`.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.title")(`yaxis.title`.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.type")(`yaxis.type`.asInstanceOf[js.Any])
    if (`xaxis.range[0]` != null) __obj.updateDynamic("xaxis.range[0]")(`xaxis.range[0]`.asInstanceOf[js.Any])
    if (`xaxis.range[1]` != null) __obj.updateDynamic("xaxis.range[1]")(`xaxis.range[1]`.asInstanceOf[js.Any])
    if (`yaxis.range[0]` != null) __obj.updateDynamic("yaxis.range[0]")(`yaxis.range[0]`.asInstanceOf[js.Any])
    if (`yaxis.range[1]` != null) __obj.updateDynamic("yaxis.range[1]")(`yaxis.range[1]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
}

