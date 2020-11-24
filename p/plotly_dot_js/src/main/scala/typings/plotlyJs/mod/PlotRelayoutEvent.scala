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

/* Inlined parent std.Partial<plotly.js.plotly.js.Layout> */
@js.native
trait PlotRelayoutEvent extends js.Object {
  
  var angularaxis: js.UndefOr[js.Object] = js.native
  
  var annotations: js.UndefOr[js.Array[PartialAnnotationsAlign]] = js.native
  
  var autosize: js.UndefOr[Boolean] = js.native
  
  var bargap: js.UndefOr[Double] = js.native
  
  var bargroupgap: js.UndefOr[Double] = js.native
  
  var barmode: js.UndefOr[stack | group | overlay | relative] = js.native
  
  var barnorm: js.UndefOr[_empty | fraction | percent] = js.native
  
  var calendar: js.UndefOr[Calendar] = js.native
  
  var colorway: js.UndefOr[js.Array[String]] = js.native
  
  var dragmode: js.UndefOr[zoom | pan | select | lasso | orbit | turntable | `false`] = js.native
  
  var font: js.UndefOr[PartialFont] = js.native
  
  var geo: js.UndefOr[js.Object] = js.native
  
  var grid: js.UndefOr[Partialrowsnumberroworder] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hiddenlabels: js.UndefOr[js.Array[String]] = js.native
  
  var hidesources: js.UndefOr[Boolean] = js.native
  
  var hoverdistance: js.UndefOr[Double] = js.native
  
  var hoverlabel: js.UndefOr[PartialHoverLabel] = js.native
  
  var hovermode: js.UndefOr[closest | x | y | (`x unified`) | (`y unified`) | `false`] = js.native
  
  var images: js.UndefOr[js.Array[PartialImage]] = js.native
  
  var legend: js.UndefOr[PartialLegend] = js.native
  
  var mapbox: js.UndefOr[PartialMapbox] = js.native
  
  var margin: js.UndefOr[PartialMargin] = js.native
  
  var orientation: js.UndefOr[Double] = js.native
  
  var paper_bgcolor: js.UndefOr[Color] = js.native
  
  var plot_bgcolor: js.UndefOr[Color] = js.native
  
  var polar: js.UndefOr[PartialPolarLayout] = js.native
  
  var polar2: js.UndefOr[PartialPolarLayout] = js.native
  
  var polar3: js.UndefOr[PartialPolarLayout] = js.native
  
  var polar4: js.UndefOr[PartialPolarLayout] = js.native
  
  var polar5: js.UndefOr[PartialPolarLayout] = js.native
  
  var polar6: js.UndefOr[PartialPolarLayout] = js.native
  
  var polar7: js.UndefOr[PartialPolarLayout] = js.native
  
  var polar8: js.UndefOr[PartialPolarLayout] = js.native
  
  var polar9: js.UndefOr[PartialPolarLayout] = js.native
  
  var radialaxis: js.UndefOr[PartialAxis] = js.native
  
  var scene: js.UndefOr[PartialScene] = js.native
  
  var selectdirection: js.UndefOr[h | v | d | any] = js.native
  
  var separators: js.UndefOr[String] = js.native
  
  var shapes: js.UndefOr[js.Array[PartialShape]] = js.native
  
  var showlegend: js.UndefOr[Boolean] = js.native
  
  var sliders: js.UndefOr[js.Array[PartialSlider]] = js.native
  
  var subplot: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[Template] = js.native
  
  var ternary: js.UndefOr[js.Object] = js.native
  
  var title: js.UndefOr[String | PartialtextstringfontPart] = js.native
  
  var titlefont: js.UndefOr[PartialFont] = js.native
  
  var transition: js.UndefOr[Transition] = js.native
  
  var updatemenus: js.UndefOr[js.Object] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var xaxis: js.UndefOr[PartialLayoutAxisAnchor] = js.native
  
  var xaxis2: js.UndefOr[PartialLayoutAxisAnchor] = js.native
  
  var xaxis3: js.UndefOr[PartialLayoutAxisAnchor] = js.native
  
