package typings.phantom.mod

import org.scalablytyped.runtime.StringDictionary
import typings.phantom.AnonAbort
import typings.phantom.AnonErrorCode
import typings.phantom.AnonErrorCodeErrorString
import typings.phantom.AnonFile
import typings.phantom.AnonFormat
import typings.phantom.AnonHeight
import typings.phantom.AnonHeightWidth
import typings.phantom.AnonLeft
import typings.phantom.AnonPageId
import typings.phantom.phantomBooleans.`false`
import typings.phantom.phantomStrings.BackOrForward
import typings.phantom.phantomStrings.FormResubmitted
import typings.phantom.phantomStrings.FormSubmitted
import typings.phantom.phantomStrings.LinkClicked
import typings.phantom.phantomStrings.Other
import typings.phantom.phantomStrings.Reload
import typings.phantom.phantomStrings.Undefined
import typings.phantom.phantomStrings.XSSAuditingEnabled
import typings.phantom.phantomStrings.canGoBack
import typings.phantom.phantomStrings.canGoForward
import typings.phantom.phantomStrings.clipRect
import typings.phantom.phantomStrings.content
import typings.phantom.phantomStrings.cookies
import typings.phantom.phantomStrings.customHeaders
import typings.phantom.phantomStrings.fail
import typings.phantom.phantomStrings.focusedFrameName
import typings.phantom.phantomStrings.frameContent
import typings.phantom.phantomStrings.frameName
import typings.phantom.phantomStrings.framePlainText
import typings.phantom.phantomStrings.frameTitle
import typings.phantom.phantomStrings.framesCount
import typings.phantom.phantomStrings.framesName
import typings.phantom.phantomStrings.javascriptEnabled
import typings.phantom.phantomStrings.libraryPath
import typings.phantom.phantomStrings.loadImages
import typings.phantom.phantomStrings.localToRemoteUrlAccessEnabled
import typings.phantom.phantomStrings.navigationLocked
import typings.phantom.phantomStrings.offlineStoragePath
import typings.phantom.phantomStrings.offlineStorageQuota
import typings.phantom.phantomStrings.onAlert
import typings.phantom.phantomStrings.onCallback
import typings.phantom.phantomStrings.onClosing
import typings.phantom.phantomStrings.onConfirm
import typings.phantom.phantomStrings.onConsoleMessage
import typings.phantom.phantomStrings.onError
import typings.phantom.phantomStrings.onFilePicker
import typings.phantom.phantomStrings.onInitialized
import typings.phantom.phantomStrings.onLoadFinished
import typings.phantom.phantomStrings.onLoadStarted
import typings.phantom.phantomStrings.onNavigationRequested
import typings.phantom.phantomStrings.onPageCreated
import typings.phantom.phantomStrings.onPrompt
import typings.phantom.phantomStrings.onResourceError
import typings.phantom.phantomStrings.onResourceReceived
import typings.phantom.phantomStrings.onResourceRequested
import typings.phantom.phantomStrings.onResourceTimeout
import typings.phantom.phantomStrings.onUrlChanged
import typings.phantom.phantomStrings.ownsPages
import typings.phantom.phantomStrings.pages
import typings.phantom.phantomStrings.pagesWindowName
import typings.phantom.phantomStrings.paperSize
import typings.phantom.phantomStrings.password
import typings.phantom.phantomStrings.plainText
import typings.phantom.phantomStrings.resourceTimeout
import typings.phantom.phantomStrings.scrollPosition
import typings.phantom.phantomStrings.success
import typings.phantom.phantomStrings.title
import typings.phantom.phantomStrings.url
import typings.phantom.phantomStrings.userAgent
import typings.phantom.phantomStrings.userName
import typings.phantom.phantomStrings.viewportSize
import typings.phantom.phantomStrings.webSecurityEnabled
import typings.phantom.phantomStrings.windowName
import typings.phantom.phantomStrings.zoomFactor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPage extends js.Object {
  def addCookie(cookie: ICookie): js.Promise[Boolean] = js.native
  def clearCookies(): js.Promise[Unit] = js.native
  def close(): js.Promise[Unit] = js.native
  def deleteCookie(cookieName: String): js.Promise[Boolean] = js.native
  def evaluate[R](callback: js.Function0[R]): js.Promise[R] = js.native
  def evaluate[R](callback: js.Function1[/* repeated */ js.Any, R], args: js.Any*): js.Promise[R] = js.native
  def evaluate[T, R](callback: js.Function1[/* arg */ T, R], arg: T): js.Promise[R] = js.native
  def evaluate[T1, T2, R](callback: js.Function2[/* arg1 */ T1, /* arg2 */ T2, R], arg1: T1, arg2: T2): js.Promise[R] = js.native
  def evaluate[T1, T2, T3, R](
    callback: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, R],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): js.Promise[R] = js.native
  def includeJs(url: String): js.Promise[Unit] = js.native
  def injectJs(filename: String): js.Promise[Boolean] = js.native
  def off(
    event: onResourceRequested | onLoadFinished | onAlert | onCallback | onClosing | onConfirm | onConsoleMessage | onError | onFilePicker | onInitialized | onLoadStarted | onNavigationRequested | onPageCreated | onPrompt | onResourceError | onResourceReceived | onResourceTimeout | onUrlChanged
  ): js.Promise[AnonPageId] = js.native
  def on(event: onAlert, runOnPhantom: `false`, listener: js.Function1[/* msg */ String, Unit]): js.Promise[AnonPageId] = js.native
  def on(event: onCallback, runOnPhantom: `false`, listener: js.Function1[/* data */ js.Any, Unit]): js.Promise[AnonPageId] = js.native
  def on(event: onClosing, runOnPhantom: `false`, listener: js.Function1[/* closingPage */ js.Any, Unit]): js.Promise[AnonPageId] = js.native
  def on(event: onConfirm, runOnPhantom: `false`, listener: js.Function1[/* msg */ String, Unit]): js.Promise[AnonPageId] = js.native
  def on(
    event: onConsoleMessage,
    runOnPhantom: `false`,
    listener: js.Function3[/* msg */ String, /* lineNum */ Double, /* sourceId */ String, Unit]
  ): js.Promise[AnonPageId] = js.native
  def on(
    event: onError,
    runOnPhantom: `false`,
    listener: js.Function2[/* msg */ String, /* trace */ js.Array[AnonFile], Unit]
  ): js.Promise[AnonPageId] = js.native
  def on(event: onFilePicker, runOnPhantom: `false`, listener: js.Function1[/* oldFile */ js.Any, Unit]): js.Promise[AnonPageId] = js.native
  def on(event: onInitialized, runOnPhantom: `false`, listener: js.Function0[Unit]): js.Promise[AnonPageId] = js.native
  def on(event: onLoadFinished, listener: js.Function1[/* status */ success | fail, Unit]): js.Promise[AnonPageId] = js.native
  def on(
    event: onLoadFinished,
    runOnPhantom: `false`,
    listener: js.Function1[/* status */ success | fail, Unit]
  ): js.Promise[AnonPageId] = js.native
  def on(event: onLoadStarted, runOnPhantom: `false`, listener: js.Function0[Unit]): js.Promise[AnonPageId] = js.native
  def on(
    event: onNavigationRequested,
    listener: js.Function4[
      /* url */ String, 
      /* type */ Undefined | LinkClicked | FormSubmitted | BackOrForward | Reload | FormResubmitted | Other, 
      /* willNavigate */ Boolean, 
      /* main */ Boolean, 
      Unit
    ]
  ): js.Promise[AnonPageId] = js.native
  def on(
    event: onNavigationRequested,
    runOnPhantom: `false`,
    listener: js.Function4[
      /* url */ String, 
      /* type */ Undefined | LinkClicked | FormSubmitted | BackOrForward | Reload | FormResubmitted | Other, 
      /* willNavigate */ Boolean, 
      /* main */ Boolean, 
      Unit
    ]
  ): js.Promise[AnonPageId] = js.native
  def on(event: onPageCreated, runOnPhantom: `false`, listener: js.Function1[/* newPage */ js.Any, Unit]): js.Promise[AnonPageId] = js.native
  def on(
    event: onPrompt,
    runOnPhantom: `false`,
    listener: js.Function2[/* msg */ String, /* defaultVal */ String, Unit]
  ): js.Promise[AnonPageId] = js.native
  def on(
    event: onResourceError,
    runOnPhantom: `false`,
    listener: js.Function1[/* resourceError */ AnonErrorCode, Unit]
  ): js.Promise[AnonPageId] = js.native
  def on(
    event: onResourceReceived,
    runOnPhantom: `false`,
    listener: js.Function1[/* response */ IResponse, Unit]
  ): js.Promise[AnonPageId] = js.native
  def on(
    event: onResourceRequested,
    runOnPhantom: `false`,
    listener: js.Function2[/* requestData */ IRequestData, /* networkRequest */ AnonAbort, Unit]
  ): js.Promise[AnonPageId] = js.native
  def on(
    event: onResourceTimeout,
    runOnPhantom: `false`,
    listener: js.Function1[/* request */ IRequestData with AnonErrorCodeErrorString, Unit]
  ): js.Promise[AnonPageId] = js.native
  def on(event: onUrlChanged, runOnPhantom: `false`, listener: js.Function1[/* targetUrl */ String, Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onAlert(event: onAlert, listener: js.Function1[/* msg */ String, Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onCallback(event: onCallback, listener: js.Function1[/* data */ js.Any, Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onClosing(event: onClosing, listener: js.Function1[/* closingPage */ js.Any, Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onConfirm(event: onConfirm, listener: js.Function1[/* msg */ String, Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onConsoleMessage(
    event: onConsoleMessage,
    listener: js.Function3[/* msg */ String, /* lineNum */ Double, /* sourceId */ String, Unit]
  ): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onError(event: onError, listener: js.Function2[/* msg */ String, /* trace */ js.Array[AnonFile], Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onFilePicker(event: onFilePicker, listener: js.Function1[/* oldFile */ js.Any, Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onInitialized(event: onInitialized, listener: js.Function0[Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onLoadStarted(event: onLoadStarted, listener: js.Function0[Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onPageCreated(event: onPageCreated, listener: js.Function1[/* newPage */ js.Any, Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onPrompt(event: onPrompt, listener: js.Function2[/* msg */ String, /* defaultVal */ String, Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onResourceError(event: onResourceError, listener: js.Function1[/* resourceError */ AnonErrorCode, Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onResourceReceived(event: onResourceReceived, listener: js.Function1[/* response */ IResponse, Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onResourceRequested(
    event: onResourceRequested,
    listener: js.Function2[/* requestData */ IRequestData, /* networkRequest */ AnonAbort, Unit]
  ): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onResourceTimeout(
    event: onResourceTimeout,
    listener: js.Function1[/* request */ IRequestData with AnonErrorCodeErrorString, Unit]
  ): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onUrlChanged(event: onUrlChanged, listener: js.Function1[/* targetUrl */ String, Unit]): js.Promise[AnonPageId] = js.native
  def open(url: String): js.Promise[String] = js.native
  def open(url: String, settings: IOpenWebPageSettings): js.Promise[String] = js.native
  def property(
    key: content | plainText | focusedFrameName | frameContent | frameName | framePlainText | frameTitle | libraryPath | offlineStoragePath | title | url | windowName
  ): js.Promise[String] = js.native
  def property[T](key: String): js.Promise[T] = js.native
  def property[T](key: String, value: T): js.Promise[Unit] = js.native
  @JSName("property")
  def property_canGoBack(key: canGoBack): js.Promise[Boolean] = js.native
  @JSName("property")
  def property_canGoForward(key: canGoForward): js.Promise[Boolean] = js.native
  @JSName("property")
  def property_clipRect(key: clipRect): js.Promise[AnonHeight] = js.native
  @JSName("property")
  def property_cookies(key: cookies): js.Promise[js.Array[ICookie]] = js.native
  @JSName("property")
  def property_customHeaders(key: customHeaders): js.Promise[StringDictionary[String]] = js.native
  @JSName("property")
  def property_framesCount(key: framesCount): js.Promise[Double] = js.native
  @JSName("property")
  def property_framesName(key: framesName): js.Promise[js.Array[String]] = js.native
  @JSName("property")
  def property_navigationLocked(key: navigationLocked): js.Promise[Boolean] = js.native
  @JSName("property")
  def property_offlineStorageQuota(key: offlineStorageQuota): js.Promise[Double] = js.native
  @JSName("property")
  def property_ownsPages(key: ownsPages): js.Promise[Boolean] = js.native
  @JSName("property")
  def property_pages(key: pages): js.Promise[js.Array[String]] = js.native
  @JSName("property")
  def property_pagesWindowName(key: pagesWindowName): js.Promise[js.Array[String]] = js.native
  @JSName("property")
  def property_paperSize(key: paperSize): js.Promise[IPaperSizeOptions] = js.native
  @JSName("property")
  def property_scrollPosition(key: scrollPosition): js.Promise[AnonLeft] = js.native
  @JSName("property")
  def property_viewportSize(key: viewportSize): js.Promise[AnonHeightWidth] = js.native
  @JSName("property")
  def property_zoomFactor(key: zoomFactor): js.Promise[Double] = js.native
  def render(filename: String): js.Promise[Unit] = js.native
  def render(filename: String, options: AnonFormat): js.Promise[Unit] = js.native
  def renderBase64(`type`: String): js.Promise[String] = js.native
  def sendEvent(keyboardEventType: String, key: String): js.Promise[Unit] = js.native
  def sendEvent(keyboardEventType: String, key: String, null1: Unit): js.Promise[Unit] = js.native
  def sendEvent(keyboardEventType: String, key: String, null1: Unit, null2: Unit): js.Promise[Unit] = js.native
  def sendEvent(keyboardEventType: String, key: String, null1: Unit, null2: Unit, modifier: Double): js.Promise[Unit] = js.native
  def sendEvent(mouseEventType: String): js.Promise[Unit] = js.native
  def sendEvent(mouseEventType: String, mouseX: Double): js.Promise[Unit] = js.native
  def sendEvent(mouseEventType: String, mouseX: Double, mouseY: Double): js.Promise[Unit] = js.native
  def sendEvent(mouseEventType: String, mouseX: Double, mouseY: Double, button: String): js.Promise[Unit] = js.native
  def setContent(html: String, url: String): js.Promise[String] = js.native
  def setting[T](key: String): js.Promise[T] = js.native
  def setting[T](key: String, value: T): js.Promise[T] = js.native
  @JSName("setting")
  def setting_XSSAuditingEnabled(key: XSSAuditingEnabled): js.Promise[Boolean] = js.native
  @JSName("setting")
  def setting_javascriptEnabled(key: javascriptEnabled): js.Promise[Boolean] = js.native
  @JSName("setting")
  def setting_loadImages(key: loadImages): js.Promise[Boolean] = js.native
  @JSName("setting")
  def setting_localToRemoteUrlAccessEnabled(key: localToRemoteUrlAccessEnabled): js.Promise[Boolean] = js.native
  @JSName("setting")
  def setting_password(key: password): js.Promise[String] = js.native
  @JSName("setting")
  def setting_resourceTimeout(key: resourceTimeout): js.Promise[Double] = js.native
  @JSName("setting")
  def setting_userAgent(key: userAgent): js.Promise[String] = js.native
  @JSName("setting")
  def setting_userName(key: userName): js.Promise[String] = js.native
  @JSName("setting")
  def setting_webSecurityEnabled(key: webSecurityEnabled): js.Promise[Boolean] = js.native
}

