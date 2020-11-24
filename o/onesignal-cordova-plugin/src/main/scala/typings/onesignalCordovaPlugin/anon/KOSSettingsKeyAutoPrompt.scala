package typings.onesignalCordovaPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KOSSettingsKeyAutoPrompt extends js.Object {
  
  var kOSSettingsKeyAutoPrompt: Boolean = js.native
  
  var kOSSettingsKeyInAppLaunchURL: Boolean = js.native
}
object KOSSettingsKeyAutoPrompt {
  
  @scala.inline
  def apply(kOSSettingsKeyAutoPrompt: Boolean, kOSSettingsKeyInAppLaunchURL: Boolean): KOSSettingsKeyAutoPrompt = {
    val __obj = js.Dynamic.literal(kOSSettingsKeyAutoPrompt = kOSSettingsKeyAutoPrompt.asInstanceOf[js.Any], kOSSettingsKeyInAppLaunchURL = kOSSettingsKeyInAppLaunchURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[KOSSettingsKeyAutoPrompt]
  }
  
  @scala.inline
  implicit class KOSSettingsKeyAutoPromptOps[Self <: KOSSettingsKeyAutoPrompt] (val x: Self) extends AnyVal {
    
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
    def setKOSSettingsKeyAutoPrompt(value: Boolean): Self = this.set("kOSSettingsKeyAutoPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKOSSettingsKeyInAppLaunchURL(value: Boolean): Self = this.set("kOSSettingsKeyInAppLaunchURL", value.asInstanceOf[js.Any])
  }
}
