package typings.phonegapPluginPush.PhonegapPluginPush

import typings.phonegapPluginPush.anon.Alert
import typings.phonegapPluginPush.anon.ApplicationServerKey
import typings.phonegapPluginPush.anon.ClearBadge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * platform specific initialization options.
	 */
@js.native
trait InitOptions extends js.Object {
  
  /**
  		 * Android specific initialization options.
  		 */
  var android: js.UndefOr[ClearBadge] = js.native
  
  /**
  		 * Browser specific initialization options.
  		 */
  var browser: js.UndefOr[ApplicationServerKey] = js.native
  
  /**
  		 * iOS specific initialization options.
  		 */
  var ios: js.UndefOr[Alert] = js.native
  
  /**
  		 * Windows specific initialization options.
  		 */
  var windows: js.UndefOr[js.Object] = js.native
}
object InitOptions {
  
  @scala.inline
  def apply(): InitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOptions]
  }
  
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
    
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
    def setAndroid(value: ClearBadge): Self = this.set("android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroid: Self = this.set("android", js.undefined)
    
    @scala.inline
    def setBrowser(value: ApplicationServerKey): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    
    @scala.inline
    def setIos(value: Alert): Self = this.set("ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIos: Self = this.set("ios", js.undefined)
    
    @scala.inline
    def setWindows(value: js.Object): Self = this.set("windows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindows: Self = this.set("windows", js.undefined)
  }
}
