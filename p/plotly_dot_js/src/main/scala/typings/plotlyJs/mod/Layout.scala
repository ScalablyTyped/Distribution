package typings.plotlyJs.mod

import typings.plotlyJs.AnonAuto
import typings.plotlyJs.plotlyJsBooleans.`false`
import typings.plotlyJs.plotlyJsNumbers.`0`
import typings.plotlyJs.plotlyJsNumbers.`1`
import typings.plotlyJs.plotlyJsStrings._empty
import typings.plotlyJs.plotlyJsStrings.any
import typings.plotlyJs.plotlyJsStrings.closest
import typings.plotlyJs.plotlyJsStrings.d
import typings.plotlyJs.plotlyJsStrings.fraction
import typings.plotlyJs.plotlyJsStrings.group
import typings.plotlyJs.plotlyJsStrings.h
import typings.plotlyJs.plotlyJsStrings.lasso
import typings.plotlyJs.plotlyJsStrings.orbit
import typings.plotlyJs.plotlyJsStrings.overlay
import typings.plotlyJs.plotlyJsStrings.pan
import typings.plotlyJs.plotlyJsStrings.percent
import typings.plotlyJs.plotlyJsStrings.relative
import typings.plotlyJs.plotlyJsStrings.select
import typings.plotlyJs.plotlyJsStrings.stack
import typings.plotlyJs.plotlyJsStrings.turntable
import typings.plotlyJs.plotlyJsStrings.v
import typings.plotlyJs.plotlyJsStrings.x
import typings.plotlyJs.plotlyJsStrings.y
import typings.plotlyJs.plotlyJsStrings.zoom
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  var annotations: js.Array[Partial[Annotations]]
  var autosize: Boolean
  var bargap: `0` | `1`
  var bargroupgap: `0` | `1`
  var barmode: stack | group | overlay | relative
  var barnorm: _empty | fraction | percent
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
  var title: String | Partial[AnonAuto]
  var titlefont: Partial[Font]
  var width: Double
  var xaxis: Partial[LayoutAxis]
  var xaxis2: Partial[LayoutAxis]
  var xaxis3: Partial[LayoutAxis]
  var xaxis4: Partial[LayoutAxis]
  var xaxis5: Partial[LayoutAxis]
  var xaxis6: Partial[LayoutAxis]
  var xaxis7: Partial[LayoutAxis]
  var xaxis8: Partial[LayoutAxis]
  var xaxis9: Partial[LayoutAxis]
  @JSName("xaxis.autorange")
  var xaxisDotautorange: Boolean
  @JSName("xaxis.range")
  var xaxisDotrange: js.Tuple2[Datum, Datum]
  @JSName("xaxis.range[0]")
  var `xaxisDotrange[0]`: Datum
  @JSName("xaxis.range[1]")
  var `xaxisDotrange[1]`: Datum
  @JSName("xaxis.title")
  var xaxisDottitle: String
  @JSName("xaxis.type")
  var xaxisDottype: AxisType
  var yaxis: Partial[LayoutAxis]
  var yaxis2: Partial[LayoutAxis]
  var yaxis3: Partial[LayoutAxis]
  var yaxis4: Partial[LayoutAxis]
  var yaxis5: Partial[LayoutAxis]
  var yaxis6: Partial[LayoutAxis]
  var yaxis7: Partial[LayoutAxis]
  var yaxis8: Partial[LayoutAxis]
  var yaxis9: Partial[LayoutAxis]
  @JSName("yaxis.autorange")
  var yaxisDotautorange: Boolean
  @JSName("yaxis.range")
  var yaxisDotrange: js.Tuple2[Datum, Datum]
  @JSName("yaxis.range[0]")
  var `yaxisDotrange[0]`: Datum
  @JSName("yaxis.range[1]")
  var `yaxisDotrange[1]`: Datum
  @JSName("yaxis.title")
  var yaxisDottitle: String
  @JSName("yaxis.type")
  var yaxisDottype: AxisType
}

