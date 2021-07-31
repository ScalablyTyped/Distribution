package typings.nodemailer

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.streamMod.Writable
import typings.node.tlsMod.TlsOptions
import typings.nodemailer.nodemailerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchMod {
  
  @scala.inline
  def apply(url: String): WritableResponse = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[WritableResponse]
  @scala.inline
  def apply(url: String, options: Options): WritableResponse = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WritableResponse]
  
  @JSImport("nodemailer/lib/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Cookies = typings.nodemailer.cookiesMod.^
  
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
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowErrorResponse(value: Boolean): Self = StObject.set(x, "allowErrorResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowErrorResponseUndefined: Self = StObject.set(x, "allowErrorResponse", js.undefined)
      
      @scala.inline
      def setBody(value: Buffer | String | StringDictionary[String]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setContentType(value: String | `false`): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setCookies(value: Cookies): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      @scala.inline
      def setFetchRes(value: Writable): Self = StObject.set(x, "fetchRes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchResUndefined: Self = StObject.set(x, "fetchRes", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setRedirects(value: Double): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
      
      @scala.inline
      def setTimeout(value: ms): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTls(value: TlsOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  @js.native
  trait WritableResponse extends Writable {
    
    var headers: IncomingHttpHeaders = js.native
    
    var statusCode: Double = js.native
  }
  
  type ms = Double
}
