package typings.nextAuth

import typings.next.distServerWebTypesMod.NextMiddleware
import typings.next.serverMod.NextFetchEvent
import typings.next.serverMod.NextRequest
import typings.nextAuth.anon.Authorized
import typings.nextAuth.anon.PartialPagesOptions
import typings.nextAuth.anon.PartialPickJWTOptionsdeco
import typings.nextAuth.anon.PartialRecordkeyofPickkey
import typings.nextAuth.anon.ReqToken
import typings.nextAuth.anon.`0`
import typings.nextAuth.coreTypesMod.Awaitable
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nextMiddlewareMod {
  
  @JSImport("next-auth/next/middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type WithAuthArgs is not an array type */ args: WithAuthArgs
  ): js.Promise[typings.next.distServerWebTypesMod.NextMiddlewareResult] | (js.Function2[
    /* request */ NextRequestWithAuth, 
    /* event */ NextFetchEvent, 
    js.Promise[typings.next.distServerWebTypesMod.NextMiddlewareResult]
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.next.distServerWebTypesMod.NextMiddlewareResult] | (js.Function2[
    /* request */ NextRequestWithAuth, 
    /* event */ NextFetchEvent, 
    js.Promise[typings.next.distServerWebTypesMod.NextMiddlewareResult]
  ])]
  
  inline def withAuth(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type WithAuthArgs is not an array type */ args: WithAuthArgs
  ): js.Promise[typings.next.distServerWebTypesMod.NextMiddlewareResult] | (js.Function2[
    /* request */ NextRequestWithAuth, 
    /* event */ NextFetchEvent, 
    js.Promise[typings.next.distServerWebTypesMod.NextMiddlewareResult]
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("withAuth")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.next.distServerWebTypesMod.NextMiddlewareResult] | (js.Function2[
    /* request */ NextRequestWithAuth, 
    /* event */ NextFetchEvent, 
    js.Promise[typings.next.distServerWebTypesMod.NextMiddlewareResult]
  ])]
  
  type AuthorizedCallback = js.Function1[/* params */ ReqToken, Awaitable[Boolean]]
  
  trait NextAuthMiddlewareOptions extends StObject {
    
    var callbacks: js.UndefOr[Authorized] = js.undefined
    
    /**
      * You can override the default cookie names and options for any of the cookies
      * by this middleware. Similar to `cookies` in `NextAuth`.
      *
      * Useful if the token is stored in not a default cookie.
      *
      * ---
      * [Documentation](https://next-auth.js.org/configuration/options#cookies)
      *
      * - ⚠ **This is an advanced option.** Advanced options are passed the same way as basic options,
      * but **may have complex implications** or side effects.
      * You should **try to avoid using advanced options** unless you are very comfortable using them.
      *
      */
    var cookies: js.UndefOr[PartialRecordkeyofPickkey] = js.undefined
    
    /**
      * If a custom jwt `decode` method is set in `[...nextauth].ts`, the same method should be set here also.
      *
      * ---
      * [Documentation](https://next-auth.js.org/configuration/nextjs#custom-jwt-decode-method)
      */
    var jwt: js.UndefOr[PartialPickJWTOptionsdeco] = js.undefined
    
    /**
      * Where to redirect the user in case of an error if they weren't logged in.
      * Similar to `pages` in `NextAuth`.
      *
      * ---
      * [Documentation](https://next-auth.js.org/configuration/pages)
      */
    var pages: js.UndefOr[PartialPagesOptions] = js.undefined
    
    /**
      * The same `secret` used in the `NextAuth` configuration.
      * Defaults to the `NEXTAUTH_SECRET` environment variable.
      */
    var secret: js.UndefOr[String] = js.undefined
  }
  object NextAuthMiddlewareOptions {
    
    inline def apply(): NextAuthMiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NextAuthMiddlewareOptions]
    }
    
    extension [Self <: NextAuthMiddlewareOptions](x: Self) {
      
      inline def setCallbacks(value: Authorized): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setCookies(value: PartialRecordkeyofPickkey): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setJwt(value: PartialPickJWTOptionsdeco): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
      
      inline def setJwtUndefined: Self = StObject.set(x, "jwt", js.undefined)
      
      inline def setPages(value: PartialPagesOptions): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    }
  }
  
  type NextMiddlewareResult = ReturnType[NextMiddleware] | Unit
  
  type NextMiddlewareWithAuth = js.Function2[
    /* request */ NextRequestWithAuth, 
    /* event */ NextFetchEvent, 
    NextMiddlewareResult | js.Promise[NextMiddlewareResult]
  ]
  
  @js.native
  trait NextRequestWithAuth extends NextRequest {
    
    var nextauth: `0` = js.native
  }
  
  type WithAuthArgs = (js.Array[Any | NextAuthMiddlewareOptions | NextMiddlewareWithAuth | NextRequestWithAuth]) | (js.Tuple2[
    NextMiddlewareWithAuth | NextRequestWithAuth, 
    NextAuthMiddlewareOptions | NextFetchEvent
  ])
}
