package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ type in plotly.js.plotly.js.PlotType ]:? std.Partial<plotly.js.plotly.js.PlotData>} */
@js.native
trait typeinPlotTypePartialPlot extends js.Object {
  
  var bar: js.UndefOr[PartialPlotData] = js.native
  
  var barpolar: js.UndefOr[PartialPlotData] = js.native
  
  var box: js.UndefOr[PartialPlotData] = js.native
  
  var candlestick: js.UndefOr[PartialPlotData] = js.native
  
  var carpet: js.UndefOr[PartialPlotData] = js.native
  
  var choropleth: js.UndefOr[PartialPlotData] = js.native
  
  var choroplethmapbox: js.UndefOr[PartialPlotData] = js.native
  
  var cone: js.UndefOr[PartialPlotData] = js.native
  
  var contour: js.UndefOr[PartialPlotData] = js.native
  
  var contourcarpet: js.UndefOr[PartialPlotData] = js.native
  
  var contourgl: js.UndefOr[PartialPlotData] = js.native
  
  var densitymapbox: js.UndefOr[PartialPlotData] = js.native
  
  var funnel: js.UndefOr[PartialPlotData] = js.native
  
  var funnelarea: js.UndefOr[PartialPlotData] = js.native
  
  var heatmap: js.UndefOr[PartialPlotData] = js.native
  
  var heatmapgl: js.UndefOr[PartialPlotData] = js.native
  
  var histogram: js.UndefOr[PartialPlotData] = js.native
  
  var histogram2d: js.UndefOr[PartialPlotData] = js.native
  
  var histogram2dcontour: js.UndefOr[PartialPlotData] = js.native
  
  var image: js.UndefOr[PartialPlotData] = js.native
  
  var indicator: js.UndefOr[PartialPlotData] = js.native
  
  var isosurface: js.UndefOr[PartialPlotData] = js.native
  
  var mesh3d: js.UndefOr[PartialPlotData] = js.native
  
  var ohlc: js.UndefOr[PartialPlotData] = js.native
  
  var parcats: js.UndefOr[PartialPlotData] = js.native
  
  var parcoords: js.UndefOr[PartialPlotData] = js.native
  
  var pie: js.UndefOr[PartialPlotData] = js.native
  
  var pointcloud: js.UndefOr[PartialPlotData] = js.native
  
  var sankey: js.UndefOr[PartialPlotData] = js.native
  
  var scatter: js.UndefOr[PartialPlotData] = js.native
  
  var scatter3d: js.UndefOr[PartialPlotData] = js.native
  
  var scattercarpet: js.UndefOr[PartialPlotData] = js.native
  
  var scattergeo: js.UndefOr[PartialPlotData] = js.native
  
  var scattergl: js.UndefOr[PartialPlotData] = js.native
  
  var scattermapbox: js.UndefOr[PartialPlotData] = js.native
  
  var scatterpolar: js.UndefOr[PartialPlotData] = js.native
  
  var scatterpolargl: js.UndefOr[PartialPlotData] = js.native
  
  var scatterternary: js.UndefOr[PartialPlotData] = js.native
  
  var splom: js.UndefOr[PartialPlotData] = js.native
  
  var streamtube: js.UndefOr[PartialPlotData] = js.native
  
  var sunburst: js.UndefOr[PartialPlotData] = js.native
  
  var surface: js.UndefOr[PartialPlotData] = js.native
  
  var table: js.UndefOr[PartialPlotData] = js.native
  
  var treemap: js.UndefOr[PartialPlotData] = js.native
  
  var violin: js.UndefOr[PartialPlotData] = js.native
  
  var volume: js.UndefOr[PartialPlotData] = js.native
  
  var waterfall: js.UndefOr[PartialPlotData] = js.native
}
object typeinPlotTypePartialPlot {
  
