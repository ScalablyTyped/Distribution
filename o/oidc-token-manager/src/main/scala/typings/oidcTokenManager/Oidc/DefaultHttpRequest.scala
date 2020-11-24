package typings.oidcTokenManager.Oidc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultHttpRequest extends js.Object {
  
  def getJSON(url: String, config: js.Any): DefaultPromise = js.native
}
object DefaultHttpRequest {
  
  @scala.inline
  def apply(getJSON: (String, js.Any) => DefaultPromise): DefaultHttpRequest = {
    val __obj = js.Dynamic.literal(getJSON = js.Any.fromFunction2(getJSON))
    __obj.asInstanceOf[DefaultHttpRequest]
  }
  
  @scala.inline
  implicit class DefaultHttpRequestOps[Self <: DefaultHttpRequest] (val x: Self) extends AnyVal {
    
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
    def setGetJSON(value: (String, js.Any) => DefaultPromise): Self = this.set("getJSON", js.Any.fromFunction2(value))
  }
}
