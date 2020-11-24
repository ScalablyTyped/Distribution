package typings.nodemailer.fetchMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.streamMod.Writable
import typings.node.tlsMod.TlsOptions
import typings.nodemailer.nodemailerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var allowErrorResponse: js.UndefOr[Boolean] = js.native
  
  var body: js.UndefOr[Buffer | String | StringDictionary[String]] = js.native
  
  var contentType: js.UndefOr[String | `false`] = js.native
  
  var cookie: js.UndefOr[String] = js.native
  
  var cookies: js.UndefOr[Cookies] = js.native
  
  var fetchRes: js.UndefOr[Writable] = js.native
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  var maxRedirects: js.UndefOr[Double] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var redirects: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[ms] = js.native
  
  var tls: js.UndefOr[TlsOptions] = js.native
  
  var userAgent: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowErrorResponse(value: Boolean): Self = this.set("allowErrorResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowErrorResponse: Self = this.set("allowErrorResponse", js.undefined)
    
    @scala.inline
    def setBody(value: Buffer | String | StringDictionary[String]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setContentType(value: String | `false`): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setCookie(value: String): Self = this.set("cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    
    @scala.inline
    def setCookies(value: Cookies): Self = this.set("cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookies: Self = this.set("cookies", js.undefined)
    
    @scala.inline
    def setFetchRes(value: Writable): Self = this.set("fetchRes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchRes: Self = this.set("fetchRes", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMaxRedirects(value: Double): Self = this.set("maxRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRedirects: Self = this.set("maxRedirects", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setRedirects(value: Double): Self = this.set("redirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirects: Self = this.set("redirects", js.undefined)
    
    @scala.inline
    def setTimeout(value: ms): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTls(value: TlsOptions): Self = this.set("tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
  }
}
