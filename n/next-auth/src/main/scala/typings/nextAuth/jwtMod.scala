package typings.nextAuth

import typings.next.anon.CookiesNextApiRequestCookies
import typings.next.distSharedLibUtilsMod.NextApiRequest
import typings.next.serverMod.NextRequest
import typings.nextAuth.coreTypesMod.Awaitable
import typings.nextAuth.jwtTypesMod.JWT
import typings.nextAuth.jwtTypesMod.JWTDecodeParams
import typings.nextAuth.jwtTypesMod.JWTEncodeParams
import typings.nextAuth.utilsLoggerMod.LoggerInstance
import typings.node.httpMod.IncomingMessage
import typings.std.Console
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jwtMod {
  
  @JSImport("next-auth/jwt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(params: JWTDecodeParams): js.Promise[JWT | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JWT | Null]]
  
  inline def encode(params: JWTEncodeParams): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getToken[R /* <: Boolean */](params: GetTokenParams[R]): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: R extends true ? string : next-auth.next-auth/jwt/types.JWT | null */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: R extends true ? string : next-auth.next-auth/jwt/types.JWT | null */ js.Any
  ]]
  
  trait GetTokenParams[R /* <: Boolean */] extends StObject {
    
    /** If the JWT is in the cookie, what name `getToken()` should look for. */
    var cookieName: js.UndefOr[String] = js.undefined
    
    var decode: js.UndefOr[js.Function1[/* params */ JWTDecodeParams, Awaitable[JWT | Null]]] = js.undefined
    
    var logger: js.UndefOr[LoggerInstance | Console] = js.undefined
    
    /**
      * `getToken()` will return the raw JWT if this is set to `true`
      * @default false
      */
    var raw: js.UndefOr[R] = js.undefined
    
    /** The request containing the JWT either in the cookies or in the `Authorization` header. */
    var req: (IncomingMessage & CookiesNextApiRequestCookies) | NextRequest | NextApiRequest
    
    /**
      * The same `secret` used in the `NextAuth` configuration.
      * Defaults to the `NEXTAUTH_SECRET` environment variable.
      */
    var secret: js.UndefOr[String] = js.undefined
    
    /**
      * Use secure prefix for cookie name, unless URL in `NEXTAUTH_URL` is http://
      * or not set (e.g. development or test instance) case use unprefixed name
      */
    var secureCookie: js.UndefOr[Boolean] = js.undefined
  }
  object GetTokenParams {
    
    inline def apply[R /* <: Boolean */](req: (IncomingMessage & CookiesNextApiRequestCookies) | NextRequest | NextApiRequest): GetTokenParams[R] = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTokenParams[R]]
    }
    
    extension [Self <: GetTokenParams[?], R /* <: Boolean */](x: Self & GetTokenParams[R]) {
      
      inline def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
      
      inline def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
      
      inline def setDecode(value: /* params */ JWTDecodeParams => Awaitable[JWT | Null]): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
      
      inline def setLogger(value: LoggerInstance | Console): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setRaw(value: R): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setReq(value: (IncomingMessage & CookiesNextApiRequestCookies) | NextRequest | NextApiRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      inline def setSecureCookie(value: Boolean): Self = StObject.set(x, "secureCookie", value.asInstanceOf[js.Any])
      
      inline def setSecureCookieUndefined: Self = StObject.set(x, "secureCookie", js.undefined)
    }
  }
}