  var xaxis4: js.UndefOr[PartialLayoutAxisAnchor] = js.native
  
  var xaxis5: js.UndefOr[PartialLayoutAxisAnchor] = js.native
  
  var xaxis6: js.UndefOr[PartialLayoutAxisAnchor] = js.native
  
  var xaxis7: js.UndefOr[PartialLayoutAxisAnchor] = js.native
  
  var xaxis8: js.UndefOr[PartialLayoutAxisAnchor] = js.native
  
  var xaxis9: js.UndefOr[PartialLayoutAxisAnchor] = js.native
  
  @JSName("xaxis.autorange")
  var xaxisDotautorange: js.UndefOr[Boolean] = js.native
  
  @JSName("xaxis.range")
  var xaxisDotrange: js.UndefOr[js.Tuple2[Datum, Datum]] = js.native
  
  @JSName("xaxis.range[0]")
  var `xaxisDotrange[0]`: js.UndefOr[Double] = js.native
  
  @JSName("xaxis.range[1]")
  var `xaxisDotrange[1]`: js.UndefOr[Double] = js.native
  
  @JSName("xaxis.title")
  var xaxisDottitle: js.UndefOr[String] = js.native
  
  @JSName("xaxis.type")
  var xaxisDottype: js.UndefOr[AxisType] = js.native
  
  var yaxis: js.UndefOr[PartialLayoutAxisAnchor] = js.native
  
  var yaxis2: js.UndefOr[PartialLayoutAxisAnchor] = js.native
  
  var yaxis3: js.UndefOr[PartialLayoutAxisAnchor] = js.native
  
  var yaxis4: js.UndefOr[PartialLayoutAxisAnchor] = js.native
  
  var yaxis5: js.UndefOr[PartialLayoutAxisAnchor] = js.native
  
  var yaxis6: js.UndefOr[PartialLayoutAxisAnchor] = js.native
  
  var yaxis7: js.UndefOr[PartialLayoutAxisAnchor] = js.native
  
  var yaxis8: js.UndefOr[PartialLayoutAxisAnchor] = js.native
  
  var yaxis9: js.UndefOr[PartialLayoutAxisAnchor] = js.native
  
  @JSName("yaxis.autorange")
  var yaxisDotautorange: js.UndefOr[Boolean] = js.native
  
  @JSName("yaxis.range")
  var yaxisDotrange: js.UndefOr[js.Tuple2[Datum, Datum]] = js.native
  
  @JSName("yaxis.range[0]")
  var `yaxisDotrange[0]`: js.UndefOr[Double] = js.native
  
  @JSName("yaxis.range[1]")
  var `yaxisDotrange[1]`: js.UndefOr[Double] = js.native
  
  @JSName("yaxis.title")
  var yaxisDottitle: js.UndefOr[String] = js.native
  
  @JSName("yaxis.type")
  var yaxisDottype: js.UndefOr[AxisType] = js.native
}
object PlotRelayoutEvent {
  
