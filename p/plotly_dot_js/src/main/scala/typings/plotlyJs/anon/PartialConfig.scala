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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Config> */
@js.native
trait PartialConfig extends js.Object {
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
  implicit class PartialConfigOps[Self <: PartialConfig] (val x: Self) extends AnyVal {
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
    def setAutosizable(value: Boolean): Self = this.set("autosizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutosizable: Self = this.set("autosizable", js.undefined)
    @scala.inline
    def setDisplayModeBar(value: hover | Boolean): Self = this.set("displayModeBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayModeBar: Self = this.set("displayModeBar", js.undefined)
    @scala.inline
    def setDisplaylogo(value: Boolean): Self = this.set("displaylogo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplaylogo: Self = this.set("displaylogo", js.undefined)
    @scala.inline
    def setDoubleClick(value: resetPlussignautosize | reset | autosize | `false`): Self = this.set("doubleClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleClick: Self = this.set("doubleClick", js.undefined)
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setEdits(value: PartialEdits): Self = this.set("edits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdits: Self = this.set("edits", js.undefined)
    @scala.inline
    def setFillFrame(value: Boolean): Self = this.set("fillFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillFrame: Self = this.set("fillFrame", js.undefined)
    @scala.inline
    def setFrameMargins(value: Double): Self = this.set("frameMargins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameMargins: Self = this.set("frameMargins", js.undefined)
    @scala.inline
    def setGlobalTransformsVarargs(value: js.Any*): Self = this.set("globalTransforms", js.Array(value :_*))
    @scala.inline
    def setGlobalTransforms(value: js.Array[_]): Self = this.set("globalTransforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalTransforms: Self = this.set("globalTransforms", js.undefined)
    @scala.inline
    def setLinkText(value: String): Self = this.set("linkText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkText: Self = this.set("linkText", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setLogging(value: Boolean | `0` | `1` | `2`): Self = this.set("logging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    @scala.inline
    def setMapboxAccessToken(value: String): Self = this.set("mapboxAccessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapboxAccessToken: Self = this.set("mapboxAccessToken", js.undefined)
    @scala.inline
    def setModeBarButtonsVarargs(value: (js.Array[ModeBarButton | ModeBarDefaultButtons])*): Self = this.set("modeBarButtons", js.Array(value :_*))
    @scala.inline
    def setModeBarButtons(value: (js.Array[js.Array[ModeBarButton | ModeBarDefaultButtons]]) | `false`): Self = this.set("modeBarButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModeBarButtons: Self = this.set("modeBarButtons", js.undefined)
    @scala.inline
    def setModeBarButtonsToAddVarargs(value: (ModeBarButton | ModeBarDefaultButtons)*): Self = this.set("modeBarButtonsToAdd", js.Array(value :_*))
    @scala.inline
    def setModeBarButtonsToAdd(value: js.Array[ModeBarButton | ModeBarDefaultButtons]): Self = this.set("modeBarButtonsToAdd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModeBarButtonsToAdd: Self = this.set("modeBarButtonsToAdd", js.undefined)
    @scala.inline
    def setModeBarButtonsToRemoveVarargs(value: ModeBarDefaultButtons*): Self = this.set("modeBarButtonsToRemove", js.Array(value :_*))
    @scala.inline
    def setModeBarButtonsToRemove(value: js.Array[ModeBarDefaultButtons]): Self = this.set("modeBarButtonsToRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModeBarButtonsToRemove: Self = this.set("modeBarButtonsToRemove", js.undefined)
    @scala.inline
    def setPlotGlPixelRatio(value: Double): Self = this.set("plotGlPixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlotGlPixelRatio: Self = this.set("plotGlPixelRatio", js.undefined)
    @scala.inline
    def setPlotlyServerURL(value: String): Self = this.set("plotlyServerURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlotlyServerURL: Self = this.set("plotlyServerURL", js.undefined)
    @scala.inline
    def setQueueLength(value: Double): Self = this.set("queueLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueLength: Self = this.set("queueLength", js.undefined)
    @scala.inline
    def setResponsive(value: Boolean): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    @scala.inline
    def setScrollZoom(value: Boolean): Self = this.set("scrollZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollZoom: Self = this.set("scrollZoom", js.undefined)
    @scala.inline
    def setSendData(value: Boolean): Self = this.set("sendData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendData: Self = this.set("sendData", js.undefined)
    @scala.inline
    def setSetBackground(value: () => String | opaque | transparent): Self = this.set("setBackground", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSetBackground: Self = this.set("setBackground", js.undefined)
    @scala.inline
    def setShowAxisDragHandles(value: Boolean): Self = this.set("showAxisDragHandles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAxisDragHandles: Self = this.set("showAxisDragHandles", js.undefined)
    @scala.inline
    def setShowAxisRangeEntryBoxes(value: Boolean): Self = this.set("showAxisRangeEntryBoxes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAxisRangeEntryBoxes: Self = this.set("showAxisRangeEntryBoxes", js.undefined)
    @scala.inline
    def setShowEditInChartStudio(value: Boolean): Self = this.set("showEditInChartStudio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowEditInChartStudio: Self = this.set("showEditInChartStudio", js.undefined)
    @scala.inline
    def setShowLink(value: Boolean): Self = this.set("showLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLink: Self = this.set("showLink", js.undefined)
    @scala.inline
    def setShowSendToCloud(value: Boolean): Self = this.set("showSendToCloud", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSendToCloud: Self = this.set("showSendToCloud", js.undefined)
    @scala.inline
    def setShowSources(value: Boolean): Self = this.set("showSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSources: Self = this.set("showSources", js.undefined)
    @scala.inline
    def setShowTips(value: Boolean): Self = this.set("showTips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTips: Self = this.set("showTips", js.undefined)
    @scala.inline
    def setStaticPlot(value: Boolean): Self = this.set("staticPlot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticPlot: Self = this.set("staticPlot", js.undefined)
    @scala.inline
    def setToImageButtonOptions(value: Partialfilenamestringscal): Self = this.set("toImageButtonOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToImageButtonOptions: Self = this.set("toImageButtonOptions", js.undefined)
    @scala.inline
    def setTopojsonURL(value: String): Self = this.set("topojsonURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopojsonURL: Self = this.set("topojsonURL", js.undefined)
  }
  
}

