package typings.phonegapPluginPush.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationServerKey extends js.Object {
  
  /**
  			 * Your GCM API key if you are using VAPID keys.
  			 */
  var applicationServerKey: js.UndefOr[String] = js.native
  
  /**
  			 * URL for the push server you want to use. Default is 'http://push.api.phonegap.com/v1/push'.
  			 */
  var pushServiceURL: js.UndefOr[String] = js.native
}
object ApplicationServerKey {
  
  @scala.inline
  def apply(): ApplicationServerKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationServerKey]
  }
  
  @scala.inline
  implicit class ApplicationServerKeyOps[Self <: ApplicationServerKey] (val x: Self) extends AnyVal {
    
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
    def setApplicationServerKey(value: String): Self = this.set("applicationServerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationServerKey: Self = this.set("applicationServerKey", js.undefined)
    
    @scala.inline
    def setPushServiceURL(value: String): Self = this.set("pushServiceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushServiceURL: Self = this.set("pushServiceURL", js.undefined)
  }
}
