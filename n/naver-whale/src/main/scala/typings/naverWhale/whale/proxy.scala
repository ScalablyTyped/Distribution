package typings.naverWhale.whale

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Proxy
////////////////////
/**
  * Use the chrome.proxy API to manage Chrome's proxy settings. This API relies on the ChromeSetting prototype of the type API for getting and setting the proxy configuration.
  * Permissions:  "proxy"
  * @since Chrome 13.
  */
object proxy {
  
  @js.native
  trait ErrorDetails extends StObject {
    
    /** Additional details about the error such as a JavaScript runtime error. */
    var details: String = js.native
    
    /** The error description. */
    var error: String = js.native
    
    /** If true, the error was fatal and the network transaction was aborted. Otherwise, a direct connection is used instead. */
    var fatal: Boolean = js.native
  }
  object ErrorDetails {
    
    @scala.inline
    def apply(details: String, error: String, fatal: Boolean): ErrorDetails = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorDetails]
    }
    
    @scala.inline
    implicit class ErrorDetailsMutableBuilder[Self <: ErrorDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PacScript extends StObject {
    
    /** Optional. A PAC script. */
    var data: js.UndefOr[String] = js.native
    
    /** Optional. If true, an invalid PAC script will prevent the network stack from falling back to direct connections. Defaults to false. */
    var mandatory: js.UndefOr[Boolean] = js.native
    
    /** Optional. URL of the PAC file to be used. */
    var url: js.UndefOr[String] = js.native
  }
  object PacScript {
    
    @scala.inline
    def apply(): PacScript = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PacScript]
    }
    
    @scala.inline
    implicit class PacScriptMutableBuilder[Self <: PacScript] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setMandatory(value: Boolean): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMandatoryUndefined: Self = StObject.set(x, "mandatory", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait ProxyConfig extends StObject {
    
    /**
      * 'direct' = Never use a proxy
      * 'auto_detect' = Auto detect proxy settings
      * 'pac_script' = Use specified PAC script
      * 'fixed_servers' = Manually specify proxy servers
      * 'system' = Use system proxy settings
      */
    var mode: String = js.native
    
    /** Optional. The proxy auto-config (PAC) script for this configuration. Use this for 'pac_script' mode. */
    var pacScript: js.UndefOr[typings.chrome.chrome.proxy.PacScript] = js.native
    
    /** Optional. The proxy rules describing this configuration. Use this for 'fixed_servers' mode. */
    var rules: js.UndefOr[typings.chrome.chrome.proxy.ProxyRules] = js.native
  }
  object ProxyConfig {
    
    @scala.inline
    def apply(mode: String): ProxyConfig = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyConfig]
    }
    
    @scala.inline
    implicit class ProxyConfigMutableBuilder[Self <: ProxyConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPacScript(value: typings.chrome.chrome.proxy.PacScript): Self = StObject.set(x, "pacScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPacScriptUndefined: Self = StObject.set(x, "pacScript", js.undefined)
      
      @scala.inline
      def setRules(value: typings.chrome.chrome.proxy.ProxyRules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    }
  }
  
  type ProxyErrorEvent = Event[js.Function1[/* details */ typings.chrome.chrome.proxy.ErrorDetails, Unit]]
  
  @js.native
  trait ProxyRules extends StObject {
    
    /** Optional. List of servers to connect to without a proxy server. */
    var bypassList: js.UndefOr[js.Array[String]] = js.native
    
    /** Optional. The proxy server to be used for everthing else or if any of the specific proxyFor... is not specified. */
    var fallbackProxy: js.UndefOr[typings.chrome.chrome.proxy.ProxyServer] = js.native
    
    /** Optional. The proxy server to be used for FTP requests. */
    var proxyForFtp: js.UndefOr[typings.chrome.chrome.proxy.ProxyServer] = js.native
    
    /** Optional. The proxy server to be used for HTTP requests. */
    var proxyForHttp: js.UndefOr[typings.chrome.chrome.proxy.ProxyServer] = js.native
    
    /** Optional. The proxy server to be used for HTTPS requests. */
    var proxyForHttps: js.UndefOr[typings.chrome.chrome.proxy.ProxyServer] = js.native
    
    /** Optional. The proxy server to be used for all per-URL requests (that is http, https, and ftp). */
    var singleProxy: js.UndefOr[typings.chrome.chrome.proxy.ProxyServer] = js.native
  }
  object ProxyRules {
    
    @scala.inline
    def apply(): ProxyRules = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProxyRules]
    }
    
    @scala.inline
    implicit class ProxyRulesMutableBuilder[Self <: ProxyRules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBypassList(value: js.Array[String]): Self = StObject.set(x, "bypassList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBypassListUndefined: Self = StObject.set(x, "bypassList", js.undefined)
      
      @scala.inline
      def setBypassListVarargs(value: String*): Self = StObject.set(x, "bypassList", js.Array(value :_*))
      
      @scala.inline
      def setFallbackProxy(value: typings.chrome.chrome.proxy.ProxyServer): Self = StObject.set(x, "fallbackProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackProxyUndefined: Self = StObject.set(x, "fallbackProxy", js.undefined)
      
      @scala.inline
      def setProxyForFtp(value: typings.chrome.chrome.proxy.ProxyServer): Self = StObject.set(x, "proxyForFtp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyForFtpUndefined: Self = StObject.set(x, "proxyForFtp", js.undefined)
      
      @scala.inline
      def setProxyForHttp(value: typings.chrome.chrome.proxy.ProxyServer): Self = StObject.set(x, "proxyForHttp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyForHttpUndefined: Self = StObject.set(x, "proxyForHttp", js.undefined)
      
      @scala.inline
      def setProxyForHttps(value: typings.chrome.chrome.proxy.ProxyServer): Self = StObject.set(x, "proxyForHttps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyForHttpsUndefined: Self = StObject.set(x, "proxyForHttps", js.undefined)
      
      @scala.inline
      def setSingleProxy(value: typings.chrome.chrome.proxy.ProxyServer): Self = StObject.set(x, "singleProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleProxyUndefined: Self = StObject.set(x, "singleProxy", js.undefined)
    }
  }
  
  @js.native
  trait ProxyServer extends StObject {
    
    /** The URI of the proxy server. This must be an ASCII hostname (in Punycode format). IDNA is not supported, yet. */
    var host: String = js.native
    
    /** Optional. The port of the proxy server. Defaults to a port that depends on the scheme. */
    var port: js.UndefOr[Double] = js.native
    
    /** Optional. The scheme (protocol) of the proxy server itself. Defaults to 'http'. */
    var scheme: js.UndefOr[String] = js.native
  }
  object ProxyServer {
    
    @scala.inline
    def apply(host: String): ProxyServer = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyServer]
    }
    
    @scala.inline
    implicit class ProxyServerMutableBuilder[Self <: ProxyServer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    }
  }
}
