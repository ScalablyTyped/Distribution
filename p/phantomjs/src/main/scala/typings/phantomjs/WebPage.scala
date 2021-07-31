package typings.phantomjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebPage extends StObject {
  
  // Functions
  def addCookie(cookie: Cookie): Boolean = js.native
  
  // Properties
  var canGoBack: Boolean = js.native
  
  var canGoForward: Boolean = js.native
  
  def childFramesCount(): Double = js.native
  
  // DEPRECATED
  def childFramesName(): String = js.native
  
  // DEPRECATED
  def clearCookies(): Unit = js.native
  
  var clipRect: ClipRect = js.native
  
  def close(): Unit = js.native
  
  // Callback triggers
  def closing(closingPage: WebPage): Unit = js.native
  
  var content: String = js.native
  
  var cookies: js.Array[Cookie] = js.native
  
  def currentFrameName(): String = js.native
  
  var customHeaders: StringDictionary[String] = js.native
  
  // DEPRECATED
  def deleteCookie(cookieName: String): Boolean = js.native
  
  def evaluate(fn: js.Function, args: js.Any*): js.Any = js.native
  
  def evaluateAsync(fn: js.Function): Unit = js.native
  
  def evaluateJavaScript(str: String): js.Any = js.native
  
  var event: js.Any = js.native
  
  // :TODO: elaborate this when documentation improves
  var focusedFrameName: String = js.native
  
  var frameContent: String = js.native
  
  var frameName: String = js.native
  
  var framePlainText: String = js.native
  
  var frameTitle: String = js.native
  
  var frameUrl: String = js.native
  
  var framesCount: Double = js.native
  
  var framesName: js.Any = js.native
  
  // :TODO: elaborate this when documentation improves
  def getPage(windowName: String): WebPage = js.native
  
  def go(index: Double): Unit = js.native
  
  def goBack(): Unit = js.native
  
  def goForward(): Unit = js.native
  
  def includeJs(url: String, callback: js.Function): Unit = js.native
  
  def initialized(): Unit = js.native
  
  def injectJs(filename: String): Boolean = js.native
  
  def javaScriptAlertSent(msg: String): Unit = js.native
  
  def javaScriptConsoleMessageSent(msg: String): Unit = js.native
  def javaScriptConsoleMessageSent(msg: String, lineNum: Double): Unit = js.native
  def javaScriptConsoleMessageSent(msg: String, lineNum: Double, sourceId: String): Unit = js.native
  def javaScriptConsoleMessageSent(msg: String, lineNum: Unit, sourceId: String): Unit = js.native
  
  // :TODO: elaborate this when documentation improves
  var libraryPath: String = js.native
  
  def loadFinished(status: String): Unit = js.native
  
  def loadStarted(): Unit = js.native
  
  var navigationLocked: Boolean = js.native
  
  def navigationRequested(url: String, `type`: String, willNavigate: Boolean, main: Boolean): Unit = js.native
  
  var offlineStoragePath: String = js.native
  
  var offlineStorageQuota: Double = js.native
  
  // Callbacks
  def onAlert(msg: String): js.Any = js.native
  
  var onCallback: js.Function = js.native
  
  // EXPERIMENTAL
  def onClosing(closingPage: WebPage): js.Any = js.native
  
  def onConfirm(msg: String): Boolean = js.native
  
  def onConsoleMessage(msg: String): js.Any = js.native
  def onConsoleMessage(msg: String, lineNum: Double): js.Any = js.native
  def onConsoleMessage(msg: String, lineNum: Double, sourceId: String): js.Any = js.native
  def onConsoleMessage(msg: String, lineNum: Unit, sourceId: String): js.Any = js.native
  
  def onError(msg: String, trace: js.Array[String]): js.Any = js.native
  
  def onFilePicker(oldFile: String): String = js.native
  
  def onInitialized(): js.Any = js.native
  
  def onLoadFinished(status: String): js.Any = js.native
  
  def onLoadStarted(): js.Any = js.native
  
  def onNavigationRequested(url: String, `type`: String, willNavigate: Boolean, main: Boolean): js.Any = js.native
  
  def onPageCreated(newPage: WebPage): js.Any = js.native
  
  def onPrompt(msg: String, defaultVal: String): String = js.native
  
  def onResourceError(resourceError: ResourceError): js.Any = js.native
  
  def onResourceReceived(response: ResourceResponse): js.Any = js.native
  
  def onResourceRequested(requestData: ResourceRequest, networkRequest: NetworkRequest): js.Any = js.native
  
  def onUrlChanged(targetUrl: String): js.Any = js.native
  
  def open(url: String, callback: js.Function1[/* status */ String, js.Any]): Unit = js.native
  def open(url: String, method: String, callback: js.Function1[/* status */ String, js.Any]): Unit = js.native
  def open(url: String, method: String, data: js.Any, callback: js.Function1[/* status */ String, js.Any]): Unit = js.native
  
  def openUrl(url: String, httpConf: js.Any, settings: js.Any): Unit = js.native
  
  var ownsPages: Boolean = js.native
  
  var pages: js.Array[WebPage] = js.native
  
  var pagesWindowName: String = js.native
  
  var paperSize: PaperSize = js.native
  
  var plainText: String = js.native
  
  def rawPageCreated(newPage: WebPage): Unit = js.native
  
  // :TODO: elaborate this when documentation improves
  def release(): Unit = js.native
  
  // DEPRECATED
  def reload(): Unit = js.native
  
  def render(filename: String): Unit = js.native
  
  def renderBase64(format: String): String = js.native
  
  def resourceReceived(response: ResourceResponse): Unit = js.native
  
  def resourceRequested(requestData: ResourceRequest, networkRequest: NetworkRequest): Unit = js.native
  
  var scrollPosition: TopLeft = js.native
  
  def sendEvent(keyboardEventType: String, keyOrKeys: js.Any): Unit = js.native
  def sendEvent(keyboardEventType: String, keyOrKeys: js.Any, aNull: js.Any): Unit = js.native
  def sendEvent(keyboardEventType: String, keyOrKeys: js.Any, aNull: js.Any, bNull: js.Any): Unit = js.native
  def sendEvent(keyboardEventType: String, keyOrKeys: js.Any, aNull: js.Any, bNull: js.Any, modifier: Double): Unit = js.native
  def sendEvent(keyboardEventType: String, keyOrKeys: js.Any, aNull: js.Any, bNull: Unit, modifier: Double): Unit = js.native
  def sendEvent(keyboardEventType: String, keyOrKeys: js.Any, aNull: Unit, bNull: js.Any): Unit = js.native
  def sendEvent(keyboardEventType: String, keyOrKeys: js.Any, aNull: Unit, bNull: js.Any, modifier: Double): Unit = js.native
  def sendEvent(keyboardEventType: String, keyOrKeys: js.Any, aNull: Unit, bNull: Unit, modifier: Double): Unit = js.native
  def sendEvent(mouseEventType: String): Unit = js.native
  def sendEvent(mouseEventType: String, mouseX: Double): Unit = js.native
  def sendEvent(mouseEventType: String, mouseX: Double, mouseY: Double): Unit = js.native
  def sendEvent(mouseEventType: String, mouseX: Double, mouseY: Double, button: String): Unit = js.native
  def sendEvent(mouseEventType: String, mouseX: Double, mouseY: Unit, button: String): Unit = js.native
  def sendEvent(mouseEventType: String, mouseX: Unit, mouseY: Double): Unit = js.native
  def sendEvent(mouseEventType: String, mouseX: Unit, mouseY: Double, button: String): Unit = js.native
  def sendEvent(mouseEventType: String, mouseX: Unit, mouseY: Unit, button: String): Unit = js.native
  
  def setContent(content: String, url: String): Unit = js.native
  
  var settings: WebPageSettings = js.native
  
  def stop(): Unit = js.native
  
  def switchToChildFrame(frameName: String): Unit = js.native
  def switchToChildFrame(framePosition: Double): Unit = js.native
  
  def switchToFocusedFrame(): Unit = js.native
  
  def switchToFrame(frameName: String): Unit = js.native
  def switchToFrame(framePosition: Double): Unit = js.native
  
  def switchToMainFrame(): Unit = js.native
  
  // DEPRECATED
  def switchToParentFrame(): Unit = js.native
  
  var title: String = js.native
  
  // DEPRECATED
  def uploadFile(selector: String, filename: String): Unit = js.native
  
  var url: String = js.native
  
  def urlChanged(targetUrl: String): Unit = js.native
  
  var viewportSize: Size = js.native
  
  var windowName: String = js.native
  
  var zoomFactor: Double = js.native
}
