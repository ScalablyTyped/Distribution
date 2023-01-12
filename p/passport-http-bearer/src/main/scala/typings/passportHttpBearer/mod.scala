package typings.passportHttpBearer

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.Application
import typings.expressServeStaticCore.mod.MediaType
import typings.expressServeStaticCore.mod.Response
import typings.koa.mod.Context
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-http-bearer", "Strategy")
  @js.native
  open class Strategy[T /* <: VerifyFunctions */] protected ()
    extends StObject
       with typings.passport.mod.Strategy {
    def this(verify: VerifyFunction) = this()
    def this(options: IStrategyOptions, verify: T) = this()
    
    def authenticate(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      options: js.Object
    ): Unit = js.native
  }
  
  trait IKoaContextContainer extends StObject {
    
    var ctx: Context
  }
  object IKoaContextContainer {
    
    inline def apply(ctx: Context): IKoaContextContainer = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKoaContextContainer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IKoaContextContainer] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IStrategyOptions] (val x: Self) extends AnyVal {
      
      inline def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
      
      inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IVerifyOptions] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<express.express.Request</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary * / any, any, any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query * / any, std.Record<string, any>>> & passport-http-bearer.passport-http-bearer.IKoaContextContainer */
  trait KoaPassportExpressRequestMock extends StObject {
    
    var accepted: js.UndefOr[js.Array[MediaType]] = js.undefined
    
    var accepts: js.UndefOr[js.Function0[js.Array[String]]] = js.undefined
    
    var acceptsCharsets: js.UndefOr[js.Function0[js.Array[String]]] = js.undefined
    
    var acceptsEncodings: js.UndefOr[js.Function0[js.Array[String]]] = js.undefined
    
    var acceptsLanguages: js.UndefOr[js.Function0[js.Array[String]]] = js.undefined
    
    var app: js.UndefOr[Application] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var body: js.UndefOr[Any] = js.undefined
    
    var clearCookie: js.UndefOr[js.Function1[/* name */ String, Response]] = js.undefined
    
    var cookies: js.UndefOr[Any] = js.undefined
    
    var ctx: Context
    
    var fresh: js.UndefOr[Boolean] = js.undefined
    
    var get: js.UndefOr[js.Function1[/* name */ String, String]] = js.undefined
    
    var header: js.UndefOr[js.Function1[/* name */ String, String]] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var ip: js.UndefOr[String] = js.undefined
    
    var ips: js.UndefOr[js.Array[String]] = js.undefined
    
    var is: js.UndefOr[js.Function1[/* type */ String, Boolean]] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var originalUrl: js.UndefOr[String] = js.undefined
    
    var param: js.UndefOr[js.Function1[/* name */ String, String]] = js.undefined
    
    var params: js.UndefOr[Any] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[Any] = js.undefined
    
    var range: js.UndefOr[js.Function1[/* size */ Double, js.Array[Any]]] = js.undefined
    
    var route: js.UndefOr[Any] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var signedCookies: js.UndefOr[Any] = js.undefined
    
    var stale: js.UndefOr[Boolean] = js.undefined
    
    var subdomains: js.UndefOr[js.Array[String]] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var xhr: js.UndefOr[Boolean] = js.undefined
  }
  object KoaPassportExpressRequestMock {
    
    inline def apply(ctx: Context): KoaPassportExpressRequestMock = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any])
      __obj.asInstanceOf[KoaPassportExpressRequestMock]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KoaPassportExpressRequestMock] (val x: Self) extends AnyVal {
      
      inline def setAccepted(value: js.Array[MediaType]): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
      
      inline def setAcceptedUndefined: Self = StObject.set(x, "accepted", js.undefined)
      
      inline def setAcceptedVarargs(value: MediaType*): Self = StObject.set(x, "accepted", js.Array(value*))
      
      inline def setAccepts(value: () => js.Array[String]): Self = StObject.set(x, "accepts", js.Any.fromFunction0(value))
      
      inline def setAcceptsCharsets(value: () => js.Array[String]): Self = StObject.set(x, "acceptsCharsets", js.Any.fromFunction0(value))
      
      inline def setAcceptsCharsetsUndefined: Self = StObject.set(x, "acceptsCharsets", js.undefined)
      
      inline def setAcceptsEncodings(value: () => js.Array[String]): Self = StObject.set(x, "acceptsEncodings", js.Any.fromFunction0(value))
      
      inline def setAcceptsEncodingsUndefined: Self = StObject.set(x, "acceptsEncodings", js.undefined)
      
      inline def setAcceptsLanguages(value: () => js.Array[String]): Self = StObject.set(x, "acceptsLanguages", js.Any.fromFunction0(value))
      
      inline def setAcceptsLanguagesUndefined: Self = StObject.set(x, "acceptsLanguages", js.undefined)
      
      inline def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
      
      inline def setApp(value: Application): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setClearCookie(value: /* name */ String => Response): Self = StObject.set(x, "clearCookie", js.Any.fromFunction1(value))
      
      inline def setClearCookieUndefined: Self = StObject.set(x, "clearCookie", js.undefined)
      
      inline def setCookies(value: Any): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setFresh(value: Boolean): Self = StObject.set(x, "fresh", value.asInstanceOf[js.Any])
      
      inline def setFreshUndefined: Self = StObject.set(x, "fresh", js.undefined)
      
      inline def setGet(value: /* name */ String => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setHeader(value: /* name */ String => String): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setIps(value: js.Array[String]): Self = StObject.set(x, "ips", value.asInstanceOf[js.Any])
      
      inline def setIpsUndefined: Self = StObject.set(x, "ips", js.undefined)
      
      inline def setIpsVarargs(value: String*): Self = StObject.set(x, "ips", js.Array(value*))
      
      inline def setIs(value: /* type */ String => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setOriginalUrl(value: String): Self = StObject.set(x, "originalUrl", value.asInstanceOf[js.Any])
      
      inline def setOriginalUrlUndefined: Self = StObject.set(x, "originalUrl", js.undefined)
      
      inline def setParam(value: /* name */ String => String): Self = StObject.set(x, "param", js.Any.fromFunction1(value))
      
      inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRange(value: /* size */ Double => js.Array[Any]): Self = StObject.set(x, "range", js.Any.fromFunction1(value))
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setRoute(value: Any): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSignedCookies(value: Any): Self = StObject.set(x, "signedCookies", value.asInstanceOf[js.Any])
      
      inline def setSignedCookiesUndefined: Self = StObject.set(x, "signedCookies", js.undefined)
      
      inline def setStale(value: Boolean): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      inline def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
      
      inline def setSubdomains(value: js.Array[String]): Self = StObject.set(x, "subdomains", value.asInstanceOf[js.Any])
      
      inline def setSubdomainsUndefined: Self = StObject.set(x, "subdomains", js.undefined)
      
      inline def setSubdomainsVarargs(value: String*): Self = StObject.set(x, "subdomains", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setXhr(value: Boolean): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  type VerifyFunction = js.Function2[
    /* token */ String, 
    /* done */ js.Function3[
      /* error */ Any, 
      /* user */ js.UndefOr[Any], 
      /* options */ js.UndefOr[IVerifyOptions | String], 
      Unit
    ], 
    Unit
  ]
  
  type VerifyFunctionWithContext = js.Function3[
    /* req */ KoaPassportExpressRequestMock, 
    /* token */ String, 
    /* done */ js.Function3[
      /* error */ Any, 
      /* user */ js.UndefOr[Any], 
      /* options */ js.UndefOr[IVerifyOptions | String], 
      Unit
    ], 
    Unit
  ]
  
  type VerifyFunctionWithRequest = js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* token */ String, 
    /* done */ js.Function3[
      /* error */ Any, 
      /* user */ js.UndefOr[Any], 
      /* options */ js.UndefOr[IVerifyOptions | String], 
      Unit
    ], 
    Unit
  ]
  
  type VerifyFunctions = VerifyFunction | VerifyFunctionWithRequest | VerifyFunctionWithContext
}
