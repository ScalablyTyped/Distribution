package typings.phantom

import org.scalablytyped.runtime.StringDictionary
import typings.phantom.anon.Abort
import typings.phantom.anon.Bottom
import typings.phantom.anon.Contents
import typings.phantom.anon.ErrorCode
import typings.phantom.anon.File
import typings.phantom.anon.Format
import typings.phantom.anon.Height
import typings.phantom.anon.IRequestDataerrorCodenumb
import typings.phantom.anon.Left
import typings.phantom.anon.LogLevel
import typings.phantom.anon.Name
import typings.phantom.anon.PageId
import typings.phantom.anon.Width
import typings.phantom.phantomBooleans.`false`
import typings.phantom.phantomBooleans.`true`
import typings.phantom.phantomStrings.A3
import typings.phantom.phantomStrings.A4
import typings.phantom.phantomStrings.A5
import typings.phantom.phantomStrings.BackOrForward
import typings.phantom.phantomStrings.DELETE
import typings.phantom.phantomStrings.FormResubmitted
import typings.phantom.phantomStrings.FormSubmitted
import typings.phantom.phantomStrings.GET
import typings.phantom.phantomStrings.HEAD
import typings.phantom.phantomStrings.Legal
import typings.phantom.phantomStrings.Letter
import typings.phantom.phantomStrings.LinkClicked
import typings.phantom.phantomStrings.Other
import typings.phantom.phantomStrings.POST
import typings.phantom.phantomStrings.PUT
import typings.phantom.phantomStrings.Reload
import typings.phantom.phantomStrings.Tabloid
import typings.phantom.phantomStrings.Undefined
import typings.phantom.phantomStrings.XSSAuditingEnabled
import typings.phantom.phantomStrings.callback
import typings.phantom.phantomStrings.canGoBack
import typings.phantom.phantomStrings.canGoForward
import typings.phantom.phantomStrings.clipRect
import typings.phantom.phantomStrings.content
import typings.phantom.phantomStrings.cookies
import typings.phantom.phantomStrings.customHeaders
import typings.phantom.phantomStrings.end
import typings.phantom.phantomStrings.fail
import typings.phantom.phantomStrings.focusedFrameName
import typings.phantom.phantomStrings.frameContent
import typings.phantom.phantomStrings.frameName
import typings.phantom.phantomStrings.framePlainText
import typings.phantom.phantomStrings.frameTitle
import typings.phantom.phantomStrings.framesCount
import typings.phantom.phantomStrings.framesName
import typings.phantom.phantomStrings.javascriptEnabled
import typings.phantom.phantomStrings.landscape
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
import typings.phantom.phantomStrings.portrait
import typings.phantom.phantomStrings.resourceTimeout
import typings.phantom.phantomStrings.scrollPosition
import typings.phantom.phantomStrings.start
import typings.phantom.phantomStrings.success
import typings.phantom.phantomStrings.title
import typings.phantom.phantomStrings.url
import typings.phantom.phantomStrings.userAgent
import typings.phantom.phantomStrings.userName
import typings.phantom.phantomStrings.utf8
import typings.phantom.phantomStrings.viewportSize
import typings.phantom.phantomStrings.webSecurityEnabled
import typings.phantom.phantomStrings.windowName
import typings.phantom.phantomStrings.zoomFactor
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("phantom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): js.Promise[PhantomJS] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[PhantomJS]]
  inline def create(args: js.Array[String]): js.Promise[PhantomJS] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PhantomJS]]
  inline def create(args: js.Array[String], config: LogLevel): js.Promise[PhantomJS] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PhantomJS]]
  inline def create(args: Unit, config: LogLevel): js.Promise[PhantomJS] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PhantomJS]]
  
  trait ICookie extends StObject {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var expires: js.UndefOr[String] = js.undefined
    
    var httponly: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var path: String
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var value: String
  }
  object ICookie {
    
    inline def apply(name: String, path: String, value: String): ICookie = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICookie]
    }
    
    extension [Self <: ICookie](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setHttponly(value: Boolean): Self = StObject.set(x, "httponly", value.asInstanceOf[js.Any])
      
      inline def setHttponlyUndefined: Self = StObject.set(x, "httponly", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOpenWebPageSettings extends StObject {
    
    var data: js.UndefOr[String] = js.undefined
    
    var encoding: js.UndefOr[utf8 | String] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var operation: js.UndefOr[GET | POST | HEAD | DELETE | PUT | String] = js.undefined
  }
  object IOpenWebPageSettings {
    
    inline def apply(): IOpenWebPageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOpenWebPageSettings]
    }
    
    extension [Self <: IOpenWebPageSettings](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEncoding(value: utf8 | String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setOperation(value: GET | POST | HEAD | DELETE | PUT | String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    }
  }
  
  trait IPaperSizeOptions extends StObject {
    
    var footer: js.UndefOr[Contents] = js.undefined
    
    var format: js.UndefOr[A3 | A4 | A5 | Legal | Letter | Tabloid] = js.undefined
    
    var header: js.UndefOr[Contents] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var margin: js.UndefOr[String | Bottom] = js.undefined
    
    var orientation: js.UndefOr[portrait | landscape] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object IPaperSizeOptions {
    
    inline def apply(): IPaperSizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPaperSizeOptions]
    }
    
    extension [Self <: IPaperSizeOptions](x: Self) {
      
      inline def setFooter(value: Contents): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFormat(value: A3 | A4 | A5 | Legal | Letter | Tabloid): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeader(value: Contents): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMargin(value: String | Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IPhantomCallback extends StObject {
    
    var method: callback
    
    var parent: typings.phantom.phantomStrings.phantom
    
    var target: js.Function
    
    var transform: `true`
  }
  object IPhantomCallback {
    
    inline def apply(target: js.Function): IPhantomCallback = {
      val __obj = js.Dynamic.literal(method = "callback", parent = "phantom", target = target.asInstanceOf[js.Any], transform = true)
      __obj.asInstanceOf[IPhantomCallback]
    }
    
    extension [Self <: IPhantomCallback](x: Self) {
      
      inline def setMethod(value: callback): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParent(value: typings.phantom.phantomStrings.phantom): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: js.Function): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: `true`): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRequestData extends StObject {
    
    var headers: js.Array[Name]
    
    var id: Double
    
    var method: String
    
    var time: Date
    
    var url: String
  }
  object IRequestData {
    
    inline def apply(headers: js.Array[Name], id: Double, method: String, time: Date, url: String): IRequestData = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRequestData]
    }
    
    extension [Self <: IRequestData](x: Self) {
      
      inline def setHeaders(value: js.Array[Name]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: Name*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IResponse extends StObject {
    
    var bodySize: Double
    
    var contentType: String
    
    var headers: js.Array[Name]
    
    var id: String
    
    var redirectURL: String
    
    var stage: start | end
    
    var status: Double
    
    var statusText: String
    
    var time: Date
    
    var url: String
  }
  object IResponse {
    
    inline def apply(
      bodySize: Double,
      contentType: String,
      headers: js.Array[Name],
      id: String,
      redirectURL: String,
      stage: start | end,
      status: Double,
      statusText: String,
      time: Date,
      url: String
    ): IResponse = {
      val __obj = js.Dynamic.literal(bodySize = bodySize.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], redirectURL = redirectURL.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResponse]
    }
    
    extension [Self <: IResponse](x: Self) {
      
      inline def setBodySize(value: Double): Self = StObject.set(x, "bodySize", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: js.Array[Name]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: Name*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRedirectURL(value: String): Self = StObject.set(x, "redirectURL", value.asInstanceOf[js.Any])
      
      inline def setStage(value: start | end): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PhantomJS extends StObject {
    
    def callback(fn: js.Function2[/* pageNum */ Double, /* numPages */ Double, String]): IPhantomCallback = js.native
    
    def createPage(): js.Promise[WebPage] = js.native
    
    def exit(): Unit = js.native
    def exit(returnValue: Double): Unit = js.native
  }
  
  @js.native
  trait WebPage extends StObject {
    
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
    
    @JSName("off")
    def off_onAlert(event: onAlert): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onCallback(event: onCallback): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onClosing(event: onClosing): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onConfirm(event: onConfirm): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onConsoleMessage(event: onConsoleMessage): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onError(event: onError): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onFilePicker(event: onFilePicker): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onInitialized(event: onInitialized): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onLoadFinished(event: onLoadFinished): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onLoadStarted(event: onLoadStarted): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onNavigationRequested(event: onNavigationRequested): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onPageCreated(event: onPageCreated): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onPrompt(event: onPrompt): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onResourceError(event: onResourceError): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onResourceReceived(event: onResourceReceived): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onResourceRequested(event: onResourceRequested): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onResourceTimeout(event: onResourceTimeout): js.Promise[PageId] = js.native
    @JSName("off")
    def off_onUrlChanged(event: onUrlChanged): js.Promise[PageId] = js.native
    
    def on(event: onAlert, runOnPhantom: `false`, listener: js.Function1[/* msg */ String, Unit]): js.Promise[PageId] = js.native
    def on(event: onCallback, runOnPhantom: `false`, listener: js.Function1[/* data */ js.Any, Unit]): js.Promise[PageId] = js.native
    def on(event: onClosing, runOnPhantom: `false`, listener: js.Function1[/* closingPage */ js.Any, Unit]): js.Promise[PageId] = js.native
    def on(event: onConfirm, runOnPhantom: `false`, listener: js.Function1[/* msg */ String, Unit]): js.Promise[PageId] = js.native
    def on(
      event: onConsoleMessage,
      runOnPhantom: `false`,
      listener: js.Function3[/* msg */ String, /* lineNum */ Double, /* sourceId */ String, Unit]
    ): js.Promise[PageId] = js.native
    def on(
      event: onError,
      runOnPhantom: `false`,
      listener: js.Function2[/* msg */ String, /* trace */ js.Array[File], Unit]
    ): js.Promise[PageId] = js.native
    def on(event: onFilePicker, runOnPhantom: `false`, listener: js.Function1[/* oldFile */ js.Any, Unit]): js.Promise[PageId] = js.native
    def on(event: onInitialized, runOnPhantom: `false`, listener: js.Function0[Unit]): js.Promise[PageId] = js.native
    def on(event: onLoadFinished, listener: js.Function1[/* status */ success | fail, Unit]): js.Promise[PageId] = js.native
    def on(
      event: onLoadFinished,
      runOnPhantom: `false`,
      listener: js.Function1[/* status */ success | fail, Unit]
    ): js.Promise[PageId] = js.native
    def on(event: onLoadStarted, runOnPhantom: `false`, listener: js.Function0[Unit]): js.Promise[PageId] = js.native
    def on(
      event: onNavigationRequested,
      listener: js.Function4[
          /* url */ String, 
          /* type */ Undefined | LinkClicked | FormSubmitted | BackOrForward | Reload | FormResubmitted | Other, 
          /* willNavigate */ Boolean, 
          /* main */ Boolean, 
          Unit
        ]
    ): js.Promise[PageId] = js.native
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
    ): js.Promise[PageId] = js.native
    def on(event: onPageCreated, runOnPhantom: `false`, listener: js.Function1[/* newPage */ js.Any, Unit]): js.Promise[PageId] = js.native
    def on(
      event: onPrompt,
      runOnPhantom: `false`,
      listener: js.Function2[/* msg */ String, /* defaultVal */ String, Unit]
    ): js.Promise[PageId] = js.native
    def on(
      event: onResourceError,
      runOnPhantom: `false`,
      listener: js.Function1[/* resourceError */ ErrorCode, Unit]
    ): js.Promise[PageId] = js.native
    def on(
      event: onResourceReceived,
      runOnPhantom: `false`,
      listener: js.Function1[/* response */ IResponse, Unit]
    ): js.Promise[PageId] = js.native
    def on(
      event: onResourceRequested,
      runOnPhantom: `false`,
      listener: js.Function2[/* requestData */ IRequestData, /* networkRequest */ Abort, Unit]
    ): js.Promise[PageId] = js.native
    def on(
      event: onResourceTimeout,
      runOnPhantom: `false`,
      listener: js.Function1[/* request */ IRequestDataerrorCodenumb, Unit]
    ): js.Promise[PageId] = js.native
    def on(event: onUrlChanged, runOnPhantom: `false`, listener: js.Function1[/* targetUrl */ String, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onAlert(event: onAlert, listener: js.Function1[/* msg */ String, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onCallback(event: onCallback, listener: js.Function1[/* data */ js.Any, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onClosing(event: onClosing, listener: js.Function1[/* closingPage */ js.Any, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onConfirm(event: onConfirm, listener: js.Function1[/* msg */ String, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onConsoleMessage(
      event: onConsoleMessage,
      listener: js.Function3[/* msg */ String, /* lineNum */ Double, /* sourceId */ String, Unit]
    ): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onError(event: onError, listener: js.Function2[/* msg */ String, /* trace */ js.Array[File], Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onFilePicker(event: onFilePicker, listener: js.Function1[/* oldFile */ js.Any, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onInitialized(event: onInitialized, listener: js.Function0[Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onLoadStarted(event: onLoadStarted, listener: js.Function0[Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onPageCreated(event: onPageCreated, listener: js.Function1[/* newPage */ js.Any, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onPrompt(event: onPrompt, listener: js.Function2[/* msg */ String, /* defaultVal */ String, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onResourceError(event: onResourceError, listener: js.Function1[/* resourceError */ ErrorCode, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onResourceReceived(event: onResourceReceived, listener: js.Function1[/* response */ IResponse, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onResourceRequested(
      event: onResourceRequested,
      listener: js.Function2[/* requestData */ IRequestData, /* networkRequest */ Abort, Unit]
    ): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onResourceTimeout(event: onResourceTimeout, listener: js.Function1[/* request */ IRequestDataerrorCodenumb, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onUrlChanged(event: onUrlChanged, listener: js.Function1[/* targetUrl */ String, Unit]): js.Promise[PageId] = js.native
    
    def open(url: String): js.Promise[String] = js.native
    def open(url: String, settings: IOpenWebPageSettings): js.Promise[String] = js.native
    
    def property[T](key: String): js.Promise[T] = js.native
    def property[T](key: String, value: T): js.Promise[Unit] = js.native
    @JSName("property")
    def property_canGoBack(key: canGoBack): js.Promise[Boolean] = js.native
    @JSName("property")
    def property_canGoForward(key: canGoForward): js.Promise[Boolean] = js.native
    @JSName("property")
    def property_clipRect(key: clipRect): js.Promise[Height] = js.native
    @JSName("property")
    def property_content(key: content): js.Promise[String] = js.native
    @JSName("property")
    def property_cookies(key: cookies): js.Promise[js.Array[ICookie]] = js.native
    @JSName("property")
    def property_customHeaders(key: customHeaders): js.Promise[StringDictionary[String]] = js.native
    @JSName("property")
    def property_focusedFrameName(key: focusedFrameName): js.Promise[String] = js.native
    @JSName("property")
    def property_frameContent(key: frameContent): js.Promise[String] = js.native
    @JSName("property")
    def property_frameName(key: frameName): js.Promise[String] = js.native
    @JSName("property")
    def property_framePlainText(key: framePlainText): js.Promise[String] = js.native
    @JSName("property")
    def property_frameTitle(key: frameTitle): js.Promise[String] = js.native
    @JSName("property")
    def property_framesCount(key: framesCount): js.Promise[Double] = js.native
    @JSName("property")
    def property_framesName(key: framesName): js.Promise[js.Array[String]] = js.native
    @JSName("property")
    def property_libraryPath(key: libraryPath): js.Promise[String] = js.native
    @JSName("property")
    def property_navigationLocked(key: navigationLocked): js.Promise[Boolean] = js.native
    @JSName("property")
    def property_offlineStoragePath(key: offlineStoragePath): js.Promise[String] = js.native
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
    def property_plainText(key: plainText): js.Promise[String] = js.native
    @JSName("property")
    def property_scrollPosition(key: scrollPosition): js.Promise[Left] = js.native
    @JSName("property")
    def property_title(key: title): js.Promise[String] = js.native
    @JSName("property")
    def property_url(key: url): js.Promise[String] = js.native
    @JSName("property")
    def property_viewportSize(key: viewportSize): js.Promise[Width] = js.native
    @JSName("property")
    def property_windowName(key: windowName): js.Promise[String] = js.native
    @JSName("property")
    def property_zoomFactor(key: zoomFactor): js.Promise[Double] = js.native
    
    def render(filename: String): js.Promise[Unit] = js.native
    def render(filename: String, options: Format): js.Promise[Unit] = js.native
    
    def renderBase64(`type`: String): js.Promise[String] = js.native
    
    def sendEvent(keyboardEventType: String, key: String): js.Promise[Unit] = js.native
    def sendEvent(keyboardEventType: String, key: String, null1: Unit): js.Promise[Unit] = js.native
    def sendEvent(keyboardEventType: String, key: String, null1: Unit, null2: Unit): js.Promise[Unit] = js.native
    def sendEvent(keyboardEventType: String, key: String, null1: Unit, null2: Unit, modifier: Double): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String, mouseX: Double): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String, mouseX: Double, mouseY: Double): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String, mouseX: Double, mouseY: Double, button: String): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String, mouseX: Double, mouseY: Unit, button: String): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String, mouseX: Unit, mouseY: Double): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String, mouseX: Unit, mouseY: Double, button: String): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String, mouseX: Unit, mouseY: Unit, button: String): js.Promise[Unit] = js.native
    
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
  
  @js.native
  trait winstonLeveledLogMethod extends StObject {
    
    def apply(infoObject: js.Any): js.Any = js.native
    def apply(message: String, callback: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
    def apply(message: String, meta: js.Any*): js.Any = js.native
    def apply(message: String, meta: js.Any, callback: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  }
}
