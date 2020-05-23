package typings.plotlyJs.anon

import typings.plotlyJs.mod.AxisType
import typings.plotlyJs.mod.Calendar
import typings.plotlyJs.mod.Datum
import typings.plotlyJs.mod.Transition
import typings.plotlyJs.plotlyJsBooleans.`false`
import typings.plotlyJs.plotlyJsNumbers.`0`
import typings.plotlyJs.plotlyJsNumbers.`1`
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

/* Inlined std.Partial<plotly.js.plotly.js.Layout> */
trait PartialLayout extends js.Object {
  var angularaxis: js.UndefOr[js.Object] = js.undefined
  var annotations: js.UndefOr[js.Array[PartialAnnotations]] = js.undefined
  var autosize: js.UndefOr[Boolean] = js.undefined
  var bargap: js.UndefOr[`0` | `1`] = js.undefined
  var bargroupgap: js.UndefOr[`0` | `1`] = js.undefined
  var barmode: js.UndefOr[stack | group | overlay | relative] = js.undefined
  var barnorm: js.UndefOr[_empty | fraction | percent] = js.undefined
  var calendar: js.UndefOr[Calendar] = js.undefined
  var colorway: js.UndefOr[js.Array[String]] = js.undefined
  var dragmode: js.UndefOr[zoom | pan | select | lasso | orbit | turntable | `false`] = js.undefined
  var font: js.UndefOr[PartialFont] = js.undefined
  var geo: js.UndefOr[js.Object] = js.undefined
  var grid: js.UndefOr[Partialrowsnumberroworder] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hiddenlabels: js.UndefOr[js.Array[String]] = js.undefined
  var hidesources: js.UndefOr[Boolean] = js.undefined
  var hoverdistance: js.UndefOr[Double] = js.undefined
  var hoverlabel: js.UndefOr[PartialHoverLabel] = js.undefined
  var hovermode: js.UndefOr[closest | x | y | (`x unified`) | (`y unified`) | `false`] = js.undefined
  var images: js.UndefOr[js.Array[PartialImage]] = js.undefined
  var legend: js.UndefOr[PartialLegend] = js.undefined
  var mapbox: js.UndefOr[PartialMapboxAccesstoken] = js.undefined
  var margin: js.UndefOr[PartialMargin] = js.undefined
  var orientation: js.UndefOr[Double] = js.undefined
  var paper_bgcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  var plot_bgcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  var polar: js.UndefOr[PartialPolarLayoutAngularaxis] = js.undefined
  var polar2: js.UndefOr[PartialPolarLayoutAngularaxis] = js.undefined
  var polar3: js.UndefOr[PartialPolarLayoutAngularaxis] = js.undefined
  var polar4: js.UndefOr[PartialPolarLayoutAngularaxis] = js.undefined
  var polar5: js.UndefOr[PartialPolarLayoutAngularaxis] = js.undefined
  var polar6: js.UndefOr[PartialPolarLayoutAngularaxis] = js.undefined
  var polar7: js.UndefOr[PartialPolarLayoutAngularaxis] = js.undefined
  var polar8: js.UndefOr[PartialPolarLayoutAngularaxis] = js.undefined
  var polar9: js.UndefOr[PartialPolarLayoutAngularaxis] = js.undefined
  var radialaxis: js.UndefOr[PartialAxisAutorange] = js.undefined
  var scene: js.UndefOr[PartialSceneAnnotations] = js.undefined
  var selectdirection: js.UndefOr[h | v | d | any] = js.undefined
  var separators: js.UndefOr[String] = js.undefined
  var shapes: js.UndefOr[js.Array[PartialShape]] = js.undefined
  var showlegend: js.UndefOr[Boolean] = js.undefined
  var sliders: js.UndefOr[js.Array[PartialSliderActive]] = js.undefined
  var subplot: js.UndefOr[String] = js.undefined
  var ternary: js.UndefOr[js.Object] = js.undefined
  var title: js.UndefOr[String | PartialtextstringfontPart] = js.undefined
  var titlefont: js.UndefOr[PartialFont] = js.undefined
  var transition: js.UndefOr[Transition] = js.undefined
  var updatemenus: js.UndefOr[js.Object] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var xaxis: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var xaxis2: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var xaxis3: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var xaxis4: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var xaxis5: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var xaxis6: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var xaxis7: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var xaxis8: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var xaxis9: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  @JSName("xaxis.autorange")
  var xaxisDotautorange: js.UndefOr[Boolean] = js.undefined
  @JSName("xaxis.range")
  var xaxisDotrange: js.UndefOr[js.Tuple2[Datum, Datum]] = js.undefined
  @JSName("xaxis.range[0]")
  var `xaxisDotrange[0]`: js.UndefOr[Datum] = js.undefined
  @JSName("xaxis.range[1]")
  var `xaxisDotrange[1]`: js.UndefOr[Datum] = js.undefined
  @JSName("xaxis.title")
  var xaxisDottitle: js.UndefOr[String] = js.undefined
  @JSName("xaxis.type")
  var xaxisDottype: js.UndefOr[AxisType] = js.undefined
  var yaxis: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var yaxis2: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var yaxis3: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var yaxis4: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var yaxis5: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var yaxis6: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var yaxis7: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var yaxis8: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var yaxis9: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  @JSName("yaxis.autorange")
  var yaxisDotautorange: js.UndefOr[Boolean] = js.undefined
  @JSName("yaxis.range")
  var yaxisDotrange: js.UndefOr[js.Tuple2[Datum, Datum]] = js.undefined
  @JSName("yaxis.range[0]")
  var `yaxisDotrange[0]`: js.UndefOr[Datum] = js.undefined
  @JSName("yaxis.range[1]")
  var `yaxisDotrange[1]`: js.UndefOr[Datum] = js.undefined
  @JSName("yaxis.title")
  var yaxisDottitle: js.UndefOr[String] = js.undefined
  @JSName("yaxis.type")
  var yaxisDottype: js.UndefOr[AxisType] = js.undefined
}

