package typings.mongodbClientEncryption.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyOptions extends StObject {
  
  var proxyHost: String
  
  var proxyPassword: js.UndefOr[String] = js.undefined
  
  var proxyPort: js.UndefOr[Double] = js.undefined
  
  var proxyUsername: js.UndefOr[String] = js.undefined
}
object ProxyOptions {
  
  inline def apply(proxyHost: String): ProxyOptions = {
    val __obj = js.Dynamic.literal(proxyHost = proxyHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProxyOptions] (val x: Self) extends AnyVal {
    
    inline def setProxyHost(value: String): Self = StObject.set(x, "proxyHost", value.asInstanceOf[js.Any])
    
    inline def setProxyPassword(value: String): Self = StObject.set(x, "proxyPassword", value.asInstanceOf[js.Any])
    
    inline def setProxyPasswordUndefined: Self = StObject.set(x, "proxyPassword", js.undefined)
    
    inline def setProxyPort(value: Double): Self = StObject.set(x, "proxyPort", value.asInstanceOf[js.Any])
    
    inline def setProxyPortUndefined: Self = StObject.set(x, "proxyPort", js.undefined)
    
    inline def setProxyUsername(value: String): Self = StObject.set(x, "proxyUsername", value.asInstanceOf[js.Any])
    
    inline def setProxyUsernameUndefined: Self = StObject.set(x, "proxyUsername", js.undefined)
  }
}
