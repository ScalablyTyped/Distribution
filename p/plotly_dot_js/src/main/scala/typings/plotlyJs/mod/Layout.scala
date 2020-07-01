package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialAnnotationsAlign
import typings.plotlyJs.anon.PartialAxis
import typings.plotlyJs.anon.PartialFont
import typings.plotlyJs.anon.PartialHoverLabel
import typings.plotlyJs.anon.PartialImage
import typings.plotlyJs.anon.PartialLayoutAxis
import typings.plotlyJs.anon.PartialLegend
import typings.plotlyJs.anon.PartialMapbox
import typings.plotlyJs.anon.PartialMargin
import typings.plotlyJs.anon.PartialPolarLayout
import typings.plotlyJs.anon.PartialScene
import typings.plotlyJs.anon.PartialShape
import typings.plotlyJs.anon.PartialSlider
import typings.plotlyJs.anon.Partialrowsnumberroworder
import typings.plotlyJs.anon.PartialtextstringfontPart
import typings.plotlyJs.plotlyJsBooleans.`false`
import typings.plotlyJs.plotlyJsStrings._empty
import typings.plotlyJs.plotlyJsStrings.`x unified`
import typings.plotlyJs.plotlyJsStrings.`y unified`
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
  var annotations: js.Array[PartialAnnotationsAlign]
  var autosize: Boolean
  var bargap: Double
  var bargroupgap: Double
  var barmode: stack | group | overlay | relative
  var barnorm: _empty | fraction | percent
  var calendar: Calendar
  var colorway: js.Array[String]
   // TODO
  var dragmode: zoom | pan | select | lasso | orbit | turntable | `false`
  var font: PartialFont
  var grid: Partialrowsnumberroworder
  var height: Double
  var hiddenlabels: js.Array[String]
  var hidesources: Boolean
  var hoverdistance: Double
  var hoverlabel: PartialHoverLabel
  var hovermode: closest | x | y | (`x unified`) | (`y unified`) | `false`
  var images: js.Array[PartialImage]
  var legend: PartialLegend
   // TODO
  var mapbox: PartialMapbox
  var margin: PartialMargin
  var orientation: Double
  var paper_bgcolor: Color
  var plot_bgcolor: Color
  var polar: PartialPolarLayout
  var polar2: PartialPolarLayout
  var polar3: PartialPolarLayout
  var polar4: PartialPolarLayout
  var polar5: PartialPolarLayout
  var polar6: PartialPolarLayout
  var polar7: PartialPolarLayout
  var polar8: PartialPolarLayout
  var polar9: PartialPolarLayout
  var radialaxis: PartialAxis
  var scene: PartialScene
  var selectdirection: h | v | d | any
  var separators: String
  var shapes: js.Array[PartialShape]
  var showlegend: Boolean
   // TODO
  var sliders: js.Array[PartialSlider]
  var subplot: String
  var title: String | PartialtextstringfontPart
  var titlefont: PartialFont
  var transition: Transition
  var width: Double
  var xaxis: PartialLayoutAxis
  var xaxis2: PartialLayoutAxis
  var xaxis3: PartialLayoutAxis
  var xaxis4: PartialLayoutAxis
  var xaxis5: PartialLayoutAxis
  var xaxis6: PartialLayoutAxis
  var xaxis7: PartialLayoutAxis
  var xaxis8: PartialLayoutAxis
  var xaxis9: PartialLayoutAxis
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
  var yaxis: PartialLayoutAxis
  var yaxis2: PartialLayoutAxis
  var yaxis3: PartialLayoutAxis
  var yaxis4: PartialLayoutAxis
  var yaxis5: PartialLayoutAxis
  var yaxis6: PartialLayoutAxis
  var yaxis7: PartialLayoutAxis
  var yaxis8: PartialLayoutAxis
  var yaxis9: PartialLayoutAxis
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
    annotations: js.Array[PartialAnnotationsAlign],
    autosize: Boolean,
    bargap: Double,
    bargroupgap: Double,
    barmode: stack | group | overlay | relative,
    barnorm: _empty | fraction | percent,
    calendar: Calendar,
    colorway: js.Array[String],
    dragmode: zoom | pan | select | lasso | orbit | turntable | `false`,
    font: PartialFont,
    grid: Partialrowsnumberroworder,
    height: Double,
    hiddenlabels: js.Array[String],
    hidesources: Boolean,
    hoverdistance: Double,
    hoverlabel: PartialHoverLabel,
    hovermode: closest | x | y | (`x unified`) | (`y unified`) | `false`,
    images: js.Array[PartialImage],
    legend: PartialLegend,
    mapbox: PartialMapbox,
    margin: PartialMargin,
    orientation: Double,
    paper_bgcolor: Color,
    plot_bgcolor: Color,
    polar: PartialPolarLayout,
    polar2: PartialPolarLayout,
    polar3: PartialPolarLayout,
    polar4: PartialPolarLayout,
    polar5: PartialPolarLayout,
    polar6: PartialPolarLayout,
    polar7: PartialPolarLayout,
    polar8: PartialPolarLayout,
    polar9: PartialPolarLayout,
    radialaxis: PartialAxis,
    scene: PartialScene,
    selectdirection: h | v | d | any,
    separators: String,
    shapes: js.Array[PartialShape],
    showlegend: Boolean,
    sliders: js.Array[PartialSlider],
    subplot: String,
    title: String | PartialtextstringfontPart,
    titlefont: PartialFont,
    transition: Transition,
    width: Double,
    xaxis: PartialLayoutAxis,
    xaxis2: PartialLayoutAxis,
    xaxis3: PartialLayoutAxis,
    xaxis4: PartialLayoutAxis,
    xaxis5: PartialLayoutAxis,
    xaxis6: PartialLayoutAxis,
    xaxis7: PartialLayoutAxis,
    xaxis8: PartialLayoutAxis,
    xaxis9: PartialLayoutAxis,
    xaxisDotautorange: Boolean,
    xaxisDotrange: js.Tuple2[Datum, Datum],
    xaxisDottitle: String,
    xaxisDottype: AxisType,
    yaxis: PartialLayoutAxis,
    yaxis2: PartialLayoutAxis,
    yaxis3: PartialLayoutAxis,
    yaxis4: PartialLayoutAxis,
    yaxis5: PartialLayoutAxis,
    yaxis6: PartialLayoutAxis,
    yaxis7: PartialLayoutAxis,
    yaxis8: PartialLayoutAxis,
    yaxis9: PartialLayoutAxis,
    yaxisDotautorange: Boolean,
    yaxisDotrange: js.Tuple2[Datum, Datum],
    yaxisDottitle: String,
    yaxisDottype: AxisType,
    `xaxisDotrange[0]`: Datum = null,
    `xaxisDotrange[1]`: Datum = null,
    `yaxisDotrange[0]`: Datum = null,
    `yaxisDotrange[1]`: Datum = null
  ): Layout = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], autosize = autosize.asInstanceOf[js.Any], bargap = bargap.asInstanceOf[js.Any], bargroupgap = bargroupgap.asInstanceOf[js.Any], barmode = barmode.asInstanceOf[js.Any], barnorm = barnorm.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], colorway = colorway.asInstanceOf[js.Any], dragmode = dragmode.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hiddenlabels = hiddenlabels.asInstanceOf[js.Any], hidesources = hidesources.asInstanceOf[js.Any], hoverdistance = hoverdistance.asInstanceOf[js.Any], hoverlabel = hoverlabel.asInstanceOf[js.Any], hovermode = hovermode.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], mapbox = mapbox.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], paper_bgcolor = paper_bgcolor.asInstanceOf[js.Any], plot_bgcolor = plot_bgcolor.asInstanceOf[js.Any], polar = polar.asInstanceOf[js.Any], polar2 = polar2.asInstanceOf[js.Any], polar3 = polar3.asInstanceOf[js.Any], polar4 = polar4.asInstanceOf[js.Any], polar5 = polar5.asInstanceOf[js.Any], polar6 = polar6.asInstanceOf[js.Any], polar7 = polar7.asInstanceOf[js.Any], polar8 = polar8.asInstanceOf[js.Any], polar9 = polar9.asInstanceOf[js.Any], radialaxis = radialaxis.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], selectdirection = selectdirection.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any], showlegend = showlegend.asInstanceOf[js.Any], sliders = sliders.asInstanceOf[js.Any], subplot = subplot.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlefont = titlefont.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], xaxis2 = xaxis2.asInstanceOf[js.Any], xaxis3 = xaxis3.asInstanceOf[js.Any], xaxis4 = xaxis4.asInstanceOf[js.Any], xaxis5 = xaxis5.asInstanceOf[js.Any], xaxis6 = xaxis6.asInstanceOf[js.Any], xaxis7 = xaxis7.asInstanceOf[js.Any], xaxis8 = xaxis8.asInstanceOf[js.Any], xaxis9 = xaxis9.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any], yaxis2 = yaxis2.asInstanceOf[js.Any], yaxis3 = yaxis3.asInstanceOf[js.Any], yaxis4 = yaxis4.asInstanceOf[js.Any], yaxis5 = yaxis5.asInstanceOf[js.Any], yaxis6 = yaxis6.asInstanceOf[js.Any], yaxis7 = yaxis7.asInstanceOf[js.Any], yaxis8 = yaxis8.asInstanceOf[js.Any], yaxis9 = yaxis9.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.autorange")(xaxisDotautorange.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.range")(xaxisDotrange.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.title")(xaxisDottitle.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.type")(xaxisDottype.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.autorange")(yaxisDotautorange.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.range")(yaxisDotrange.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.title")(yaxisDottitle.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.type")(yaxisDottype.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.range[0]")(`xaxisDotrange[0]`.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.range[1]")(`xaxisDotrange[1]`.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.range[0]")(`yaxisDotrange[0]`.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.range[1]")(`yaxisDotrange[1]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
}

