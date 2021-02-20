package typings.plotlyJs.anon

import typings.plotlyJs.mod.ModeBarButton
import typings.plotlyJs.mod.ModeBarDefaultButtons
import typings.plotlyJs.plotlyJsBooleans.`false`
import typings.plotlyJs.plotlyJsNumbers.`0`
import typings.plotlyJs.plotlyJsNumbers.`1`
import typings.plotlyJs.plotlyJsNumbers.`2`
import typings.plotlyJs.plotlyJsStrings.autosize
import typings.plotlyJs.plotlyJsStrings.hover
import typings.plotlyJs.plotlyJsStrings.opaque
import typings.plotlyJs.plotlyJsStrings.reset
import typings.plotlyJs.plotlyJsStrings.resetPlussignautosize
import typings.plotlyJs.plotlyJsStrings.transparent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Config> */
@js.native
trait PartialConfig extends StObject {
  
  var autosizable: js.UndefOr[Boolean] = js.native
  
  var displayModeBar: js.UndefOr[hover | Boolean] = js.native
  
  var displaylogo: js.UndefOr[Boolean] = js.native
  
  var doubleClick: js.UndefOr[resetPlussignautosize | reset | autosize | `false`] = js.native
  
  var editable: js.UndefOr[Boolean] = js.native
  
  var edits: js.UndefOr[PartialEdits] = js.native
  
  var fillFrame: js.UndefOr[Boolean] = js.native
  
  var frameMargins: js.UndefOr[Double] = js.native
  
  var globalTransforms: js.UndefOr[js.Array[_]] = js.native
  
  var linkText: js.UndefOr[String] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var logging: js.UndefOr[Boolean | `0` | `1` | `2`] = js.native
  
  var mapboxAccessToken: js.UndefOr[String] = js.native
  
  var modeBarButtons: js.UndefOr[(js.Array[js.Array[ModeBarButton | ModeBarDefaultButtons]]) | `false`] = js.native
  
  var modeBarButtonsToAdd: js.UndefOr[js.Array[ModeBarButton | ModeBarDefaultButtons]] = js.native
  
  var modeBarButtonsToRemove: js.UndefOr[js.Array[ModeBarDefaultButtons]] = js.native
  
  var plotGlPixelRatio: js.UndefOr[Double] = js.native
  
  var plotlyServerURL: js.UndefOr[String] = js.native
  
  var queueLength: js.UndefOr[Double] = js.native
  
  var responsive: js.UndefOr[Boolean] = js.native
  
  var scrollZoom: js.UndefOr[Boolean] = js.native
  
  var sendData: js.UndefOr[Boolean] = js.native
  
  var setBackground: js.UndefOr[js.Function0[String | opaque | transparent]] = js.native
  
  var showAxisDragHandles: js.UndefOr[Boolean] = js.native
  
  var showAxisRangeEntryBoxes: js.UndefOr[Boolean] = js.native
  
  var showEditInChartStudio: js.UndefOr[Boolean] = js.native
  
  var showLink: js.UndefOr[Boolean] = js.native
  
  var showSendToCloud: js.UndefOr[Boolean] = js.native
  
  var showSources: js.UndefOr[Boolean] = js.native
  
  var showTips: js.UndefOr[Boolean] = js.native
  
  var staticPlot: js.UndefOr[Boolean] = js.native
  
  var toImageButtonOptions: js.UndefOr[Partialfilenamestringscal] = js.native
  
  var topojsonURL: js.UndefOr[String] = js.native
}
object PartialConfig {
  
