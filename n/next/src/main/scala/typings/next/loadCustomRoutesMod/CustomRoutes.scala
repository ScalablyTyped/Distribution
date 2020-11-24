package typings.next.loadCustomRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomRoutes extends js.Object {
  
  var headers: js.Array[Header] = js.native
  
  var redirects: js.Array[Redirect] = js.native
  
  var rewrites: js.Array[Rewrite] = js.native
}
object CustomRoutes {
  
  @scala.inline
  def apply(headers: js.Array[Header], redirects: js.Array[Redirect], rewrites: js.Array[Rewrite]): CustomRoutes = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], redirects = redirects.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomRoutes]
  }
  
  @scala.inline
  implicit class CustomRoutesOps[Self <: CustomRoutes] (val x: Self) extends AnyVal {
    
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
    def setHeadersVarargs(value: Header*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[Header]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectsVarargs(value: Redirect*): Self = this.set("redirects", js.Array(value :_*))
    
    @scala.inline
    def setRedirects(value: js.Array[Redirect]): Self = this.set("redirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewritesVarargs(value: Rewrite*): Self = this.set("rewrites", js.Array(value :_*))
    
    @scala.inline
    def setRewrites(value: js.Array[Rewrite]): Self = this.set("rewrites", value.asInstanceOf[js.Any])
  }
}
