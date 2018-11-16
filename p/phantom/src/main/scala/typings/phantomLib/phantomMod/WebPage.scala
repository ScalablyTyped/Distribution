package typings
package phantomLib.phantomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPage extends js.Object {
  def addCookie(cookie: ICookie): stdLib.Promise[scala.Boolean] = js.native
  def clearCookies(): stdLib.Promise[scala.Unit] = js.native
  def close(): stdLib.Promise[scala.Unit] = js.native
  def deleteCookie(cookieName: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def evaluate[R](callback: js.Function0[R]): stdLib.Promise[R] = js.native
  def evaluate[R](callback: js.Function1[/* repeated */js.Any, R], args: js.Any*): stdLib.Promise[R] = js.native
  def evaluate[T, R](callback: js.Function1[/* arg */ T, R], arg: T): stdLib.Promise[R] = js.native
  def evaluate[T1, T2, R](callback: js.Function2[/* arg1 */ T1, /* arg2 */ T2, R], arg1: T1, arg2: T2): stdLib.Promise[R] = js.native
  def evaluate[T1, T2, T3, R](
    callback: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, R],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): stdLib.Promise[R] = js.native
  def includeJs(url: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def injectJs(filename: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def off(
    event: phantomLib.phantomLibStrings.onResourceRequested | phantomLib.phantomLibStrings.onLoadFinished | phantomLib.phantomLibStrings.onAlert | phantomLib.phantomLibStrings.onCallback | phantomLib.phantomLibStrings.onClosing | phantomLib.phantomLibStrings.onConfirm | phantomLib.phantomLibStrings.onConsoleMessage | phantomLib.phantomLibStrings.onError | phantomLib.phantomLibStrings.onFilePicker | phantomLib.phantomLibStrings.onInitialized | phantomLib.phantomLibStrings.onLoadStarted | phantomLib.phantomLibStrings.onNavigationRequested | phantomLib.phantomLibStrings.onPageCreated | phantomLib.phantomLibStrings.onPrompt | phantomLib.phantomLibStrings.onResourceError | phantomLib.phantomLibStrings.onResourceReceived | phantomLib.phantomLibStrings.onResourceTimeout | phantomLib.phantomLibStrings.onUrlChanged
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  def on(
    event: phantomLib.phantomLibStrings.onLoadFinished,
    listener: js.Function1[
      /* status */ phantomLib.phantomLibStrings.success | phantomLib.phantomLibStrings.fail, 
      scala.Unit
    ]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  def on(
    event: phantomLib.phantomLibStrings.onLoadFinished,
    runOnPhantom: phantomLib.phantomLibNumbers.`false`,
    listener: js.Function1[
      /* status */ phantomLib.phantomLibStrings.success | phantomLib.phantomLibStrings.fail, 
      scala.Unit
    ]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  def on(
    event: phantomLib.phantomLibStrings.onNavigationRequested,
    listener: js.Function4[
      /* url */ java.lang.String, 
      /* type */ phantomLib.phantomLibStrings.Undefined | phantomLib.phantomLibStrings.LinkClicked | phantomLib.phantomLibStrings.FormSubmitted | phantomLib.phantomLibStrings.BackOrForward | phantomLib.phantomLibStrings.Reload | phantomLib.phantomLibStrings.FormResubmitted | phantomLib.phantomLibStrings.Other, 
      /* willNavigate */ scala.Boolean, 
      /* main */ scala.Boolean, 
      scala.Unit
    ]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  def on(
    event: phantomLib.phantomLibStrings.onNavigationRequested,
    runOnPhantom: phantomLib.phantomLibNumbers.`false`,
    listener: js.Function4[
      /* url */ java.lang.String, 
      /* type */ phantomLib.phantomLibStrings.Undefined | phantomLib.phantomLibStrings.LinkClicked | phantomLib.phantomLibStrings.FormSubmitted | phantomLib.phantomLibStrings.BackOrForward | phantomLib.phantomLibStrings.Reload | phantomLib.phantomLibStrings.FormResubmitted | phantomLib.phantomLibStrings.Other, 
      /* willNavigate */ scala.Boolean, 
      /* main */ scala.Boolean, 
      scala.Unit
    ]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onAlert(
    event: phantomLib.phantomLibStrings.onAlert,
    listener: js.Function1[/* msg */ java.lang.String, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onAlert(
    event: phantomLib.phantomLibStrings.onAlert,
    runOnPhantom: phantomLib.phantomLibNumbers.`false`,
    listener: js.Function1[/* msg */ java.lang.String, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onCallback(
    event: phantomLib.phantomLibStrings.onCallback,
    listener: js.Function1[/* data */ js.Any, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onCallback(
    event: phantomLib.phantomLibStrings.onCallback,
    runOnPhantom: phantomLib.phantomLibNumbers.`false`,
    listener: js.Function1[/* data */ js.Any, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onClosing(
    event: phantomLib.phantomLibStrings.onClosing,
    listener: js.Function1[/* closingPage */ js.Any, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onClosing(
    event: phantomLib.phantomLibStrings.onClosing,
    runOnPhantom: phantomLib.phantomLibNumbers.`false`,
    listener: js.Function1[/* closingPage */ js.Any, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onConfirm(
    event: phantomLib.phantomLibStrings.onConfirm,
    listener: js.Function1[/* msg */ java.lang.String, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onConfirm(
    event: phantomLib.phantomLibStrings.onConfirm,
    runOnPhantom: phantomLib.phantomLibNumbers.`false`,
    listener: js.Function1[/* msg */ java.lang.String, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onConsoleMessage(
    event: phantomLib.phantomLibStrings.onConsoleMessage,
    listener: js.Function3[
      /* msg */ java.lang.String, 
      /* lineNum */ scala.Double, 
      /* sourceId */ java.lang.String, 
      scala.Unit
    ]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onConsoleMessage(
    event: phantomLib.phantomLibStrings.onConsoleMessage,
    runOnPhantom: phantomLib.phantomLibNumbers.`false`,
    listener: js.Function3[
      /* msg */ java.lang.String, 
      /* lineNum */ scala.Double, 
      /* sourceId */ java.lang.String, 
      scala.Unit
    ]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onError(
    event: phantomLib.phantomLibStrings.onError,
    listener: js.Function2[
      /* msg */ java.lang.String, 
      /* trace */ js.Array[phantomLib.Anon_Function], 
      scala.Unit
    ]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onError(
    event: phantomLib.phantomLibStrings.onError,
    runOnPhantom: phantomLib.phantomLibNumbers.`false`,
    listener: js.Function2[
      /* msg */ java.lang.String, 
      /* trace */ js.Array[phantomLib.Anon_Function], 
      scala.Unit
    ]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onFilePicker(
    event: phantomLib.phantomLibStrings.onFilePicker,
    listener: js.Function1[/* oldFile */ js.Any, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onFilePicker(
    event: phantomLib.phantomLibStrings.onFilePicker,
    runOnPhantom: phantomLib.phantomLibNumbers.`false`,
    listener: js.Function1[/* oldFile */ js.Any, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onInitialized(event: phantomLib.phantomLibStrings.onInitialized, listener: js.Function0[scala.Unit]): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onInitialized(
    event: phantomLib.phantomLibStrings.onInitialized,
    runOnPhantom: phantomLib.phantomLibNumbers.`false`,
    listener: js.Function0[scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onLoadStarted(event: phantomLib.phantomLibStrings.onLoadStarted, listener: js.Function0[scala.Unit]): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onLoadStarted(
    event: phantomLib.phantomLibStrings.onLoadStarted,
    runOnPhantom: phantomLib.phantomLibNumbers.`false`,
    listener: js.Function0[scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onPageCreated(
    event: phantomLib.phantomLibStrings.onPageCreated,
    listener: js.Function1[/* newPage */ js.Any, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onPageCreated(
    event: phantomLib.phantomLibStrings.onPageCreated,
    runOnPhantom: phantomLib.phantomLibNumbers.`false`,
    listener: js.Function1[/* newPage */ js.Any, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onPrompt(
    event: phantomLib.phantomLibStrings.onPrompt,
    listener: js.Function2[/* msg */ java.lang.String, /* defaultVal */ java.lang.String, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onPrompt(
    event: phantomLib.phantomLibStrings.onPrompt,
    runOnPhantom: phantomLib.phantomLibNumbers.`false`,
    listener: js.Function2[/* msg */ java.lang.String, /* defaultVal */ java.lang.String, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onResourceError(
    event: phantomLib.phantomLibStrings.onResourceError,
    listener: js.Function1[/* resourceError */ phantomLib.Anon_ErrorCode, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onResourceError(
    event: phantomLib.phantomLibStrings.onResourceError,
    runOnPhantom: phantomLib.phantomLibNumbers.`false`,
    listener: js.Function1[/* resourceError */ phantomLib.Anon_ErrorCode, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onResourceReceived(
    event: phantomLib.phantomLibStrings.onResourceReceived,
    listener: js.Function1[/* response */ IResponse, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onResourceReceived(
    event: phantomLib.phantomLibStrings.onResourceReceived,
    runOnPhantom: phantomLib.phantomLibNumbers.`false`,
    listener: js.Function1[/* response */ IResponse, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onResourceRequested(
    event: phantomLib.phantomLibStrings.onResourceRequested,
    listener: js.Function2[
      /* requestData */ IRequestData, 
      /* networkRequest */ phantomLib.Anon_ChangeUrl, 
      scala.Unit
    ]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onResourceRequested(
    event: phantomLib.phantomLibStrings.onResourceRequested,
    runOnPhantom: phantomLib.phantomLibNumbers.`false`,
    listener: js.Function2[
      /* requestData */ IRequestData, 
      /* networkRequest */ phantomLib.Anon_ChangeUrl, 
      scala.Unit
    ]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onResourceTimeout(
    event: phantomLib.phantomLibStrings.onResourceTimeout,
    listener: js.Function1[/* request */ IRequestData with phantomLib.Anon_ErrorCodeErrorString, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onResourceTimeout(
    event: phantomLib.phantomLibStrings.onResourceTimeout,
    runOnPhantom: phantomLib.phantomLibNumbers.`false`,
    listener: js.Function1[/* request */ IRequestData with phantomLib.Anon_ErrorCodeErrorString, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onUrlChanged(
    event: phantomLib.phantomLibStrings.onUrlChanged,
    listener: js.Function1[/* targetUrl */ java.lang.String, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  @JSName("on")
  def on_onUrlChanged(
    event: phantomLib.phantomLibStrings.onUrlChanged,
    runOnPhantom: phantomLib.phantomLibNumbers.`false`,
    listener: js.Function1[/* targetUrl */ java.lang.String, scala.Unit]
  ): stdLib.Promise[phantomLib.Anon_PageId] = js.native
  def open(url: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def open(url: java.lang.String, settings: IOpenWebPageSettings): stdLib.Promise[java.lang.String] = js.native
  def property(
    key: phantomLib.phantomLibStrings.content | phantomLib.phantomLibStrings.plainText | phantomLib.phantomLibStrings.focusedFrameName | phantomLib.phantomLibStrings.frameContent | phantomLib.phantomLibStrings.frameName | phantomLib.phantomLibStrings.framePlainText | phantomLib.phantomLibStrings.frameTitle | phantomLib.phantomLibStrings.libraryPath | phantomLib.phantomLibStrings.offlineStoragePath | phantomLib.phantomLibStrings.title | phantomLib.phantomLibStrings.url | phantomLib.phantomLibStrings.windowName
  ): stdLib.Promise[java.lang.String] = js.native
  def property[T](key: java.lang.String): stdLib.Promise[T] = js.native
  def property[T](key: java.lang.String, value: T): stdLib.Promise[scala.Unit] = js.native
  @JSName("property")
  def property_canGoBack(key: phantomLib.phantomLibStrings.canGoBack): stdLib.Promise[scala.Boolean] = js.native
  @JSName("property")
  def property_canGoForward(key: phantomLib.phantomLibStrings.canGoForward): stdLib.Promise[scala.Boolean] = js.native
  @JSName("property")
  def property_clipRect(key: phantomLib.phantomLibStrings.clipRect): stdLib.Promise[phantomLib.Anon_Top] = js.native
  @JSName("property")
  def property_cookies(key: phantomLib.phantomLibStrings.cookies): stdLib.Promise[js.Array[ICookie]] = js.native
  @JSName("property")
  def property_customHeaders(key: phantomLib.phantomLibStrings.customHeaders): stdLib.Promise[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.native
  @JSName("property")
  def property_framesCount(key: phantomLib.phantomLibStrings.framesCount): stdLib.Promise[scala.Double] = js.native
  @JSName("property")
  def property_framesName(key: phantomLib.phantomLibStrings.framesName): stdLib.Promise[js.Array[java.lang.String]] = js.native
  @JSName("property")
  def property_navigationLocked(key: phantomLib.phantomLibStrings.navigationLocked): stdLib.Promise[scala.Boolean] = js.native
  @JSName("property")
  def property_offlineStorageQuota(key: phantomLib.phantomLibStrings.offlineStorageQuota): stdLib.Promise[scala.Double] = js.native
  @JSName("property")
  def property_ownsPages(key: phantomLib.phantomLibStrings.ownsPages): stdLib.Promise[scala.Boolean] = js.native
  @JSName("property")
  def property_pages(key: phantomLib.phantomLibStrings.pages): stdLib.Promise[js.Array[java.lang.String]] = js.native
  @JSName("property")
  def property_pagesWindowName(key: phantomLib.phantomLibStrings.pagesWindowName): stdLib.Promise[js.Array[java.lang.String]] = js.native
  @JSName("property")
  def property_paperSize(key: phantomLib.phantomLibStrings.paperSize): stdLib.Promise[IPaperSizeOptions] = js.native
  @JSName("property")
  def property_scrollPosition(key: phantomLib.phantomLibStrings.scrollPosition): stdLib.Promise[phantomLib.Anon_TopLeft] = js.native
  @JSName("property")
  def property_viewportSize(key: phantomLib.phantomLibStrings.viewportSize): stdLib.Promise[phantomLib.Anon_Height] = js.native
  @JSName("property")
  def property_zoomFactor(key: phantomLib.phantomLibStrings.zoomFactor): stdLib.Promise[scala.Double] = js.native
  def render(filename: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def render(filename: java.lang.String, options: phantomLib.Anon_Quality): stdLib.Promise[scala.Unit] = js.native
  def renderBase64(`type`: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def sendEvent(keyboardEventType: java.lang.String, key: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def sendEvent(keyboardEventType: java.lang.String, key: java.lang.String, null1: scala.Unit): stdLib.Promise[scala.Unit] = js.native
  def sendEvent(keyboardEventType: java.lang.String, key: java.lang.String, null1: scala.Unit, null2: scala.Unit): stdLib.Promise[scala.Unit] = js.native
  def sendEvent(
    keyboardEventType: java.lang.String,
    key: java.lang.String,
    null1: scala.Unit,
    null2: scala.Unit,
    modifier: scala.Double
  ): stdLib.Promise[scala.Unit] = js.native
  def sendEvent(mouseEventType: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def sendEvent(mouseEventType: java.lang.String, mouseX: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def sendEvent(mouseEventType: java.lang.String, mouseX: scala.Double, mouseY: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def sendEvent(
    mouseEventType: java.lang.String,
    mouseX: scala.Double,
    mouseY: scala.Double,
    button: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def setContent(html: java.lang.String, url: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def setting[T](key: java.lang.String): stdLib.Promise[T] = js.native
  def setting[T](key: java.lang.String, value: T): stdLib.Promise[T] = js.native
  @JSName("setting")
  def setting_XSSAuditingEnabled(key: phantomLib.phantomLibStrings.XSSAuditingEnabled): stdLib.Promise[scala.Boolean] = js.native
  @JSName("setting")
  def setting_javascriptEnabled(key: phantomLib.phantomLibStrings.javascriptEnabled): stdLib.Promise[scala.Boolean] = js.native
  @JSName("setting")
  def setting_loadImages(key: phantomLib.phantomLibStrings.loadImages): stdLib.Promise[scala.Boolean] = js.native
  @JSName("setting")
  def setting_localToRemoteUrlAccessEnabled(key: phantomLib.phantomLibStrings.localToRemoteUrlAccessEnabled): stdLib.Promise[scala.Boolean] = js.native
  @JSName("setting")
  def setting_password(key: phantomLib.phantomLibStrings.password): stdLib.Promise[java.lang.String] = js.native
  @JSName("setting")
  def setting_resourceTimeout(key: phantomLib.phantomLibStrings.resourceTimeout): stdLib.Promise[scala.Double] = js.native
  @JSName("setting")
  def setting_userAgent(key: phantomLib.phantomLibStrings.userAgent): stdLib.Promise[java.lang.String] = js.native
  @JSName("setting")
  def setting_userName(key: phantomLib.phantomLibStrings.userName): stdLib.Promise[java.lang.String] = js.native
  @JSName("setting")
  def setting_webSecurityEnabled(key: phantomLib.phantomLibStrings.webSecurityEnabled): stdLib.Promise[scala.Boolean] = js.native
}