  @scala.inline
  def apply(): PlotRelayoutEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotRelayoutEvent]
  }
  
  @scala.inline
  implicit class PlotRelayoutEventOps[Self <: PlotRelayoutEvent] (val x: Self) extends AnyVal {
    
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
    def setAngularaxis(value: js.Object): Self = this.set("angularaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngularaxis: Self = this.set("angularaxis", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: PartialAnnotationsAlign*): Self = this.set("annotations", js.Array(value :_*))
    
    @scala.inline
    def setAnnotations(value: js.Array[PartialAnnotationsAlign]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setAutosize(value: Boolean): Self = this.set("autosize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutosize: Self = this.set("autosize", js.undefined)
    
    @scala.inline
    def setBargap(value: Double): Self = this.set("bargap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBargap: Self = this.set("bargap", js.undefined)
    
    @scala.inline
    def setBargroupgap(value: Double): Self = this.set("bargroupgap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBargroupgap: Self = this.set("bargroupgap", js.undefined)
    
    @scala.inline
    def setBarmode(value: stack | group | overlay | relative): Self = this.set("barmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarmode: Self = this.set("barmode", js.undefined)
    
    @scala.inline
    def setBarnorm(value: _empty | fraction | percent): Self = this.set("barnorm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarnorm: Self = this.set("barnorm", js.undefined)
    
    @scala.inline
    def setCalendar(value: Calendar): Self = this.set("calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    
    @scala.inline
    def setColorwayVarargs(value: String*): Self = this.set("colorway", js.Array(value :_*))
    
    @scala.inline
    def setColorway(value: js.Array[String]): Self = this.set("colorway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorway: Self = this.set("colorway", js.undefined)
    
    @scala.inline
    def setDragmode(value: zoom | pan | select | lasso | orbit | turntable | `false`): Self = this.set("dragmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragmode: Self = this.set("dragmode", js.undefined)
    
    @scala.inline
    def setFont(value: PartialFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setGeo(value: js.Object): Self = this.set("geo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeo: Self = this.set("geo", js.undefined)
    
    @scala.inline
    def setGrid(value: Partialrowsnumberroworder): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHiddenlabelsVarargs(value: String*): Self = this.set("hiddenlabels", js.Array(value :_*))
    
    @scala.inline
    def setHiddenlabels(value: js.Array[String]): Self = this.set("hiddenlabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenlabels: Self = this.set("hiddenlabels", js.undefined)
    
    @scala.inline
    def setHidesources(value: Boolean): Self = this.set("hidesources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidesources: Self = this.set("hidesources", js.undefined)
    
    @scala.inline
    def setHoverdistance(value: Double): Self = this.set("hoverdistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverdistance: Self = this.set("hoverdistance", js.undefined)
    
    @scala.inline
    def setHoverlabel(value: PartialHoverLabel): Self = this.set("hoverlabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverlabel: Self = this.set("hoverlabel", js.undefined)
    
    @scala.inline
    def setHovermode(value: closest | typings.plotlyJs.plotlyJsStrings.x | y | (`x unified`) | (`y unified`) | `false`): Self = this.set("hovermode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHovermode: Self = this.set("hovermode", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: PartialImage*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[PartialImage]): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    
    @scala.inline
    def setLegend(value: PartialLegend): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setMapbox(value: PartialMapbox): Self = this.set("mapbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapbox: Self = this.set("mapbox", js.undefined)
    
    @scala.inline
    def setMargin(value: PartialMargin): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setOrientation(value: Double): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPaper_bgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("paper_bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setPaper_bgcolor(value: Color): Self = this.set("paper_bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaper_bgcolor: Self = this.set("paper_bgcolor", js.undefined)
    
    @scala.inline
    def setPlot_bgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("plot_bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setPlot_bgcolor(value: Color): Self = this.set("plot_bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlot_bgcolor: Self = this.set("plot_bgcolor", js.undefined)
    
    @scala.inline
    def setPolar(value: PartialPolarLayout): Self = this.set("polar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolar: Self = this.set("polar", js.undefined)
    
    @scala.inline
    def setPolar2(value: PartialPolarLayout): Self = this.set("polar2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolar2: Self = this.set("polar2", js.undefined)
    
    @scala.inline
    def setPolar3(value: PartialPolarLayout): Self = this.set("polar3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolar3: Self = this.set("polar3", js.undefined)
    
    @scala.inline
    def setPolar4(value: PartialPolarLayout): Self = this.set("polar4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolar4: Self = this.set("polar4", js.undefined)
    
    @scala.inline
    def setPolar5(value: PartialPolarLayout): Self = this.set("polar5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolar5: Self = this.set("polar5", js.undefined)
    
    @scala.inline
    def setPolar6(value: PartialPolarLayout): Self = this.set("polar6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolar6: Self = this.set("polar6", js.undefined)
    
    @scala.inline
    def setPolar7(value: PartialPolarLayout): Self = this.set("polar7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolar7: Self = this.set("polar7", js.undefined)
    
    @scala.inline
    def setPolar8(value: PartialPolarLayout): Self = this.set("polar8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolar8: Self = this.set("polar8", js.undefined)
    
    @scala.inline
    def setPolar9(value: PartialPolarLayout): Self = this.set("polar9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolar9: Self = this.set("polar9", js.undefined)
    
    @scala.inline
    def setRadialaxis(value: PartialAxis): Self = this.set("radialaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadialaxis: Self = this.set("radialaxis", js.undefined)
    
    @scala.inline
    def setScene(value: PartialScene): Self = this.set("scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScene: Self = this.set("scene", js.undefined)
    
    @scala.inline
    def setSelectdirection(value: h | v | d | any): Self = this.set("selectdirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectdirection: Self = this.set("selectdirection", js.undefined)
    
    @scala.inline
    def setSeparators(value: String): Self = this.set("separators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparators: Self = this.set("separators", js.undefined)
    
    @scala.inline
    def setShapesVarargs(value: PartialShape*): Self = this.set("shapes", js.Array(value :_*))
    
    @scala.inline
    def setShapes(value: js.Array[PartialShape]): Self = this.set("shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapes: Self = this.set("shapes", js.undefined)
    
    @scala.inline
    def setShowlegend(value: Boolean): Self = this.set("showlegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowlegend: Self = this.set("showlegend", js.undefined)
    
    @scala.inline
    def setSlidersVarargs(value: PartialSlider*): Self = this.set("sliders", js.Array(value :_*))
    
    @scala.inline
    def setSliders(value: js.Array[PartialSlider]): Self = this.set("sliders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSliders: Self = this.set("sliders", js.undefined)
    
    @scala.inline
    def setSubplot(value: String): Self = this.set("subplot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubplot: Self = this.set("subplot", js.undefined)
    
    @scala.inline
    def setTemplate(value: Template): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTernary(value: js.Object): Self = this.set("ternary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTernary: Self = this.set("ternary", js.undefined)
    
    @scala.inline
    def setTitle(value: String | PartialtextstringfontPart): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitlefont(value: PartialFont): Self = this.set("titlefont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitlefont: Self = this.set("titlefont", js.undefined)
    
    @scala.inline
    def setTransition(value: Transition): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setUpdatemenus(value: js.Object): Self = this.set("updatemenus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatemenus: Self = this.set("updatemenus", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setXaxis(value: PartialLayoutAxisAnchor): Self = this.set("xaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXaxis: Self = this.set("xaxis", js.undefined)
    
    @scala.inline
    def setXaxis2(value: PartialLayoutAxisAnchor): Self = this.set("xaxis2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXaxis2: Self = this.set("xaxis2", js.undefined)
    
    @scala.inline
    def setXaxis3(value: PartialLayoutAxisAnchor): Self = this.set("xaxis3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXaxis3: Self = this.set("xaxis3", js.undefined)
    
    @scala.inline
    def setXaxis4(value: PartialLayoutAxisAnchor): Self = this.set("xaxis4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXaxis4: Self = this.set("xaxis4", js.undefined)
    
    @scala.inline
    def setXaxis5(value: PartialLayoutAxisAnchor): Self = this.set("xaxis5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXaxis5: Self = this.set("xaxis5", js.undefined)
    
    @scala.inline
    def setXaxis6(value: PartialLayoutAxisAnchor): Self = this.set("xaxis6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXaxis6: Self = this.set("xaxis6", js.undefined)
    
    @scala.inline
    def setXaxis7(value: PartialLayoutAxisAnchor): Self = this.set("xaxis7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXaxis7: Self = this.set("xaxis7", js.undefined)
    
    @scala.inline
    def setXaxis8(value: PartialLayoutAxisAnchor): Self = this.set("xaxis8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXaxis8: Self = this.set("xaxis8", js.undefined)
    
    @scala.inline
    def setXaxis9(value: PartialLayoutAxisAnchor): Self = this.set("xaxis9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXaxis9: Self = this.set("xaxis9", js.undefined)
    
    @scala.inline
    def setXaxisDotautorange(value: Boolean): Self = this.set("xaxis.autorange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXaxisDotautorange: Self = this.set("xaxis.autorange", js.undefined)
    
    @scala.inline
    def setXaxisDotrange(value: js.Tuple2[Datum, Datum]): Self = this.set("xaxis.range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXaxisDotrange: Self = this.set("xaxis.range", js.undefined)
    
    @scala.inline
    def `setXaxisDotrange[0]`(value: Double): Self = this.set("xaxis.range[0]", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteXaxisDotrange[0]`: Self = this.set("xaxis.range[0]", js.undefined)
    
    @scala.inline
    def `setXaxisDotrange[1]`(value: Double): Self = this.set("xaxis.range[1]", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteXaxisDotrange[1]`: Self = this.set("xaxis.range[1]", js.undefined)
    
    @scala.inline
    def setXaxisDottitle(value: String): Self = this.set("xaxis.title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXaxisDottitle: Self = this.set("xaxis.title", js.undefined)
    
    @scala.inline
    def setXaxisDottype(value: AxisType): Self = this.set("xaxis.type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXaxisDottype: Self = this.set("xaxis.type", js.undefined)
    
    @scala.inline
    def setYaxis(value: PartialLayoutAxisAnchor): Self = this.set("yaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYaxis: Self = this.set("yaxis", js.undefined)
    
    @scala.inline
    def setYaxis2(value: PartialLayoutAxisAnchor): Self = this.set("yaxis2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYaxis2: Self = this.set("yaxis2", js.undefined)
    
    @scala.inline
    def setYaxis3(value: PartialLayoutAxisAnchor): Self = this.set("yaxis3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYaxis3: Self = this.set("yaxis3", js.undefined)
    
    @scala.inline
    def setYaxis4(value: PartialLayoutAxisAnchor): Self = this.set("yaxis4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYaxis4: Self = this.set("yaxis4", js.undefined)
    
    @scala.inline
    def setYaxis5(value: PartialLayoutAxisAnchor): Self = this.set("yaxis5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYaxis5: Self = this.set("yaxis5", js.undefined)
    
    @scala.inline
    def setYaxis6(value: PartialLayoutAxisAnchor): Self = this.set("yaxis6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYaxis6: Self = this.set("yaxis6", js.undefined)
    
    @scala.inline
    def setYaxis7(value: PartialLayoutAxisAnchor): Self = this.set("yaxis7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYaxis7: Self = this.set("yaxis7", js.undefined)
    
    @scala.inline
    def setYaxis8(value: PartialLayoutAxisAnchor): Self = this.set("yaxis8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYaxis8: Self = this.set("yaxis8", js.undefined)
    
    @scala.inline
    def setYaxis9(value: PartialLayoutAxisAnchor): Self = this.set("yaxis9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYaxis9: Self = this.set("yaxis9", js.undefined)
    
    @scala.inline
    def setYaxisDotautorange(value: Boolean): Self = this.set("yaxis.autorange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYaxisDotautorange: Self = this.set("yaxis.autorange", js.undefined)
    
    @scala.inline
    def setYaxisDotrange(value: js.Tuple2[Datum, Datum]): Self = this.set("yaxis.range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYaxisDotrange: Self = this.set("yaxis.range", js.undefined)
    
    @scala.inline
    def `setYaxisDotrange[0]`(value: Double): Self = this.set("yaxis.range[0]", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteYaxisDotrange[0]`: Self = this.set("yaxis.range[0]", js.undefined)
    
    @scala.inline
    def `setYaxisDotrange[1]`(value: Double): Self = this.set("yaxis.range[1]", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteYaxisDotrange[1]`: Self = this.set("yaxis.range[1]", js.undefined)
    
    @scala.inline
    def setYaxisDottitle(value: String): Self = this.set("yaxis.title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYaxisDottitle: Self = this.set("yaxis.title", js.undefined)
    
    @scala.inline
    def setYaxisDottype(value: AxisType): Self = this.set("yaxis.type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYaxisDottype: Self = this.set("yaxis.type", js.undefined)
  }
}
