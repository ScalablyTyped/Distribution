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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<plotly.js.plotly.js.Layout> */
trait PlotRelayoutEvent extends StObject {
  
  var angularaxis: js.UndefOr[js.Object] = js.undefined
  
  var annotations: js.UndefOr[js.Array[PartialAnnotationsAlign]] = js.undefined
  
  var autosize: js.UndefOr[Boolean] = js.undefined
  
  var bargap: js.UndefOr[Double] = js.undefined
  
  var bargroupgap: js.UndefOr[Double] = js.undefined
  
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
  
  var mapbox: js.UndefOr[PartialMapbox] = js.undefined
  
  var margin: js.UndefOr[PartialMargin] = js.undefined
  
  var orientation: js.UndefOr[Double] = js.undefined
  
  var paper_bgcolor: js.UndefOr[Color] = js.undefined
  
  var plot_bgcolor: js.UndefOr[Color] = js.undefined
  
  var polar: js.UndefOr[PartialPolarLayout] = js.undefined
  
  var polar2: js.UndefOr[PartialPolarLayout] = js.undefined
  
  var polar3: js.UndefOr[PartialPolarLayout] = js.undefined
  
  var polar4: js.UndefOr[PartialPolarLayout] = js.undefined
  
  var polar5: js.UndefOr[PartialPolarLayout] = js.undefined
  
  var polar6: js.UndefOr[PartialPolarLayout] = js.undefined
  
  var polar7: js.UndefOr[PartialPolarLayout] = js.undefined
  
  var polar8: js.UndefOr[PartialPolarLayout] = js.undefined
  
  var polar9: js.UndefOr[PartialPolarLayout] = js.undefined
  
  var radialaxis: js.UndefOr[PartialAxis] = js.undefined
  
  var scene: js.UndefOr[PartialScene] = js.undefined
  
  var selectdirection: js.UndefOr[h | v | d | any] = js.undefined
  
  var separators: js.UndefOr[String] = js.undefined
  
  var shapes: js.UndefOr[js.Array[PartialShape]] = js.undefined
  
  var showlegend: js.UndefOr[Boolean] = js.undefined
  
  var sliders: js.UndefOr[js.Array[PartialSlider]] = js.undefined
  
  var subplot: js.UndefOr[String] = js.undefined
  
  var template: js.UndefOr[Template] = js.undefined
  
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
  var `xaxisDotrange[0]`: js.UndefOr[Double] = js.undefined
  
  @JSName("xaxis.range[1]")
  var `xaxisDotrange[1]`: js.UndefOr[Double] = js.undefined
  
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
  var `yaxisDotrange[0]`: js.UndefOr[Double] = js.undefined
  
  @JSName("yaxis.range[1]")
  var `yaxisDotrange[1]`: js.UndefOr[Double] = js.undefined
  
  @JSName("yaxis.title")
  var yaxisDottitle: js.UndefOr[String] = js.undefined
  
  @JSName("yaxis.type")
  var yaxisDottype: js.UndefOr[AxisType] = js.undefined
}
object PlotRelayoutEvent {
  
