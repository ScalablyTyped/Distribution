package typings.phantomjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebPageSettings extends js.Object {
  
  var XSSAuditingEnabled: Boolean = js.native
  
  var javascriptEnabled: Boolean = js.native
  
  var loadImages: Boolean = js.native
  
  var localToRemoteUrlAccessEnabled: Boolean = js.native
  
  var password: String = js.native
  
  var resourceTimeout: Double = js.native
  
  var userAgent: String = js.native
  
  var userName: String = js.native
  
  var webSecurityEnabled: Boolean = js.native
}
object WebPageSettings {
  
  @scala.inline
  def apply(
    XSSAuditingEnabled: Boolean,
    javascriptEnabled: Boolean,
    loadImages: Boolean,
    localToRemoteUrlAccessEnabled: Boolean,
    password: String,
    resourceTimeout: Double,
    userAgent: String,
    userName: String,
    webSecurityEnabled: Boolean
  ): WebPageSettings = {
    val __obj = js.Dynamic.literal(XSSAuditingEnabled = XSSAuditingEnabled.asInstanceOf[js.Any], javascriptEnabled = javascriptEnabled.asInstanceOf[js.Any], loadImages = loadImages.asInstanceOf[js.Any], localToRemoteUrlAccessEnabled = localToRemoteUrlAccessEnabled.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], resourceTimeout = resourceTimeout.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], webSecurityEnabled = webSecurityEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebPageSettings]
  }
  
  @scala.inline
  implicit class WebPageSettingsOps[Self <: WebPageSettings] (val x: Self) extends AnyVal {
    
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
    def setXSSAuditingEnabled(value: Boolean): Self = this.set("XSSAuditingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavascriptEnabled(value: Boolean): Self = this.set("javascriptEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadImages(value: Boolean): Self = this.set("loadImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalToRemoteUrlAccessEnabled(value: Boolean): Self = this.set("localToRemoteUrlAccessEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTimeout(value: Double): Self = this.set("resourceTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebSecurityEnabled(value: Boolean): Self = this.set("webSecurityEnabled", value.asInstanceOf[js.Any])
  }
}