  @scala.inline
  def apply(): PartialConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfig]
  }
  
  @scala.inline
  implicit class PartialConfigMutableBuilder[Self <: PartialConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutosizable(value: Boolean): Self = StObject.set(x, "autosizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutosizableUndefined: Self = StObject.set(x, "autosizable", js.undefined)
    
    @scala.inline
    def setDisplayModeBar(value: hover | Boolean): Self = StObject.set(x, "displayModeBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayModeBarUndefined: Self = StObject.set(x, "displayModeBar", js.undefined)
    
    @scala.inline
    def setDisplaylogo(value: Boolean): Self = StObject.set(x, "displaylogo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplaylogoUndefined: Self = StObject.set(x, "displaylogo", js.undefined)
    
    @scala.inline
    def setDoubleClick(value: resetPlussignautosize | reset | autosize | `false`): Self = StObject.set(x, "doubleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleClickUndefined: Self = StObject.set(x, "doubleClick", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setEdits(value: PartialEdits): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditsUndefined: Self = StObject.set(x, "edits", js.undefined)
    
    @scala.inline
    def setFillFrame(value: Boolean): Self = StObject.set(x, "fillFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillFrameUndefined: Self = StObject.set(x, "fillFrame", js.undefined)
    
    @scala.inline
    def setFrameMargins(value: Double): Self = StObject.set(x, "frameMargins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameMarginsUndefined: Self = StObject.set(x, "frameMargins", js.undefined)
    
    @scala.inline
    def setGlobalTransforms(value: js.Array[_]): Self = StObject.set(x, "globalTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalTransformsUndefined: Self = StObject.set(x, "globalTransforms", js.undefined)
    
    @scala.inline
    def setGlobalTransformsVarargs(value: js.Any*): Self = StObject.set(x, "globalTransforms", js.Array(value :_*))
    
    @scala.inline
    def setLinkText(value: String): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkTextUndefined: Self = StObject.set(x, "linkText", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setLogging(value: Boolean | `0` | `1` | `2`): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setMapboxAccessToken(value: String): Self = StObject.set(x, "mapboxAccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapboxAccessTokenUndefined: Self = StObject.set(x, "mapboxAccessToken", js.undefined)
    
    @scala.inline
    def setModeBarButtons(value: (js.Array[js.Array[ModeBarButton | ModeBarDefaultButtons]]) | `false`): Self = StObject.set(x, "modeBarButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeBarButtonsToAdd(value: js.Array[ModeBarButton | ModeBarDefaultButtons]): Self = StObject.set(x, "modeBarButtonsToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeBarButtonsToAddUndefined: Self = StObject.set(x, "modeBarButtonsToAdd", js.undefined)
    
    @scala.inline
    def setModeBarButtonsToAddVarargs(value: (ModeBarButton | ModeBarDefaultButtons)*): Self = StObject.set(x, "modeBarButtonsToAdd", js.Array(value :_*))
    
    @scala.inline
    def setModeBarButtonsToRemove(value: js.Array[ModeBarDefaultButtons]): Self = StObject.set(x, "modeBarButtonsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeBarButtonsToRemoveUndefined: Self = StObject.set(x, "modeBarButtonsToRemove", js.undefined)
    
    @scala.inline
    def setModeBarButtonsToRemoveVarargs(value: ModeBarDefaultButtons*): Self = StObject.set(x, "modeBarButtonsToRemove", js.Array(value :_*))
    
    @scala.inline
    def setModeBarButtonsUndefined: Self = StObject.set(x, "modeBarButtons", js.undefined)
    
    @scala.inline
    def setModeBarButtonsVarargs(value: (js.Array[ModeBarButton | ModeBarDefaultButtons])*): Self = StObject.set(x, "modeBarButtons", js.Array(value :_*))
    
    @scala.inline
    def setPlotGlPixelRatio(value: Double): Self = StObject.set(x, "plotGlPixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotGlPixelRatioUndefined: Self = StObject.set(x, "plotGlPixelRatio", js.undefined)
    
    @scala.inline
    def setPlotlyServerURL(value: String): Self = StObject.set(x, "plotlyServerURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotlyServerURLUndefined: Self = StObject.set(x, "plotlyServerURL", js.undefined)
    
    @scala.inline
    def setQueueLength(value: Double): Self = StObject.set(x, "queueLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueLengthUndefined: Self = StObject.set(x, "queueLength", js.undefined)
    
    @scala.inline
    def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    @scala.inline
    def setScrollZoom(value: Boolean): Self = StObject.set(x, "scrollZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollZoomUndefined: Self = StObject.set(x, "scrollZoom", js.undefined)
    
    @scala.inline
    def setSendData(value: Boolean): Self = StObject.set(x, "sendData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendDataUndefined: Self = StObject.set(x, "sendData", js.undefined)
    
    @scala.inline
    def setSetBackground(value: () => String | opaque | transparent): Self = StObject.set(x, "setBackground", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetBackgroundUndefined: Self = StObject.set(x, "setBackground", js.undefined)
    
    @scala.inline
    def setShowAxisDragHandles(value: Boolean): Self = StObject.set(x, "showAxisDragHandles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAxisDragHandlesUndefined: Self = StObject.set(x, "showAxisDragHandles", js.undefined)
    
    @scala.inline
    def setShowAxisRangeEntryBoxes(value: Boolean): Self = StObject.set(x, "showAxisRangeEntryBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAxisRangeEntryBoxesUndefined: Self = StObject.set(x, "showAxisRangeEntryBoxes", js.undefined)
    
    @scala.inline
    def setShowEditInChartStudio(value: Boolean): Self = StObject.set(x, "showEditInChartStudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowEditInChartStudioUndefined: Self = StObject.set(x, "showEditInChartStudio", js.undefined)
    
    @scala.inline
    def setShowLink(value: Boolean): Self = StObject.set(x, "showLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLinkUndefined: Self = StObject.set(x, "showLink", js.undefined)
    
    @scala.inline
    def setShowSendToCloud(value: Boolean): Self = StObject.set(x, "showSendToCloud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSendToCloudUndefined: Self = StObject.set(x, "showSendToCloud", js.undefined)
    
    @scala.inline
    def setShowSources(value: Boolean): Self = StObject.set(x, "showSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSourcesUndefined: Self = StObject.set(x, "showSources", js.undefined)
    
    @scala.inline
    def setShowTips(value: Boolean): Self = StObject.set(x, "showTips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTipsUndefined: Self = StObject.set(x, "showTips", js.undefined)
    
    @scala.inline
    def setStaticPlot(value: Boolean): Self = StObject.set(x, "staticPlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticPlotUndefined: Self = StObject.set(x, "staticPlot", js.undefined)
    
    @scala.inline
    def setToImageButtonOptions(value: Partialfilenamestringscal): Self = StObject.set(x, "toImageButtonOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToImageButtonOptionsUndefined: Self = StObject.set(x, "toImageButtonOptions", js.undefined)
    
    @scala.inline
    def setTopojsonURL(value: String): Self = StObject.set(x, "topojsonURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopojsonURLUndefined: Self = StObject.set(x, "topojsonURL", js.undefined)
  }
}
