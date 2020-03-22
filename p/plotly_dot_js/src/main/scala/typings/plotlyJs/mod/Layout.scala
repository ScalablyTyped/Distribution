package typings.plotlyJs.mod

import typings.plotlyJs.PartialAnnotationsArrowcolor
import typings.plotlyJs.PartialAxisCalendar
import typings.plotlyJs.PartialFont
import typings.plotlyJs.PartialHoverLabel
import typings.plotlyJs.PartialImage
import typings.plotlyJs.PartialLayoutAxisAngle
import typings.plotlyJs.PartialLegend
import typings.plotlyJs.PartialMargin
import typings.plotlyJs.PartialPolarLayoutBgcolor
import typings.plotlyJs.PartialSceneAspectmode
import typings.plotlyJs.PartialShape
import typings.plotlyJs.PartialSliderActivebgcolor
import typings.plotlyJs.Partialrowsnumberroworder
import typings.plotlyJs.PartialtextstringfontPart
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  var annotations: js.Array[PartialAnnotationsArrowcolor]
  var autosize: Boolean
  var bargap: `0` | `1`
  var bargroupgap: `0` | `1`
  var barmode: stack | group | overlay | relative
  var barnorm: _empty | fraction | percent
  var calendar: Calendar
   // TODO
  var dragmode: zoom | pan | select | lasso | orbit | turntable | `false`
  var font: PartialFont
  var grid: Partialrowsnumberroworder
  var height: Double
  var hiddenlabels: js.Array[String]
  var hidesources: Boolean
  var hoverlabel: PartialHoverLabel
  var hovermode: closest | x | y | `false`
  var images: js.Array[PartialImage]
  var legend: PartialLegend
  var margin: PartialMargin
  var orientation: Double
  var paper_bgcolor: Color
  var plot_bgcolor: Color
  var polar: PartialPolarLayoutBgcolor
  var polar2: PartialPolarLayoutBgcolor
  var polar3: PartialPolarLayoutBgcolor
  var polar4: PartialPolarLayoutBgcolor
  var polar5: PartialPolarLayoutBgcolor
  var polar6: PartialPolarLayoutBgcolor
  var polar7: PartialPolarLayoutBgcolor
  var polar8: PartialPolarLayoutBgcolor
  var polar9: PartialPolarLayoutBgcolor
   // TODO
  var radialaxis: PartialAxisCalendar
  var scene: PartialSceneAspectmode
  var selectdirection: h | v | d | any
  var separators: String
  var shapes: js.Array[PartialShape]
  var showlegend: Boolean
   // TODO
  var sliders: js.Array[PartialSliderActivebgcolor]
  var title: String | PartialtextstringfontPart
  var titlefont: PartialFont
  var width: Double
  var xaxis: PartialLayoutAxisAngle
  var xaxis2: PartialLayoutAxisAngle
  var xaxis3: PartialLayoutAxisAngle
  var xaxis4: PartialLayoutAxisAngle
  var xaxis5: PartialLayoutAxisAngle
  var xaxis6: PartialLayoutAxisAngle
  var xaxis7: PartialLayoutAxisAngle
  var xaxis8: PartialLayoutAxisAngle
  var xaxis9: PartialLayoutAxisAngle
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
  var yaxis: PartialLayoutAxisAngle
  var yaxis2: PartialLayoutAxisAngle
  var yaxis3: PartialLayoutAxisAngle
  var yaxis4: PartialLayoutAxisAngle
  var yaxis5: PartialLayoutAxisAngle
  var yaxis6: PartialLayoutAxisAngle
  var yaxis7: PartialLayoutAxisAngle
  var yaxis8: PartialLayoutAxisAngle
  var yaxis9: PartialLayoutAxisAngle
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
    annotations: js.Array[PartialAnnotationsArrowcolor],
    autosize: Boolean,
    bargap: `0` | `1`,
    bargroupgap: `0` | `1`,
    barmode: stack | group | overlay | relative,
    barnorm: _empty | fraction | percent,
    calendar: Calendar,
    dragmode: zoom | pan | select | lasso | orbit | turntable | `false`,
    font: PartialFont,
    grid: Partialrowsnumberroworder,
    height: Double,
    hiddenlabels: js.Array[String],
    hidesources: Boolean,
    hoverlabel: PartialHoverLabel,
    hovermode: closest | x | y | `false`,
    images: js.Array[PartialImage],
    legend: PartialLegend,
    margin: PartialMargin,
    orientation: Double,
    paper_bgcolor: Color,
    plot_bgcolor: Color,
    polar: PartialPolarLayoutBgcolor,
    polar2: PartialPolarLayoutBgcolor,
    polar3: PartialPolarLayoutBgcolor,
    polar4: PartialPolarLayoutBgcolor,
    polar5: PartialPolarLayoutBgcolor,
    polar6: PartialPolarLayoutBgcolor,
    polar7: PartialPolarLayoutBgcolor,
    polar8: PartialPolarLayoutBgcolor,
    polar9: PartialPolarLayoutBgcolor,
    radialaxis: PartialAxisCalendar,
    scene: PartialSceneAspectmode,
    selectdirection: h | v | d | any,
    separators: String,
    shapes: js.Array[PartialShape],
    showlegend: Boolean,
    sliders: js.Array[PartialSliderActivebgcolor],
    title: String | PartialtextstringfontPart,
    titlefont: PartialFont,
    width: Double,
    xaxis: PartialLayoutAxisAngle,
    xaxis2: PartialLayoutAxisAngle,
    xaxis3: PartialLayoutAxisAngle,
    xaxis4: PartialLayoutAxisAngle,
    xaxis5: PartialLayoutAxisAngle,
    xaxis6: PartialLayoutAxisAngle,
    xaxis7: PartialLayoutAxisAngle,
    xaxis8: PartialLayoutAxisAngle,
    xaxis9: PartialLayoutAxisAngle,
    xaxisDotautorange: Boolean,
    xaxisDotrange: js.Tuple2[Datum, Datum],
    xaxisDottitle: String,
    xaxisDottype: AxisType,
    yaxis: PartialLayoutAxisAngle,
    yaxis2: PartialLayoutAxisAngle,
    yaxis3: PartialLayoutAxisAngle,
    yaxis4: PartialLayoutAxisAngle,
    yaxis5: PartialLayoutAxisAngle,
    yaxis6: PartialLayoutAxisAngle,
    yaxis7: PartialLayoutAxisAngle,
    yaxis8: PartialLayoutAxisAngle,
    yaxis9: PartialLayoutAxisAngle,
    yaxisDotautorange: Boolean,
    yaxisDotrange: js.Tuple2[Datum, Datum],
    yaxisDottitle: String,
    yaxisDottype: AxisType,
    `xaxisDotrange[0]`: Datum = null,
    `xaxisDotrange[1]`: Datum = null,
    `yaxisDotrange[0]`: Datum = null,
    `yaxisDotrange[1]`: Datum = null
  ): Layout = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], autosize = autosize.asInstanceOf[js.Any], bargap = bargap.asInstanceOf[js.Any], bargroupgap = bargroupgap.asInstanceOf[js.Any], barmode = barmode.asInstanceOf[js.Any], barnorm = barnorm.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], dragmode = dragmode.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hiddenlabels = hiddenlabels.asInstanceOf[js.Any], hidesources = hidesources.asInstanceOf[js.Any], hoverlabel = hoverlabel.asInstanceOf[js.Any], hovermode = hovermode.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], paper_bgcolor = paper_bgcolor.asInstanceOf[js.Any], plot_bgcolor = plot_bgcolor.asInstanceOf[js.Any], polar = polar.asInstanceOf[js.Any], polar2 = polar2.asInstanceOf[js.Any], polar3 = polar3.asInstanceOf[js.Any], polar4 = polar4.asInstanceOf[js.Any], polar5 = polar5.asInstanceOf[js.Any], polar6 = polar6.asInstanceOf[js.Any], polar7 = polar7.asInstanceOf[js.Any], polar8 = polar8.asInstanceOf[js.Any], polar9 = polar9.asInstanceOf[js.Any], radialaxis = radialaxis.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], selectdirection = selectdirection.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any], showlegend = showlegend.asInstanceOf[js.Any], sliders = sliders.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlefont = titlefont.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], xaxis2 = xaxis2.asInstanceOf[js.Any], xaxis3 = xaxis3.asInstanceOf[js.Any], xaxis4 = xaxis4.asInstanceOf[js.Any], xaxis5 = xaxis5.asInstanceOf[js.Any], xaxis6 = xaxis6.asInstanceOf[js.Any], xaxis7 = xaxis7.asInstanceOf[js.Any], xaxis8 = xaxis8.asInstanceOf[js.Any], xaxis9 = xaxis9.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any], yaxis2 = yaxis2.asInstanceOf[js.Any], yaxis3 = yaxis3.asInstanceOf[js.Any], yaxis4 = yaxis4.asInstanceOf[js.Any], yaxis5 = yaxis5.asInstanceOf[js.Any], yaxis6 = yaxis6.asInstanceOf[js.Any], yaxis7 = yaxis7.asInstanceOf[js.Any], yaxis8 = yaxis8.asInstanceOf[js.Any], yaxis9 = yaxis9.asInstanceOf[js.Any])
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