  @scala.inline
  def apply(): typeinPlotTypePartialPlot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typeinPlotTypePartialPlot]
  }
  
  @scala.inline
  implicit class typeinPlotTypePartialPlotOps[Self <: typeinPlotTypePartialPlot] (val x: Self) extends AnyVal {
    
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
    def setBar(value: PartialPlotData): Self = this.set("bar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBar: Self = this.set("bar", js.undefined)
    
    @scala.inline
    def setBarpolar(value: PartialPlotData): Self = this.set("barpolar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarpolar: Self = this.set("barpolar", js.undefined)
    
    @scala.inline
    def setBox(value: PartialPlotData): Self = this.set("box", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBox: Self = this.set("box", js.undefined)
    
    @scala.inline
    def setCandlestick(value: PartialPlotData): Self = this.set("candlestick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCandlestick: Self = this.set("candlestick", js.undefined)
    
    @scala.inline
    def setCarpet(value: PartialPlotData): Self = this.set("carpet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarpet: Self = this.set("carpet", js.undefined)
    
    @scala.inline
    def setChoropleth(value: PartialPlotData): Self = this.set("choropleth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChoropleth: Self = this.set("choropleth", js.undefined)
    
    @scala.inline
    def setChoroplethmapbox(value: PartialPlotData): Self = this.set("choroplethmapbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChoroplethmapbox: Self = this.set("choroplethmapbox", js.undefined)
    
    @scala.inline
    def setCone(value: PartialPlotData): Self = this.set("cone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCone: Self = this.set("cone", js.undefined)
    
    @scala.inline
    def setContour(value: PartialPlotData): Self = this.set("contour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContour: Self = this.set("contour", js.undefined)
    
    @scala.inline
    def setContourcarpet(value: PartialPlotData): Self = this.set("contourcarpet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContourcarpet: Self = this.set("contourcarpet", js.undefined)
    
    @scala.inline
    def setContourgl(value: PartialPlotData): Self = this.set("contourgl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContourgl: Self = this.set("contourgl", js.undefined)
    
    @scala.inline
    def setDensitymapbox(value: PartialPlotData): Self = this.set("densitymapbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDensitymapbox: Self = this.set("densitymapbox", js.undefined)
    
    @scala.inline
    def setFunnel(value: PartialPlotData): Self = this.set("funnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunnel: Self = this.set("funnel", js.undefined)
    
    @scala.inline
    def setFunnelarea(value: PartialPlotData): Self = this.set("funnelarea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunnelarea: Self = this.set("funnelarea", js.undefined)
    
    @scala.inline
    def setHeatmap(value: PartialPlotData): Self = this.set("heatmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeatmap: Self = this.set("heatmap", js.undefined)
    
    @scala.inline
    def setHeatmapgl(value: PartialPlotData): Self = this.set("heatmapgl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeatmapgl: Self = this.set("heatmapgl", js.undefined)
    
    @scala.inline
    def setHistogram(value: PartialPlotData): Self = this.set("histogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistogram: Self = this.set("histogram", js.undefined)
    
    @scala.inline
    def setHistogram2d(value: PartialPlotData): Self = this.set("histogram2d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistogram2d: Self = this.set("histogram2d", js.undefined)
    
    @scala.inline
    def setHistogram2dcontour(value: PartialPlotData): Self = this.set("histogram2dcontour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistogram2dcontour: Self = this.set("histogram2dcontour", js.undefined)
    
    @scala.inline
    def setImage(value: PartialPlotData): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setIndicator(value: PartialPlotData): Self = this.set("indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicator: Self = this.set("indicator", js.undefined)
    
    @scala.inline
    def setIsosurface(value: PartialPlotData): Self = this.set("isosurface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsosurface: Self = this.set("isosurface", js.undefined)
    
    @scala.inline
    def setMesh3d(value: PartialPlotData): Self = this.set("mesh3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMesh3d: Self = this.set("mesh3d", js.undefined)
    
    @scala.inline
    def setOhlc(value: PartialPlotData): Self = this.set("ohlc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOhlc: Self = this.set("ohlc", js.undefined)
    
    @scala.inline
    def setParcats(value: PartialPlotData): Self = this.set("parcats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParcats: Self = this.set("parcats", js.undefined)
    
    @scala.inline
    def setParcoords(value: PartialPlotData): Self = this.set("parcoords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParcoords: Self = this.set("parcoords", js.undefined)
    
    @scala.inline
    def setPie(value: PartialPlotData): Self = this.set("pie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePie: Self = this.set("pie", js.undefined)
    
    @scala.inline
    def setPointcloud(value: PartialPlotData): Self = this.set("pointcloud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointcloud: Self = this.set("pointcloud", js.undefined)
    
    @scala.inline
    def setSankey(value: PartialPlotData): Self = this.set("sankey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSankey: Self = this.set("sankey", js.undefined)
    
    @scala.inline
    def setScatter(value: PartialPlotData): Self = this.set("scatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScatter: Self = this.set("scatter", js.undefined)
    
    @scala.inline
    def setScatter3d(value: PartialPlotData): Self = this.set("scatter3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScatter3d: Self = this.set("scatter3d", js.undefined)
    
    @scala.inline
    def setScattercarpet(value: PartialPlotData): Self = this.set("scattercarpet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScattercarpet: Self = this.set("scattercarpet", js.undefined)
    
    @scala.inline
    def setScattergeo(value: PartialPlotData): Self = this.set("scattergeo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScattergeo: Self = this.set("scattergeo", js.undefined)
    
    @scala.inline
    def setScattergl(value: PartialPlotData): Self = this.set("scattergl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScattergl: Self = this.set("scattergl", js.undefined)
    
    @scala.inline
    def setScattermapbox(value: PartialPlotData): Self = this.set("scattermapbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScattermapbox: Self = this.set("scattermapbox", js.undefined)
    
    @scala.inline
    def setScatterpolar(value: PartialPlotData): Self = this.set("scatterpolar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScatterpolar: Self = this.set("scatterpolar", js.undefined)
    
    @scala.inline
    def setScatterpolargl(value: PartialPlotData): Self = this.set("scatterpolargl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScatterpolargl: Self = this.set("scatterpolargl", js.undefined)
    
    @scala.inline
    def setScatterternary(value: PartialPlotData): Self = this.set("scatterternary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScatterternary: Self = this.set("scatterternary", js.undefined)
    
    @scala.inline
    def setSplom(value: PartialPlotData): Self = this.set("splom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplom: Self = this.set("splom", js.undefined)
    
    @scala.inline
    def setStreamtube(value: PartialPlotData): Self = this.set("streamtube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamtube: Self = this.set("streamtube", js.undefined)
    
    @scala.inline
    def setSunburst(value: PartialPlotData): Self = this.set("sunburst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSunburst: Self = this.set("sunburst", js.undefined)
    
    @scala.inline
    def setSurface(value: PartialPlotData): Self = this.set("surface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurface: Self = this.set("surface", js.undefined)
    
    @scala.inline
    def setTable(value: PartialPlotData): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    
    @scala.inline
    def setTreemap(value: PartialPlotData): Self = this.set("treemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreemap: Self = this.set("treemap", js.undefined)
    
    @scala.inline
    def setViolin(value: PartialPlotData): Self = this.set("violin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViolin: Self = this.set("violin", js.undefined)
    
    @scala.inline
    def setVolume(value: PartialPlotData): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
    
    @scala.inline
    def setWaterfall(value: PartialPlotData): Self = this.set("waterfall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaterfall: Self = this.set("waterfall", js.undefined)
  }
}