object PartialLayout {
  @scala.inline
  def apply(
    angularaxis: js.Object = null,
    annotations: js.Array[PartialAnnotations] = null,
    autosize: js.UndefOr[Boolean] = js.undefined,
    bargap: `0` | `1` = null,
    bargroupgap: `0` | `1` = null,
    barmode: stack | group | overlay | relative = null,
    barnorm: _empty | fraction | percent = null,
    calendar: Calendar = null,
    colorway: js.Array[String] = null,
    dragmode: zoom | pan | select | lasso | orbit | turntable | `false` = null,
    font: PartialFont = null,
    geo: js.Object = null,
    grid: Partialrowsnumberroworder = null,
    height: js.UndefOr[Double] = js.undefined,
    hiddenlabels: js.Array[String] = null,
    hidesources: js.UndefOr[Boolean] = js.undefined,
    hoverdistance: js.UndefOr[Double] = js.undefined,
    hoverlabel: PartialHoverLabel = null,
    hovermode: closest | x | y | (`x unified`) | (`y unified`) | `false` = null,
    images: js.Array[PartialImage] = null,
    legend: PartialLegend = null,
    mapbox: PartialMapboxAccesstoken = null,
    margin: PartialMargin = null,
    orientation: js.UndefOr[Double] = js.undefined,
    paper_bgcolor: typings.plotlyJs.mod.Color = null,
    plot_bgcolor: typings.plotlyJs.mod.Color = null,
    polar: PartialPolarLayoutAngularaxis = null,
    polar2: PartialPolarLayoutAngularaxis = null,
    polar3: PartialPolarLayoutAngularaxis = null,
    polar4: PartialPolarLayoutAngularaxis = null,
    polar5: PartialPolarLayoutAngularaxis = null,
    polar6: PartialPolarLayoutAngularaxis = null,
    polar7: PartialPolarLayoutAngularaxis = null,
    polar8: PartialPolarLayoutAngularaxis = null,
    polar9: PartialPolarLayoutAngularaxis = null,
    radialaxis: PartialAxisAutorange = null,
    scene: PartialSceneAnnotations = null,
    selectdirection: h | v | d | any = null,
    separators: String = null,
    shapes: js.Array[PartialShape] = null,
    showlegend: js.UndefOr[Boolean] = js.undefined,
    sliders: js.Array[PartialSliderActive] = null,
    subplot: String = null,
    ternary: js.Object = null,
    title: String | PartialtextstringfontPart = null,
    titlefont: PartialFont = null,
    transition: Transition = null,
    updatemenus: js.Object = null,
    width: js.UndefOr[Double] = js.undefined,
    xaxis: PartialLayoutAxisAnchor = null,
    xaxis2: PartialLayoutAxisAnchor = null,
    xaxis3: PartialLayoutAxisAnchor = null,
    xaxis4: PartialLayoutAxisAnchor = null,
    xaxis5: PartialLayoutAxisAnchor = null,
    xaxis6: PartialLayoutAxisAnchor = null,
    xaxis7: PartialLayoutAxisAnchor = null,
    xaxis8: PartialLayoutAxisAnchor = null,
    xaxis9: PartialLayoutAxisAnchor = null,
    xaxisDotautorange: js.UndefOr[Boolean] = js.undefined,
    xaxisDotrange: js.Tuple2[Datum, Datum] = null,
    `xaxisDotrange[0]`: js.UndefOr[Null | Datum] = js.undefined,
    `xaxisDotrange[1]`: js.UndefOr[Null | Datum] = js.undefined,
    xaxisDottitle: String = null,
    xaxisDottype: AxisType = null,
    yaxis: PartialLayoutAxisAnchor = null,
    yaxis2: PartialLayoutAxisAnchor = null,
    yaxis3: PartialLayoutAxisAnchor = null,
    yaxis4: PartialLayoutAxisAnchor = null,
    yaxis5: PartialLayoutAxisAnchor = null,
    yaxis6: PartialLayoutAxisAnchor = null,
    yaxis7: PartialLayoutAxisAnchor = null,
    yaxis8: PartialLayoutAxisAnchor = null,
    yaxis9: PartialLayoutAxisAnchor = null,
    yaxisDotautorange: js.UndefOr[Boolean] = js.undefined,
    yaxisDotrange: js.Tuple2[Datum, Datum] = null,
    `yaxisDotrange[0]`: js.UndefOr[Null | Datum] = js.undefined,
    `yaxisDotrange[1]`: js.UndefOr[Null | Datum] = js.undefined,
    yaxisDottitle: String = null,
    yaxisDottype: AxisType = null
  ): PartialLayout = {
    val __obj = js.Dynamic.literal()
    if (angularaxis != null) __obj.updateDynamic("angularaxis")(angularaxis.asInstanceOf[js.Any])
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (!js.isUndefined(autosize)) __obj.updateDynamic("autosize")(autosize.get.asInstanceOf[js.Any])
    if (bargap != null) __obj.updateDynamic("bargap")(bargap.asInstanceOf[js.Any])
    if (bargroupgap != null) __obj.updateDynamic("bargroupgap")(bargroupgap.asInstanceOf[js.Any])
    if (barmode != null) __obj.updateDynamic("barmode")(barmode.asInstanceOf[js.Any])
    if (barnorm != null) __obj.updateDynamic("barnorm")(barnorm.asInstanceOf[js.Any])
    if (calendar != null) __obj.updateDynamic("calendar")(calendar.asInstanceOf[js.Any])
    if (colorway != null) __obj.updateDynamic("colorway")(colorway.asInstanceOf[js.Any])
    if (dragmode != null) __obj.updateDynamic("dragmode")(dragmode.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (geo != null) __obj.updateDynamic("geo")(geo.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (hiddenlabels != null) __obj.updateDynamic("hiddenlabels")(hiddenlabels.asInstanceOf[js.Any])
    if (!js.isUndefined(hidesources)) __obj.updateDynamic("hidesources")(hidesources.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverdistance)) __obj.updateDynamic("hoverdistance")(hoverdistance.get.asInstanceOf[js.Any])
    if (hoverlabel != null) __obj.updateDynamic("hoverlabel")(hoverlabel.asInstanceOf[js.Any])
    if (hovermode != null) __obj.updateDynamic("hovermode")(hovermode.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (mapbox != null) __obj.updateDynamic("mapbox")(mapbox.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(orientation)) __obj.updateDynamic("orientation")(orientation.get.asInstanceOf[js.Any])
    if (paper_bgcolor != null) __obj.updateDynamic("paper_bgcolor")(paper_bgcolor.asInstanceOf[js.Any])
    if (plot_bgcolor != null) __obj.updateDynamic("plot_bgcolor")(plot_bgcolor.asInstanceOf[js.Any])
    if (polar != null) __obj.updateDynamic("polar")(polar.asInstanceOf[js.Any])
    if (polar2 != null) __obj.updateDynamic("polar2")(polar2.asInstanceOf[js.Any])
    if (polar3 != null) __obj.updateDynamic("polar3")(polar3.asInstanceOf[js.Any])
    if (polar4 != null) __obj.updateDynamic("polar4")(polar4.asInstanceOf[js.Any])
    if (polar5 != null) __obj.updateDynamic("polar5")(polar5.asInstanceOf[js.Any])
    if (polar6 != null) __obj.updateDynamic("polar6")(polar6.asInstanceOf[js.Any])
    if (polar7 != null) __obj.updateDynamic("polar7")(polar7.asInstanceOf[js.Any])
    if (polar8 != null) __obj.updateDynamic("polar8")(polar8.asInstanceOf[js.Any])
    if (polar9 != null) __obj.updateDynamic("polar9")(polar9.asInstanceOf[js.Any])
    if (radialaxis != null) __obj.updateDynamic("radialaxis")(radialaxis.asInstanceOf[js.Any])
    if (scene != null) __obj.updateDynamic("scene")(scene.asInstanceOf[js.Any])
    if (selectdirection != null) __obj.updateDynamic("selectdirection")(selectdirection.asInstanceOf[js.Any])
    if (separators != null) __obj.updateDynamic("separators")(separators.asInstanceOf[js.Any])
    if (shapes != null) __obj.updateDynamic("shapes")(shapes.asInstanceOf[js.Any])
    if (!js.isUndefined(showlegend)) __obj.updateDynamic("showlegend")(showlegend.get.asInstanceOf[js.Any])
    if (sliders != null) __obj.updateDynamic("sliders")(sliders.asInstanceOf[js.Any])
    if (subplot != null) __obj.updateDynamic("subplot")(subplot.asInstanceOf[js.Any])
    if (ternary != null) __obj.updateDynamic("ternary")(ternary.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titlefont != null) __obj.updateDynamic("titlefont")(titlefont.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (updatemenus != null) __obj.updateDynamic("updatemenus")(updatemenus.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (xaxis != null) __obj.updateDynamic("xaxis")(xaxis.asInstanceOf[js.Any])
    if (xaxis2 != null) __obj.updateDynamic("xaxis2")(xaxis2.asInstanceOf[js.Any])
    if (xaxis3 != null) __obj.updateDynamic("xaxis3")(xaxis3.asInstanceOf[js.Any])
    if (xaxis4 != null) __obj.updateDynamic("xaxis4")(xaxis4.asInstanceOf[js.Any])
    if (xaxis5 != null) __obj.updateDynamic("xaxis5")(xaxis5.asInstanceOf[js.Any])
    if (xaxis6 != null) __obj.updateDynamic("xaxis6")(xaxis6.asInstanceOf[js.Any])
    if (xaxis7 != null) __obj.updateDynamic("xaxis7")(xaxis7.asInstanceOf[js.Any])
    if (xaxis8 != null) __obj.updateDynamic("xaxis8")(xaxis8.asInstanceOf[js.Any])
    if (xaxis9 != null) __obj.updateDynamic("xaxis9")(xaxis9.asInstanceOf[js.Any])
    if (!js.isUndefined(xaxisDotautorange)) __obj.updateDynamic("xaxis.autorange")(xaxisDotautorange.get.asInstanceOf[js.Any])
    if (xaxisDotrange != null) __obj.updateDynamic("xaxis.range")(xaxisDotrange.asInstanceOf[js.Any])
    if (!js.isUndefined(`xaxisDotrange[0]`)) __obj.updateDynamic("xaxis.range[0]")(`xaxisDotrange[0]`.asInstanceOf[js.Any])
    if (!js.isUndefined(`xaxisDotrange[1]`)) __obj.updateDynamic("xaxis.range[1]")(`xaxisDotrange[1]`.asInstanceOf[js.Any])
    if (xaxisDottitle != null) __obj.updateDynamic("xaxis.title")(xaxisDottitle.asInstanceOf[js.Any])
    if (xaxisDottype != null) __obj.updateDynamic("xaxis.type")(xaxisDottype.asInstanceOf[js.Any])
    if (yaxis != null) __obj.updateDynamic("yaxis")(yaxis.asInstanceOf[js.Any])
    if (yaxis2 != null) __obj.updateDynamic("yaxis2")(yaxis2.asInstanceOf[js.Any])
    if (yaxis3 != null) __obj.updateDynamic("yaxis3")(yaxis3.asInstanceOf[js.Any])
    if (yaxis4 != null) __obj.updateDynamic("yaxis4")(yaxis4.asInstanceOf[js.Any])
    if (yaxis5 != null) __obj.updateDynamic("yaxis5")(yaxis5.asInstanceOf[js.Any])
    if (yaxis6 != null) __obj.updateDynamic("yaxis6")(yaxis6.asInstanceOf[js.Any])
    if (yaxis7 != null) __obj.updateDynamic("yaxis7")(yaxis7.asInstanceOf[js.Any])
    if (yaxis8 != null) __obj.updateDynamic("yaxis8")(yaxis8.asInstanceOf[js.Any])
    if (yaxis9 != null) __obj.updateDynamic("yaxis9")(yaxis9.asInstanceOf[js.Any])
    if (!js.isUndefined(yaxisDotautorange)) __obj.updateDynamic("yaxis.autorange")(yaxisDotautorange.get.asInstanceOf[js.Any])
    if (yaxisDotrange != null) __obj.updateDynamic("yaxis.range")(yaxisDotrange.asInstanceOf[js.Any])
    if (!js.isUndefined(`yaxisDotrange[0]`)) __obj.updateDynamic("yaxis.range[0]")(`yaxisDotrange[0]`.asInstanceOf[js.Any])
    if (!js.isUndefined(`yaxisDotrange[1]`)) __obj.updateDynamic("yaxis.range[1]")(`yaxisDotrange[1]`.asInstanceOf[js.Any])
    if (yaxisDottitle != null) __obj.updateDynamic("yaxis.title")(yaxisDottitle.asInstanceOf[js.Any])
    if (yaxisDottype != null) __obj.updateDynamic("yaxis.type")(yaxisDottype.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLayout]
  }
}

