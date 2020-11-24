package typings.nodeGeocoder.mod

import typings.nodeGeocoder.nodeGeocoderStrings.smartyStreet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartyStreetsOptions extends js.Object {
  
  var auth_id: String = js.native
  
  var auth_token: String = js.native
  
  var provider: smartyStreet = js.native
}
object SmartyStreetsOptions {
  
  @scala.inline
  def apply(auth_id: String, auth_token: String, provider: smartyStreet): SmartyStreetsOptions = {
    val __obj = js.Dynamic.literal(auth_id = auth_id.asInstanceOf[js.Any], auth_token = auth_token.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartyStreetsOptions]
  }
  
  @scala.inline
  implicit class SmartyStreetsOptionsOps[Self <: SmartyStreetsOptions] (val x: Self) extends AnyVal {
    
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
    def setAuth_id(value: String): Self = this.set("auth_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuth_token(value: String): Self = this.set("auth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: smartyStreet): Self = this.set("provider", value.asInstanceOf[js.Any])
  }
}
