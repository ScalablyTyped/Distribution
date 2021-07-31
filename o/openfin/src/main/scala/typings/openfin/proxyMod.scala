package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyMod {
  
  trait ProxyConfig extends StObject {
    
    var proxyAddress: String
    
    var proxyPort: Double
    
    var `type`: String
  }
  object ProxyConfig {
    
    @scala.inline
    def apply(proxyAddress: String, proxyPort: Double, `type`: String): ProxyConfig = {
      val __obj = js.Dynamic.literal(proxyAddress = proxyAddress.asInstanceOf[js.Any], proxyPort = proxyPort.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyConfig]
    }
    
    @scala.inline
    implicit class ProxyConfigMutableBuilder[Self <: ProxyConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProxyAddress(value: String): Self = StObject.set(x, "proxyAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyPort(value: Double): Self = StObject.set(x, "proxyPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProxyInfo extends StObject {
    
    var config: ProxyConfig
    
    var system: ProxySystemInfo
  }
  object ProxyInfo {
    
    @scala.inline
    def apply(config: ProxyConfig, system: ProxySystemInfo): ProxyInfo = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyInfo]
    }
    
    @scala.inline
    implicit class ProxyInfoMutableBuilder[Self <: ProxyInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: ProxyConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystem(value: ProxySystemInfo): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProxySystemInfo extends StObject {
    
    var autoConfigUrl: String
    
    var bypass: String
    
    var enabled: Boolean
    
    var proxy: String
  }
  object ProxySystemInfo {
    
    @scala.inline
    def apply(autoConfigUrl: String, bypass: String, enabled: Boolean, proxy: String): ProxySystemInfo = {
      val __obj = js.Dynamic.literal(autoConfigUrl = autoConfigUrl.asInstanceOf[js.Any], bypass = bypass.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxySystemInfo]
    }
    
    @scala.inline
    implicit class ProxySystemInfoMutableBuilder[Self <: ProxySystemInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoConfigUrl(value: String): Self = StObject.set(x, "autoConfigUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBypass(value: String): Self = StObject.set(x, "bypass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    }
  }
}
