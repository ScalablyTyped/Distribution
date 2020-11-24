package typings.nodeGeocoder.mod

import typings.nodeGeocoder.nodeGeocoderStrings.google
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleOptions extends js.Object {
  
  var apiKey: js.UndefOr[String] = js.native
  
  var channel: js.UndefOr[String] = js.native
  
  var clientId: js.UndefOr[String] = js.native
  
  var excludePartialMatches: js.UndefOr[Boolean] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var provider: google = js.native
  
  var region: js.UndefOr[String] = js.native
}
object GoogleOptions {
  
  @scala.inline
  def apply(provider: google): GoogleOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleOptions]
  }
  
  @scala.inline
  implicit class GoogleOptionsOps[Self <: GoogleOptions] (val x: Self) extends AnyVal {
    
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
    def setProvider(value: google): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
    
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setExcludePartialMatches(value: Boolean): Self = this.set("excludePartialMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludePartialMatches: Self = this.set("excludePartialMatches", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
}
