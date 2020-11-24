package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialAnnotationsAlign
import typings.plotlyJs.anon.PartialAxis
import typings.plotlyJs.anon.PartialFont
import typings.plotlyJs.anon.PartialHoverLabel
import typings.plotlyJs.anon.PartialImage
import typings.plotlyJs.anon.PartialLayoutAxisAnchor
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layout extends js.Object {
  
  var annotations: js.Array[PartialAnnotationsAlign] = js.native
  
  var autosize: Boolean = js.native
  
  var bargap: Double = js.native
  
  var bargroupgap: Double = js.native
  
  var barmode: stack | group | overlay | relative = js.native
  
  var barnorm: _empty | fraction | percent = js.native
  
  var calendar: Calendar = js.native
  
  var colorway: js.Array[String] = js.native
  
   // TODO
  var dragmode: zoom | pan | select | lasso | orbit | turntable | `false` = js.native
  
  var font: PartialFont = js.native
  
  var grid: Partialrowsnumberroworder = js.native
  
  var height: Double = js.native
  
  var hiddenlabels: js.Array[String] = js.native
  
  var hidesources: Boolean = js.native
  
  var hoverdistance: Double = js.native
  
  var hoverlabel: PartialHoverLabel = js.native
  
  var hovermode: closest | x | y | (`x unified`) | (`y unified`) | `false` = js.native
  
  var images: js.Array[PartialImage] = js.native
  
  var legend: PartialLegend = js.native
  
   // TODO
  var mapbox: PartialMapbox = js.native
  
  var margin: PartialMargin = js.native
  
  var orientation: Double = js.native
  
  var paper_bgcolor: Color = js.native
  
  var plot_bgcolor: Color = js.native
  
  var polar: PartialPolarLayout = js.native
  
  var polar2: PartialPolarLayout = js.native
  
  var polar3: PartialPolarLayout = js.native
  
  var polar4: PartialPolarLayout = js.native
  
  var polar5: PartialPolarLayout = js.native
  
  var polar6: PartialPolarLayout = js.native
  
  var polar7: PartialPolarLayout = js.native
  
  var polar8: PartialPolarLayout = js.native
  
  var polar9: PartialPolarLayout = js.native
  
  var radialaxis: PartialAxis = js.native
  
  var scene: PartialScene = js.native
  
  var selectdirection: h | v | d | any = js.native
  
  var separators: String = js.native
  
  var shapes: js.Array[PartialShape] = js.native
  
  var showlegend: Boolean = js.native
  
   // TODO
  var sliders: js.Array[PartialSlider] = js.native
  
  var subplot: String = js.native
  
  var template: Template = js.native
  
  var title: String | PartialtextstringfontPart = js.native
  
  var titlefont: PartialFont = js.native
  
  var transition: Transition = js.native
  
  var width: Double = js.native
  
  var xaxis: PartialLayoutAxisAnchor = js.native
  
  var xaxis2: PartialLayoutAxisAnchor = js.native
  
  var xaxis3: PartialLayoutAxisAnchor = js.native
  
  var xaxis4: PartialLayoutAxisAnchor = js.native
  
  var xaxis5: PartialLayoutAxisAnchor = js.native
  
  var xaxis6: PartialLayoutAxisAnchor = js.native
  
  var xaxis7: PartialLayoutAxisAnchor = js.native
  
  var xaxis8: PartialLayoutAxisAnchor = js.native
  
  var xaxis9: PartialLayoutAxisAnchor = js.native
  
  @JSName("xaxis.autorange")
  var xaxisDotautorange: Boolean = js.native
  
  @JSName("xaxis.range")
  var xaxisDotrange: js.Tuple2[Datum, Datum] = js.native
  
  @JSName("xaxis.range[0]")
  var `xaxisDotrange[0]`: Datum = js.native
  
  @JSName("xaxis.range[1]")
  var `xaxisDotrange[1]`: Datum = js.native
  
  @JSName("xaxis.title")
  var xaxisDottitle: String = js.native
  
  @JSName("xaxis.type")
  var xaxisDottype: AxisType = js.native
  
  var yaxis: PartialLayoutAxisAnchor = js.native
  
  var yaxis2: PartialLayoutAxisAnchor = js.native
  
  var yaxis3: PartialLayoutAxisAnchor = js.native
  
  var yaxis4: PartialLayoutAxisAnchor = js.native
  
  var yaxis5: PartialLayoutAxisAnchor = js.native
  
  var yaxis6: PartialLayoutAxisAnchor = js.native
  
  var yaxis7: PartialLayoutAxisAnchor = js.native
  
  var yaxis8: PartialLayoutAxisAnchor = js.native
  
  var yaxis9: PartialLayoutAxisAnchor = js.native
  
  @JSName("yaxis.autorange")
  var yaxisDotautorange: Boolean = js.native
  
  @JSName("yaxis.range")
  var yaxisDotrange: js.Tuple2[Datum, Datum] = js.native
  
  @JSName("yaxis.range[0]")
  var `yaxisDotrange[0]`: Datum = js.native
  
  @JSName("yaxis.range[1]")
  var `yaxisDotrange[1]`: Datum = js.native
  
  @JSName("yaxis.title")
  var yaxisDottitle: String = js.native
  
  @JSName("yaxis.type")
  var yaxisDottype: AxisType = js.native
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
    template: Template,
    title: String | PartialtextstringfontPart,
    titlefont: PartialFont,
    transition: Transition,
    width: Double,
    xaxis: PartialLayoutAxisAnchor,
    xaxis2: PartialLayoutAxisAnchor,
    xaxis3: PartialLayoutAxisAnchor,
    xaxis4: PartialLayoutAxisAnchor,
    xaxis5: PartialLayoutAxisAnchor,
    xaxis6: PartialLayoutAxisAnchor,
    xaxis7: PartialLayoutAxisAnchor,
    xaxis8: PartialLayoutAxisAnchor,
    xaxis9: PartialLayoutAxisAnchor,
    xaxisDotautorange: Boolean,
    xaxisDotrange: js.Tuple2[Datum, Datum],
    xaxisDottitle: String,
    xaxisDottype: AxisType,
    yaxis: PartialLayoutAxisAnchor,
    yaxis2: PartialLayoutAxisAnchor,
    yaxis3: PartialLayoutAxisAnchor,
    yaxis4: PartialLayoutAxisAnchor,
    yaxis5: PartialLayoutAxisAnchor,
    yaxis6: PartialLayoutAxisAnchor,
    yaxis7: PartialLayoutAxisAnchor,
    yaxis8: PartialLayoutAxisAnchor,
    yaxis9: PartialLayoutAxisAnchor,
    yaxisDotautorange: Boolean,
    yaxisDotrange: js.Tuple2[Datum, Datum],
    yaxisDottitle: String,
    yaxisDottype: AxisType
  ): Layout = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], autosize = autosize.asInstanceOf[js.Any], bargap = bargap.asInstanceOf[js.Any], bargroupgap = bargroupgap.asInstanceOf[js.Any], barmode = barmode.asInstanceOf[js.Any], barnorm = barnorm.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], colorway = colorway.asInstanceOf[js.Any], dragmode = dragmode.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hiddenlabels = hiddenlabels.asInstanceOf[js.Any], hidesources = hidesources.asInstanceOf[js.Any], hoverdistance = hoverdistance.asInstanceOf[js.Any], hoverlabel = hoverlabel.asInstanceOf[js.Any], hovermode = hovermode.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], mapbox = mapbox.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], paper_bgcolor = paper_bgcolor.asInstanceOf[js.Any], plot_bgcolor = plot_bgcolor.asInstanceOf[js.Any], polar = polar.asInstanceOf[js.Any], polar2 = polar2.asInstanceOf[js.Any], polar3 = polar3.asInstanceOf[js.Any], polar4 = polar4.asInstanceOf[js.Any], polar5 = polar5.asInstanceOf[js.Any], polar6 = polar6.asInstanceOf[js.Any], polar7 = polar7.asInstanceOf[js.Any], polar8 = polar8.asInstanceOf[js.Any], polar9 = polar9.asInstanceOf[js.Any], radialaxis = radialaxis.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], selectdirection = selectdirection.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any], showlegend = showlegend.asInstanceOf[js.Any], sliders = sliders.asInstanceOf[js.Any], subplot = subplot.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlefont = titlefont.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], xaxis2 = xaxis2.asInstanceOf[js.Any], xaxis3 = xaxis3.asInstanceOf[js.Any], xaxis4 = xaxis4.asInstanceOf[js.Any], xaxis5 = xaxis5.asInstanceOf[js.Any], xaxis6 = xaxis6.asInstanceOf[js.Any], xaxis7 = xaxis7.asInstanceOf[js.Any], xaxis8 = xaxis8.asInstanceOf[js.Any], xaxis9 = xaxis9.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any], yaxis2 = yaxis2.asInstanceOf[js.Any], yaxis3 = yaxis3.asInstanceOf[js.Any], yaxis4 = yaxis4.asInstanceOf[js.Any], yaxis5 = yaxis5.asInstanceOf[js.Any], yaxis6 = yaxis6.asInstanceOf[js.Any], yaxis7 = yaxis7.asInstanceOf[js.Any], yaxis8 = yaxis8.asInstanceOf[js.Any], yaxis9 = yaxis9.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.autorange")(xaxisDotautorange.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.range")(xaxisDotrange.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.title")(xaxisDottitle.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.type")(xaxisDottype.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.autorange")(yaxisDotautorange.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.range")(yaxisDotrange.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.title")(yaxisDottitle.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.type")(yaxisDottype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  
  @scala.inline
  implicit class LayoutOps[Self <: Layout] (val x: Self) extends AnyVal {
    
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
    def setAnnotationsVarargs(value: PartialAnnotationsAlign*): Self = this.set("annotations", js.Array(value :_*))
    
    @scala.inline
    def setAnnotations(value: js.Array[PartialAnnotationsAlign]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutosize(value: Boolean): Self = this.set("autosize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBargap(value: Double): Self = this.set("bargap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBargroupgap(value: Double): Self = this.set("bargroupgap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarmode(value: stack | group | overlay | relative): Self = this.set("barmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarnorm(value: _empty | fraction | percent): Self = this.set("barnorm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendar(value: Calendar): Self = this.set("calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorwayVarargs(value: String*): Self = this.set("colorway", js.Array(value :_*))
    
    @scala.inline
    def setColorway(value: js.Array[String]): Self = this.set("colorway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragmode(value: zoom | pan | select | lasso | orbit | turntable | `false`): Self = this.set("dragmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: PartialFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrid(value: Partialrowsnumberroworder): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenlabelsVarargs(value: String*): Self = this.set("hiddenlabels", js.Array(value :_*))
    
    @scala.inline
    def setHiddenlabels(value: js.Array[String]): Self = this.set("hiddenlabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidesources(value: Boolean): Self = this.set("hidesources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverdistance(value: Double): Self = this.set("hoverdistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverlabel(value: PartialHoverLabel): Self = this.set("hoverlabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHovermode(value: closest | typings.plotlyJs.plotlyJsStrings.x | y | (`x unified`) | (`y unified`) | `false`): Self = this.set("hovermode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: PartialImage*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[PartialImage]): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegend(value: PartialLegend): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapbox(value: PartialMapbox): Self = this.set("mapbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargin(value: PartialMargin): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: Double): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaper_bgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("paper_bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setPaper_bgcolor(value: Color): Self = this.set("paper_bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlot_bgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("plot_bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setPlot_bgcolor(value: Color): Self = this.set("plot_bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolar(value: PartialPolarLayout): Self = this.set("polar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolar2(value: PartialPolarLayout): Self = this.set("polar2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolar3(value: PartialPolarLayout): Self = this.set("polar3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolar4(value: PartialPolarLayout): Self = this.set("polar4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolar5(value: PartialPolarLayout): Self = this.set("polar5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolar6(value: PartialPolarLayout): Self = this.set("polar6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolar7(value: PartialPolarLayout): Self = this.set("polar7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolar8(value: PartialPolarLayout): Self = this.set("polar8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolar9(value: PartialPolarLayout): Self = this.set("polar9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadialaxis(value: PartialAxis): Self = this.set("radialaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScene(value: PartialScene): Self = this.set("scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectdirection(value: h | v | d | any): Self = this.set("selectdirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparators(value: String): Self = this.set("separators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapesVarargs(value: PartialShape*): Self = this.set("shapes", js.Array(value :_*))
    
    @scala.inline
    def setShapes(value: js.Array[PartialShape]): Self = this.set("shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowlegend(value: Boolean): Self = this.set("showlegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidersVarargs(value: PartialSlider*): Self = this.set("sliders", js.Array(value :_*))
    
    @scala.inline
    def setSliders(value: js.Array[PartialSlider]): Self = this.set("sliders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubplot(value: String): Self = this.set("subplot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: Template): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String | PartialtextstringfontPart): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlefont(value: PartialFont): Self = this.set("titlefont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransition(value: Transition): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxis(value: PartialLayoutAxisAnchor): Self = this.set("xaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxis2(value: PartialLayoutAxisAnchor): Self = this.set("xaxis2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxis3(value: PartialLayoutAxisAnchor): Self = this.set("xaxis3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxis4(value: PartialLayoutAxisAnchor): Self = this.set("xaxis4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxis5(value: PartialLayoutAxisAnchor): Self = this.set("xaxis5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxis6(value: PartialLayoutAxisAnchor): Self = this.set("xaxis6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxis7(value: PartialLayoutAxisAnchor): Self = this.set("xaxis7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxis8(value: PartialLayoutAxisAnchor): Self = this.set("xaxis8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxis9(value: PartialLayoutAxisAnchor): Self = this.set("xaxis9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxisDotautorange(value: Boolean): Self = this.set("xaxis.autorange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxisDotrange(value: js.Tuple2[Datum, Datum]): Self = this.set("xaxis.range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxisDottitle(value: String): Self = this.set("xaxis.title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxisDottype(value: AxisType): Self = this.set("xaxis.type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxis(value: PartialLayoutAxisAnchor): Self = this.set("yaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxis2(value: PartialLayoutAxisAnchor): Self = this.set("yaxis2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxis3(value: PartialLayoutAxisAnchor): Self = this.set("yaxis3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxis4(value: PartialLayoutAxisAnchor): Self = this.set("yaxis4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxis5(value: PartialLayoutAxisAnchor): Self = this.set("yaxis5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxis6(value: PartialLayoutAxisAnchor): Self = this.set("yaxis6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxis7(value: PartialLayoutAxisAnchor): Self = this.set("yaxis7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxis8(value: PartialLayoutAxisAnchor): Self = this.set("yaxis8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxis9(value: PartialLayoutAxisAnchor): Self = this.set("yaxis9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxisDotautorange(value: Boolean): Self = this.set("yaxis.autorange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxisDotrange(value: js.Tuple2[Datum, Datum]): Self = this.set("yaxis.range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxisDottitle(value: String): Self = this.set("yaxis.title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxisDottype(value: AxisType): Self = this.set("yaxis.type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setXaxisDotrange[0]`(value: Datum): Self = this.set("xaxis.range[0]", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setXaxisDotrange[0]Null`: Self = this.set("xaxis.range[0]", null)
    
    @scala.inline
    def `setXaxisDotrange[1]`(value: Datum): Self = this.set("xaxis.range[1]", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setXaxisDotrange[1]Null`: Self = this.set("xaxis.range[1]", null)
    
    @scala.inline
    def `setYaxisDotrange[0]`(value: Datum): Self = this.set("yaxis.range[0]", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setYaxisDotrange[0]Null`: Self = this.set("yaxis.range[0]", null)
    
    @scala.inline
    def `setYaxisDotrange[1]`(value: Datum): Self = this.set("yaxis.range[1]", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setYaxisDotrange[1]Null`: Self = this.set("yaxis.range[1]", null)
  }
}
