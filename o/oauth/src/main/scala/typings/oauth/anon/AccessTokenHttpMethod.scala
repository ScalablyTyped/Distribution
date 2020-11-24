package typings.oauth.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessTokenHttpMethod extends js.Object {
  
  var accessTokenHttpMethod: String = js.native
  
  var followRedirects: Boolean = js.native
  
  var requestTokenHttpMethod: String = js.native
}
object AccessTokenHttpMethod {
  
  @scala.inline
  def apply(accessTokenHttpMethod: String, followRedirects: Boolean, requestTokenHttpMethod: String): AccessTokenHttpMethod = {
    val __obj = js.Dynamic.literal(accessTokenHttpMethod = accessTokenHttpMethod.asInstanceOf[js.Any], followRedirects = followRedirects.asInstanceOf[js.Any], requestTokenHttpMethod = requestTokenHttpMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenHttpMethod]
  }
  
  @scala.inline
  implicit class AccessTokenHttpMethodOps[Self <: AccessTokenHttpMethod] (val x: Self) extends AnyVal {
    
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
    def setAccessTokenHttpMethod(value: String): Self = this.set("accessTokenHttpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowRedirects(value: Boolean): Self = this.set("followRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTokenHttpMethod(value: String): Self = this.set("requestTokenHttpMethod", value.asInstanceOf[js.Any])
  }
}
