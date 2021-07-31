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
    
    @scala.inline
    def apply(ctx: Context): IKoaContextContainer = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKoaContextContainer]
    }
    
    @scala.inline
    implicit class IKoaContextContainerMutableBuilder[Self <: IKoaContextContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    }
  }
  
  trait IStrategyOptions extends StObject {
    
    var passReqToCallback: js.UndefOr[Boolean] = js.undefined
    
    var realm: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object IStrategyOptions {
    
    @scala.inline
    def apply(): IStrategyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStrategyOptions]
    }
    
    @scala.inline
    implicit class IStrategyOptionsMutableBuilder[Self <: IStrategyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      @scala.inline
      def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
      
      @scala.inline
      def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    }
  }
  
  trait IVerifyOptions extends StObject {
    
    var message: js.UndefOr[String] = js.undefined
    
    var scope: String | js.Array[String]
  }
  object IVerifyOptions {
    
    @scala.inline
    def apply(scope: String | js.Array[String]): IVerifyOptions = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[IVerifyOptions]
    }
    
    @scala.inline
    implicit class IVerifyOptionsMutableBuilder[Self <: IVerifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
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
    
    @scala.inline
    def apply(ctx: Context): KoaPassportExpressRequestMock = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any])
      __obj.asInstanceOf[KoaPassportExpressRequestMock]
    }
    
    @scala.inline
    implicit class KoaPassportExpressRequestMockMutableBuilder[Self <: KoaPassportExpressRequestMock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortedUndefined: Self = StObject.set(x, "aborted", js.undefined)
      
      @scala.inline
      def setAccepted(value: js.Array[MediaType]): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptedUndefined: Self = StObject.set(x, "accepted", js.undefined)
      
      @scala.inline
      def setAcceptedVarargs(value: MediaType*): Self = StObject.set(x, "accepted", js.Array(value :_*))
      
      @scala.inline
      def setAccepts(value: () => js.Array[String]): Self = StObject.set(x, "accepts", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAcceptsCharsets(value: () => js.Array[String]): Self = StObject.set(x, "acceptsCharsets", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAcceptsCharsetsUndefined: Self = StObject.set(x, "acceptsCharsets", js.undefined)
      
      @scala.inline
      def setAcceptsEncodings(value: () => js.Array[String]): Self = StObject.set(x, "acceptsEncodings", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAcceptsEncodingsUndefined: Self = StObject.set(x, "acceptsEncodings", js.undefined)
      
      @scala.inline
      def setAcceptsLanguages(value: () => js.Array[String]): Self = StObject.set(x, "acceptsLanguages", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAcceptsLanguagesUndefined: Self = StObject.set(x, "acceptsLanguages", js.undefined)
      
      @scala.inline
      def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
      
      @scala.inline
      def setAddListener(value: (close, /* listener */ js.Function0[Unit]) => KoaPassportExpressRequestMock): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
      
      @scala.inline
      def setApp(
        value: (/* req */ Request[ParamsDictionary, js.Any, js.Any, ParsedQs], /* res */ Response[js.Any, Double]) => js.Any
      ): Self = StObject.set(x, "app", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setConnection(value: Socket): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      @scala.inline
      def setConstructor(value: /* socket */ Socket => js.Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
      
      @scala.inline
      def setCookies(value: js.Any): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      @scala.inline
      def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyedUndefined: Self = StObject.set(x, "destroyed", js.undefined)
      
      @scala.inline
      def setEmit(value: close => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmitUndefined: Self = StObject.set(x, "emit", js.undefined)
      
      @scala.inline
      def setEventNames(value: () => js.Array[String | js.Symbol]): Self = StObject.set(x, "eventNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEventNamesUndefined: Self = StObject.set(x, "eventNames", js.undefined)
      
      @scala.inline
      def setFresh(value: Boolean): Self = StObject.set(x, "fresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreshUndefined: Self = StObject.set(x, "fresh", js.undefined)
      
      @scala.inline
      def setGet(value: `set-cookie` => js.UndefOr[js.Array[String]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMaxListeners(value: () => Double): Self = StObject.set(x, "getMaxListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMaxListenersUndefined: Self = StObject.set(x, "getMaxListeners", js.undefined)
      
      @scala.inline
      def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      @scala.inline
      def setHeader(value: `set-cookie` => js.UndefOr[js.Array[String]]): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setHttpVersion(value: String): Self = StObject.set(x, "httpVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpVersionMajor(value: Double): Self = StObject.set(x, "httpVersionMajor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpVersionMajorUndefined: Self = StObject.set(x, "httpVersionMajor", js.undefined)
      
      @scala.inline
      def setHttpVersionMinor(value: Double): Self = StObject.set(x, "httpVersionMinor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpVersionMinorUndefined: Self = StObject.set(x, "httpVersionMinor", js.undefined)
      
      @scala.inline
      def setHttpVersionUndefined: Self = StObject.set(x, "httpVersion", js.undefined)
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      @scala.inline
      def setIps(value: js.Array[String]): Self = StObject.set(x, "ips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpsUndefined: Self = StObject.set(x, "ips", js.undefined)
      
      @scala.inline
      def setIpsVarargs(value: String*): Self = StObject.set(x, "ips", js.Array(value :_*))
      
      @scala.inline
      def setIs(value: /* type */ String => String | `false` | Null): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsPaused(value: () => Boolean): Self = StObject.set(x, "isPaused", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPausedUndefined: Self = StObject.set(x, "isPaused", js.undefined)
      
      @scala.inline
      def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      @scala.inline
      def setListenerCount(value: /* event */ String => Double): Self = StObject.set(x, "listenerCount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListenerCountUndefined: Self = StObject.set(x, "listenerCount", js.undefined)
      
      @scala.inline
      def setListeners(value: /* event */ String => js.Array[js.Function]): Self = StObject.set(x, "listeners", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setNext(value: NextFunction): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setOff(
        value: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => KoaPassportExpressRequestMock
      ): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOffUndefined: Self = StObject.set(x, "off", js.undefined)
      
      @scala.inline
      def setOn(value: (close, /* listener */ js.Function0[Unit]) => KoaPassportExpressRequestMock): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      @scala.inline
      def setOnce(value: (close, /* listener */ js.Function0[Unit]) => KoaPassportExpressRequestMock): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      @scala.inline
      def setOriginalUrl(value: String): Self = StObject.set(x, "originalUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalUrlUndefined: Self = StObject.set(x, "originalUrl", js.undefined)
      
      @scala.inline
      def setParam(value: /* name */ String => String): Self = StObject.set(x, "param", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
      
      @scala.inline
      def setParams(value: ParamsDictionary): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPause(value: () => KoaPassportExpressRequestMock): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      @scala.inline
      def setPipe(value: /* destination */ WritableStream => WritableStream): Self = StObject.set(x, "pipe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPipeUndefined: Self = StObject.set(x, "pipe", js.undefined)
      
      @scala.inline
      def setPrependListener(value: (close, /* listener */ js.Function0[Unit]) => KoaPassportExpressRequestMock): Self = StObject.set(x, "prependListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrependListenerUndefined: Self = StObject.set(x, "prependListener", js.undefined)
      
      @scala.inline
      def setPrependOnceListener(value: (close, /* listener */ js.Function0[Unit]) => KoaPassportExpressRequestMock): Self = StObject.set(x, "prependOnceListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrependOnceListenerUndefined: Self = StObject.set(x, "prependOnceListener", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setPush(value: /* chunk */ js.Any => Boolean): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      @scala.inline
      def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setRange(value: /* size */ Double => js.UndefOr[Ranges | Result]): Self = StObject.set(x, "range", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setRawHeaders(value: js.Array[String]): Self = StObject.set(x, "rawHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawHeadersUndefined: Self = StObject.set(x, "rawHeaders", js.undefined)
      
      @scala.inline
      def setRawHeadersVarargs(value: String*): Self = StObject.set(x, "rawHeaders", js.Array(value :_*))
      
      @scala.inline
      def setRawListeners(value: /* event */ String => js.Array[js.Function]): Self = StObject.set(x, "rawListeners", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRawListenersUndefined: Self = StObject.set(x, "rawListeners", js.undefined)
      
      @scala.inline
      def setRawTrailers(value: js.Array[String]): Self = StObject.set(x, "rawTrailers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawTrailersUndefined: Self = StObject.set(x, "rawTrailers", js.undefined)
      
      @scala.inline
      def setRawTrailersVarargs(value: String*): Self = StObject.set(x, "rawTrailers", js.Array(value :_*))
      
      @scala.inline
      def setRead(value: () => js.Any): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableEncoding(value: BufferEncoding): Self = StObject.set(x, "readableEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableEncodingNull: Self = StObject.set(x, "readableEncoding", null)
      
      @scala.inline
      def setReadableEncodingUndefined: Self = StObject.set(x, "readableEncoding", js.undefined)
      
      @scala.inline
      def setReadableEnded(value: Boolean): Self = StObject.set(x, "readableEnded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableEndedUndefined: Self = StObject.set(x, "readableEnded", js.undefined)
      
      @scala.inline
      def setReadableFlowing(value: Boolean): Self = StObject.set(x, "readableFlowing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableFlowingNull: Self = StObject.set(x, "readableFlowing", null)
      
      @scala.inline
      def setReadableFlowingUndefined: Self = StObject.set(x, "readableFlowing", js.undefined)
      
      @scala.inline
      def setReadableHighWaterMark(value: Double): Self = StObject.set(x, "readableHighWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableHighWaterMarkUndefined: Self = StObject.set(x, "readableHighWaterMark", js.undefined)
      
      @scala.inline
      def setReadableLength(value: Double): Self = StObject.set(x, "readableLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableLengthUndefined: Self = StObject.set(x, "readableLength", js.undefined)
      
      @scala.inline
      def setReadableObjectMode(value: Boolean): Self = StObject.set(x, "readableObjectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableObjectModeUndefined: Self = StObject.set(x, "readableObjectMode", js.undefined)
      
      @scala.inline
      def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
      
      @scala.inline
      def setRemoveAllListeners(value: () => KoaPassportExpressRequestMock): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveAllListenersUndefined: Self = StObject.set(x, "removeAllListeners", js.undefined)
      
      @scala.inline
      def setRemoveListener(value: (close, /* listener */ js.Function0[Unit]) => KoaPassportExpressRequestMock): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveListenerUndefined: Self = StObject.set(x, "removeListener", js.undefined)
      
      @scala.inline
      def setRes(value: Response[js.Any, Double]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResUndefined: Self = StObject.set(x, "res", js.undefined)
      
      @scala.inline
      def setResume(value: () => KoaPassportExpressRequestMock): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResumeUndefined: Self = StObject.set(x, "resume", js.undefined)
      
      @scala.inline
      def setRoute(value: js.Any): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setSetEncoding(value: /* encoding */ BufferEncoding => KoaPassportExpressRequestMock): Self = StObject.set(x, "setEncoding", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetEncodingUndefined: Self = StObject.set(x, "setEncoding", js.undefined)
      
      @scala.inline
      def setSetMaxListeners(value: /* n */ Double => KoaPassportExpressRequestMock): Self = StObject.set(x, "setMaxListeners", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMaxListenersUndefined: Self = StObject.set(x, "setMaxListeners", js.undefined)
      
      @scala.inline
      def setSetTimeout(value: /* msecs */ Double => KoaPassportExpressRequestMock): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTimeoutUndefined: Self = StObject.set(x, "setTimeout", js.undefined)
      
      @scala.inline
      def setSignedCookies(value: js.Any): Self = StObject.set(x, "signedCookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedCookiesUndefined: Self = StObject.set(x, "signedCookies", js.undefined)
      
      @scala.inline
      def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
      
      @scala.inline
      def setStale(value: Boolean): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      @scala.inline
      def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      @scala.inline
      def setSubdomains(value: js.Array[String]): Self = StObject.set(x, "subdomains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubdomainsUndefined: Self = StObject.set(x, "subdomains", js.undefined)
      
      @scala.inline
      def setSubdomainsVarargs(value: String*): Self = StObject.set(x, "subdomains", js.Array(value :_*))
      
      @scala.inline
      def setTrailers(value: Dict[String]): Self = StObject.set(x, "trailers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailersUndefined: Self = StObject.set(x, "trailers", js.undefined)
      
      @scala.inline
      def setUnpipe(value: () => KoaPassportExpressRequestMock): Self = StObject.set(x, "unpipe", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnpipeUndefined: Self = StObject.set(x, "unpipe", js.undefined)
      
      @scala.inline
      def setUnshift(value: /* chunk */ js.Any => Unit): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnshiftUndefined: Self = StObject.set(x, "unshift", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setWrap(value: /* oldStream */ ReadableStream => KoaPassportExpressRequestMock): Self = StObject.set(x, "wrap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
      
      @scala.inline
      def setXhr(value: Boolean): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
      
      @scala.inline
      def set_destroy(
        value: (/* error */ Error, /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit]) => Unit
      ): Self = StObject.set(x, "_destroy", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_destroyUndefined: Self = StObject.set(x, "_destroy", js.undefined)
      
      @scala.inline
      def set_read(value: /* size */ Double => Unit): Self = StObject.set(x, "_read", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_readUndefined: Self = StObject.set(x, "_read", js.undefined)
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
