package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyOptions extends StObject {
  
  var proxyHost: js.UndefOr[String] = js.undefined
  
  var proxyPassword: js.UndefOr[String] = js.undefined
  
  var proxyPort: js.UndefOr[scala.Double] = js.undefined
  
  var proxyUsername: js.UndefOr[String] = js.undefined
}
object ProxyOptions {
  
  inline def apply(): ProxyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyOptions]
  }
  
  extension [Self <: ProxyOptions](x: Self) {
    
    inline def setProxyHost(value: String): Self = StObject.set(x, "proxyHost", value.asInstanceOf[js.Any])
    
    inline def setProxyHostUndefined: Self = StObject.set(x, "proxyHost", js.undefined)
    
    inline def setProxyPassword(value: String): Self = StObject.set(x, "proxyPassword", value.asInstanceOf[js.Any])
    
    inline def setProxyPasswordUndefined: Self = StObject.set(x, "proxyPassword", js.undefined)
    
    inline def setProxyPort(value: scala.Double): Self = StObject.set(x, "proxyPort", value.asInstanceOf[js.Any])
    
    inline def setProxyPortUndefined: Self = StObject.set(x, "proxyPort", js.undefined)
    
    inline def setProxyUsername(value: String): Self = StObject.set(x, "proxyUsername", value.asInstanceOf[js.Any])
    
    inline def setProxyUsernameUndefined: Self = StObject.set(x, "proxyUsername", js.undefined)
  }
}
