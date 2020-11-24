package typings.nextAuth.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetOptionsParams extends js.Object {
  
  var basePath: js.UndefOr[String] = js.native
  
  var baseUrl: js.UndefOr[String] = js.native
  
  var clientMaxAge: js.UndefOr[Double] = js.native
  
  var keepAlive: js.UndefOr[Double] = js.native
}
object SetOptionsParams {
  
  @scala.inline
  def apply(): SetOptionsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptionsParams]
  }
  
  @scala.inline
  implicit class SetOptionsParamsOps[Self <: SetOptionsParams] (val x: Self) extends AnyVal {
    
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
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    
    @scala.inline
    def setClientMaxAge(value: Double): Self = this.set("clientMaxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientMaxAge: Self = this.set("clientMaxAge", js.undefined)
    
    @scala.inline
    def setKeepAlive(value: Double): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
  }
}
