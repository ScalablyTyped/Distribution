package typings.oembedParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Provider extends js.Object {
  
  var endpoints: js.Array[Endpoint] = js.native
  
  var provider_name: String = js.native
  
  var provider_url: String = js.native
}
object Provider {
  
  @scala.inline
  def apply(endpoints: js.Array[Endpoint], provider_name: String, provider_url: String): Provider = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], provider_name = provider_name.asInstanceOf[js.Any], provider_url = provider_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
  
  @scala.inline
  implicit class ProviderOps[Self <: Provider] (val x: Self) extends AnyVal {
    
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
    def setEndpointsVarargs(value: Endpoint*): Self = this.set("endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: js.Array[Endpoint]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider_name(value: String): Self = this.set("provider_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider_url(value: String): Self = this.set("provider_url", value.asInstanceOf[js.Any])
  }
}
