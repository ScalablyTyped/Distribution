package typings.naverDashWhale.whaleNs.tabsNs

import typings.chrome.chromeNs.runtimeNs.Port
import typings.naverDashWhale.naverDashWhaleNumbers.`-1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs")
@js.native
object ^ extends js.Object {
  var TAB_ID_NONE: `-1` = js.native
  var onActivated: typings.chrome.chromeNs.tabsNs.TabActivatedEvent = js.native
  var onActiveChanged: typings.chrome.chromeNs.tabsNs.TabSelectedEvent = js.native
  var onAttached: typings.chrome.chromeNs.tabsNs.TabAttachedEvent = js.native
  var onCreated: typings.chrome.chromeNs.tabsNs.TabCreatedEvent = js.native
  var onDetached: typings.chrome.chromeNs.tabsNs.TabDetachedEvent = js.native
  var onHighlightChanged: typings.chrome.chromeNs.tabsNs.TabHighlightedEvent = js.native
  var onHighlighted: typings.chrome.chromeNs.tabsNs.TabHighlightedEvent = js.native
  var onMoved: typings.chrome.chromeNs.tabsNs.TabMovedEvent = js.native
  var onRemoved: typings.chrome.chromeNs.tabsNs.TabRemovedEvent = js.native
  var onReplaced: typings.chrome.chromeNs.tabsNs.TabReplacedEvent = js.native
  var onSelectionChanged: typings.chrome.chromeNs.tabsNs.TabSelectedEvent = js.native
  var onUpdated: typings.chrome.chromeNs.tabsNs.TabUpdatedEvent = js.native
  var onZoomChange: typings.chrome.chromeNs.tabsNs.TabZoomChangeEvent = js.native
  def captureVisibleTab(callback: js.Function1[/* dataUrl */ String, Unit]): Unit = js.native
  def captureVisibleTab(
    options: typings.chrome.chromeNs.tabsNs.CaptureVisibleTabOptions,
    callback: js.Function1[/* dataUrl */ String, Unit]
  ): Unit = js.native
  def captureVisibleTab(windowId: Double, callback: js.Function1[/* dataUrl */ String, Unit]): Unit = js.native
  def captureVisibleTab(
    windowId: Double,
    options: typings.chrome.chromeNs.tabsNs.CaptureVisibleTabOptions,
    callback: js.Function1[/* dataUrl */ String, Unit]
  ): Unit = js.native
  def connect(tabId: Double): Port = js.native
  def connect(tabId: Double, connectInfo: typings.chrome.chromeNs.tabsNs.ConnectInfo): Port = js.native
  def create(createProperties: typings.chrome.chromeNs.tabsNs.CreateProperties): Unit = js.native
  def create(
    createProperties: typings.chrome.chromeNs.tabsNs.CreateProperties,
    callback: js.Function1[/* tab */ typings.chrome.chromeNs.tabsNs.Tab, Unit]
  ): Unit = js.native
  def detectLanguage(callback: js.Function1[/* language */ String, Unit]): Unit = js.native
  def detectLanguage(tabId: Double, callback: js.Function1[/* language */ String, Unit]): Unit = js.native
  def discard(): Unit = js.native
  def discard(tabId: Double): Unit = js.native
  def discard(tabId: Double, callback: js.Function1[/* tab */ typings.chrome.chromeNs.tabsNs.Tab, Unit]): Unit = js.native
  def duplicate(tabId: Double): Unit = js.native
  def duplicate(
    tabId: Double,
    callback: js.Function1[/* tab */ js.UndefOr[typings.chrome.chromeNs.tabsNs.Tab], Unit]
  ): Unit = js.native
  def executeScript(details: typings.chrome.chromeNs.tabsNs.InjectDetails): Unit = js.native
  def executeScript(
    details: typings.chrome.chromeNs.tabsNs.InjectDetails,
    callback: js.Function1[/* result */ js.Array[_], Unit]
  ): Unit = js.native
  def executeScript(tabId: Double, details: typings.chrome.chromeNs.tabsNs.InjectDetails): Unit = js.native
  def executeScript(
    tabId: Double,
    details: typings.chrome.chromeNs.tabsNs.InjectDetails,
    callback: js.Function1[/* result */ js.Array[_], Unit]
  ): Unit = js.native
  def get(tabId: Double, callback: js.Function1[/* tab */ typings.chrome.chromeNs.tabsNs.Tab, Unit]): Unit = js.native
  def getAllInWindow(callback: js.Function1[/* tab */ typings.chrome.chromeNs.tabsNs.Tab, Unit]): Unit = js.native
  def getAllInWindow(windowId: Double, callback: js.Function1[/* tab */ typings.chrome.chromeNs.tabsNs.Tab, Unit]): Unit = js.native
  def getCurrent(callback: js.Function1[/* tab */ js.UndefOr[typings.chrome.chromeNs.tabsNs.Tab], Unit]): Unit = js.native
  def getSelected(callback: js.Function1[/* tab */ typings.chrome.chromeNs.tabsNs.Tab, Unit]): Unit = js.native
  def getSelected(windowId: Double, callback: js.Function1[/* tab */ typings.chrome.chromeNs.tabsNs.Tab, Unit]): Unit = js.native
  def getZoom(callback: js.Function1[/* zoomFactor */ Double, Unit]): Unit = js.native
  def getZoom(tabId: Double, callback: js.Function1[/* zoomFactor */ Double, Unit]): Unit = js.native
  def getZoomSettings(callback: js.Function1[/* zoomSettings */ typings.chrome.chromeNs.tabsNs.ZoomSettings, Unit]): Unit = js.native
  def getZoomSettings(
    tabId: Double,
    callback: js.Function1[/* zoomSettings */ typings.chrome.chromeNs.tabsNs.ZoomSettings, Unit]
  ): Unit = js.native
  def highlight(highlightInfo: typings.chrome.chromeNs.tabsNs.HighlightInfo): Unit = js.native
  def highlight(
    highlightInfo: typings.chrome.chromeNs.tabsNs.HighlightInfo,
    callback: js.Function1[/* window */ typings.chrome.chromeNs.windowsNs.Window, Unit]
  ): Unit = js.native
  def insertCSS(details: typings.chrome.chromeNs.tabsNs.InjectDetails): Unit = js.native
  def insertCSS(details: typings.chrome.chromeNs.tabsNs.InjectDetails, callback: js.Function): Unit = js.native
  def insertCSS(tabId: Double, details: typings.chrome.chromeNs.tabsNs.InjectDetails): Unit = js.native
  def insertCSS(tabId: Double, details: typings.chrome.chromeNs.tabsNs.InjectDetails, callback: js.Function): Unit = js.native
  def move(tabId: Double, moveProperties: typings.chrome.chromeNs.tabsNs.MoveProperties): Unit = js.native
  def move(
    tabId: Double,
    moveProperties: typings.chrome.chromeNs.tabsNs.MoveProperties,
    callback: js.Function1[/* tab */ typings.chrome.chromeNs.tabsNs.Tab, Unit]
  ): Unit = js.native
  def move(tabIds: js.Array[Double], moveProperties: typings.chrome.chromeNs.tabsNs.MoveProperties): Unit = js.native
  def move(
    tabIds: js.Array[Double],
    moveProperties: typings.chrome.chromeNs.tabsNs.MoveProperties,
    callback: js.Function1[/* tabs */ js.Array[typings.chrome.chromeNs.tabsNs.Tab], Unit]
  ): Unit = js.native
  def query(
    queryInfo: typings.chrome.chromeNs.tabsNs.QueryInfo,
    callback: js.Function1[/* result */ js.Array[typings.chrome.chromeNs.tabsNs.Tab], Unit]
  ): Unit = js.native
  def reload(): Unit = js.native
  def reload(callback: js.Function0[Unit]): Unit = js.native
  def reload(reloadProperties: typings.chrome.chromeNs.tabsNs.ReloadProperties): Unit = js.native
  def reload(reloadProperties: typings.chrome.chromeNs.tabsNs.ReloadProperties, callback: js.Function0[Unit]): Unit = js.native
  def reload(tabId: Double): Unit = js.native
  def reload(tabId: Double, reloadProperties: typings.chrome.chromeNs.tabsNs.ReloadProperties): Unit = js.native
  def reload(
    tabId: Double,
    reloadProperties: typings.chrome.chromeNs.tabsNs.ReloadProperties,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def remove(tabId: Double): Unit = js.native
  def remove(tabId: Double, callback: js.Function): Unit = js.native
  def remove(tabIds: js.Array[Double]): Unit = js.native
  def remove(tabIds: js.Array[Double], callback: js.Function): Unit = js.native
  def sendMessage(tabId: Double, message: js.Any): Unit = js.native
  def sendMessage(tabId: Double, message: js.Any, options: typings.chrome.chromeNs.tabsNs.MessageSendOptions): Unit = js.native
  def sendMessage(
    tabId: Double,
    message: js.Any,
    options: typings.chrome.chromeNs.tabsNs.MessageSendOptions,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  def sendMessage(tabId: Double, message: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def sendRequest(tabId: Double, request: js.Any): Unit = js.native
  def sendRequest(tabId: Double, request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def setZoom(tabId: Double, zoomFactor: Double): Unit = js.native
  def setZoom(tabId: Double, zoomFactor: Double, callback: js.Function0[Unit]): Unit = js.native
  def setZoom(zoomFactor: Double): Unit = js.native
  def setZoom(zoomFactor: Double, callback: js.Function0[Unit]): Unit = js.native
  def setZoomSettings(tabId: Double, zoomSettings: typings.chrome.chromeNs.tabsNs.ZoomSettings): Unit = js.native
  def setZoomSettings(
    tabId: Double,
    zoomSettings: typings.chrome.chromeNs.tabsNs.ZoomSettings,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setZoomSettings(zoomSettings: typings.chrome.chromeNs.tabsNs.ZoomSettings): Unit = js.native
  def setZoomSettings(zoomSettings: typings.chrome.chromeNs.tabsNs.ZoomSettings, callback: js.Function0[Unit]): Unit = js.native
  def update(tabId: Double, updateProperties: typings.chrome.chromeNs.tabsNs.UpdateProperties): Unit = js.native
  def update(
    tabId: Double,
    updateProperties: typings.chrome.chromeNs.tabsNs.UpdateProperties,
    callback: js.Function1[/* tab */ js.UndefOr[typings.chrome.chromeNs.tabsNs.Tab], Unit]
  ): Unit = js.native
  def update(updateProperties: typings.chrome.chromeNs.tabsNs.UpdateProperties): Unit = js.native
  def update(
    updateProperties: typings.chrome.chromeNs.tabsNs.UpdateProperties,
    callback: js.Function1[/* tab */ js.UndefOr[typings.chrome.chromeNs.tabsNs.Tab], Unit]
  ): Unit = js.native
}

