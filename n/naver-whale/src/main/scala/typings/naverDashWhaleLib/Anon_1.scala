package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_1 extends js.Object {
  var TAB_ID_NONE: naverDashWhaleLib.naverDashWhaleLibNumbers.`-1` = js.native
  var onActivated: chromeLib.chromeNs.tabsNs.TabActivatedEvent = js.native
  var onActiveChanged: chromeLib.chromeNs.tabsNs.TabSelectedEvent = js.native
  var onAttached: chromeLib.chromeNs.tabsNs.TabAttachedEvent = js.native
  var onCreated: chromeLib.chromeNs.tabsNs.TabCreatedEvent = js.native
  var onDetached: chromeLib.chromeNs.tabsNs.TabDetachedEvent = js.native
  var onHighlightChanged: chromeLib.chromeNs.tabsNs.TabHighlightedEvent = js.native
  var onHighlighted: chromeLib.chromeNs.tabsNs.TabHighlightedEvent = js.native
  var onMoved: chromeLib.chromeNs.tabsNs.TabMovedEvent = js.native
  var onRemoved: chromeLib.chromeNs.tabsNs.TabRemovedEvent = js.native
  var onReplaced: chromeLib.chromeNs.tabsNs.TabReplacedEvent = js.native
  var onSelectionChanged: chromeLib.chromeNs.tabsNs.TabSelectedEvent = js.native
  var onUpdated: chromeLib.chromeNs.tabsNs.TabUpdatedEvent = js.native
  var onZoomChange: chromeLib.chromeNs.tabsNs.TabZoomChangeEvent = js.native
  def captureVisibleTab(callback: js.Function1[/* dataUrl */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def captureVisibleTab(
    options: chromeLib.chromeNs.tabsNs.CaptureVisibleTabOptions,
    callback: js.Function1[/* dataUrl */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def captureVisibleTab(windowId: scala.Double, callback: js.Function1[/* dataUrl */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def captureVisibleTab(
    windowId: scala.Double,
    options: chromeLib.chromeNs.tabsNs.CaptureVisibleTabOptions,
    callback: js.Function1[/* dataUrl */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def connect(tabId: scala.Double): chromeLib.chromeNs.runtimeNs.Port = js.native
  def connect(tabId: scala.Double, connectInfo: chromeLib.chromeNs.tabsNs.ConnectInfo): chromeLib.chromeNs.runtimeNs.Port = js.native
  def create(createProperties: chromeLib.chromeNs.tabsNs.CreateProperties): scala.Unit = js.native
  def create(
    createProperties: chromeLib.chromeNs.tabsNs.CreateProperties,
    callback: js.Function1[/* tab */ chromeLib.chromeNs.tabsNs.Tab, scala.Unit]
  ): scala.Unit = js.native
  def detectLanguage(callback: js.Function1[/* language */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def detectLanguage(tabId: scala.Double, callback: js.Function1[/* language */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def discard(tabId: scala.Double, callback: js.Function1[/* tab */ chromeLib.chromeNs.tabsNs.Tab, scala.Unit]): scala.Unit = js.native
  def duplicate(tabId: scala.Double): scala.Unit = js.native
  def duplicate(
    tabId: scala.Double,
    callback: js.Function1[/* tab */ js.UndefOr[chromeLib.chromeNs.tabsNs.Tab], scala.Unit]
  ): scala.Unit = js.native
  def executeScript(details: chromeLib.chromeNs.tabsNs.InjectDetails): scala.Unit = js.native
  def executeScript(
    details: chromeLib.chromeNs.tabsNs.InjectDetails,
    callback: js.Function1[/* result */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def executeScript(tabId: scala.Double, details: chromeLib.chromeNs.tabsNs.InjectDetails): scala.Unit = js.native
  def executeScript(
    tabId: scala.Double,
    details: chromeLib.chromeNs.tabsNs.InjectDetails,
    callback: js.Function1[/* result */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def get(tabId: scala.Double, callback: js.Function1[/* tab */ chromeLib.chromeNs.tabsNs.Tab, scala.Unit]): scala.Unit = js.native
  def getAllInWindow(callback: js.Function1[/* tab */ chromeLib.chromeNs.tabsNs.Tab, scala.Unit]): scala.Unit = js.native
  def getAllInWindow(
    windowId: scala.Double,
    callback: js.Function1[/* tab */ chromeLib.chromeNs.tabsNs.Tab, scala.Unit]
  ): scala.Unit = js.native
  def getCurrent(callback: js.Function1[/* tab */ js.UndefOr[chromeLib.chromeNs.tabsNs.Tab], scala.Unit]): scala.Unit = js.native
  def getSelected(callback: js.Function1[/* tab */ chromeLib.chromeNs.tabsNs.Tab, scala.Unit]): scala.Unit = js.native
  def getSelected(
    windowId: scala.Double,
    callback: js.Function1[/* tab */ chromeLib.chromeNs.tabsNs.Tab, scala.Unit]
  ): scala.Unit = js.native
  def getZoom(callback: js.Function1[/* zoomFactor */ scala.Double, scala.Unit]): scala.Unit = js.native
  def getZoom(tabId: scala.Double, callback: js.Function1[/* zoomFactor */ scala.Double, scala.Unit]): scala.Unit = js.native
  def getZoomSettings(callback: js.Function1[/* zoomSettings */ chromeLib.chromeNs.tabsNs.ZoomSettings, scala.Unit]): scala.Unit = js.native
  def getZoomSettings(
    tabId: scala.Double,
    callback: js.Function1[/* zoomSettings */ chromeLib.chromeNs.tabsNs.ZoomSettings, scala.Unit]
  ): scala.Unit = js.native
  def highlight(highlightInfo: chromeLib.chromeNs.tabsNs.HighlightInfo): scala.Unit = js.native
  def highlight(
    highlightInfo: chromeLib.chromeNs.tabsNs.HighlightInfo,
    callback: js.Function1[/* window */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def insertCSS(details: chromeLib.chromeNs.tabsNs.InjectDetails): scala.Unit = js.native
  def insertCSS(details: chromeLib.chromeNs.tabsNs.InjectDetails, callback: js.Function): scala.Unit = js.native
  def insertCSS(tabId: scala.Double, details: chromeLib.chromeNs.tabsNs.InjectDetails): scala.Unit = js.native
  def insertCSS(tabId: scala.Double, details: chromeLib.chromeNs.tabsNs.InjectDetails, callback: js.Function): scala.Unit = js.native
  def move(tabId: scala.Double, moveProperties: chromeLib.chromeNs.tabsNs.MoveProperties): scala.Unit = js.native
  def move(
    tabId: scala.Double,
    moveProperties: chromeLib.chromeNs.tabsNs.MoveProperties,
    callback: js.Function1[/* tab */ chromeLib.chromeNs.tabsNs.Tab, scala.Unit]
  ): scala.Unit = js.native
  def move(tabIds: js.Array[scala.Double], moveProperties: chromeLib.chromeNs.tabsNs.MoveProperties): scala.Unit = js.native
  def move(
    tabIds: js.Array[scala.Double],
    moveProperties: chromeLib.chromeNs.tabsNs.MoveProperties,
    callback: js.Function1[/* tabs */ js.Array[chromeLib.chromeNs.tabsNs.Tab], scala.Unit]
  ): scala.Unit = js.native
  def query(
    queryInfo: chromeLib.chromeNs.tabsNs.QueryInfo,
    callback: js.Function1[/* result */ js.Array[chromeLib.chromeNs.tabsNs.Tab], scala.Unit]
  ): scala.Unit = js.native
  def reload(): scala.Unit = js.native
  def reload(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def reload(reloadProperties: chromeLib.chromeNs.tabsNs.ReloadProperties): scala.Unit = js.native
  def reload(reloadProperties: chromeLib.chromeNs.tabsNs.ReloadProperties, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def reload(tabId: scala.Double): scala.Unit = js.native
  def reload(tabId: scala.Double, reloadProperties: chromeLib.chromeNs.tabsNs.ReloadProperties): scala.Unit = js.native
  def reload(
    tabId: scala.Double,
    reloadProperties: chromeLib.chromeNs.tabsNs.ReloadProperties,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def remove(tabId: scala.Double): scala.Unit = js.native
  def remove(tabId: scala.Double, callback: js.Function): scala.Unit = js.native
  def remove(tabIds: js.Array[scala.Double]): scala.Unit = js.native
  def remove(tabIds: js.Array[scala.Double], callback: js.Function): scala.Unit = js.native
  def sendMessage(tabId: scala.Double, message: js.Any): scala.Unit = js.native
  def sendMessage(tabId: scala.Double, message: js.Any, options: chromeLib.chromeNs.tabsNs.MessageSendOptions): scala.Unit = js.native
  def sendMessage(
    tabId: scala.Double,
    message: js.Any,
    options: chromeLib.chromeNs.tabsNs.MessageSendOptions,
    responseCallback: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def sendMessage(
    tabId: scala.Double,
    message: js.Any,
    responseCallback: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def sendRequest(tabId: scala.Double, request: js.Any): scala.Unit = js.native
  def sendRequest(
    tabId: scala.Double,
    request: js.Any,
    responseCallback: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def setZoom(tabId: scala.Double, zoomFactor: scala.Double): scala.Unit = js.native
  def setZoom(tabId: scala.Double, zoomFactor: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setZoom(zoomFactor: scala.Double): scala.Unit = js.native
  def setZoom(zoomFactor: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setZoomSettings(tabId: scala.Double, zoomSettings: chromeLib.chromeNs.tabsNs.ZoomSettings): scala.Unit = js.native
  def setZoomSettings(
    tabId: scala.Double,
    zoomSettings: chromeLib.chromeNs.tabsNs.ZoomSettings,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def setZoomSettings(zoomSettings: chromeLib.chromeNs.tabsNs.ZoomSettings): scala.Unit = js.native
  def setZoomSettings(zoomSettings: chromeLib.chromeNs.tabsNs.ZoomSettings, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def update(tabId: scala.Double, updateProperties: chromeLib.chromeNs.tabsNs.UpdateProperties): scala.Unit = js.native
  def update(
    tabId: scala.Double,
    updateProperties: chromeLib.chromeNs.tabsNs.UpdateProperties,
    callback: js.Function1[/* tab */ js.UndefOr[chromeLib.chromeNs.tabsNs.Tab], scala.Unit]
  ): scala.Unit = js.native
  def update(updateProperties: chromeLib.chromeNs.tabsNs.UpdateProperties): scala.Unit = js.native
  def update(
    updateProperties: chromeLib.chromeNs.tabsNs.UpdateProperties,
    callback: js.Function1[/* tab */ js.UndefOr[chromeLib.chromeNs.tabsNs.Tab], scala.Unit]
  ): scala.Unit = js.native
}

