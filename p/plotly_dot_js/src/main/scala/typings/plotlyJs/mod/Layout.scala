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
import typings.plotlyJs.anon.PartialModeBar
import typings.plotlyJs.anon.PartialPolarLayout
import typings.plotlyJs.anon.PartialScene
import typings.plotlyJs.anon.PartialShape
import typings.plotlyJs.anon.PartialSlider
import typings.plotlyJs.anon.PartialUpdateMenu
import typings.plotlyJs.anon.Partialrowsnumberroworder
import typings.plotlyJs.anon.PartialtextstringfontPart
import typings.plotlyJs.plotlyJsBooleans.`false`
import typings.plotlyJs.plotlyJsStrings._empty
import typings.plotlyJs.plotlyJsStrings.`x unified`
import typings.plotlyJs.plotlyJsStrings.`y unified`
import typings.plotlyJs.plotlyJsStrings.any
import typings.plotlyJs.plotlyJsStrings.closest
import typings.plotlyJs.plotlyJsStrings.d
import typings.plotlyJs.plotlyJsStrings.event
import typings.plotlyJs.plotlyJsStrings.eventPlussignselect
import typings.plotlyJs.plotlyJsStrings.fraction
import typings.plotlyJs.plotlyJsStrings.group
import typings.plotlyJs.plotlyJsStrings.h
import typings.plotlyJs.plotlyJsStrings.lasso
import typings.plotlyJs.plotlyJsStrings.none
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layout extends StObject {
  
  var annotations: js.Array[PartialAnnotationsAlign]
  
  var autosize: Boolean
  
  var bargap: Double
  
  var bargroupgap: Double
  
  var barmode: stack | group | overlay | relative
  
  var barnorm: _empty | fraction | percent
  
  var boxmode: group | overlay
  
  var calendar: Calendar
  
  var clickmode: event | select | eventPlussignselect | none
  
  var colorway: js.Array[String]
  
  var datarevision: Double | String
  
  // TODO
  var dragmode: zoom | pan | select | lasso | orbit | turntable | `false`
  
  var editrevision: Double | String
  
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
  
  var modebar: PartialModeBar
  
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
  
  var selectionrevision: Double | String
  
  var separators: String
  
  var shapes: js.Array[PartialShape]
  
  var showlegend: Boolean
  
  var sliders: js.Array[PartialSlider]
  
  var subplot: String
  
  var template: Template
  
  var title: String | PartialtextstringfontPart
  
  var titlefont: PartialFont
  
  var transition: Transition
  
  var uirevision: Double | String
  
  var updatemenus: js.Array[PartialUpdateMenu]
  
  var width: Double
  
  var xaxis: PartialLayoutAxisAnchor
  
  var xaxis2: PartialLayoutAxisAnchor
  
  var xaxis3: PartialLayoutAxisAnchor
  
  var xaxis4: PartialLayoutAxisAnchor
  
  var xaxis5: PartialLayoutAxisAnchor
  
  var xaxis6: PartialLayoutAxisAnchor
  
  var xaxis7: PartialLayoutAxisAnchor
  
  var xaxis8: PartialLayoutAxisAnchor
  
  var xaxis9: PartialLayoutAxisAnchor
  
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
  
  var yaxis: PartialLayoutAxisAnchor
  
  var yaxis2: PartialLayoutAxisAnchor
  
  var yaxis3: PartialLayoutAxisAnchor
  
  var yaxis4: PartialLayoutAxisAnchor
  
  var yaxis5: PartialLayoutAxisAnchor
  
  var yaxis6: PartialLayoutAxisAnchor
  
  var yaxis7: PartialLayoutAxisAnchor
  
  var yaxis8: PartialLayoutAxisAnchor
  
  var yaxis9: PartialLayoutAxisAnchor
  
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
  
  inline def apply(
    annotations: js.Array[PartialAnnotationsAlign],
    autosize: Boolean,
    bargap: Double,
    bargroupgap: Double,
    barmode: stack | group | overlay | relative,
    barnorm: _empty | fraction | percent,
    boxmode: group | overlay,
    calendar: Calendar,
    clickmode: event | select | eventPlussignselect | none,
    colorway: js.Array[String],
    datarevision: Double | String,
    dragmode: zoom | pan | select | lasso | orbit | turntable | `false`,
    editrevision: Double | String,
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
    modebar: PartialModeBar,
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
    selectionrevision: Double | String,
    separators: String,
    shapes: js.Array[PartialShape],
    showlegend: Boolean,
    sliders: js.Array[PartialSlider],
    subplot: String,
    template: Template,
    title: String | PartialtextstringfontPart,
    titlefont: PartialFont,
    transition: Transition,
    uirevision: Double | String,
    updatemenus: js.Array[PartialUpdateMenu],
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
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], autosize = autosize.asInstanceOf[js.Any], bargap = bargap.asInstanceOf[js.Any], bargroupgap = bargroupgap.asInstanceOf[js.Any], barmode = barmode.asInstanceOf[js.Any], barnorm = barnorm.asInstanceOf[js.Any], boxmode = boxmode.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], clickmode = clickmode.asInstanceOf[js.Any], colorway = colorway.asInstanceOf[js.Any], datarevision = datarevision.asInstanceOf[js.Any], dragmode = dragmode.asInstanceOf[js.Any], editrevision = editrevision.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hiddenlabels = hiddenlabels.asInstanceOf[js.Any], hidesources = hidesources.asInstanceOf[js.Any], hoverdistance = hoverdistance.asInstanceOf[js.Any], hoverlabel = hoverlabel.asInstanceOf[js.Any], hovermode = hovermode.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], mapbox = mapbox.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], modebar = modebar.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], paper_bgcolor = paper_bgcolor.asInstanceOf[js.Any], plot_bgcolor = plot_bgcolor.asInstanceOf[js.Any], polar = polar.asInstanceOf[js.Any], polar2 = polar2.asInstanceOf[js.Any], polar3 = polar3.asInstanceOf[js.Any], polar4 = polar4.asInstanceOf[js.Any], polar5 = polar5.asInstanceOf[js.Any], polar6 = polar6.asInstanceOf[js.Any], polar7 = polar7.asInstanceOf[js.Any], polar8 = polar8.asInstanceOf[js.Any], polar9 = polar9.asInstanceOf[js.Any], radialaxis = radialaxis.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], selectdirection = selectdirection.asInstanceOf[js.Any], selectionrevision = selectionrevision.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any], showlegend = showlegend.asInstanceOf[js.Any], sliders = sliders.asInstanceOf[js.Any], subplot = subplot.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlefont = titlefont.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], uirevision = uirevision.asInstanceOf[js.Any], updatemenus = updatemenus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], xaxis2 = xaxis2.asInstanceOf[js.Any], xaxis3 = xaxis3.asInstanceOf[js.Any], xaxis4 = xaxis4.asInstanceOf[js.Any], xaxis5 = xaxis5.asInstanceOf[js.Any], xaxis6 = xaxis6.asInstanceOf[js.Any], xaxis7 = xaxis7.asInstanceOf[js.Any], xaxis8 = xaxis8.asInstanceOf[js.Any], xaxis9 = xaxis9.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any], yaxis2 = yaxis2.asInstanceOf[js.Any], yaxis3 = yaxis3.asInstanceOf[js.Any], yaxis4 = yaxis4.asInstanceOf[js.Any], yaxis5 = yaxis5.asInstanceOf[js.Any], yaxis6 = yaxis6.asInstanceOf[js.Any], yaxis7 = yaxis7.asInstanceOf[js.Any], yaxis8 = yaxis8.asInstanceOf[js.Any], yaxis9 = yaxis9.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.autorange")(xaxisDotautorange.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.range")(xaxisDotrange.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.title")(xaxisDottitle.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.type")(xaxisDottype.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.autorange")(yaxisDotautorange.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.range")(yaxisDotrange.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.title")(yaxisDottitle.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.type")(yaxisDottype.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.range[0]")(null)
    __obj.updateDynamic("xaxis.range[1]")(null)
    __obj.updateDynamic("yaxis.range[0]")(null)
    __obj.updateDynamic("yaxis.range[1]")(null)
    __obj.asInstanceOf[Layout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: js.Array[PartialAnnotationsAlign]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsVarargs(value: PartialAnnotationsAlign*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setAutosize(value: Boolean): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
    
    inline def setBargap(value: Double): Self = StObject.set(x, "bargap", value.asInstanceOf[js.Any])
    
    inline def setBargroupgap(value: Double): Self = StObject.set(x, "bargroupgap", value.asInstanceOf[js.Any])
    
    inline def setBarmode(value: stack | group | overlay | relative): Self = StObject.set(x, "barmode", value.asInstanceOf[js.Any])
    
    inline def setBarnorm(value: _empty | fraction | percent): Self = StObject.set(x, "barnorm", value.asInstanceOf[js.Any])
    
    inline def setBoxmode(value: group | overlay): Self = StObject.set(x, "boxmode", value.asInstanceOf[js.Any])
    
    inline def setCalendar(value: Calendar): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setClickmode(value: event | select | eventPlussignselect | none): Self = StObject.set(x, "clickmode", value.asInstanceOf[js.Any])
    
    inline def setColorway(value: js.Array[String]): Self = StObject.set(x, "colorway", value.asInstanceOf[js.Any])
    
    inline def setColorwayVarargs(value: String*): Self = StObject.set(x, "colorway", js.Array(value*))
    
    inline def setDatarevision(value: Double | String): Self = StObject.set(x, "datarevision", value.asInstanceOf[js.Any])
    
    inline def setDragmode(value: zoom | pan | select | lasso | orbit | turntable | `false`): Self = StObject.set(x, "dragmode", value.asInstanceOf[js.Any])
    
    inline def setEditrevision(value: Double | String): Self = StObject.set(x, "editrevision", value.asInstanceOf[js.Any])
    
    inline def setFont(value: PartialFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setGrid(value: Partialrowsnumberroworder): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHiddenlabels(value: js.Array[String]): Self = StObject.set(x, "hiddenlabels", value.asInstanceOf[js.Any])
    
    inline def setHiddenlabelsVarargs(value: String*): Self = StObject.set(x, "hiddenlabels", js.Array(value*))
    
    inline def setHidesources(value: Boolean): Self = StObject.set(x, "hidesources", value.asInstanceOf[js.Any])
    
    inline def setHoverdistance(value: Double): Self = StObject.set(x, "hoverdistance", value.asInstanceOf[js.Any])
    
    inline def setHoverlabel(value: PartialHoverLabel): Self = StObject.set(x, "hoverlabel", value.asInstanceOf[js.Any])
    
    inline def setHovermode(value: closest | typings.plotlyJs.plotlyJsStrings.x | y | (`x unified`) | (`y unified`) | `false`): Self = StObject.set(x, "hovermode", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[PartialImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: PartialImage*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setLegend(value: PartialLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setMapbox(value: PartialMapbox): Self = StObject.set(x, "mapbox", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: PartialMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setModebar(value: PartialModeBar): Self = StObject.set(x, "modebar", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setPaper_bgcolor(value: Color): Self = StObject.set(x, "paper_bgcolor", value.asInstanceOf[js.Any])
    
    inline def setPaper_bgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "paper_bgcolor", js.Array(value*))
    
    inline def setPlot_bgcolor(value: Color): Self = StObject.set(x, "plot_bgcolor", value.asInstanceOf[js.Any])
    
    inline def setPlot_bgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "plot_bgcolor", js.Array(value*))
    
    inline def setPolar(value: PartialPolarLayout): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
    
    inline def setPolar2(value: PartialPolarLayout): Self = StObject.set(x, "polar2", value.asInstanceOf[js.Any])
    
    inline def setPolar3(value: PartialPolarLayout): Self = StObject.set(x, "polar3", value.asInstanceOf[js.Any])
    
    inline def setPolar4(value: PartialPolarLayout): Self = StObject.set(x, "polar4", value.asInstanceOf[js.Any])
    
    inline def setPolar5(value: PartialPolarLayout): Self = StObject.set(x, "polar5", value.asInstanceOf[js.Any])
    
    inline def setPolar6(value: PartialPolarLayout): Self = StObject.set(x, "polar6", value.asInstanceOf[js.Any])
    
    inline def setPolar7(value: PartialPolarLayout): Self = StObject.set(x, "polar7", value.asInstanceOf[js.Any])
    
    inline def setPolar8(value: PartialPolarLayout): Self = StObject.set(x, "polar8", value.asInstanceOf[js.Any])
    
    inline def setPolar9(value: PartialPolarLayout): Self = StObject.set(x, "polar9", value.asInstanceOf[js.Any])
    
    inline def setRadialaxis(value: PartialAxis): Self = StObject.set(x, "radialaxis", value.asInstanceOf[js.Any])
    
    inline def setScene(value: PartialScene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setSelectdirection(value: h | v | d | any): Self = StObject.set(x, "selectdirection", value.asInstanceOf[js.Any])
    
    inline def setSelectionrevision(value: Double | String): Self = StObject.set(x, "selectionrevision", value.asInstanceOf[js.Any])
    
    inline def setSeparators(value: String): Self = StObject.set(x, "separators", value.asInstanceOf[js.Any])
    
    inline def setShapes(value: js.Array[PartialShape]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    inline def setShapesVarargs(value: PartialShape*): Self = StObject.set(x, "shapes", js.Array(value*))
    
    inline def setShowlegend(value: Boolean): Self = StObject.set(x, "showlegend", value.asInstanceOf[js.Any])
    
    inline def setSliders(value: js.Array[PartialSlider]): Self = StObject.set(x, "sliders", value.asInstanceOf[js.Any])
    
    inline def setSlidersVarargs(value: PartialSlider*): Self = StObject.set(x, "sliders", js.Array(value*))
    
    inline def setSubplot(value: String): Self = StObject.set(x, "subplot", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: Template): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String | PartialtextstringfontPart): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitlefont(value: PartialFont): Self = StObject.set(x, "titlefont", value.asInstanceOf[js.Any])
    
    inline def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setUirevision(value: Double | String): Self = StObject.set(x, "uirevision", value.asInstanceOf[js.Any])
    
    inline def setUpdatemenus(value: js.Array[PartialUpdateMenu]): Self = StObject.set(x, "updatemenus", value.asInstanceOf[js.Any])
    
    inline def setUpdatemenusVarargs(value: PartialUpdateMenu*): Self = StObject.set(x, "updatemenus", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setXaxis(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    inline def setXaxis2(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "xaxis2", value.asInstanceOf[js.Any])
    
    inline def setXaxis3(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "xaxis3", value.asInstanceOf[js.Any])
    
    inline def setXaxis4(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "xaxis4", value.asInstanceOf[js.Any])
    
    inline def setXaxis5(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "xaxis5", value.asInstanceOf[js.Any])
    
    inline def setXaxis6(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "xaxis6", value.asInstanceOf[js.Any])
    
    inline def setXaxis7(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "xaxis7", value.asInstanceOf[js.Any])
    
    inline def setXaxis8(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "xaxis8", value.asInstanceOf[js.Any])
    
    inline def setXaxis9(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "xaxis9", value.asInstanceOf[js.Any])
    
    inline def setXaxisDotautorange(value: Boolean): Self = StObject.set(x, "xaxis.autorange", value.asInstanceOf[js.Any])
    
    inline def setXaxisDotrange(value: js.Tuple2[Datum, Datum]): Self = StObject.set(x, "xaxis.range", value.asInstanceOf[js.Any])
    
    inline def `setXaxisDotrange[0]`(value: Datum): Self = StObject.set(x, "xaxis.range[0]", value.asInstanceOf[js.Any])
    
    inline def `setXaxisDotrange[0]Null`: Self = StObject.set(x, "xaxis.range[0]", null)
    
    inline def `setXaxisDotrange[1]`(value: Datum): Self = StObject.set(x, "xaxis.range[1]", value.asInstanceOf[js.Any])
    
    inline def `setXaxisDotrange[1]Null`: Self = StObject.set(x, "xaxis.range[1]", null)
    
    inline def setXaxisDottitle(value: String): Self = StObject.set(x, "xaxis.title", value.asInstanceOf[js.Any])
    
    inline def setXaxisDottype(value: AxisType): Self = StObject.set(x, "xaxis.type", value.asInstanceOf[js.Any])
    
    inline def setYaxis(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
    
    inline def setYaxis2(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "yaxis2", value.asInstanceOf[js.Any])
    
    inline def setYaxis3(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "yaxis3", value.asInstanceOf[js.Any])
    
    inline def setYaxis4(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "yaxis4", value.asInstanceOf[js.Any])
    
    inline def setYaxis5(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "yaxis5", value.asInstanceOf[js.Any])
    
    inline def setYaxis6(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "yaxis6", value.asInstanceOf[js.Any])
    
    inline def setYaxis7(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "yaxis7", value.asInstanceOf[js.Any])
    
    inline def setYaxis8(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "yaxis8", value.asInstanceOf[js.Any])
    
    inline def setYaxis9(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "yaxis9", value.asInstanceOf[js.Any])
    
    inline def setYaxisDotautorange(value: Boolean): Self = StObject.set(x, "yaxis.autorange", value.asInstanceOf[js.Any])
    
    inline def setYaxisDotrange(value: js.Tuple2[Datum, Datum]): Self = StObject.set(x, "yaxis.range", value.asInstanceOf[js.Any])
    
    inline def `setYaxisDotrange[0]`(value: Datum): Self = StObject.set(x, "yaxis.range[0]", value.asInstanceOf[js.Any])
    
    inline def `setYaxisDotrange[0]Null`: Self = StObject.set(x, "yaxis.range[0]", null)
    
    inline def `setYaxisDotrange[1]`(value: Datum): Self = StObject.set(x, "yaxis.range[1]", value.asInstanceOf[js.Any])
    
    inline def `setYaxisDotrange[1]Null`: Self = StObject.set(x, "yaxis.range[1]", null)
    
    inline def setYaxisDottitle(value: String): Self = StObject.set(x, "yaxis.title", value.asInstanceOf[js.Any])
    
    inline def setYaxisDottype(value: AxisType): Self = StObject.set(x, "yaxis.type", value.asInstanceOf[js.Any])
  }
}
