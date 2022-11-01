package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.City
import typings.next.anon.I18n
import typings.next.anon.NameParams
import typings.next.distServerBodyStreamsMod.ClonableBody
import typings.next.distServerWebSpecExtensionFetchEventMod.NextFetchEvent
import typings.next.distServerWebSpecExtensionRequestMod.NextRequest
import typings.next.distServerWebSpecExtensionResponseMod.NextResponse
import typings.std.ReadableStream
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebTypesMod {
  
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
