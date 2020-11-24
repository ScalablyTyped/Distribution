package typings.nextAuth.providersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderAppleOptions extends js.Object {
  
  var clientId: String = js.native
  
  var clientSecret: ProviderAppleSecret = js.native
}
object ProviderAppleOptions {
  
  @scala.inline
  def apply(clientId: String, clientSecret: ProviderAppleSecret): ProviderAppleOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderAppleOptions]
  }
  
  @scala.inline
  implicit class ProviderAppleOptionsOps[Self <: ProviderAppleOptions] (val x: Self) extends AnyVal {
    
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: ProviderAppleSecret): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
  }
}
