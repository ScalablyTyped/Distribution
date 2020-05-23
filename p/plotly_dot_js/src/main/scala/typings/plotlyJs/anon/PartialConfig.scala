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
trait PartialConfig extends js.Object {
  var autosizable: js.UndefOr[Boolean] = js.undefined
  var displayModeBar: js.UndefOr[hover | Boolean] = js.undefined
  var displaylogo: js.UndefOr[Boolean] = js.undefined
  var doubleClick: js.UndefOr[resetPlussignautosize | reset | autosize | `false`] = js.undefined
  var editable: js.UndefOr[Boolean] = js.undefined
  var edits: js.UndefOr[PartialEdits] = js.undefined
  var fillFrame: js.UndefOr[Boolean] = js.undefined
  var frameMargins: js.UndefOr[Double] = js.undefined
  var globalTransforms: js.UndefOr[js.Array[_]] = js.undefined
  var linkText: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var logging: js.UndefOr[Boolean | `0` | `1` | `2`] = js.undefined
  var mapboxAccessToken: js.UndefOr[String] = js.undefined
  var modeBarButtons: js.UndefOr[(js.Array[js.Array[ModeBarButton | ModeBarDefaultButtons]]) | `false`] = js.undefined
  var modeBarButtonsToAdd: js.UndefOr[js.Array[ModeBarButton | ModeBarDefaultButtons]] = js.undefined
  var modeBarButtonsToRemove: js.UndefOr[js.Array[ModeBarDefaultButtons]] = js.undefined
  var plotGlPixelRatio: js.UndefOr[Double] = js.undefined
  var plotlyServerURL: js.UndefOr[String] = js.undefined
  var queueLength: js.UndefOr[Double] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var scrollZoom: js.UndefOr[Boolean] = js.undefined
  var sendData: js.UndefOr[Boolean] = js.undefined
  var setBackground: js.UndefOr[js.Function0[String | opaque | transparent]] = js.undefined
  var showAxisDragHandles: js.UndefOr[Boolean] = js.undefined
  var showAxisRangeEntryBoxes: js.UndefOr[Boolean] = js.undefined
  var showEditInChartStudio: js.UndefOr[Boolean] = js.undefined
  var showLink: js.UndefOr[Boolean] = js.undefined
  var showSendToCloud: js.UndefOr[Boolean] = js.undefined
  var showSources: js.UndefOr[Boolean] = js.undefined
  var showTips: js.UndefOr[Boolean] = js.undefined
  var staticPlot: js.UndefOr[Boolean] = js.undefined
  var toImageButtonOptions: js.UndefOr[Partialfilenamestringscal] = js.undefined
  var topojsonURL: js.UndefOr[String] = js.undefined
}

