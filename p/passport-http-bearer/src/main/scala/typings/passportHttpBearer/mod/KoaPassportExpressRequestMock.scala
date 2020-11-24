package typings.passportHttpBearer.mod

import typings.expressServeStaticCore.mod.MediaType
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.koa.mod.Context
import typings.node.BufferEncoding
import typings.node.NodeJS.Dict
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.netMod.Socket
import typings.passportHttpBearer.passportHttpBearerBooleans.`false`
import typings.passportHttpBearer.passportHttpBearerStrings.`set-cookie`
import typings.passportHttpBearer.passportHttpBearerStrings.close
import typings.qs.mod.ParsedQs
import typings.rangeParser.mod.Ranges
import typings.rangeParser.mod.Result
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<express.express.Request<express-serve-static-core.express-serve-static-core.ParamsDictionary, any, any, express-serve-static-core.express-serve-static-core.Query>> & passport-http-bearer.passport-http-bearer.IKoaContextContainer */
@js.native
trait KoaPassportExpressRequestMock extends js.Object {
  
  var _destroy: js.UndefOr[
    js.Function2[
      /* error */ Error, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  
  var _read: js.UndefOr[js.Function1[/* size */ Double, Unit]] = js.native
  
  var aborted: js.UndefOr[Boolean] = js.native
  
  var accepted: js.UndefOr[js.Array[MediaType]] = js.native
  
  var accepts: js.UndefOr[js.Function0[js.Array[String]]] = js.native
  
  var acceptsCharsets: js.UndefOr[js.Function0[js.Array[String]]] = js.native
  
  var acceptsEncodings: js.UndefOr[js.Function0[js.Array[String]]] = js.native
  
  var acceptsLanguages: js.UndefOr[js.Function0[js.Array[String]]] = js.native
  
  var addListener: js.UndefOr[js.Function2[close, /* listener */ js.Function0[Unit], this.type]] = js.native
  
  var app: js.UndefOr[
    js.Function2[
      /* req */ Request[ParamsDictionary, _, _, ParsedQs], 
      /* res */ Response[_, Double], 
      _
    ]
  ] = js.native
  
  var baseUrl: js.UndefOr[String] = js.native
  
  var body: js.UndefOr[js.Any] = js.native
  
  var complete: js.UndefOr[Boolean] = js.native
  
  var connection: js.UndefOr[Socket] = js.native
  
  var constructor: js.UndefOr[js.Function1[/* socket */ Socket, js.Any]] = js.native
  
  var cookies: js.UndefOr[js.Any] = js.native
  
  var ctx: Context = js.native
  
  var defaultMaxListeners: js.UndefOr[js.Any] = js.native
  
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  
  var destroyed: js.UndefOr[Boolean] = js.native
  
  var emit: js.UndefOr[js.Function1[close, Boolean]] = js.native
  
  var errorMonitor: js.UndefOr[js.Any] = js.native
  
  var eventNames: js.UndefOr[js.Function0[js.Array[String | js.Symbol]]] = js.native
  
  var fresh: js.UndefOr[Boolean] = js.native
  
  var from: js.UndefOr[js.Any] = js.native
  
  var get: js.UndefOr[js.Function1[`set-cookie`, js.UndefOr[js.Array[String]]]] = js.native
  
  var getMaxListeners: js.UndefOr[js.Function0[Double]] = js.native
  
  var header: js.UndefOr[js.Function1[`set-cookie`, js.UndefOr[js.Array[String]]]] = js.native
  
  var headers: js.UndefOr[IncomingHttpHeaders] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var hostname: js.UndefOr[String] = js.native
  
  var httpVersion: js.UndefOr[String] = js.native
  
  var httpVersionMajor: js.UndefOr[Double] = js.native
  
  var httpVersionMinor: js.UndefOr[Double] = js.native
  
  var ip: js.UndefOr[String] = js.native
  
  var ips: js.UndefOr[js.Array[String]] = js.native
  
  var is: js.UndefOr[js.Function1[/* type */ String, String | `false` | Null]] = js.native
  
  var isPaused: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var listenerCount: js.UndefOr[js.Function1[/* event */ String, Double]] = js.native
  
  var listeners: js.UndefOr[js.Function1[/* event */ String, js.Array[js.Function]]] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var next: js.UndefOr[NextFunction] = js.native
  
  var off: js.UndefOr[
    js.Function2[
      /* event */ String, 
      /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
      this.type
    ]
  ] = js.native
  
  var on: js.UndefOr[js.Function2[close, /* listener */ js.Function0[Unit], this.type]] = js.native
  
  var once: js.UndefOr[js.Function2[close, /* listener */ js.Function0[Unit], this.type]] = js.native
  
  var originalUrl: js.UndefOr[String] = js.native
  
  var param: js.UndefOr[js.Function1[/* name */ String, String]] = js.native
  
  var params: js.UndefOr[ParamsDictionary] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var pause: js.UndefOr[js.Function0[this.type]] = js.native
  
  var pipe: js.UndefOr[js.Function1[/* destination */ WritableStream, WritableStream]] = js.native
  
  var prependListener: js.UndefOr[js.Function2[close, /* listener */ js.Function0[Unit], this.type]] = js.native
  
  var prependOnceListener: js.UndefOr[js.Function2[close, /* listener */ js.Function0[Unit], this.type]] = js.native
  
  var protocol: js.UndefOr[String] = js.native
  
  var push: js.UndefOr[js.Function1[/* chunk */ js.Any, Boolean]] = js.native
  
  var query: js.UndefOr[Query] = js.native
  
  var range: js.UndefOr[js.Function1[/* size */ Double, js.UndefOr[Ranges | Result]]] = js.native
  
  var rawHeaders: js.UndefOr[js.Array[String]] = js.native
  
  var rawListeners: js.UndefOr[js.Function1[/* event */ String, js.Array[js.Function]]] = js.native
  
  var rawTrailers: js.UndefOr[js.Array[String]] = js.native
  
  var read: js.UndefOr[js.Function0[_]] = js.native
  
  var readable: js.UndefOr[Boolean] = js.native
  
  var readableEncoding: js.UndefOr[BufferEncoding | Null] = js.native
  
  var readableEnded: js.UndefOr[Boolean] = js.native
  
  var readableFlowing: js.UndefOr[Boolean | Null] = js.native
  
  var readableHighWaterMark: js.UndefOr[Double] = js.native
  
  var readableLength: js.UndefOr[Double] = js.native
  
  var readableObjectMode: js.UndefOr[Boolean] = js.native
  
  var removeAllListeners: js.UndefOr[js.Function0[this.type]] = js.native
  
  var removeListener: js.UndefOr[js.Function2[close, /* listener */ js.Function0[Unit], this.type]] = js.native
  
  var res: js.UndefOr[Response[_, Double]] = js.native
  
  var resume: js.UndefOr[js.Function0[this.type]] = js.native
  
  var route: js.UndefOr[js.Any] = js.native
  
  var secure: js.UndefOr[Boolean] = js.native
  
  var setEncoding: js.UndefOr[js.Function1[/* encoding */ BufferEncoding, this.type]] = js.native
  
  var setMaxListeners: js.UndefOr[js.Function1[/* n */ Double, this.type]] = js.native
  
  var setTimeout: js.UndefOr[js.Function1[/* msecs */ Double, this.type]] = js.native
  
  var signedCookies: js.UndefOr[js.Any] = js.native
  
  var socket: js.UndefOr[Socket] = js.native
  
  var stale: js.UndefOr[Boolean] = js.native
  
  var statusCode: js.UndefOr[Double] = js.native
  
  var statusMessage: js.UndefOr[String] = js.native
  
  var subdomains: js.UndefOr[js.Array[String]] = js.native
  
  var trailers: js.UndefOr[Dict[String]] = js.native
  
  var unpipe: js.UndefOr[js.Function0[this.type]] = js.native
  
  var unshift: js.UndefOr[js.Function1[/* chunk */ js.Any, Unit]] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var wrap: js.UndefOr[js.Function1[/* oldStream */ ReadableStream, this.type]] = js.native
  
  var xhr: js.UndefOr[Boolean] = js.native
}
object KoaPassportExpressRequestMock {
  
  @scala.inline
  def apply(ctx: Context): KoaPassportExpressRequestMock = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any])
    __obj.asInstanceOf[KoaPassportExpressRequestMock]
  }
  
  @scala.inline
  implicit class KoaPassportExpressRequestMockOps[Self <: KoaPassportExpressRequestMock] (val x: Self) extends AnyVal {
    
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
    def setCtx(value: Context): Self = this.set("ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_destroy(
      value: (/* error */ Error, /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit]) => Unit
    ): Self = this.set("_destroy", js.Any.fromFunction2(value))
    
    @scala.inline
    def delete_destroy: Self = this.set("_destroy", js.undefined)
    
    @scala.inline
    def set_read(value: /* size */ Double => Unit): Self = this.set("_read", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete_read: Self = this.set("_read", js.undefined)
    
    @scala.inline
    def setAborted(value: Boolean): Self = this.set("aborted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAborted: Self = this.set("aborted", js.undefined)
    
    @scala.inline
    def setAcceptedVarargs(value: MediaType*): Self = this.set("accepted", js.Array(value :_*))
    
    @scala.inline
    def setAccepted(value: js.Array[MediaType]): Self = this.set("accepted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccepted: Self = this.set("accepted", js.undefined)
    
    @scala.inline
    def setAccepts(value: () => js.Array[String]): Self = this.set("accepts", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAccepts: Self = this.set("accepts", js.undefined)
    
    @scala.inline
    def setAcceptsCharsets(value: () => js.Array[String]): Self = this.set("acceptsCharsets", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAcceptsCharsets: Self = this.set("acceptsCharsets", js.undefined)
    
    @scala.inline
    def setAcceptsEncodings(value: () => js.Array[String]): Self = this.set("acceptsEncodings", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAcceptsEncodings: Self = this.set("acceptsEncodings", js.undefined)
    
    @scala.inline
    def setAcceptsLanguages(value: () => js.Array[String]): Self = this.set("acceptsLanguages", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAcceptsLanguages: Self = this.set("acceptsLanguages", js.undefined)
    
    @scala.inline
    def setAddListener(value: (close, /* listener */ js.Function0[Unit]) => KoaPassportExpressRequestMock): Self = this.set("addListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAddListener: Self = this.set("addListener", js.undefined)
    
    @scala.inline
    def setApp(value: (/* req */ Request[ParamsDictionary, _, _, ParsedQs], /* res */ Response[_, Double]) => _): Self = this.set("app", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteApp: Self = this.set("app", js.undefined)
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    
    @scala.inline
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setComplete(value: Boolean): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setConnection(value: Socket): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    
    @scala.inline
    def setConstructor(value: /* socket */ Socket => js.Any): Self = this.set("constructor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteConstructor: Self = this.set("constructor", js.undefined)
    
    @scala.inline
    def setCookies(value: js.Any): Self = this.set("cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookies: Self = this.set("cookies", js.undefined)
    
    @scala.inline
    def setDefaultMaxListeners(value: js.Any): Self = this.set("defaultMaxListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMaxListeners: Self = this.set("defaultMaxListeners", js.undefined)
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setDestroyed(value: Boolean): Self = this.set("destroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroyed: Self = this.set("destroyed", js.undefined)
    
    @scala.inline
    def setEmit(value: close => Boolean): Self = this.set("emit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEmit: Self = this.set("emit", js.undefined)
    
    @scala.inline
    def setErrorMonitor(value: js.Any): Self = this.set("errorMonitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMonitor: Self = this.set("errorMonitor", js.undefined)
    
    @scala.inline
    def setEventNames(value: () => js.Array[String | js.Symbol]): Self = this.set("eventNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEventNames: Self = this.set("eventNames", js.undefined)
    
    @scala.inline
    def setFresh(value: Boolean): Self = this.set("fresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFresh: Self = this.set("fresh", js.undefined)
    
    @scala.inline
    def setFrom(value: js.Any): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setGet(value: `set-cookie` => js.UndefOr[js.Array[String]]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    
    @scala.inline
    def setGetMaxListeners(value: () => Double): Self = this.set("getMaxListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMaxListeners: Self = this.set("getMaxListeners", js.undefined)
    
    @scala.inline
    def setHeader(value: `set-cookie` => js.UndefOr[js.Array[String]]): Self = this.set("header", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHeaders(value: IncomingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setHttpVersion(value: String): Self = this.set("httpVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpVersion: Self = this.set("httpVersion", js.undefined)
    
    @scala.inline
    def setHttpVersionMajor(value: Double): Self = this.set("httpVersionMajor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpVersionMajor: Self = this.set("httpVersionMajor", js.undefined)
    
    @scala.inline
    def setHttpVersionMinor(value: Double): Self = this.set("httpVersionMinor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpVersionMinor: Self = this.set("httpVersionMinor", js.undefined)
    
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    
    @scala.inline
    def setIpsVarargs(value: String*): Self = this.set("ips", js.Array(value :_*))
    
    @scala.inline
    def setIps(value: js.Array[String]): Self = this.set("ips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIps: Self = this.set("ips", js.undefined)
    
    @scala.inline
    def setIs(value: /* type */ String => String | `false` | Null): Self = this.set("is", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    
    @scala.inline
    def setIsPaused(value: () => Boolean): Self = this.set("isPaused", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsPaused: Self = this.set("isPaused", js.undefined)
    
    @scala.inline
    def setListenerCount(value: /* event */ String => Double): Self = this.set("listenerCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteListenerCount: Self = this.set("listenerCount", js.undefined)
    
    @scala.inline
    def setListeners(value: /* event */ String => js.Array[js.Function]): Self = this.set("listeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteListeners: Self = this.set("listeners", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setNext(value: NextFunction): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setOff(
      value: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => KoaPassportExpressRequestMock
    ): Self = this.set("off", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOff: Self = this.set("off", js.undefined)
    
    @scala.inline
    def setOn(value: (close, /* listener */ js.Function0[Unit]) => KoaPassportExpressRequestMock): Self = this.set("on", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    
    @scala.inline
    def setOnce(value: (close, /* listener */ js.Function0[Unit]) => KoaPassportExpressRequestMock): Self = this.set("once", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    
    @scala.inline
    def setOriginalUrl(value: String): Self = this.set("originalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalUrl: Self = this.set("originalUrl", js.undefined)
    
    @scala.inline
    def setParam(value: /* name */ String => String): Self = this.set("param", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteParam: Self = this.set("param", js.undefined)
    
    @scala.inline
    def setParams(value: ParamsDictionary): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPause(value: () => KoaPassportExpressRequestMock): Self = this.set("pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    
    @scala.inline
    def setPipe(value: /* destination */ WritableStream => WritableStream): Self = this.set("pipe", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePipe: Self = this.set("pipe", js.undefined)
    
    @scala.inline
    def setPrependListener(value: (close, /* listener */ js.Function0[Unit]) => KoaPassportExpressRequestMock): Self = this.set("prependListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePrependListener: Self = this.set("prependListener", js.undefined)
    
    @scala.inline
    def setPrependOnceListener(value: (close, /* listener */ js.Function0[Unit]) => KoaPassportExpressRequestMock): Self = this.set("prependOnceListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePrependOnceListener: Self = this.set("prependOnceListener", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setPush(value: /* chunk */ js.Any => Boolean): Self = this.set("push", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    
    @scala.inline
    def setQuery(value: Query): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setRange(value: /* size */ Double => js.UndefOr[Ranges | Result]): Self = this.set("range", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setRawHeadersVarargs(value: String*): Self = this.set("rawHeaders", js.Array(value :_*))
    
    @scala.inline
    def setRawHeaders(value: js.Array[String]): Self = this.set("rawHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawHeaders: Self = this.set("rawHeaders", js.undefined)
    
    @scala.inline
    def setRawListeners(value: /* event */ String => js.Array[js.Function]): Self = this.set("rawListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRawListeners: Self = this.set("rawListeners", js.undefined)
    
    @scala.inline
    def setRawTrailersVarargs(value: String*): Self = this.set("rawTrailers", js.Array(value :_*))
    
    @scala.inline
    def setRawTrailers(value: js.Array[String]): Self = this.set("rawTrailers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawTrailers: Self = this.set("rawTrailers", js.undefined)
    
    @scala.inline
    def setRead(value: () => _): Self = this.set("read", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    
    @scala.inline
    def setReadable(value: Boolean): Self = this.set("readable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadable: Self = this.set("readable", js.undefined)
    
    @scala.inline
    def setReadableEncoding(value: BufferEncoding): Self = this.set("readableEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadableEncoding: Self = this.set("readableEncoding", js.undefined)
    
    @scala.inline
    def setReadableEncodingNull: Self = this.set("readableEncoding", null)
    
    @scala.inline
    def setReadableEnded(value: Boolean): Self = this.set("readableEnded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadableEnded: Self = this.set("readableEnded", js.undefined)
    
    @scala.inline
    def setReadableFlowing(value: Boolean): Self = this.set("readableFlowing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadableFlowing: Self = this.set("readableFlowing", js.undefined)
    
    @scala.inline
    def setReadableFlowingNull: Self = this.set("readableFlowing", null)
    
    @scala.inline
    def setReadableHighWaterMark(value: Double): Self = this.set("readableHighWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadableHighWaterMark: Self = this.set("readableHighWaterMark", js.undefined)
    
    @scala.inline
    def setReadableLength(value: Double): Self = this.set("readableLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadableLength: Self = this.set("readableLength", js.undefined)
    
    @scala.inline
    def setReadableObjectMode(value: Boolean): Self = this.set("readableObjectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadableObjectMode: Self = this.set("readableObjectMode", js.undefined)
    
    @scala.inline
    def setRemoveAllListeners(value: () => KoaPassportExpressRequestMock): Self = this.set("removeAllListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRemoveAllListeners: Self = this.set("removeAllListeners", js.undefined)
    
    @scala.inline
    def setRemoveListener(value: (close, /* listener */ js.Function0[Unit]) => KoaPassportExpressRequestMock): Self = this.set("removeListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemoveListener: Self = this.set("removeListener", js.undefined)
    
    @scala.inline
    def setRes(value: Response[_, Double]): Self = this.set("res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRes: Self = this.set("res", js.undefined)
    
    @scala.inline
    def setResume(value: () => KoaPassportExpressRequestMock): Self = this.set("resume", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteResume: Self = this.set("resume", js.undefined)
    
    @scala.inline
    def setRoute(value: js.Any): Self = this.set("route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoute: Self = this.set("route", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    
    @scala.inline
    def setSetEncoding(value: /* encoding */ BufferEncoding => KoaPassportExpressRequestMock): Self = this.set("setEncoding", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetEncoding: Self = this.set("setEncoding", js.undefined)
    
    @scala.inline
    def setSetMaxListeners(value: /* n */ Double => KoaPassportExpressRequestMock): Self = this.set("setMaxListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMaxListeners: Self = this.set("setMaxListeners", js.undefined)
    
    @scala.inline
    def setSetTimeout(value: /* msecs */ Double => KoaPassportExpressRequestMock): Self = this.set("setTimeout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTimeout: Self = this.set("setTimeout", js.undefined)
    
    @scala.inline
    def setSignedCookies(value: js.Any): Self = this.set("signedCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedCookies: Self = this.set("signedCookies", js.undefined)
    
    @scala.inline
    def setSocket(value: Socket): Self = this.set("socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocket: Self = this.set("socket", js.undefined)
    
    @scala.inline
    def setStale(value: Boolean): Self = this.set("stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStale: Self = this.set("stale", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    
    @scala.inline
    def setSubdomainsVarargs(value: String*): Self = this.set("subdomains", js.Array(value :_*))
    
    @scala.inline
    def setSubdomains(value: js.Array[String]): Self = this.set("subdomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdomains: Self = this.set("subdomains", js.undefined)
    
    @scala.inline
    def setTrailers(value: Dict[String]): Self = this.set("trailers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailers: Self = this.set("trailers", js.undefined)
    
    @scala.inline
    def setUnpipe(value: () => KoaPassportExpressRequestMock): Self = this.set("unpipe", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteUnpipe: Self = this.set("unpipe", js.undefined)
    
    @scala.inline
    def setUnshift(value: /* chunk */ js.Any => Unit): Self = this.set("unshift", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUnshift: Self = this.set("unshift", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWrap(value: /* oldStream */ ReadableStream => KoaPassportExpressRequestMock): Self = this.set("wrap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
    
    @scala.inline
    def setXhr(value: Boolean): Self = this.set("xhr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXhr: Self = this.set("xhr", js.undefined)
  }
}
