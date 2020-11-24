package typings.nodeGeocoder.mod

import typings.nodeGeocoder.nodeGeocoderStrings.openstreetmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenStreetMapOptions extends js.Object {
  
  var apiKey: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var osmServer: js.UndefOr[String] = js.native
  
  var provider: openstreetmap = js.native
}
object OpenStreetMapOptions {
  
  @scala.inline
  def apply(provider: openstreetmap): OpenStreetMapOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenStreetMapOptions]
  }
  
  @scala.inline
  implicit class OpenStreetMapOptionsOps[Self <: OpenStreetMapOptions] (val x: Self) extends AnyVal {
    
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
    def setProvider(value: openstreetmap): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setOsmServer(value: String): Self = this.set("osmServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsmServer: Self = this.set("osmServer", js.undefined)
  }
}
