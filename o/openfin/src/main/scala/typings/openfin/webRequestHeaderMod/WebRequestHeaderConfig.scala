package typings.openfin.webRequestHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebRequestHeaderConfig extends js.Object {
  
  var headers: js.Array[WebRequestHeader] = js.native
  
  var urlPatterns: js.Array[String] = js.native
}
object WebRequestHeaderConfig {
  
  @scala.inline
  def apply(headers: js.Array[WebRequestHeader], urlPatterns: js.Array[String]): WebRequestHeaderConfig = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], urlPatterns = urlPatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebRequestHeaderConfig]
  }
  
  @scala.inline
  implicit class WebRequestHeaderConfigOps[Self <: WebRequestHeaderConfig] (val x: Self) extends AnyVal {
    
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
    def setHeadersVarargs(value: WebRequestHeader*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[WebRequestHeader]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlPatternsVarargs(value: String*): Self = this.set("urlPatterns", js.Array(value :_*))
    
    @scala.inline
    def setUrlPatterns(value: js.Array[String]): Self = this.set("urlPatterns", value.asInstanceOf[js.Any])
  }
}
