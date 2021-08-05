package typings.nightmare

import typings.nightmare.anon.Downloads
import typings.nightmare.anon.Height
import typings.nightmare.anon.Mode
import typings.nightmare.nightmareStrings.HTMLComplete
import typings.nightmare.nightmareStrings.HTMLOnly
import typings.nightmare.nightmareStrings.MHTML
import typings.nightmare.nightmareStrings.alert
import typings.nightmare.nightmareStrings.cancel
import typings.nightmare.nightmareStrings.confirm
import typings.nightmare.nightmareStrings.consoleMessage
import typings.nightmare.nightmareStrings.continue
import typings.nightmare.nightmareStrings.error
import typings.nightmare.nightmareStrings.initialized
import typings.nightmare.nightmareStrings.loadFinished
import typings.nightmare.nightmareStrings.loadStarted
import typings.nightmare.nightmareStrings.navigationRequested
import typings.nightmare.nightmareStrings.prompt
import typings.nightmare.nightmareStrings.resourceError
import typings.nightmare.nightmareStrings.resourceReceived
import typings.nightmare.nightmareStrings.resourceRequested
import typings.nightmare.nightmareStrings.timeout
import typings.nightmare.nightmareStrings.urlChanged
import typings.node.Buffer
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nightmare", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Nightmare {
    def this(options: IConstructorOptions) = this()
  }
  
  @JSImport("nightmare", "Cookies")
  @js.native
  class Cookies () extends StObject {
    
    def clear(): Nightmare = js.native
    def clear(name: String): Nightmare = js.native
    
    def clearAll(): Nightmare = js.native
    
    def get(): js.Array[ICookie] = js.native
    def get(name: String): ICookie = js.native
    def get(query: ICookieQuery): js.Array[ICookie] = js.native
    
    def set(cookies: js.Array[ICookie]): Nightmare = js.native
    def set(cookie: ICookie): Nightmare = js.native
    def set(name: String, value: String): Nightmare = js.native
  }
  
  trait IConstructorOptions extends StObject {
    
    var cookiesFile: js.UndefOr[String] = js.undefined
    
    var electronPath: js.UndefOr[String] = js.undefined
    
    var executionTimeout: js.UndefOr[Double] = js.undefined
    
    //in ms
    var gotoTimeout: js.UndefOr[Double] = js.undefined
    
    var ignoreDownloads: js.UndefOr[Boolean] = js.undefined
    
    var ignoreSslErrors: js.UndefOr[Boolean] = js.undefined
    
    var interval: js.UndefOr[js.Any] = js.undefined
    
    var loadImages: js.UndefOr[Boolean] = js.undefined
    
    var maxDownloadRequestWait: js.UndefOr[Double] = js.undefined
    
    var openDevTools: js.UndefOr[Mode] = js.undefined
    
    var paths: js.UndefOr[Downloads] = js.undefined
    
    var phantomPath: js.UndefOr[String] = js.undefined
    
    var pollInterval: js.UndefOr[Double] = js.undefined
    
    // number | string;
    var port: js.UndefOr[Double] = js.undefined
    
    var proxy: js.UndefOr[String] = js.undefined
    
    var proxyAuth: js.UndefOr[String] = js.undefined
    
    var proxyType: js.UndefOr[String] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var sslProtocol: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[js.Any] = js.undefined
    
    var typeInterval: js.UndefOr[Double] = js.undefined
    
    // number | string;
    var waitTimeout: js.UndefOr[Double] = js.undefined
    
    var weak: js.UndefOr[Boolean] = js.undefined
    
    var webSecurity: js.UndefOr[Boolean] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object IConstructorOptions {
    
    inline def apply(): IConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IConstructorOptions]
    }
    
    extension [Self <: IConstructorOptions](x: Self) {
      
      inline def setCookiesFile(value: String): Self = StObject.set(x, "cookiesFile", value.asInstanceOf[js.Any])
      
      inline def setCookiesFileUndefined: Self = StObject.set(x, "cookiesFile", js.undefined)
      
      inline def setElectronPath(value: String): Self = StObject.set(x, "electronPath", value.asInstanceOf[js.Any])
      
      inline def setElectronPathUndefined: Self = StObject.set(x, "electronPath", js.undefined)
      
      inline def setExecutionTimeout(value: Double): Self = StObject.set(x, "executionTimeout", value.asInstanceOf[js.Any])
      
      inline def setExecutionTimeoutUndefined: Self = StObject.set(x, "executionTimeout", js.undefined)
      
      inline def setGotoTimeout(value: Double): Self = StObject.set(x, "gotoTimeout", value.asInstanceOf[js.Any])
      
      inline def setGotoTimeoutUndefined: Self = StObject.set(x, "gotoTimeout", js.undefined)
      
      inline def setIgnoreDownloads(value: Boolean): Self = StObject.set(x, "ignoreDownloads", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDownloadsUndefined: Self = StObject.set(x, "ignoreDownloads", js.undefined)
      
      inline def setIgnoreSslErrors(value: Boolean): Self = StObject.set(x, "ignoreSslErrors", value.asInstanceOf[js.Any])
      
      inline def setIgnoreSslErrorsUndefined: Self = StObject.set(x, "ignoreSslErrors", js.undefined)
      
      inline def setInterval(value: js.Any): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setLoadImages(value: Boolean): Self = StObject.set(x, "loadImages", value.asInstanceOf[js.Any])
      
      inline def setLoadImagesUndefined: Self = StObject.set(x, "loadImages", js.undefined)
      
      inline def setMaxDownloadRequestWait(value: Double): Self = StObject.set(x, "maxDownloadRequestWait", value.asInstanceOf[js.Any])
      
      inline def setMaxDownloadRequestWaitUndefined: Self = StObject.set(x, "maxDownloadRequestWait", js.undefined)
      
      inline def setOpenDevTools(value: Mode): Self = StObject.set(x, "openDevTools", value.asInstanceOf[js.Any])
      
      inline def setOpenDevToolsUndefined: Self = StObject.set(x, "openDevTools", js.undefined)
      
      inline def setPaths(value: Downloads): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPhantomPath(value: String): Self = StObject.set(x, "phantomPath", value.asInstanceOf[js.Any])
      
      inline def setPhantomPathUndefined: Self = StObject.set(x, "phantomPath", js.undefined)
      
      inline def setPollInterval(value: Double): Self = StObject.set(x, "pollInterval", value.asInstanceOf[js.Any])
      
      inline def setPollIntervalUndefined: Self = StObject.set(x, "pollInterval", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyAuth(value: String): Self = StObject.set(x, "proxyAuth", value.asInstanceOf[js.Any])
      
      inline def setProxyAuthUndefined: Self = StObject.set(x, "proxyAuth", js.undefined)
      
      inline def setProxyType(value: String): Self = StObject.set(x, "proxyType", value.asInstanceOf[js.Any])
      
      inline def setProxyTypeUndefined: Self = StObject.set(x, "proxyType", js.undefined)
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setSslProtocol(value: String): Self = StObject.set(x, "sslProtocol", value.asInstanceOf[js.Any])
      
      inline def setSslProtocolUndefined: Self = StObject.set(x, "sslProtocol", js.undefined)
      
      inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTypeInterval(value: Double): Self = StObject.set(x, "typeInterval", value.asInstanceOf[js.Any])
      
      inline def setTypeIntervalUndefined: Self = StObject.set(x, "typeInterval", js.undefined)
      
      inline def setWaitTimeout(value: Double): Self = StObject.set(x, "waitTimeout", value.asInstanceOf[js.Any])
      
      inline def setWaitTimeoutUndefined: Self = StObject.set(x, "waitTimeout", js.undefined)
      
      inline def setWeak(value: Boolean): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
      
      inline def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
      
      inline def setWebSecurity(value: Boolean): Self = StObject.set(x, "webSecurity", value.asInstanceOf[js.Any])
      
      inline def setWebSecurityUndefined: Self = StObject.set(x, "webSecurity", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ICookie extends StObject {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var expirationDate: js.UndefOr[Double] = js.undefined
    
    var hostOnly: js.UndefOr[Boolean] = js.undefined
    
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var path: js.UndefOr[String] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var session: js.UndefOr[Boolean] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var value: String
  }
  object ICookie {
    
    inline def apply(name: String, value: String): ICookie = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICookie]
    }
    
    extension [Self <: ICookie](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setExpirationDate(value: Double): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
      
      inline def setHostOnly(value: Boolean): Self = StObject.set(x, "hostOnly", value.asInstanceOf[js.Any])
      
      inline def setHostOnlyUndefined: Self = StObject.set(x, "hostOnly", js.undefined)
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICookieQuery extends StObject {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var session: js.UndefOr[Boolean] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object ICookieQuery {
    
    inline def apply(): ICookieQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICookieQuery]
    }
    
    extension [Self <: ICookieQuery](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait INetwordRequest extends StObject {
    
    def abort(): Unit
    
    def changeUrl(url: String): Unit
    
    def setHeader(key: String, value: String): Unit
  }
  object INetwordRequest {
    
    inline def apply(abort: () => Unit, changeUrl: String => Unit, setHeader: (String, String) => Unit): INetwordRequest = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), changeUrl = js.Any.fromFunction1(changeUrl), setHeader = js.Any.fromFunction2(setHeader))
      __obj.asInstanceOf[INetwordRequest]
    }
    
    extension [Self <: INetwordRequest](x: Self) {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setChangeUrl(value: String => Unit): Self = StObject.set(x, "changeUrl", js.Any.fromFunction1(value))
      
      inline def setSetHeader(value: (String, String) => Unit): Self = StObject.set(x, "setHeader", js.Any.fromFunction2(value))
    }
  }
  
  trait IRequest extends StObject {
    
    var headers: js.Object
    
    var id: Double
    
    var method: String
    
    var time: Date
    
    var url: String
  }
  object IRequest {
    
    inline def apply(headers: js.Object, id: Double, method: String, time: Date, url: String): IRequest = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRequest]
    }
    
    extension [Self <: IRequest](x: Self) {
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IResourceError extends StObject {
    
    var errorCode: Double
    
    var errorString: String
    
    var id: Double
    
    var url: String
  }
  object IResourceError {
    
    inline def apply(errorCode: Double, errorString: String, id: Double, url: String): IResourceError = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorString = errorString.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResourceError]
    }
    
    extension [Self <: IResourceError](x: Self) {
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorString(value: String): Self = StObject.set(x, "errorString", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IResponse extends StObject {
    
    var bodySize: Double
    
    var contentType: String
    
    var headers: js.Object
    
    var id: Double
    
    var redirectURL: String
    
    var stage: String
    
    var status: Double
    
    var statusText: String
    
    var time: Date
    
    var url: String
  }
  object IResponse {
    
    inline def apply(
      bodySize: Double,
      contentType: String,
      headers: js.Object,
      id: Double,
      redirectURL: String,
      stage: String,
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
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRedirectURL(value: String): Self = StObject.set(x, "redirectURL", value.asInstanceOf[js.Any])
      
      inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IStackTrace extends StObject {
    
    var file: String
    
    var function: js.UndefOr[String] = js.undefined
    
    var line: Double
  }
  object IStackTrace {
    
    inline def apply(file: String, line: Double): IStackTrace = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStackTrace]
    }
    
    extension [Self <: IStackTrace](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Nightmare extends StObject {
    
    // Settings
    def authentication(user: String, password: String): Nightmare = js.native
    
    def back(): Nightmare = js.native
    
    def check(seletor: String): Nightmare = js.native
    
    def click(selector: String): Nightmare = js.native
    
    val cookies: Cookies = js.native
    
    def download(path: String): Nightmare = js.native
    @JSName("download")
    def download_cancel(action: cancel): Nightmare = js.native
    @JSName("download")
    def download_continue(action: continue): Nightmare = js.native
    
    // Interact
    def end(): Nightmare = js.native
    
    def evaluate(fn: js.Function0[Unit]): Nightmare = js.native
    def evaluate[R](fn: js.Function0[R], cb: js.Function1[/* result */ R, Unit]): Nightmare = js.native
    def evaluate[T](fn: js.Function1[/* arg */ T, Unit], cb: js.Function0[Unit], arg: T): Nightmare = js.native
    def evaluate[T, R](fn: js.Function1[/* arg */ T, R], cb: js.Function1[/* result */ R, Unit], arg: T): Nightmare = js.native
    def evaluate[T1, T2, R](
      fn: js.Function2[/* arg1 */ T1, /* arg2 */ T2, R],
      cb: js.Function1[/* result */ R, Unit],
      arg1: T1,
      arg2: T2
    ): Nightmare = js.native
    def evaluate[T1, T2, T3, R](
      fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, R],
      cb: js.Function1[/* result */ R, Unit],
      arg1: T1,
      arg2: T2,
      arg3: T3
    ): Nightmare = js.native
    
    // Extract
    def exists(selector: String): Nightmare = js.native
    def exists(selector: String, cb: js.Function1[/* result */ Boolean, Unit]): Nightmare = js.native
    
    def forward(): Nightmare = js.native
    
    def goto(url: String): Nightmare = js.native
    def goto(url: String, headers: js.Object): Nightmare = js.native
    
    def halt(error: String, cb: js.Function0[Unit]): Nightmare = js.native
    
    def header(header: String, value: String): Nightmare = js.native
    
    def headers(headers: js.Object): Nightmare = js.native
    
    def html(path: String, saveType: String): Nightmare = js.native
    @JSName("html")
    def html_HTMLComplete(path: String, saveType: HTMLComplete): Nightmare = js.native
    @JSName("html")
    def html_HTMLOnly(path: String, saveType: HTMLOnly): Nightmare = js.native
    @JSName("html")
    def html_MHTML(path: String, saveType: MHTML): Nightmare = js.native
    
    def inject(`type`: String, file: String): Nightmare = js.native
    
    def insert(selector: String, text: String): Nightmare = js.native
    
    def mousedown(selector: String): Nightmare = js.native
    
    def mouseover(selector: String): Nightmare = js.native
    
    def mouseup(selector: String): Nightmare = js.native
    
    def on(event: String, cb: js.Function0[Unit]): Nightmare = js.native
    @JSName("on")
    def on_alert(event: alert, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
    @JSName("on")
    def on_confirm(event: confirm, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
    @JSName("on")
    def on_consoleMessage(
      event: consoleMessage,
      cb: js.Function3[/* msg */ String, /* lineNumber */ Double, /* sourceId */ Double, Unit]
    ): Nightmare = js.native
    @JSName("on")
    def on_error(
      event: error,
      cb: js.Function2[/* msg */ String, /* trace */ js.UndefOr[js.Array[IStackTrace]], Unit]
    ): Nightmare = js.native
    @JSName("on")
    def on_initialized(event: initialized, cb: js.Function0[Unit]): Nightmare = js.native
    @JSName("on")
    def on_loadFinished(event: loadFinished, cb: js.Function1[/* status */ String, Unit]): Nightmare = js.native
    @JSName("on")
    def on_loadStarted(event: loadStarted, cb: js.Function0[Unit]): Nightmare = js.native
    @JSName("on")
    def on_navigationRequested(
      event: navigationRequested,
      cb: js.Function4[
          /* url */ String, 
          /* type */ String, 
          /* willNavigate */ Boolean, 
          /* main */ Boolean, 
          Unit
        ]
    ): Nightmare = js.native
    @JSName("on")
    def on_prompt(event: prompt, cb: js.Function2[/* msg */ String, /* defaultValue */ js.UndefOr[String], Unit]): Nightmare = js.native
    @JSName("on")
    def on_resourceError(event: resourceError, cb: js.Function1[/* resourceError */ IResourceError, Unit]): Nightmare = js.native
    @JSName("on")
    def on_resourceReceived(event: resourceReceived, cb: js.Function1[/* response */ IResponse, Unit]): Nightmare = js.native
    @JSName("on")
    def on_resourceRequested(
      event: resourceRequested,
      cb: js.Function2[/* requestData */ IRequest, /* networkRequest */ INetwordRequest, Unit]
    ): Nightmare = js.native
    @JSName("on")
    def on_timeout(event: timeout, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
    @JSName("on")
    def on_urlChanged(event: urlChanged, cb: js.Function1[/* targetUrl */ String, Unit]): Nightmare = js.native
    
    def once(event: String, cb: js.Function0[Unit]): Nightmare = js.native
    @JSName("once")
    def once_alert(event: alert, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
    @JSName("once")
    def once_confirm(event: confirm, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
    @JSName("once")
    def once_consoleMessage(
      event: consoleMessage,
      cb: js.Function3[/* msg */ String, /* lineNumber */ Double, /* sourceId */ Double, Unit]
    ): Nightmare = js.native
    @JSName("once")
    def once_error(
      event: error,
      cb: js.Function2[/* msg */ String, /* trace */ js.UndefOr[js.Array[IStackTrace]], Unit]
    ): Nightmare = js.native
    @JSName("once")
    def once_initialized(event: initialized, cb: js.Function0[Unit]): Nightmare = js.native
    @JSName("once")
    def once_loadFinished(event: loadFinished, cb: js.Function1[/* status */ String, Unit]): Nightmare = js.native
    @JSName("once")
    def once_loadStarted(event: loadStarted, cb: js.Function0[Unit]): Nightmare = js.native
    @JSName("once")
    def once_navigationRequested(
      event: navigationRequested,
      cb: js.Function4[
          /* url */ String, 
          /* type */ String, 
          /* willNavigate */ Boolean, 
          /* main */ Boolean, 
          Unit
        ]
    ): Nightmare = js.native
    @JSName("once")
    def once_prompt(event: prompt, cb: js.Function2[/* msg */ String, /* defaultValue */ js.UndefOr[String], Unit]): Nightmare = js.native
    @JSName("once")
    def once_resourceError(event: resourceError, cb: js.Function1[/* resourceError */ IResourceError, Unit]): Nightmare = js.native
    @JSName("once")
    def once_resourceReceived(event: resourceReceived, cb: js.Function1[/* response */ IResponse, Unit]): Nightmare = js.native
    @JSName("once")
    def once_resourceRequested(
      event: resourceRequested,
      cb: js.Function2[/* requestData */ IRequest, /* networkRequest */ INetwordRequest, Unit]
    ): Nightmare = js.native
    @JSName("once")
    def once_timeout(event: timeout, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
    @JSName("once")
    def once_urlChanged(event: urlChanged, cb: js.Function1[/* targetUrl */ String, Unit]): Nightmare = js.native
    
    def path(): String = js.native
    
    def pdf(cb: js.Function2[/* err */ Error, /* data */ Buffer, Unit]): Nightmare = js.native
    def pdf(path: String): Nightmare = js.native
    def pdf(path: String, options: js.Object): Nightmare = js.native
    
    def refresh(): Nightmare = js.native
    
    def removeListener(event: String, cb: js.Function0[Unit]): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_alert(event: alert, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_confirm(event: confirm, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_consoleMessage(
      event: consoleMessage,
      cb: js.Function3[/* msg */ String, /* lineNumber */ Double, /* sourceId */ Double, Unit]
    ): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_error(
      event: error,
      cb: js.Function2[/* msg */ String, /* trace */ js.UndefOr[js.Array[IStackTrace]], Unit]
    ): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_initialized(event: initialized, cb: js.Function0[Unit]): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_loadFinished(event: loadFinished, cb: js.Function1[/* status */ String, Unit]): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_loadStarted(event: loadStarted, cb: js.Function0[Unit]): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_navigationRequested(
      event: navigationRequested,
      cb: js.Function4[
          /* url */ String, 
          /* type */ String, 
          /* willNavigate */ Boolean, 
          /* main */ Boolean, 
          Unit
        ]
    ): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_prompt(event: prompt, cb: js.Function2[/* msg */ String, /* defaultValue */ js.UndefOr[String], Unit]): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_resourceError(event: resourceError, cb: js.Function1[/* resourceError */ IResourceError, Unit]): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_resourceReceived(event: resourceReceived, cb: js.Function1[/* response */ IResponse, Unit]): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_resourceRequested(
      event: resourceRequested,
      cb: js.Function2[/* requestData */ IRequest, /* networkRequest */ INetwordRequest, Unit]
    ): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_timeout(event: timeout, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
    @JSName("removeListener")
    def removeListener_urlChanged(event: urlChanged, cb: js.Function1[/* targetUrl */ String, Unit]): Nightmare = js.native
    
    def run(): Nightmare = js.native
    def run(cb: js.Function2[/* err */ js.Any, /* nightmare */ this.type, Unit]): Nightmare = js.native
    
    def screenshot(): Nightmare = js.native
    def screenshot(clip: Height): Nightmare = js.native
    def screenshot(clip: Height, done: js.Function2[/* err */ js.Any, /* buffer */ Buffer, Unit]): Nightmare = js.native
    def screenshot(done: js.Function2[/* err */ js.Any, /* buffer */ Buffer, Unit]): Nightmare = js.native
    def screenshot(path: String): Nightmare = js.native
    def screenshot(path: String, clip: Unit, done: js.Function1[/* err */ js.Any, Unit]): Nightmare = js.native
    def screenshot(path: String, clip: Height): Nightmare = js.native
    def screenshot(path: String, clip: Height, done: js.Function1[/* err */ js.Any, Unit]): Nightmare = js.native
    def screenshot(path: String, done: js.Function1[/* err */ js.Any, Unit]): Nightmare = js.native
    
    def scrollTo(top: Double, left: Double): Nightmare = js.native
    
    def select(seletor: String, option: String): Nightmare = js.native
    
    def `then`[T, R](fn: js.Function1[/* value */ T, R]): js.Promise[R] = js.native
    
    def title(): String = js.native
    def title(cb: js.Function1[/* title */ String, Unit]): Nightmare = js.native
    
    def `type`(selector: String, text: String): Nightmare = js.native
    
    def uncheck(seletor: String): Nightmare = js.native
    
    def upload(selector: String, path: String): Nightmare = js.native
    
    def url(): String = js.native
    def url(cb: js.Function1[/* url */ String, Unit]): Nightmare = js.native
    
    def use(plugin: js.Function1[/* nightmare */ this.type, Unit]): Nightmare = js.native
    
    def useragent(useragent: String): Nightmare = js.native
    
    def viewport(width: Double, height: Double): Nightmare = js.native
    
    def visible(selector: String): Nightmare = js.native
    def visible(selector: String, cb: js.Function1[/* result */ Boolean, Unit]): Nightmare = js.native
    
    def wait(fn: js.Function0[js.Any]): Nightmare = js.native
    def wait(fn: js.Function0[js.Any], value: js.Any): Nightmare = js.native
    def wait(fn: js.Function0[js.Any], value: js.Any, delay: Double): Nightmare = js.native
    def wait(ms: Double): Nightmare = js.native
    def wait(selector: String): Nightmare = js.native
    def wait[T1](fn: js.Function1[/* arg1 */ T1, js.Any], value1: T1): Nightmare = js.native
    def wait[T1, T2](fn: js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Any], value1: T1, value2: T2): Nightmare = js.native
    def wait[T1, T2, T3](
      fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Any],
      value1: T1,
      value2: T2,
      value3: T3
    ): Nightmare = js.native
    def wait[T1, T2, T3, T4](
      fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Any],
      value1: T1,
      value2: T2,
      value3: T3,
      value4: T4
    ): Nightmare = js.native
    def wait[T1, T2, T3, T4, T5](
      fn: js.Function5[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, /* arg5 */ T5, js.Any],
      value1: T1,
      value2: T2,
      value3: T3,
      value4: T4,
      value5: T5
    ): Nightmare = js.native
    
    def zoom(zoomFactor: Double): Nightmare = js.native
  }
}
