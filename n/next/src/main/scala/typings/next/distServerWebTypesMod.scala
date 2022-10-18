package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.City
import typings.next.anon.I18n
import typings.next.anon.NameParams
import typings.next.distServerBodyStreamsMod.ClonableBody
import typings.next.distServerWebSpecExtensionFetchEventMod.NextFetchEvent
import typings.next.distServerWebSpecExtensionRequestMod.NextRequest
import typings.next.distServerWebSpecExtensionResponseMod.NextResponse
import typings.next.nextStrings.lax
import typings.next.nextStrings.none
import typings.next.nextStrings.strict
import typings.std.ReadableStream
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebTypesMod {
  
  trait CookieSerializeOptions extends StObject {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var encode: js.UndefOr[js.Function1[/* val */ String, String]] = js.undefined
    
    var expires: js.UndefOr[js.Date] = js.undefined
    
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var sameSite: js.UndefOr[Boolean | lax | strict | none] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
  }
  object CookieSerializeOptions {
    
    inline def apply(): CookieSerializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieSerializeOptions]
    }
    
    extension [Self <: CookieSerializeOptions](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEncode(value: /* val */ String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSameSite(value: Boolean | lax | strict | none): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
  
  trait FetchEventResult extends StObject {
    
    var response: Response
    
    var waitUntil: js.Promise[Any]
  }
  object FetchEventResult {
    
    inline def apply(response: Response, waitUntil: js.Promise[Any]): FetchEventResult = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], waitUntil = waitUntil.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchEventResult]
    }
    
    extension [Self <: FetchEventResult](x: Self) {
      
      inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setWaitUntil(value: js.Promise[Any]): Self = StObject.set(x, "waitUntil", value.asInstanceOf[js.Any])
    }
  }
  
  type NextMiddleware = js.Function2[
    /* request */ NextRequest, 
    /* event */ NextFetchEvent, 
    NextMiddlewareResult | js.Promise[NextMiddlewareResult]
  ]
  
  type NextMiddlewareResult = js.UndefOr[NextResponse | Response | Null | Unit]
  
  type NodeHeaders = StringDictionary[js.UndefOr[String | js.Array[String]]]
  
  /* Inlined std.Omit<next.next/dist/server/web/types.RequestData, 'body'> & {  body :next.next/dist/server/body-streams.ClonableBody | undefined} */
  trait NodejsRequestData extends StObject {
    
    var body: js.UndefOr[ClonableBody] = js.undefined
    
    var geo: js.UndefOr[City] = js.undefined
    
    var headers: NodeHeaders
    
    var ip: js.UndefOr[String] = js.undefined
    
    var method: String
    
    var nextConfig: js.UndefOr[I18n] = js.undefined
    
    var page: js.UndefOr[NameParams] = js.undefined
    
    var url: String
  }
  object NodejsRequestData {
    
    inline def apply(headers: NodeHeaders, method: String, url: String): NodejsRequestData = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodejsRequestData]
    }
    
    extension [Self <: NodejsRequestData](x: Self) {
      
      inline def setBody(value: ClonableBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setGeo(value: City): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
      
      inline def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
      
      inline def setHeaders(value: NodeHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setNextConfig(value: I18n): Self = StObject.set(x, "nextConfig", value.asInstanceOf[js.Any])
      
      inline def setNextConfigUndefined: Self = StObject.set(x, "nextConfig", js.undefined)
      
      inline def setPage(value: NameParams): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestData extends StObject {
    
    var body: js.UndefOr[ReadableStream[js.typedarray.Uint8Array]] = js.undefined
    
    var geo: js.UndefOr[City] = js.undefined
    
    var headers: NodeHeaders
    
    var ip: js.UndefOr[String] = js.undefined
    
    var method: String
    
    var nextConfig: js.UndefOr[I18n] = js.undefined
    
    var page: js.UndefOr[NameParams] = js.undefined
    
    var url: String
  }
  object RequestData {
    
    inline def apply(headers: NodeHeaders, method: String, url: String): RequestData = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestData]
    }
    
    extension [Self <: RequestData](x: Self) {
      
      inline def setBody(value: ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setGeo(value: City): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
      
      inline def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
      
      inline def setHeaders(value: NodeHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setNextConfig(value: I18n): Self = StObject.set(x, "nextConfig", value.asInstanceOf[js.Any])
      
      inline def setNextConfigUndefined: Self = StObject.set(x, "nextConfig", js.undefined)
      
      inline def setPage(value: NameParams): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
