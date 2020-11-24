package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigSettings extends js.Object {
  
  /** How Lighthouse was run, e.g. from the Chrome extension or from the npm module. */
  var channel: js.UndefOr[String] = js.native
  
  /** The form factor the emulation should use. */
  var emulatedFormFactor: js.UndefOr[String] = js.native
  
  /** The locale setting. */
  var locale: js.UndefOr[String] = js.native
  
  /** List of categories of audits the run should conduct. */
  var onlyCategories: js.UndefOr[js.Any] = js.native
}
object ConfigSettings {
  
  @scala.inline
  def apply(): ConfigSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigSettings]
  }
  
  @scala.inline
  implicit class ConfigSettingsOps[Self <: ConfigSettings] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    
    @scala.inline
    def setEmulatedFormFactor(value: String): Self = this.set("emulatedFormFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmulatedFormFactor: Self = this.set("emulatedFormFactor", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setOnlyCategories(value: js.Any): Self = this.set("onlyCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyCategories: Self = this.set("onlyCategories", js.undefined)
  }
}
