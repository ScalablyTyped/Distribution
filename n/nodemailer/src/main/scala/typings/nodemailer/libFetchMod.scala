package typings.nodemailer

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.streamMod.Writable
import typings.node.tlsMod.TlsOptions
import typings.nodemailer.nodemailerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFetchMod {
  
  inline def apply(url: String): WritableResponse = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[WritableResponse]
  inline def apply(url: String, options: Options): WritableResponse = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WritableResponse]
  
  @JSImport("nodemailer/lib/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Cookies = typings.nodemailer.libFetchCookiesMod.^
  
  trait Options extends StObject {
    
    var allowErrorResponse: js.UndefOr[Boolean] = js.undefined
    
    var body: js.UndefOr[Buffer | String | StringDictionary[String]] = js.undefined
    
    var contentType: js.UndefOr[String | `false`] = js.undefined
    
    var cookie: js.UndefOr[String] = js.undefined
    
    var cookies: js.UndefOr[Cookies] = js.undefined
    
    var fetchRes: js.UndefOr[Writable] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var maxRedirects: js.UndefOr[Double] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var redirects: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[ms] = js.undefined
    
    var tls: js.UndefOr[TlsOptions] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowErrorResponse(value: Boolean): Self = StObject.set(x, "allowErrorResponse", value.asInstanceOf[js.Any])
      
      inline def setAllowErrorResponseUndefined: Self = StObject.set(x, "allowErrorResponse", js.undefined)
      
      inline def setBody(value: Buffer | String | StringDictionary[String]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setContentType(value: String | `false`): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setCookies(value: Cookies): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setFetchRes(value: Writable): Self = StObject.set(x, "fetchRes", value.asInstanceOf[js.Any])
      
      inline def setFetchResUndefined: Self = StObject.set(x, "fetchRes", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setRedirects(value: Double): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      inline def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
      
      inline def setTimeout(value: ms): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTls(value: TlsOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  @js.native
  trait WritableResponse extends Writable {
    
    var headers: IncomingHttpHeaders = js.native
    
    var statusCode: Double = js.native
  }
  
  type ms = Double
}