object PartialConfig {
  @scala.inline
  def apply(
    autosizable: js.UndefOr[Boolean] = js.undefined,
    displayModeBar: hover | Boolean = null,
    displaylogo: js.UndefOr[Boolean] = js.undefined,
    doubleClick: resetPlussignautosize | reset | autosize | `false` = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    edits: PartialEdits = null,
    fillFrame: js.UndefOr[Boolean] = js.undefined,
    frameMargins: js.UndefOr[Double] = js.undefined,
    globalTransforms: js.Array[_] = null,
    linkText: String = null,
    locale: String = null,
    logging: Boolean | `0` | `1` | `2` = null,
    mapboxAccessToken: String = null,
    modeBarButtons: (js.Array[js.Array[ModeBarButton | ModeBarDefaultButtons]]) | `false` = null,
    modeBarButtonsToAdd: js.Array[ModeBarButton | ModeBarDefaultButtons] = null,
    modeBarButtonsToRemove: js.Array[ModeBarDefaultButtons] = null,
    plotGlPixelRatio: js.UndefOr[Double] = js.undefined,
    plotlyServerURL: String = null,
    queueLength: js.UndefOr[Double] = js.undefined,
    responsive: js.UndefOr[Boolean] = js.undefined,
    scrollZoom: js.UndefOr[Boolean] = js.undefined,
    sendData: js.UndefOr[Boolean] = js.undefined,
    setBackground: () => String | opaque | transparent = null,
    showAxisDragHandles: js.UndefOr[Boolean] = js.undefined,
    showAxisRangeEntryBoxes: js.UndefOr[Boolean] = js.undefined,
    showEditInChartStudio: js.UndefOr[Boolean] = js.undefined,
    showLink: js.UndefOr[Boolean] = js.undefined,
    showSendToCloud: js.UndefOr[Boolean] = js.undefined,
    showSources: js.UndefOr[Boolean] = js.undefined,
    showTips: js.UndefOr[Boolean] = js.undefined,
    staticPlot: js.UndefOr[Boolean] = js.undefined,
    toImageButtonOptions: Partialfilenamestringscal = null,
    topojsonURL: String = null
  ): PartialConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autosizable)) __obj.updateDynamic("autosizable")(autosizable.get.asInstanceOf[js.Any])
    if (displayModeBar != null) __obj.updateDynamic("displayModeBar")(displayModeBar.asInstanceOf[js.Any])
    if (!js.isUndefined(displaylogo)) __obj.updateDynamic("displaylogo")(displaylogo.get.asInstanceOf[js.Any])
    if (doubleClick != null) __obj.updateDynamic("doubleClick")(doubleClick.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.get.asInstanceOf[js.Any])
    if (edits != null) __obj.updateDynamic("edits")(edits.asInstanceOf[js.Any])
    if (!js.isUndefined(fillFrame)) __obj.updateDynamic("fillFrame")(fillFrame.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frameMargins)) __obj.updateDynamic("frameMargins")(frameMargins.get.asInstanceOf[js.Any])
    if (globalTransforms != null) __obj.updateDynamic("globalTransforms")(globalTransforms.asInstanceOf[js.Any])
    if (linkText != null) __obj.updateDynamic("linkText")(linkText.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (mapboxAccessToken != null) __obj.updateDynamic("mapboxAccessToken")(mapboxAccessToken.asInstanceOf[js.Any])
    if (modeBarButtons != null) __obj.updateDynamic("modeBarButtons")(modeBarButtons.asInstanceOf[js.Any])
    if (modeBarButtonsToAdd != null) __obj.updateDynamic("modeBarButtonsToAdd")(modeBarButtonsToAdd.asInstanceOf[js.Any])
    if (modeBarButtonsToRemove != null) __obj.updateDynamic("modeBarButtonsToRemove")(modeBarButtonsToRemove.asInstanceOf[js.Any])
    if (!js.isUndefined(plotGlPixelRatio)) __obj.updateDynamic("plotGlPixelRatio")(plotGlPixelRatio.get.asInstanceOf[js.Any])
    if (plotlyServerURL != null) __obj.updateDynamic("plotlyServerURL")(plotlyServerURL.asInstanceOf[js.Any])
    if (!js.isUndefined(queueLength)) __obj.updateDynamic("queueLength")(queueLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollZoom)) __obj.updateDynamic("scrollZoom")(scrollZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sendData)) __obj.updateDynamic("sendData")(sendData.get.asInstanceOf[js.Any])
    if (setBackground != null) __obj.updateDynamic("setBackground")(js.Any.fromFunction0(setBackground))
    if (!js.isUndefined(showAxisDragHandles)) __obj.updateDynamic("showAxisDragHandles")(showAxisDragHandles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showAxisRangeEntryBoxes)) __obj.updateDynamic("showAxisRangeEntryBoxes")(showAxisRangeEntryBoxes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showEditInChartStudio)) __obj.updateDynamic("showEditInChartStudio")(showEditInChartStudio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLink)) __obj.updateDynamic("showLink")(showLink.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSendToCloud)) __obj.updateDynamic("showSendToCloud")(showSendToCloud.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSources)) __obj.updateDynamic("showSources")(showSources.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTips)) __obj.updateDynamic("showTips")(showTips.get.asInstanceOf[js.Any])
    if (!js.isUndefined(staticPlot)) __obj.updateDynamic("staticPlot")(staticPlot.get.asInstanceOf[js.Any])
    if (toImageButtonOptions != null) __obj.updateDynamic("toImageButtonOptions")(toImageButtonOptions.asInstanceOf[js.Any])
    if (topojsonURL != null) __obj.updateDynamic("topojsonURL")(topojsonURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConfig]
  }
}