object Layout {
  @scala.inline
  def apply(
    annotations: js.Array[Partial[Annotations]],
    autosize: Boolean,
    bargap: `0` | `1`,
    bargroupgap: `0` | `1`,
    barmode: stack | group | overlay | relative,
    barnorm: _empty | fraction | percent,
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
    title: String | Partial[AnonAuto],
    titlefont: Partial[Font],
    width: Double,
    xaxis: Partial[LayoutAxis],
    xaxis2: Partial[LayoutAxis],
    xaxis3: Partial[LayoutAxis],
    xaxis4: Partial[LayoutAxis],
    xaxis5: Partial[LayoutAxis],
    xaxis6: Partial[LayoutAxis],
    xaxis7: Partial[LayoutAxis],
    xaxis8: Partial[LayoutAxis],
    xaxis9: Partial[LayoutAxis],
    xaxisDotautorange: Boolean,
    xaxisDotrange: js.Tuple2[Datum, Datum],
    xaxisDottitle: String,
    xaxisDottype: AxisType,
    yaxis: Partial[LayoutAxis],
    yaxis2: Partial[LayoutAxis],
    yaxis3: Partial[LayoutAxis],
    yaxis4: Partial[LayoutAxis],
    yaxis5: Partial[LayoutAxis],
    yaxis6: Partial[LayoutAxis],
    yaxis7: Partial[LayoutAxis],
    yaxis8: Partial[LayoutAxis],
    yaxis9: Partial[LayoutAxis],
    yaxisDotautorange: Boolean,
    yaxisDotrange: js.Tuple2[Datum, Datum],
    yaxisDottitle: String,
    yaxisDottype: AxisType,
    `xaxisDotrange[0]`: Datum = null,
    `xaxisDotrange[1]`: Datum = null,
    `yaxisDotrange[0]`: Datum = null,
    `yaxisDotrange[1]`: Datum = null
  ): Layout = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], autosize = autosize.asInstanceOf[js.Any], bargap = bargap.asInstanceOf[js.Any], bargroupgap = bargroupgap.asInstanceOf[js.Any], barmode = barmode.asInstanceOf[js.Any], barnorm = barnorm.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], dragmode = dragmode.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hiddenlabels = hiddenlabels.asInstanceOf[js.Any], hidesources = hidesources.asInstanceOf[js.Any], hoverlabel = hoverlabel.asInstanceOf[js.Any], hovermode = hovermode.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], paper_bgcolor = paper_bgcolor.asInstanceOf[js.Any], plot_bgcolor = plot_bgcolor.asInstanceOf[js.Any], radialaxis = radialaxis.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], selectdirection = selectdirection.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any], showlegend = showlegend.asInstanceOf[js.Any], sliders = sliders.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlefont = titlefont.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], xaxis2 = xaxis2.asInstanceOf[js.Any], xaxis3 = xaxis3.asInstanceOf[js.Any], xaxis4 = xaxis4.asInstanceOf[js.Any], xaxis5 = xaxis5.asInstanceOf[js.Any], xaxis6 = xaxis6.asInstanceOf[js.Any], xaxis7 = xaxis7.asInstanceOf[js.Any], xaxis8 = xaxis8.asInstanceOf[js.Any], xaxis9 = xaxis9.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any], yaxis2 = yaxis2.asInstanceOf[js.Any], yaxis3 = yaxis3.asInstanceOf[js.Any], yaxis4 = yaxis4.asInstanceOf[js.Any], yaxis5 = yaxis5.asInstanceOf[js.Any], yaxis6 = yaxis6.asInstanceOf[js.Any], yaxis7 = yaxis7.asInstanceOf[js.Any], yaxis8 = yaxis8.asInstanceOf[js.Any], yaxis9 = yaxis9.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.autorange")(xaxisDotautorange.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.range")(xaxisDotrange.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.title")(xaxisDottitle.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.type")(xaxisDottype.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.autorange")(yaxisDotautorange.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.range")(yaxisDotrange.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.title")(yaxisDottitle.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.type")(yaxisDottype.asInstanceOf[js.Any])
    if (`xaxisDotrange[0]` != null) __obj.updateDynamic("xaxis.range[0]")(`xaxisDotrange[0]`.asInstanceOf[js.Any])
    if (`xaxisDotrange[1]` != null) __obj.updateDynamic("xaxis.range[1]")(`xaxisDotrange[1]`.asInstanceOf[js.Any])
    if (`yaxisDotrange[0]` != null) __obj.updateDynamic("yaxis.range[0]")(`yaxisDotrange[0]`.asInstanceOf[js.Any])
    if (`yaxisDotrange[1]` != null) __obj.updateDynamic("yaxis.range[1]")(`yaxisDotrange[1]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
}

