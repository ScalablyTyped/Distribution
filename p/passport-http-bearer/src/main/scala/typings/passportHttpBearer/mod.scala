package typings.passportHttpBearer

import typings.express.mod.Request_
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-http-bearer", "Strategy")
  @js.native
  class Strategy[T /* <: VerifyFunctions */] protected ()
    extends StObject
       with typings.passport.mod.Strategy {
    def this(verify: VerifyFunction) = this()
    def this(options: IStrategyOptions, verify: T) = this()
    
    def authenticate(req: Request_[ParamsDictionary, js.Any, js.Any, Query], options: js.Object): Unit = js.native
  }
  
  trait IKoaContextContainer extends StObject {
    
    var ctx: Context
  }
  object IKoaContextContainer {
    
    inline def apply(ctx: Context): IKoaContextContainer = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKoaContextContainer]
    }
    
    extension [Self <: IKoaContextContainer](x: Self) {
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    }
  }
  
  trait IStrategyOptions extends StObject {
    
    var passReqToCallback: js.UndefOr[Boolean] = js.undefined
    
    var realm: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object IStrategyOptions {
    
    inline def apply(): IStrategyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStrategyOptions]
    }
    
    extension [Self <: IStrategyOptions](x: Self) {
      
      inline def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
      
      inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    }
  }
  
  trait IVerifyOptions extends StObject {
    
    var message: js.UndefOr[String] = js.undefined
    
    var scope: String | js.Array[String]
  }
  object IVerifyOptions {
    
    inline def apply(scope: String | js.Array[String]): IVerifyOptions = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[IVerifyOptions]
    }
    
    extension [Self <: IVerifyOptions](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<express.express.Request<express-serve-static-core.express-serve-static-core.ParamsDictionary, any, any, express-serve-static-core.express-serve-static-core.Query>> & passport-http-bearer.passport-http-bearer.IKoaContextContainer */
  trait KoaPassportExpressRequestMock extends StObject {
    
    var _destroy: js.UndefOr[
        js.Function2[
          /* error */ Error, 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var _read: js.UndefOr[js.Function1[/* size */ Double, Unit]] = js.undefined
    
    var aborted: js.UndefOr[Boolean] = js.undefined
    
    var accepted: js.UndefOr[js.Array[MediaType]] = js.undefined
    
    var accepts: js.UndefOr[js.Function0[js.Array[String]]] = js.undefined
    
    var acceptsCharsets: js.UndefOr[js.Function0[js.Array[String]]] = js.undefined
    
    var acceptsEncodings: js.UndefOr[js.Function0[js.Array[String]]] = js.undefined
    
    var acceptsLanguages: js.UndefOr[js.Function0[js.Array[String]]] = js.undefined
    
    var addListener: js.UndefOr[js.Function2[close, /* listener */ js.Function0[Unit], this.type]] = js.undefined
    
    var app: js.UndefOr[
        js.Function2[
          /* req */ Request[ParamsDictionary, js.Any, js.Any, ParsedQs], 
          /* res */ Response[js.Any, Double], 
          js.Any
        ]
      ] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var body: js.UndefOr[js.Any] = js.undefined
    
    var complete: js.UndefOr[Boolean] = js.undefined
    
    var connection: js.UndefOr[Socket] = js.undefined
    
    var constructor: js.UndefOr[js.Function1[/* socket */ Socket, js.Any]] = js.undefined
    
    var cookies: js.UndefOr[js.Any] = js.undefined
    
    var ctx: Context
    
    var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var destroyed: js.UndefOr[Boolean] = js.undefined
    
    var emit: js.UndefOr[js.Function1[close, Boolean]] = js.undefined
    
    var eventNames: js.UndefOr[js.Function0[js.Array[String | js.Symbol]]] = js.undefined
    
    var fresh: js.UndefOr[Boolean] = js.undefined
    
    var get: js.UndefOr[js.Function1[`set-cookie`, js.UndefOr[js.Array[String]]]] = js.undefined
    
    var getMaxListeners: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var header: js.UndefOr[js.Function1[`set-cookie`, js.UndefOr[js.Array[String]]]] = js.undefined
    
    var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var httpVersion: js.UndefOr[String] = js.undefined
    
    var httpVersionMajor: js.UndefOr[Double] = js.undefined
    
    var httpVersionMinor: js.UndefOr[Double] = js.undefined
    
    var ip: js.UndefOr[String] = js.undefined
    
    var ips: js.UndefOr[js.Array[String]] = js.undefined
    
    var is: js.UndefOr[js.Function1[/* type */ String, String | `false` | Null]] = js.undefined
    
    var isPaused: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var listenerCount: js.UndefOr[js.Function1[/* event */ String, Double]] = js.undefined
    
    var listeners: js.UndefOr[js.Function1[/* event */ String, js.Array[js.Function]]] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var next: js.UndefOr[NextFunction] = js.undefined
    
    var off: js.UndefOr[
        js.Function2[
          /* event */ String, 
          /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
          this.type
        ]
      ] = js.undefined
    
    var on: js.UndefOr[js.Function2[close, /* listener */ js.Function0[Unit], this.type]] = js.undefined
    
    var once: js.UndefOr[js.Function2[close, /* listener */ js.Function0[Unit], this.type]] = js.undefined
    
    var originalUrl: js.UndefOr[String] = js.undefined
    
    var param: js.UndefOr[js.Function1[/* name */ String, String]] = js.undefined
    
    var params: js.UndefOr[ParamsDictionary] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var pause: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    var pipe: js.UndefOr[js.Function1[/* destination */ WritableStream, WritableStream]] = js.undefined
    
    var prependListener: js.UndefOr[js.Function2[close, /* listener */ js.Function0[Unit], this.type]] = js.undefined
    
    var prependOnceListener: js.UndefOr[js.Function2[close, /* listener */ js.Function0[Unit], this.type]] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var push: js.UndefOr[js.Function1[/* chunk */ js.Any, Boolean]] = js.undefined
    
    var query: js.UndefOr[Query] = js.undefined
    
    var range: js.UndefOr[js.Function1[/* size */ Double, js.UndefOr[Ranges | Result]]] = js.undefined
    
    var rawHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
    var rawListeners: js.UndefOr[js.Function1[/* event */ String, js.Array[js.Function]]] = js.undefined
    
    var rawTrailers: js.UndefOr[js.Array[String]] = js.undefined
    
    var read: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var readable: js.UndefOr[Boolean] = js.undefined
    
    var readableEncoding: js.UndefOr[BufferEncoding | Null] = js.undefined
    
    var readableEnded: js.UndefOr[Boolean] = js.undefined
    
    var readableFlowing: js.UndefOr[Boolean | Null] = js.undefined
    
    var readableHighWaterMark: js.UndefOr[Double] = js.undefined
    
    var readableLength: js.UndefOr[Double] = js.undefined
    
    var readableObjectMode: js.UndefOr[Boolean] = js.undefined
    
    var removeAllListeners: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    var removeListener: js.UndefOr[js.Function2[close, /* listener */ js.Function0[Unit], this.type]] = js.undefined
    
    var res: js.UndefOr[Response[js.Any, Double]] = js.undefined
    
    var resume: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    var route: js.UndefOr[js.Any] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var setEncoding: js.UndefOr[js.Function1[/* encoding */ BufferEncoding, this.type]] = js.undefined
    
    var setMaxListeners: js.UndefOr[js.Function1[/* n */ Double, this.type]] = js.undefined
    
    var setTimeout: js.UndefOr[js.Function1[/* msecs */ Double, this.type]] = js.undefined
    
    var signedCookies: js.UndefOr[js.Any] = js.undefined
    
    var socket: js.UndefOr[Socket] = js.undefined
    
    var stale: js.UndefOr[Boolean] = js.undefined
    
    var statusCode: js.UndefOr[Double] = js.undefined
    
    var statusMessage: js.UndefOr[String] = js.undefined
    
    var subdomains: js.UndefOr[js.Array[String]] = js.undefined
    
    var trailers: js.UndefOr[Dict[String]] = js.undefined
    
    var unpipe: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    var unshift: js.UndefOr[js.Function1[/* chunk */ js.Any, Unit]] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var wrap: js.UndefOr[js.Function1[/* oldStream */ ReadableStream, this.type]] = js.undefined
    
    var xhr: js.UndefOr[Boolean] = js.undefined
  }
  object KoaPassportExpressRequestMock {
    
    inline def apply(ctx: Context): KoaPassportExpressRequestMock = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any])
      __obj.asInstanceOf[KoaPassportExpressRequestMock]
    }
    
    extension [Self <: KoaPassportExpressRequestMock](x: Self) {
      
      inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      inline def setAbortedUndefined: Self = StObject.set(x, "aborted", js.undefined)
      
      inline def setAccepted(value: js.Array[MediaType]): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
      
      inline def setAcceptedUndefined: Self = StObject.set(x, "accepted", js.undefined)
      
      inline def setAcceptedVarargs(value: MediaType*): Self = StObject.set(x, "accepted", js.Array(value :_*))
      
      inline def setAccepts(value: () => js.Array[String]): Self = StObject.set(x, "accepts", js.Any.fromFunction0(value))
      
      inline def setAcceptsCharsets(value: () => js.Array[String]): Self = StObject.set(x, "acceptsCharsets", js.Any.fromFunction0(value))
      
      inline def setAcceptsCharsetsUndefined: Self = StObject.set(x, "acceptsCharsets", js.undefined)
      
      inline def setAcceptsEncodings(value: () => js.Array[String]): Self = StObject.set(x, "acceptsEncodings", js.Any.fromFunction0(value))
      
      inline def setAcceptsEncodingsUndefined: Self = StObject.set(x, "acceptsEncodings", js.undefined)
      
      inline def setAcceptsLanguages(value: () => js.Array[String]): Self = StObject.set(x, "acceptsLanguages", js.Any.fromFunction0(value))
      
      inline def setAcceptsLanguagesUndefined: Self = StObject.set(x, "acceptsLanguages", js.undefined)
      
      inline def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
      
      inline def setAddListener(value: (close, /* listener */ js.Function0[Unit]) => KoaPassportExpressRequestMock): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
      
      inline def setApp(
        value: (/* req */ Request[ParamsDictionary, js.Any, js.Any, ParsedQs], /* res */ Response[js.Any, Double]) => js.Any
      ): Self = StObject.set(x, "app", js.Any.fromFunction2(value))
      
      inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setConnection(value: Socket): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      inline def setConstructor(value: /* socket */ Socket => js.Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
      
      inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
      
      inline def setCookies(value: js.Any): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      inline def setDestroyedUndefined: Self = StObject.set(x, "destroyed", js.undefined)
      
      inline def setEmit(value: close => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
      
      inline def setEmitUndefined: Self = StObject.set(x, "emit", js.undefined)
      
      inline def setEventNames(value: () => js.Array[String | js.Symbol]): Self = StObject.set(x, "eventNames", js.Any.fromFunction0(value))
      
      inline def setEventNamesUndefined: Self = StObject.set(x, "eventNames", js.undefined)
      
      inline def setFresh(value: Boolean): Self = StObject.set(x, "fresh", value.asInstanceOf[js.Any])
      
      inline def setFreshUndefined: Self = StObject.set(x, "fresh", js.undefined)
      
      inline def setGet(value: `set-cookie` => js.UndefOr[js.Array[String]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetMaxListeners(value: () => Double): Self = StObject.set(x, "getMaxListeners", js.Any.fromFunction0(value))
      
      inline def setGetMaxListenersUndefined: Self = StObject.set(x, "getMaxListeners", js.undefined)
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setHeader(value: `set-cookie` => js.UndefOr[js.Array[String]]): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setHttpVersion(value: String): Self = StObject.set(x, "httpVersion", value.asInstanceOf[js.Any])
      
      inline def setHttpVersionMajor(value: Double): Self = StObject.set(x, "httpVersionMajor", value.asInstanceOf[js.Any])
      
      inline def setHttpVersionMajorUndefined: Self = StObject.set(x, "httpVersionMajor", js.undefined)
      
      inline def setHttpVersionMinor(value: Double): Self = StObject.set(x, "httpVersionMinor", value.asInstanceOf[js.Any])
      
      inline def setHttpVersionMinorUndefined: Self = StObject.set(x, "httpVersionMinor", js.undefined)
      
      inline def setHttpVersionUndefined: Self = StObject.set(x, "httpVersion", js.undefined)
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setIps(value: js.Array[String]): Self = StObject.set(x, "ips", value.asInstanceOf[js.Any])
      
      inline def setIpsUndefined: Self = StObject.set(x, "ips", js.undefined)
      
      inline def setIpsVarargs(value: String*): Self = StObject.set(x, "ips", js.Array(value :_*))
      
      inline def setIs(value: /* type */ String => String | `false` | Null): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
      
      inline def setIsPaused(value: () => Boolean): Self = StObject.set(x, "isPaused", js.Any.fromFunction0(value))
      
      inline def setIsPausedUndefined: Self = StObject.set(x, "isPaused", js.undefined)
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setListenerCount(value: /* event */ String => Double): Self = StObject.set(x, "listenerCount", js.Any.fromFunction1(value))
      
      inline def setListenerCountUndefined: Self = StObject.set(x, "listenerCount", js.undefined)
      
      inline def setListeners(value: /* event */ String => js.Array[js.Function]): Self = StObject.set(x, "listeners", js.Any.fromFunction1(value))
      
      inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setNext(value: NextFunction): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setOff(
        value: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => KoaPassportExpressRequestMock
      ): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      inline def setOffUndefined: Self = StObject.set(x, "off", js.undefined)
      
      inline def setOn(value: (close, /* listener */ js.Function0[Unit]) => KoaPassportExpressRequestMock): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setOnce(value: (close, /* listener */ js.Function0[Unit]) => KoaPassportExpressRequestMock): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setOriginalUrl(value: String): Self = StObject.set(x, "originalUrl", value.asInstanceOf[js.Any])
      
      inline def setOriginalUrlUndefined: Self = StObject.set(x, "originalUrl", js.undefined)
      
      inline def setParam(value: /* name */ String => String): Self = StObject.set(x, "param", js.Any.fromFunction1(value))
      
      inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
      
      inline def setParams(value: ParamsDictionary): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPause(value: () => KoaPassportExpressRequestMock): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setPipe(value: /* destination */ WritableStream => WritableStream): Self = StObject.set(x, "pipe", js.Any.fromFunction1(value))
      
      inline def setPipeUndefined: Self = StObject.set(x, "pipe", js.undefined)
      
      inline def setPrependListener(value: (close, /* listener */ js.Function0[Unit]) => KoaPassportExpressRequestMock): Self = StObject.set(x, "prependListener", js.Any.fromFunction2(value))
      
      inline def setPrependListenerUndefined: Self = StObject.set(x, "prependListener", js.undefined)
      
      inline def setPrependOnceListener(value: (close, /* listener */ js.Function0[Unit]) => KoaPassportExpressRequestMock): Self = StObject.set(x, "prependOnceListener", js.Any.fromFunction2(value))
      
      inline def setPrependOnceListenerUndefined: Self = StObject.set(x, "prependOnceListener", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setPush(value: /* chunk */ js.Any => Boolean): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRange(value: /* size */ Double => js.UndefOr[Ranges | Result]): Self = StObject.set(x, "range", js.Any.fromFunction1(value))
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setRawHeaders(value: js.Array[String]): Self = StObject.set(x, "rawHeaders", value.asInstanceOf[js.Any])
      
      inline def setRawHeadersUndefined: Self = StObject.set(x, "rawHeaders", js.undefined)
      
      inline def setRawHeadersVarargs(value: String*): Self = StObject.set(x, "rawHeaders", js.Array(value :_*))
      
      inline def setRawListeners(value: /* event */ String => js.Array[js.Function]): Self = StObject.set(x, "rawListeners", js.Any.fromFunction1(value))
      
      inline def setRawListenersUndefined: Self = StObject.set(x, "rawListeners", js.undefined)
      
      inline def setRawTrailers(value: js.Array[String]): Self = StObject.set(x, "rawTrailers", value.asInstanceOf[js.Any])
      
      inline def setRawTrailersUndefined: Self = StObject.set(x, "rawTrailers", js.undefined)
      
      inline def setRawTrailersVarargs(value: String*): Self = StObject.set(x, "rawTrailers", js.Array(value :_*))
      
      inline def setRead(value: () => js.Any): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      inline def setReadableEncoding(value: BufferEncoding): Self = StObject.set(x, "readableEncoding", value.asInstanceOf[js.Any])
      
      inline def setReadableEncodingNull: Self = StObject.set(x, "readableEncoding", null)
      
      inline def setReadableEncodingUndefined: Self = StObject.set(x, "readableEncoding", js.undefined)
      
      inline def setReadableEnded(value: Boolean): Self = StObject.set(x, "readableEnded", value.asInstanceOf[js.Any])
      
      inline def setReadableEndedUndefined: Self = StObject.set(x, "readableEnded", js.undefined)
      
      inline def setReadableFlowing(value: Boolean): Self = StObject.set(x, "readableFlowing", value.asInstanceOf[js.Any])
      
      inline def setReadableFlowingNull: Self = StObject.set(x, "readableFlowing", null)
      
      inline def setReadableFlowingUndefined: Self = StObject.set(x, "readableFlowing", js.undefined)
      
      inline def setReadableHighWaterMark(value: Double): Self = StObject.set(x, "readableHighWaterMark", value.asInstanceOf[js.Any])
      
      inline def setReadableHighWaterMarkUndefined: Self = StObject.set(x, "readableHighWaterMark", js.undefined)
      
      inline def setReadableLength(value: Double): Self = StObject.set(x, "readableLength", value.asInstanceOf[js.Any])
      
      inline def setReadableLengthUndefined: Self = StObject.set(x, "readableLength", js.undefined)
      
      inline def setReadableObjectMode(value: Boolean): Self = StObject.set(x, "readableObjectMode", value.asInstanceOf[js.Any])
      
      inline def setReadableObjectModeUndefined: Self = StObject.set(x, "readableObjectMode", js.undefined)
      
      inline def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
      
      inline def setRemoveAllListeners(value: () => KoaPassportExpressRequestMock): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction0(value))
      
      inline def setRemoveAllListenersUndefined: Self = StObject.set(x, "removeAllListeners", js.undefined)
      
      inline def setRemoveListener(value: (close, /* listener */ js.Function0[Unit]) => KoaPassportExpressRequestMock): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
      
      inline def setRemoveListenerUndefined: Self = StObject.set(x, "removeListener", js.undefined)
      
      inline def setRes(value: Response[js.Any, Double]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setResUndefined: Self = StObject.set(x, "res", js.undefined)
      
      inline def setResume(value: () => KoaPassportExpressRequestMock): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
      
      inline def setResumeUndefined: Self = StObject.set(x, "resume", js.undefined)
      
      inline def setRoute(value: js.Any): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSetEncoding(value: /* encoding */ BufferEncoding => KoaPassportExpressRequestMock): Self = StObject.set(x, "setEncoding", js.Any.fromFunction1(value))
      
      inline def setSetEncodingUndefined: Self = StObject.set(x, "setEncoding", js.undefined)
      
      inline def setSetMaxListeners(value: /* n */ Double => KoaPassportExpressRequestMock): Self = StObject.set(x, "setMaxListeners", js.Any.fromFunction1(value))
      
      inline def setSetMaxListenersUndefined: Self = StObject.set(x, "setMaxListeners", js.undefined)
      
      inline def setSetTimeout(value: /* msecs */ Double => KoaPassportExpressRequestMock): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1(value))
      
      inline def setSetTimeoutUndefined: Self = StObject.set(x, "setTimeout", js.undefined)
      
      inline def setSignedCookies(value: js.Any): Self = StObject.set(x, "signedCookies", value.asInstanceOf[js.Any])
      
      inline def setSignedCookiesUndefined: Self = StObject.set(x, "signedCookies", js.undefined)
      
      inline def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
      
      inline def setStale(value: Boolean): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      inline def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      inline def setSubdomains(value: js.Array[String]): Self = StObject.set(x, "subdomains", value.asInstanceOf[js.Any])
      
      inline def setSubdomainsUndefined: Self = StObject.set(x, "subdomains", js.undefined)
      
      inline def setSubdomainsVarargs(value: String*): Self = StObject.set(x, "subdomains", js.Array(value :_*))
      
      inline def setTrailers(value: Dict[String]): Self = StObject.set(x, "trailers", value.asInstanceOf[js.Any])
      
      inline def setTrailersUndefined: Self = StObject.set(x, "trailers", js.undefined)
      
      inline def setUnpipe(value: () => KoaPassportExpressRequestMock): Self = StObject.set(x, "unpipe", js.Any.fromFunction0(value))
      
      inline def setUnpipeUndefined: Self = StObject.set(x, "unpipe", js.undefined)
      
      inline def setUnshift(value: /* chunk */ js.Any => Unit): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
      
      inline def setUnshiftUndefined: Self = StObject.set(x, "unshift", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWrap(value: /* oldStream */ ReadableStream => KoaPassportExpressRequestMock): Self = StObject.set(x, "wrap", js.Any.fromFunction1(value))
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
      
      inline def setXhr(value: Boolean): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
      
      inline def set_destroy(
        value: (/* error */ Error, /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit]) => Unit
      ): Self = StObject.set(x, "_destroy", js.Any.fromFunction2(value))
      
      inline def set_destroyUndefined: Self = StObject.set(x, "_destroy", js.undefined)
      
      inline def set_read(value: /* size */ Double => Unit): Self = StObject.set(x, "_read", js.Any.fromFunction1(value))
      
      inline def set_readUndefined: Self = StObject.set(x, "_read", js.undefined)
    }
  }
  
  type VerifyFunction = js.Function2[
    /* token */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[IVerifyOptions | String], 
      Unit
    ], 
    Unit
  ]
  
  type VerifyFunctionWithContext = js.Function3[
    /* req */ KoaPassportExpressRequestMock, 
    /* token */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[IVerifyOptions | String], 
      Unit
    ], 
    Unit
  ]
  
  type VerifyFunctionWithRequest = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* token */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[IVerifyOptions | String], 
      Unit
    ], 
    Unit
  ]
  
  type VerifyFunctions = VerifyFunction | VerifyFunctionWithRequest | VerifyFunctionWithContext
}
