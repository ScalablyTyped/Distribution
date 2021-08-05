package typings.phantomjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebPageSettings extends StObject {
  
  var XSSAuditingEnabled: Boolean
  
  var javascriptEnabled: Boolean
  
  var loadImages: Boolean
  
  var localToRemoteUrlAccessEnabled: Boolean
  
  var password: String
  
  var resourceTimeout: Double
  
  var userAgent: String
  
  var userName: String
  
  var webSecurityEnabled: Boolean
}
object WebPageSettings {
  
  inline def apply(
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
  
  extension [Self <: WebPageSettings](x: Self) {
    
    inline def setJavascriptEnabled(value: Boolean): Self = StObject.set(x, "javascriptEnabled", value.asInstanceOf[js.Any])
    
    inline def setLoadImages(value: Boolean): Self = StObject.set(x, "loadImages", value.asInstanceOf[js.Any])
    
    inline def setLocalToRemoteUrlAccessEnabled(value: Boolean): Self = StObject.set(x, "localToRemoteUrlAccessEnabled", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setResourceTimeout(value: Double): Self = StObject.set(x, "resourceTimeout", value.asInstanceOf[js.Any])
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setWebSecurityEnabled(value: Boolean): Self = StObject.set(x, "webSecurityEnabled", value.asInstanceOf[js.Any])
    
    inline def setXSSAuditingEnabled(value: Boolean): Self = StObject.set(x, "XSSAuditingEnabled", value.asInstanceOf[js.Any])
  }
}
