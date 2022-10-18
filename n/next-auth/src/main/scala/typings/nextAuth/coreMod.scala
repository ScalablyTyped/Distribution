package typings.nextAuth

import typings.nextAuth.coreLibCookieMod.Cookie
import typings.nextAuth.coreTypesMod.NextAuthAction
import typings.nextAuth.coreTypesMod.NextAuthOptions
import typings.std.Partial
import typings.std.Record
import typings.std.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("next-auth/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def NextAuthHandler[Body /* <: String | (Record[String, Any]) | js.Array[Any] */](params: NextAuthHandlerParams): js.Promise[OutgoingResponse[Body]] = ^.asInstanceOf[js.Dynamic].applyDynamic("NextAuthHandler")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OutgoingResponse[Body]]]
  
  trait NextAuthHandlerParams extends StObject {
    
    var options: NextAuthOptions
    
    var req: Request | RequestInternal
  }
  object NextAuthHandlerParams {
    
    inline def apply(options: NextAuthOptions, req: Request | RequestInternal): NextAuthHandlerParams = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextAuthHandlerParams]
    }
    
    extension [Self <: NextAuthHandlerParams](x: Self) {
      
      inline def setOptions(value: NextAuthOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setReq(value: Request | RequestInternal): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    }
  }
  
  trait NextAuthHeader extends StObject {
    
    var key: String
    
    var value: String
  }
  object NextAuthHeader {
    
    inline def apply(key: String, value: String): NextAuthHeader = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextAuthHeader]
    }
    
    extension [Self <: NextAuthHeader](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutgoingResponse[Body /* <: String | (Record[String, Any]) | js.Array[Any] */] extends StObject {
    
    var body: js.UndefOr[Body] = js.undefined
    
    var cookies: js.UndefOr[js.Array[Cookie]] = js.undefined
    
    var headers: js.UndefOr[js.Array[NextAuthHeader]] = js.undefined
    
    var redirect: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[Double] = js.undefined
  }
  object OutgoingResponse {
    
    inline def apply[Body /* <: String | (Record[String, Any]) | js.Array[Any] */](): OutgoingResponse[Body] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutgoingResponse[Body]]
    }
    
    extension [Self <: OutgoingResponse[?], Body /* <: String | (Record[String, Any]) | js.Array[Any] */](x: Self & OutgoingResponse[Body]) {
      
      inline def setBody(value: Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCookies(value: js.Array[Cookie]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setCookiesVarargs(value: Cookie*): Self = StObject.set(x, "cookies", js.Array(value*))
      
      inline def setHeaders(value: js.Array[NextAuthHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: NextAuthHeader*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait RequestInternal extends StObject {
    
    var action: NextAuthAction
    
    var body: js.UndefOr[Record[String, Any]] = js.undefined
    
    var cookies: js.UndefOr[Partial[Record[String, String]]] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[Record[String, Any]] = js.undefined
    
    /** @default "http://localhost:3000" */
    var host: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var providerId: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object RequestInternal {
    
    inline def apply(action: NextAuthAction): RequestInternal = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestInternal]
    }
    
    extension [Self <: RequestInternal](x: Self) {
      
      inline def setAction(value: NextAuthAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setBody(value: Record[String, Any]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCookies(value: Partial[Record[String, String]]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHeaders(value: Record[String, Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
      
      inline def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
      
      inline def setQuery(value: Record[String, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
}