  @scala.inline
  def apply(): PlotRelayoutEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotRelayoutEvent]
  }
  
  @scala.inline
  implicit class PlotRelayoutEventMutableBuilder[Self <: PlotRelayoutEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngularaxis(value: js.Object): Self = StObject.set(x, "angularaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularaxisUndefined: Self = StObject.set(x, "angularaxis", js.undefined)
    
    @scala.inline
    def setAnnotations(value: js.Array[PartialAnnotationsAlign]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: PartialAnnotationsAlign*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    @scala.inline
    def setAutosize(value: Boolean): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutosizeUndefined: Self = StObject.set(x, "autosize", js.undefined)
    
    @scala.inline
    def setBargap(value: Double): Self = StObject.set(x, "bargap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBargapUndefined: Self = StObject.set(x, "bargap", js.undefined)
    
    @scala.inline
    def setBargroupgap(value: Double): Self = StObject.set(x, "bargroupgap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBargroupgapUndefined: Self = StObject.set(x, "bargroupgap", js.undefined)
    
    @scala.inline
    def setBarmode(value: stack | group | overlay | relative): Self = StObject.set(x, "barmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarmodeUndefined: Self = StObject.set(x, "barmode", js.undefined)
    
    @scala.inline
    def setBarnorm(value: _empty | fraction | percent): Self = StObject.set(x, "barnorm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarnormUndefined: Self = StObject.set(x, "barnorm", js.undefined)
    
    @scala.inline
    def setCalendar(value: Calendar): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    @scala.inline
    def setColorway(value: js.Array[String]): Self = StObject.set(x, "colorway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorwayUndefined: Self = StObject.set(x, "colorway", js.undefined)
    
    @scala.inline
    def setColorwayVarargs(value: String*): Self = StObject.set(x, "colorway", js.Array(value :_*))
    
    @scala.inline
    def setDragmode(value: zoom | pan | select | lasso | orbit | turntable | `false`): Self = StObject.set(x, "dragmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragmodeUndefined: Self = StObject.set(x, "dragmode", js.undefined)
    
    @scala.inline
    def setFont(value: PartialFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setGeo(value: js.Object): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
    
    @scala.inline
    def setGrid(value: Partialrowsnumberroworder): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHiddenlabels(value: js.Array[String]): Self = StObject.set(x, "hiddenlabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenlabelsUndefined: Self = StObject.set(x, "hiddenlabels", js.undefined)
    
    @scala.inline
    def setHiddenlabelsVarargs(value: String*): Self = StObject.set(x, "hiddenlabels", js.Array(value :_*))
    
    @scala.inline
    def setHidesources(value: Boolean): Self = StObject.set(x, "hidesources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidesourcesUndefined: Self = StObject.set(x, "hidesources", js.undefined)
    
    @scala.inline
    def setHoverdistance(value: Double): Self = StObject.set(x, "hoverdistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverdistanceUndefined: Self = StObject.set(x, "hoverdistance", js.undefined)
    
    @scala.inline
    def setHoverlabel(value: PartialHoverLabel): Self = StObject.set(x, "hoverlabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverlabelUndefined: Self = StObject.set(x, "hoverlabel", js.undefined)
    
    @scala.inline
    def setHovermode(value: closest | typings.plotlyJs.plotlyJsStrings.x | y | (`x unified`) | (`y unified`) | `false`): Self = StObject.set(x, "hovermode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHovermodeUndefined: Self = StObject.set(x, "hovermode", js.undefined)
    
    @scala.inline
    def setImages(value: js.Array[PartialImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: PartialImage*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setLegend(value: PartialLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setMapbox(value: PartialMapbox): Self = StObject.set(x, "mapbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapboxUndefined: Self = StObject.set(x, "mapbox", js.undefined)
    
    @scala.inline
    def setMargin(value: PartialMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPaper_bgcolor(value: Color): Self = StObject.set(x, "paper_bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaper_bgcolorUndefined: Self = StObject.set(x, "paper_bgcolor", js.undefined)
    
    @scala.inline
    def setPaper_bgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "paper_bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setPlot_bgcolor(value: Color): Self = StObject.set(x, "plot_bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlot_bgcolorUndefined: Self = StObject.set(x, "plot_bgcolor", js.undefined)
    
    @scala.inline
    def setPlot_bgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "plot_bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setPolar(value: PartialPolarLayout): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolar2(value: PartialPolarLayout): Self = StObject.set(x, "polar2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolar2Undefined: Self = StObject.set(x, "polar2", js.undefined)
    
    @scala.inline
    def setPolar3(value: PartialPolarLayout): Self = StObject.set(x, "polar3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolar3Undefined: Self = StObject.set(x, "polar3", js.undefined)
    
    @scala.inline
    def setPolar4(value: PartialPolarLayout): Self = StObject.set(x, "polar4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolar4Undefined: Self = StObject.set(x, "polar4", js.undefined)
    
    @scala.inline
    def setPolar5(value: PartialPolarLayout): Self = StObject.set(x, "polar5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolar5Undefined: Self = StObject.set(x, "polar5", js.undefined)
    
    @scala.inline
    def setPolar6(value: PartialPolarLayout): Self = StObject.set(x, "polar6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolar6Undefined: Self = StObject.set(x, "polar6", js.undefined)
    
    @scala.inline
    def setPolar7(value: PartialPolarLayout): Self = StObject.set(x, "polar7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolar7Undefined: Self = StObject.set(x, "polar7", js.undefined)
    
    @scala.inline
    def setPolar8(value: PartialPolarLayout): Self = StObject.set(x, "polar8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolar8Undefined: Self = StObject.set(x, "polar8", js.undefined)
    
    @scala.inline
    def setPolar9(value: PartialPolarLayout): Self = StObject.set(x, "polar9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolar9Undefined: Self = StObject.set(x, "polar9", js.undefined)
    
    @scala.inline
    def setPolarUndefined: Self = StObject.set(x, "polar", js.undefined)
    
    @scala.inline
    def setRadialaxis(value: PartialAxis): Self = StObject.set(x, "radialaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadialaxisUndefined: Self = StObject.set(x, "radialaxis", js.undefined)
    
    @scala.inline
    def setScene(value: PartialScene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSceneUndefined: Self = StObject.set(x, "scene", js.undefined)
    
    @scala.inline
    def setSelectdirection(value: h | v | d | any): Self = StObject.set(x, "selectdirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectdirectionUndefined: Self = StObject.set(x, "selectdirection", js.undefined)
    
    @scala.inline
    def setSeparators(value: String): Self = StObject.set(x, "separators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorsUndefined: Self = StObject.set(x, "separators", js.undefined)
    
    @scala.inline
    def setShapes(value: js.Array[PartialShape]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
    
    @scala.inline
    def setShapesVarargs(value: PartialShape*): Self = StObject.set(x, "shapes", js.Array(value :_*))
    
    @scala.inline
    def setShowlegend(value: Boolean): Self = StObject.set(x, "showlegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowlegendUndefined: Self = StObject.set(x, "showlegend", js.undefined)
    
    @scala.inline
    def setSliders(value: js.Array[PartialSlider]): Self = StObject.set(x, "sliders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidersUndefined: Self = StObject.set(x, "sliders", js.undefined)
    
    @scala.inline
    def setSlidersVarargs(value: PartialSlider*): Self = StObject.set(x, "sliders", js.Array(value :_*))
    
    @scala.inline
    def setSubplot(value: String): Self = StObject.set(x, "subplot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubplotUndefined: Self = StObject.set(x, "subplot", js.undefined)
    
    @scala.inline
    def setTemplate(value: Template): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTernary(value: js.Object): Self = StObject.set(x, "ternary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTernaryUndefined: Self = StObject.set(x, "ternary", js.undefined)
    
    @scala.inline
    def setTitle(value: String | PartialtextstringfontPart): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTitlefont(value: PartialFont): Self = StObject.set(x, "titlefont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlefontUndefined: Self = StObject.set(x, "titlefont", js.undefined)
    
    @scala.inline
    def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setUpdatemenus(value: js.Object): Self = StObject.set(x, "updatemenus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatemenusUndefined: Self = StObject.set(x, "updatemenus", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setXaxis(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxis2(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "xaxis2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxis2Undefined: Self = StObject.set(x, "xaxis2", js.undefined)
    
    @scala.inline
    def setXaxis3(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "xaxis3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxis3Undefined: Self = StObject.set(x, "xaxis3", js.undefined)
    
    @scala.inline
    def setXaxis4(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "xaxis4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxis4Undefined: Self = StObject.set(x, "xaxis4", js.undefined)
    
    @scala.inline
    def setXaxis5(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "xaxis5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxis5Undefined: Self = StObject.set(x, "xaxis5", js.undefined)
    
    @scala.inline
    def setXaxis6(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "xaxis6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxis6Undefined: Self = StObject.set(x, "xaxis6", js.undefined)
    
    @scala.inline
    def setXaxis7(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "xaxis7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxis7Undefined: Self = StObject.set(x, "xaxis7", js.undefined)
    
    @scala.inline
    def setXaxis8(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "xaxis8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxis8Undefined: Self = StObject.set(x, "xaxis8", js.undefined)
    
    @scala.inline
    def setXaxis9(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "xaxis9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxis9Undefined: Self = StObject.set(x, "xaxis9", js.undefined)
    
    @scala.inline
    def setXaxisDotautorange(value: Boolean): Self = StObject.set(x, "xaxis.autorange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxisDotautorangeUndefined: Self = StObject.set(x, "xaxis.autorange", js.undefined)
    
    @scala.inline
    def setXaxisDotrange(value: js.Tuple2[Datum, Datum]): Self = StObject.set(x, "xaxis.range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxisDotrangeUndefined: Self = StObject.set(x, "xaxis.range", js.undefined)
    
    @scala.inline
    def `setXaxisDotrange[0]`(value: Double): Self = StObject.set(x, "xaxis.range[0]", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setXaxisDotrange[0]Undefined`: Self = StObject.set(x, "xaxis.range[0]", js.undefined)
    
    @scala.inline
    def `setXaxisDotrange[1]`(value: Double): Self = StObject.set(x, "xaxis.range[1]", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setXaxisDotrange[1]Undefined`: Self = StObject.set(x, "xaxis.range[1]", js.undefined)
    
    @scala.inline
    def setXaxisDottitle(value: String): Self = StObject.set(x, "xaxis.title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxisDottitleUndefined: Self = StObject.set(x, "xaxis.title", js.undefined)
    
    @scala.inline
    def setXaxisDottype(value: AxisType): Self = StObject.set(x, "xaxis.type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxisDottypeUndefined: Self = StObject.set(x, "xaxis.type", js.undefined)
    
    @scala.inline
    def setXaxisUndefined: Self = StObject.set(x, "xaxis", js.undefined)
    
    @scala.inline
    def setYaxis(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxis2(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "yaxis2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxis2Undefined: Self = StObject.set(x, "yaxis2", js.undefined)
    
    @scala.inline
    def setYaxis3(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "yaxis3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxis3Undefined: Self = StObject.set(x, "yaxis3", js.undefined)
    
    @scala.inline
    def setYaxis4(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "yaxis4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxis4Undefined: Self = StObject.set(x, "yaxis4", js.undefined)
    
    @scala.inline
    def setYaxis5(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "yaxis5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxis5Undefined: Self = StObject.set(x, "yaxis5", js.undefined)
    
    @scala.inline
    def setYaxis6(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "yaxis6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxis6Undefined: Self = StObject.set(x, "yaxis6", js.undefined)
    
    @scala.inline
    def setYaxis7(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "yaxis7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxis7Undefined: Self = StObject.set(x, "yaxis7", js.undefined)
    
    @scala.inline
    def setYaxis8(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "yaxis8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxis8Undefined: Self = StObject.set(x, "yaxis8", js.undefined)
    
    @scala.inline
    def setYaxis9(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "yaxis9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxis9Undefined: Self = StObject.set(x, "yaxis9", js.undefined)
    
    @scala.inline
    def setYaxisDotautorange(value: Boolean): Self = StObject.set(x, "yaxis.autorange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxisDotautorangeUndefined: Self = StObject.set(x, "yaxis.autorange", js.undefined)
    
    @scala.inline
    def setYaxisDotrange(value: js.Tuple2[Datum, Datum]): Self = StObject.set(x, "yaxis.range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxisDotrangeUndefined: Self = StObject.set(x, "yaxis.range", js.undefined)
    
    @scala.inline
    def `setYaxisDotrange[0]`(value: Double): Self = StObject.set(x, "yaxis.range[0]", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setYaxisDotrange[0]Undefined`: Self = StObject.set(x, "yaxis.range[0]", js.undefined)
    
    @scala.inline
    def `setYaxisDotrange[1]`(value: Double): Self = StObject.set(x, "yaxis.range[1]", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setYaxisDotrange[1]Undefined`: Self = StObject.set(x, "yaxis.range[1]", js.undefined)
    
    @scala.inline
    def setYaxisDottitle(value: String): Self = StObject.set(x, "yaxis.title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxisDottitleUndefined: Self = StObject.set(x, "yaxis.title", js.undefined)
    
    @scala.inline
    def setYaxisDottype(value: AxisType): Self = StObject.set(x, "yaxis.type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxisDottypeUndefined: Self = StObject.set(x, "yaxis.type", js.undefined)
    
    @scala.inline
    def setYaxisUndefined: Self = StObject.set(x, "yaxis", js.undefined)
  }
}
