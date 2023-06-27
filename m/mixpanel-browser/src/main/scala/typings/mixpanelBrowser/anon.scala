package typings.mixpanelBrowser

import typings.mixpanelBrowser.mixpanelBrowserInts.`0`
import typings.mixpanelBrowser.mixpanelBrowserInts.`1`
import typings.mixpanelBrowser.mod.Dict
import typings.mixpanelBrowser.mod.Mixpanel
import typings.mixpanelBrowser.mod.Persistence
import typings.mixpanelBrowser.mod.VerboseResponse
import typings.mixpanelBrowser.mod.XhrHeadersDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error
    extends StObject
       with VerboseResponse {
    
    var error: Null
    
    var status: `1`
  }
  object Error {
    
    inline def apply(error: Null): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = 1)
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setError(value: Null): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: `1`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<mixpanel-browser.mixpanel-browser.ClearOptOutInOutOptions> */
  trait PartialClearOptOutInOutOp extends StObject {
    
    var cookie_expiration: js.UndefOr[Double] = js.undefined
    
    var cookie_prefix: js.UndefOr[String] = js.undefined
    
    var cross_subdomain_cookie: js.UndefOr[Boolean] = js.undefined
    
    var persistence_type: js.UndefOr[Persistence] = js.undefined
    
    var secure_cookie: js.UndefOr[Boolean] = js.undefined
  }
  object PartialClearOptOutInOutOp {
    
    inline def apply(): PartialClearOptOutInOutOp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialClearOptOutInOutOp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialClearOptOutInOutOp] (val x: Self) extends AnyVal {
      
      inline def setCookie_expiration(value: Double): Self = StObject.set(x, "cookie_expiration", value.asInstanceOf[js.Any])
      
      inline def setCookie_expirationUndefined: Self = StObject.set(x, "cookie_expiration", js.undefined)
      
      inline def setCookie_prefix(value: String): Self = StObject.set(x, "cookie_prefix", value.asInstanceOf[js.Any])
      
      inline def setCookie_prefixUndefined: Self = StObject.set(x, "cookie_prefix", js.undefined)
      
      inline def setCross_subdomain_cookie(value: Boolean): Self = StObject.set(x, "cross_subdomain_cookie", value.asInstanceOf[js.Any])
      
      inline def setCross_subdomain_cookieUndefined: Self = StObject.set(x, "cross_subdomain_cookie", js.undefined)
      
      inline def setPersistence_type(value: Persistence): Self = StObject.set(x, "persistence_type", value.asInstanceOf[js.Any])
      
      inline def setPersistence_typeUndefined: Self = StObject.set(x, "persistence_type", js.undefined)
      
      inline def setSecure_cookie(value: Boolean): Self = StObject.set(x, "secure_cookie", value.asInstanceOf[js.Any])
      
      inline def setSecure_cookieUndefined: Self = StObject.set(x, "secure_cookie", js.undefined)
    }
  }
  
  /* Inlined std.Partial<mixpanel-browser.mixpanel-browser.Config> */
  trait PartialConfig extends StObject {
    
    var api_host: js.UndefOr[String] = js.undefined
    
    var api_method: js.UndefOr[String] = js.undefined
    
    var api_transport: js.UndefOr[String] = js.undefined
    
    var app_host: js.UndefOr[String] = js.undefined
    
    var autotrack: js.UndefOr[Boolean] = js.undefined
    
    var batch_flush_interval_ms: js.UndefOr[Double] = js.undefined
    
    var batch_request_timeout_ms: js.UndefOr[Double] = js.undefined
    
    var batch_requests: js.UndefOr[Boolean] = js.undefined
    
    var batch_size: js.UndefOr[Double] = js.undefined
    
    var cdn: js.UndefOr[String] = js.undefined
    
    var cookie_domain: js.UndefOr[String] = js.undefined
    
    var cookie_expiration: js.UndefOr[Double] = js.undefined
    
    var cookie_name: js.UndefOr[String] = js.undefined
    
    var cross_site_cookie: js.UndefOr[Boolean] = js.undefined
    
    var cross_subdomain_cookie: js.UndefOr[Boolean] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var disable_cookie: js.UndefOr[Boolean] = js.undefined
    
    var disable_notifications: js.UndefOr[Boolean] = js.undefined
    
    var disable_persistence: js.UndefOr[Boolean] = js.undefined
    
    var ignore_dnt: js.UndefOr[Boolean] = js.undefined
    
    var img: js.UndefOr[Boolean] = js.undefined
    
    var inapp_link_new_window: js.UndefOr[Boolean] = js.undefined
    
    var inapp_protocol: js.UndefOr[String] = js.undefined
    
    var ip: js.UndefOr[Boolean] = js.undefined
    
    var loaded: js.UndefOr[js.Function1[/* mixpanel */ this.type, Unit]] = js.undefined
    
    var opt_out_persistence_by_default: js.UndefOr[Boolean] = js.undefined
    
    var opt_out_tracking_by_default: js.UndefOr[Boolean] = js.undefined
    
    var opt_out_tracking_cookie_prefix: js.UndefOr[String] = js.undefined
    
    var opt_out_tracking_persistence_type: js.UndefOr[Persistence] = js.undefined
    
    var persistence: js.UndefOr[Persistence] = js.undefined
    
    var persistence_name: js.UndefOr[String] = js.undefined
    
    var property_blacklist: js.UndefOr[js.Array[String]] = js.undefined
    
    var save_referrer: js.UndefOr[Boolean] = js.undefined
    
    var secure_cookie: js.UndefOr[Boolean] = js.undefined
    
    var store_google: js.UndefOr[Boolean] = js.undefined
    
    var test: js.UndefOr[Boolean] = js.undefined
    
    var track_links_timeout: js.UndefOr[Double] = js.undefined
    
    var track_pageview: js.UndefOr[Boolean] = js.undefined
    
    var upgrade: js.UndefOr[Boolean] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var xhr_headers: js.UndefOr[XhrHeadersDef] = js.undefined
  }
  object PartialConfig {
    
    inline def apply(): PartialConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialConfig] (val x: Self) extends AnyVal {
      
      inline def setApi_host(value: String): Self = StObject.set(x, "api_host", value.asInstanceOf[js.Any])
      
      inline def setApi_hostUndefined: Self = StObject.set(x, "api_host", js.undefined)
      
      inline def setApi_method(value: String): Self = StObject.set(x, "api_method", value.asInstanceOf[js.Any])
      
      inline def setApi_methodUndefined: Self = StObject.set(x, "api_method", js.undefined)
      
      inline def setApi_transport(value: String): Self = StObject.set(x, "api_transport", value.asInstanceOf[js.Any])
      
      inline def setApi_transportUndefined: Self = StObject.set(x, "api_transport", js.undefined)
      
      inline def setApp_host(value: String): Self = StObject.set(x, "app_host", value.asInstanceOf[js.Any])
      
      inline def setApp_hostUndefined: Self = StObject.set(x, "app_host", js.undefined)
      
      inline def setAutotrack(value: Boolean): Self = StObject.set(x, "autotrack", value.asInstanceOf[js.Any])
      
      inline def setAutotrackUndefined: Self = StObject.set(x, "autotrack", js.undefined)
      
      inline def setBatch_flush_interval_ms(value: Double): Self = StObject.set(x, "batch_flush_interval_ms", value.asInstanceOf[js.Any])
      
      inline def setBatch_flush_interval_msUndefined: Self = StObject.set(x, "batch_flush_interval_ms", js.undefined)
      
      inline def setBatch_request_timeout_ms(value: Double): Self = StObject.set(x, "batch_request_timeout_ms", value.asInstanceOf[js.Any])
      
      inline def setBatch_request_timeout_msUndefined: Self = StObject.set(x, "batch_request_timeout_ms", js.undefined)
      
      inline def setBatch_requests(value: Boolean): Self = StObject.set(x, "batch_requests", value.asInstanceOf[js.Any])
      
      inline def setBatch_requestsUndefined: Self = StObject.set(x, "batch_requests", js.undefined)
      
      inline def setBatch_size(value: Double): Self = StObject.set(x, "batch_size", value.asInstanceOf[js.Any])
      
      inline def setBatch_sizeUndefined: Self = StObject.set(x, "batch_size", js.undefined)
      
      inline def setCdn(value: String): Self = StObject.set(x, "cdn", value.asInstanceOf[js.Any])
      
      inline def setCdnUndefined: Self = StObject.set(x, "cdn", js.undefined)
      
      inline def setCookie_domain(value: String): Self = StObject.set(x, "cookie_domain", value.asInstanceOf[js.Any])
      
      inline def setCookie_domainUndefined: Self = StObject.set(x, "cookie_domain", js.undefined)
      
      inline def setCookie_expiration(value: Double): Self = StObject.set(x, "cookie_expiration", value.asInstanceOf[js.Any])
      
      inline def setCookie_expirationUndefined: Self = StObject.set(x, "cookie_expiration", js.undefined)
      
      inline def setCookie_name(value: String): Self = StObject.set(x, "cookie_name", value.asInstanceOf[js.Any])
      
      inline def setCookie_nameUndefined: Self = StObject.set(x, "cookie_name", js.undefined)
      
      inline def setCross_site_cookie(value: Boolean): Self = StObject.set(x, "cross_site_cookie", value.asInstanceOf[js.Any])
      
      inline def setCross_site_cookieUndefined: Self = StObject.set(x, "cross_site_cookie", js.undefined)
      
      inline def setCross_subdomain_cookie(value: Boolean): Self = StObject.set(x, "cross_subdomain_cookie", value.asInstanceOf[js.Any])
      
      inline def setCross_subdomain_cookieUndefined: Self = StObject.set(x, "cross_subdomain_cookie", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDisable_cookie(value: Boolean): Self = StObject.set(x, "disable_cookie", value.asInstanceOf[js.Any])
      
      inline def setDisable_cookieUndefined: Self = StObject.set(x, "disable_cookie", js.undefined)
      
      inline def setDisable_notifications(value: Boolean): Self = StObject.set(x, "disable_notifications", value.asInstanceOf[js.Any])
      
      inline def setDisable_notificationsUndefined: Self = StObject.set(x, "disable_notifications", js.undefined)
      
      inline def setDisable_persistence(value: Boolean): Self = StObject.set(x, "disable_persistence", value.asInstanceOf[js.Any])
      
      inline def setDisable_persistenceUndefined: Self = StObject.set(x, "disable_persistence", js.undefined)
      
      inline def setIgnore_dnt(value: Boolean): Self = StObject.set(x, "ignore_dnt", value.asInstanceOf[js.Any])
      
      inline def setIgnore_dntUndefined: Self = StObject.set(x, "ignore_dnt", js.undefined)
      
      inline def setImg(value: Boolean): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      inline def setInapp_link_new_window(value: Boolean): Self = StObject.set(x, "inapp_link_new_window", value.asInstanceOf[js.Any])
      
      inline def setInapp_link_new_windowUndefined: Self = StObject.set(x, "inapp_link_new_window", js.undefined)
      
      inline def setInapp_protocol(value: String): Self = StObject.set(x, "inapp_protocol", value.asInstanceOf[js.Any])
      
      inline def setInapp_protocolUndefined: Self = StObject.set(x, "inapp_protocol", js.undefined)
      
      inline def setIp(value: Boolean): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setLoaded(value: PartialConfig => Unit): Self = StObject.set(x, "loaded", js.Any.fromFunction1(value))
      
      inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      inline def setOpt_out_persistence_by_default(value: Boolean): Self = StObject.set(x, "opt_out_persistence_by_default", value.asInstanceOf[js.Any])
      
      inline def setOpt_out_persistence_by_defaultUndefined: Self = StObject.set(x, "opt_out_persistence_by_default", js.undefined)
      
      inline def setOpt_out_tracking_by_default(value: Boolean): Self = StObject.set(x, "opt_out_tracking_by_default", value.asInstanceOf[js.Any])
      
      inline def setOpt_out_tracking_by_defaultUndefined: Self = StObject.set(x, "opt_out_tracking_by_default", js.undefined)
      
      inline def setOpt_out_tracking_cookie_prefix(value: String): Self = StObject.set(x, "opt_out_tracking_cookie_prefix", value.asInstanceOf[js.Any])
      
      inline def setOpt_out_tracking_cookie_prefixUndefined: Self = StObject.set(x, "opt_out_tracking_cookie_prefix", js.undefined)
      
      inline def setOpt_out_tracking_persistence_type(value: Persistence): Self = StObject.set(x, "opt_out_tracking_persistence_type", value.asInstanceOf[js.Any])
      
      inline def setOpt_out_tracking_persistence_typeUndefined: Self = StObject.set(x, "opt_out_tracking_persistence_type", js.undefined)
      
      inline def setPersistence(value: Persistence): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
      
      inline def setPersistenceUndefined: Self = StObject.set(x, "persistence", js.undefined)
      
      inline def setPersistence_name(value: String): Self = StObject.set(x, "persistence_name", value.asInstanceOf[js.Any])
      
      inline def setPersistence_nameUndefined: Self = StObject.set(x, "persistence_name", js.undefined)
      
      inline def setProperty_blacklist(value: js.Array[String]): Self = StObject.set(x, "property_blacklist", value.asInstanceOf[js.Any])
      
      inline def setProperty_blacklistUndefined: Self = StObject.set(x, "property_blacklist", js.undefined)
      
      inline def setProperty_blacklistVarargs(value: String*): Self = StObject.set(x, "property_blacklist", js.Array(value*))
      
      inline def setSave_referrer(value: Boolean): Self = StObject.set(x, "save_referrer", value.asInstanceOf[js.Any])
      
      inline def setSave_referrerUndefined: Self = StObject.set(x, "save_referrer", js.undefined)
      
      inline def setSecure_cookie(value: Boolean): Self = StObject.set(x, "secure_cookie", value.asInstanceOf[js.Any])
      
      inline def setSecure_cookieUndefined: Self = StObject.set(x, "secure_cookie", js.undefined)
      
      inline def setStore_google(value: Boolean): Self = StObject.set(x, "store_google", value.asInstanceOf[js.Any])
      
      inline def setStore_googleUndefined: Self = StObject.set(x, "store_google", js.undefined)
      
      inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setTrack_links_timeout(value: Double): Self = StObject.set(x, "track_links_timeout", value.asInstanceOf[js.Any])
      
      inline def setTrack_links_timeoutUndefined: Self = StObject.set(x, "track_links_timeout", js.undefined)
      
      inline def setTrack_pageview(value: Boolean): Self = StObject.set(x, "track_pageview", value.asInstanceOf[js.Any])
      
      inline def setTrack_pageviewUndefined: Self = StObject.set(x, "track_pageview", js.undefined)
      
      inline def setUpgrade(value: Boolean): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
      
      inline def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setXhr_headers(value: XhrHeadersDef): Self = StObject.set(x, "xhr_headers", value.asInstanceOf[js.Any])
      
      inline def setXhr_headersUndefined: Self = StObject.set(x, "xhr_headers", js.undefined)
    }
  }
  
  /* Inlined std.Partial<mixpanel-browser.mixpanel-browser.Config> */
  trait PartialConfigApihost extends StObject {
    
    var api_host: js.UndefOr[String] = js.undefined
    
    var api_method: js.UndefOr[String] = js.undefined
    
    var api_transport: js.UndefOr[String] = js.undefined
    
    var app_host: js.UndefOr[String] = js.undefined
    
    var autotrack: js.UndefOr[Boolean] = js.undefined
    
    var batch_flush_interval_ms: js.UndefOr[Double] = js.undefined
    
    var batch_request_timeout_ms: js.UndefOr[Double] = js.undefined
    
    var batch_requests: js.UndefOr[Boolean] = js.undefined
    
    var batch_size: js.UndefOr[Double] = js.undefined
    
    var cdn: js.UndefOr[String] = js.undefined
    
    var cookie_domain: js.UndefOr[String] = js.undefined
    
    var cookie_expiration: js.UndefOr[Double] = js.undefined
    
    var cookie_name: js.UndefOr[String] = js.undefined
    
    var cross_site_cookie: js.UndefOr[Boolean] = js.undefined
    
    var cross_subdomain_cookie: js.UndefOr[Boolean] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var disable_cookie: js.UndefOr[Boolean] = js.undefined
    
    var disable_notifications: js.UndefOr[Boolean] = js.undefined
    
    var disable_persistence: js.UndefOr[Boolean] = js.undefined
    
    var ignore_dnt: js.UndefOr[Boolean] = js.undefined
    
    var img: js.UndefOr[Boolean] = js.undefined
    
    var inapp_link_new_window: js.UndefOr[Boolean] = js.undefined
    
    var inapp_protocol: js.UndefOr[String] = js.undefined
    
    var ip: js.UndefOr[Boolean] = js.undefined
    
    var loaded: js.UndefOr[js.Function1[/* mixpanel */ Mixpanel, Unit]] = js.undefined
    
    var opt_out_persistence_by_default: js.UndefOr[Boolean] = js.undefined
    
    var opt_out_tracking_by_default: js.UndefOr[Boolean] = js.undefined
    
    var opt_out_tracking_cookie_prefix: js.UndefOr[String] = js.undefined
    
    var opt_out_tracking_persistence_type: js.UndefOr[Persistence] = js.undefined
    
    var persistence: js.UndefOr[Persistence] = js.undefined
    
    var persistence_name: js.UndefOr[String] = js.undefined
    
    var property_blacklist: js.UndefOr[js.Array[String]] = js.undefined
    
    var save_referrer: js.UndefOr[Boolean] = js.undefined
    
    var secure_cookie: js.UndefOr[Boolean] = js.undefined
    
    var store_google: js.UndefOr[Boolean] = js.undefined
    
    var test: js.UndefOr[Boolean] = js.undefined
    
    var track_links_timeout: js.UndefOr[Double] = js.undefined
    
    var track_pageview: js.UndefOr[Boolean] = js.undefined
    
    var upgrade: js.UndefOr[Boolean] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var xhr_headers: js.UndefOr[XhrHeadersDef] = js.undefined
  }
  object PartialConfigApihost {
    
    inline def apply(): PartialConfigApihost = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfigApihost]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialConfigApihost] (val x: Self) extends AnyVal {
      
      inline def setApi_host(value: String): Self = StObject.set(x, "api_host", value.asInstanceOf[js.Any])
      
      inline def setApi_hostUndefined: Self = StObject.set(x, "api_host", js.undefined)
      
      inline def setApi_method(value: String): Self = StObject.set(x, "api_method", value.asInstanceOf[js.Any])
      
      inline def setApi_methodUndefined: Self = StObject.set(x, "api_method", js.undefined)
      
      inline def setApi_transport(value: String): Self = StObject.set(x, "api_transport", value.asInstanceOf[js.Any])
      
      inline def setApi_transportUndefined: Self = StObject.set(x, "api_transport", js.undefined)
      
      inline def setApp_host(value: String): Self = StObject.set(x, "app_host", value.asInstanceOf[js.Any])
      
      inline def setApp_hostUndefined: Self = StObject.set(x, "app_host", js.undefined)
      
      inline def setAutotrack(value: Boolean): Self = StObject.set(x, "autotrack", value.asInstanceOf[js.Any])
      
      inline def setAutotrackUndefined: Self = StObject.set(x, "autotrack", js.undefined)
      
      inline def setBatch_flush_interval_ms(value: Double): Self = StObject.set(x, "batch_flush_interval_ms", value.asInstanceOf[js.Any])
      
      inline def setBatch_flush_interval_msUndefined: Self = StObject.set(x, "batch_flush_interval_ms", js.undefined)
      
      inline def setBatch_request_timeout_ms(value: Double): Self = StObject.set(x, "batch_request_timeout_ms", value.asInstanceOf[js.Any])
      
      inline def setBatch_request_timeout_msUndefined: Self = StObject.set(x, "batch_request_timeout_ms", js.undefined)
      
      inline def setBatch_requests(value: Boolean): Self = StObject.set(x, "batch_requests", value.asInstanceOf[js.Any])
      
      inline def setBatch_requestsUndefined: Self = StObject.set(x, "batch_requests", js.undefined)
      
      inline def setBatch_size(value: Double): Self = StObject.set(x, "batch_size", value.asInstanceOf[js.Any])
      
      inline def setBatch_sizeUndefined: Self = StObject.set(x, "batch_size", js.undefined)
      
      inline def setCdn(value: String): Self = StObject.set(x, "cdn", value.asInstanceOf[js.Any])
      
      inline def setCdnUndefined: Self = StObject.set(x, "cdn", js.undefined)
      
      inline def setCookie_domain(value: String): Self = StObject.set(x, "cookie_domain", value.asInstanceOf[js.Any])
      
      inline def setCookie_domainUndefined: Self = StObject.set(x, "cookie_domain", js.undefined)
      
      inline def setCookie_expiration(value: Double): Self = StObject.set(x, "cookie_expiration", value.asInstanceOf[js.Any])
      
      inline def setCookie_expirationUndefined: Self = StObject.set(x, "cookie_expiration", js.undefined)
      
      inline def setCookie_name(value: String): Self = StObject.set(x, "cookie_name", value.asInstanceOf[js.Any])
      
      inline def setCookie_nameUndefined: Self = StObject.set(x, "cookie_name", js.undefined)
      
      inline def setCross_site_cookie(value: Boolean): Self = StObject.set(x, "cross_site_cookie", value.asInstanceOf[js.Any])
      
      inline def setCross_site_cookieUndefined: Self = StObject.set(x, "cross_site_cookie", js.undefined)
      
      inline def setCross_subdomain_cookie(value: Boolean): Self = StObject.set(x, "cross_subdomain_cookie", value.asInstanceOf[js.Any])
      
      inline def setCross_subdomain_cookieUndefined: Self = StObject.set(x, "cross_subdomain_cookie", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDisable_cookie(value: Boolean): Self = StObject.set(x, "disable_cookie", value.asInstanceOf[js.Any])
      
      inline def setDisable_cookieUndefined: Self = StObject.set(x, "disable_cookie", js.undefined)
      
      inline def setDisable_notifications(value: Boolean): Self = StObject.set(x, "disable_notifications", value.asInstanceOf[js.Any])
      
      inline def setDisable_notificationsUndefined: Self = StObject.set(x, "disable_notifications", js.undefined)
      
      inline def setDisable_persistence(value: Boolean): Self = StObject.set(x, "disable_persistence", value.asInstanceOf[js.Any])
      
      inline def setDisable_persistenceUndefined: Self = StObject.set(x, "disable_persistence", js.undefined)
      
      inline def setIgnore_dnt(value: Boolean): Self = StObject.set(x, "ignore_dnt", value.asInstanceOf[js.Any])
      
      inline def setIgnore_dntUndefined: Self = StObject.set(x, "ignore_dnt", js.undefined)
      
      inline def setImg(value: Boolean): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      inline def setInapp_link_new_window(value: Boolean): Self = StObject.set(x, "inapp_link_new_window", value.asInstanceOf[js.Any])
      
      inline def setInapp_link_new_windowUndefined: Self = StObject.set(x, "inapp_link_new_window", js.undefined)
      
      inline def setInapp_protocol(value: String): Self = StObject.set(x, "inapp_protocol", value.asInstanceOf[js.Any])
      
      inline def setInapp_protocolUndefined: Self = StObject.set(x, "inapp_protocol", js.undefined)
      
      inline def setIp(value: Boolean): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setLoaded(value: /* mixpanel */ Mixpanel => Unit): Self = StObject.set(x, "loaded", js.Any.fromFunction1(value))
      
      inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      inline def setOpt_out_persistence_by_default(value: Boolean): Self = StObject.set(x, "opt_out_persistence_by_default", value.asInstanceOf[js.Any])
      
      inline def setOpt_out_persistence_by_defaultUndefined: Self = StObject.set(x, "opt_out_persistence_by_default", js.undefined)
      
      inline def setOpt_out_tracking_by_default(value: Boolean): Self = StObject.set(x, "opt_out_tracking_by_default", value.asInstanceOf[js.Any])
      
      inline def setOpt_out_tracking_by_defaultUndefined: Self = StObject.set(x, "opt_out_tracking_by_default", js.undefined)
      
      inline def setOpt_out_tracking_cookie_prefix(value: String): Self = StObject.set(x, "opt_out_tracking_cookie_prefix", value.asInstanceOf[js.Any])
      
      inline def setOpt_out_tracking_cookie_prefixUndefined: Self = StObject.set(x, "opt_out_tracking_cookie_prefix", js.undefined)
      
      inline def setOpt_out_tracking_persistence_type(value: Persistence): Self = StObject.set(x, "opt_out_tracking_persistence_type", value.asInstanceOf[js.Any])
      
      inline def setOpt_out_tracking_persistence_typeUndefined: Self = StObject.set(x, "opt_out_tracking_persistence_type", js.undefined)
      
      inline def setPersistence(value: Persistence): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
      
      inline def setPersistenceUndefined: Self = StObject.set(x, "persistence", js.undefined)
      
      inline def setPersistence_name(value: String): Self = StObject.set(x, "persistence_name", value.asInstanceOf[js.Any])
      
      inline def setPersistence_nameUndefined: Self = StObject.set(x, "persistence_name", js.undefined)
      
      inline def setProperty_blacklist(value: js.Array[String]): Self = StObject.set(x, "property_blacklist", value.asInstanceOf[js.Any])
      
      inline def setProperty_blacklistUndefined: Self = StObject.set(x, "property_blacklist", js.undefined)
      
      inline def setProperty_blacklistVarargs(value: String*): Self = StObject.set(x, "property_blacklist", js.Array(value*))
      
      inline def setSave_referrer(value: Boolean): Self = StObject.set(x, "save_referrer", value.asInstanceOf[js.Any])
      
      inline def setSave_referrerUndefined: Self = StObject.set(x, "save_referrer", js.undefined)
      
      inline def setSecure_cookie(value: Boolean): Self = StObject.set(x, "secure_cookie", value.asInstanceOf[js.Any])
      
      inline def setSecure_cookieUndefined: Self = StObject.set(x, "secure_cookie", js.undefined)
      
      inline def setStore_google(value: Boolean): Self = StObject.set(x, "store_google", value.asInstanceOf[js.Any])
      
      inline def setStore_googleUndefined: Self = StObject.set(x, "store_google", js.undefined)
      
      inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setTrack_links_timeout(value: Double): Self = StObject.set(x, "track_links_timeout", value.asInstanceOf[js.Any])
      
      inline def setTrack_links_timeoutUndefined: Self = StObject.set(x, "track_links_timeout", js.undefined)
      
      inline def setTrack_pageview(value: Boolean): Self = StObject.set(x, "track_pageview", value.asInstanceOf[js.Any])
      
      inline def setTrack_pageviewUndefined: Self = StObject.set(x, "track_pageview", js.undefined)
      
      inline def setUpgrade(value: Boolean): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
      
      inline def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setXhr_headers(value: XhrHeadersDef): Self = StObject.set(x, "xhr_headers", value.asInstanceOf[js.Any])
      
      inline def setXhr_headersUndefined: Self = StObject.set(x, "xhr_headers", js.undefined)
    }
  }
  
  /* Inlined std.Partial<mixpanel-browser.mixpanel-browser.HasOptedInOutOptions> */
  trait PartialHasOptedInOutOptio extends StObject {
    
    var cookie_prefix: js.UndefOr[String] = js.undefined
    
    var persistence_type: js.UndefOr[Persistence] = js.undefined
  }
  object PartialHasOptedInOutOptio {
    
    inline def apply(): PartialHasOptedInOutOptio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialHasOptedInOutOptio]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialHasOptedInOutOptio] (val x: Self) extends AnyVal {
      
      inline def setCookie_prefix(value: String): Self = StObject.set(x, "cookie_prefix", value.asInstanceOf[js.Any])
      
      inline def setCookie_prefixUndefined: Self = StObject.set(x, "cookie_prefix", js.undefined)
      
      inline def setPersistence_type(value: Persistence): Self = StObject.set(x, "persistence_type", value.asInstanceOf[js.Any])
      
      inline def setPersistence_typeUndefined: Self = StObject.set(x, "persistence_type", js.undefined)
    }
  }
  
  /* Inlined std.Partial<mixpanel-browser.mixpanel-browser.InTrackingOptions> */
  trait PartialInTrackingOptions extends StObject {
    
    var cookie_expiration: js.UndefOr[Double] = js.undefined
    
    var cookie_prefix: js.UndefOr[String] = js.undefined
    
    var cross_subdomain_cookie: js.UndefOr[Boolean] = js.undefined
    
    var persistence_type: js.UndefOr[Persistence] = js.undefined
    
    var secure_cookie: js.UndefOr[Boolean] = js.undefined
    
    var track: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var track_event_name: js.UndefOr[String] = js.undefined
    
    var track_event_properties: js.UndefOr[Dict] = js.undefined
  }
  object PartialInTrackingOptions {
    
    inline def apply(): PartialInTrackingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialInTrackingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialInTrackingOptions] (val x: Self) extends AnyVal {
      
      inline def setCookie_expiration(value: Double): Self = StObject.set(x, "cookie_expiration", value.asInstanceOf[js.Any])
      
      inline def setCookie_expirationUndefined: Self = StObject.set(x, "cookie_expiration", js.undefined)
      
      inline def setCookie_prefix(value: String): Self = StObject.set(x, "cookie_prefix", value.asInstanceOf[js.Any])
      
      inline def setCookie_prefixUndefined: Self = StObject.set(x, "cookie_prefix", js.undefined)
      
      inline def setCross_subdomain_cookie(value: Boolean): Self = StObject.set(x, "cross_subdomain_cookie", value.asInstanceOf[js.Any])
      
      inline def setCross_subdomain_cookieUndefined: Self = StObject.set(x, "cross_subdomain_cookie", js.undefined)
      
      inline def setPersistence_type(value: Persistence): Self = StObject.set(x, "persistence_type", value.asInstanceOf[js.Any])
      
      inline def setPersistence_typeUndefined: Self = StObject.set(x, "persistence_type", js.undefined)
      
      inline def setSecure_cookie(value: Boolean): Self = StObject.set(x, "secure_cookie", value.asInstanceOf[js.Any])
      
      inline def setSecure_cookieUndefined: Self = StObject.set(x, "secure_cookie", js.undefined)
      
      inline def setTrack(value: () => Unit): Self = StObject.set(x, "track", js.Any.fromFunction0(value))
      
      inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
      
      inline def setTrack_event_name(value: String): Self = StObject.set(x, "track_event_name", value.asInstanceOf[js.Any])
      
      inline def setTrack_event_nameUndefined: Self = StObject.set(x, "track_event_name", js.undefined)
      
      inline def setTrack_event_properties(value: Dict): Self = StObject.set(x, "track_event_properties", value.asInstanceOf[js.Any])
      
      inline def setTrack_event_propertiesUndefined: Self = StObject.set(x, "track_event_properties", js.undefined)
    }
  }
  
  /* Inlined std.Partial<mixpanel-browser.mixpanel-browser.OutTrackingOptions> */
  trait PartialOutTrackingOptions extends StObject {
    
    var cookie_expiration: js.UndefOr[Double] = js.undefined
    
    var cookie_prefix: js.UndefOr[String] = js.undefined
    
    var cross_subdomain_cookie: js.UndefOr[Boolean] = js.undefined
    
    var delete_user: js.UndefOr[Boolean] = js.undefined
    
    var persistence_type: js.UndefOr[Persistence] = js.undefined
    
    var secure_cookie: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOutTrackingOptions {
    
    inline def apply(): PartialOutTrackingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOutTrackingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialOutTrackingOptions] (val x: Self) extends AnyVal {
      
      inline def setCookie_expiration(value: Double): Self = StObject.set(x, "cookie_expiration", value.asInstanceOf[js.Any])
      
      inline def setCookie_expirationUndefined: Self = StObject.set(x, "cookie_expiration", js.undefined)
      
      inline def setCookie_prefix(value: String): Self = StObject.set(x, "cookie_prefix", value.asInstanceOf[js.Any])
      
      inline def setCookie_prefixUndefined: Self = StObject.set(x, "cookie_prefix", js.undefined)
      
      inline def setCross_subdomain_cookie(value: Boolean): Self = StObject.set(x, "cross_subdomain_cookie", value.asInstanceOf[js.Any])
      
      inline def setCross_subdomain_cookieUndefined: Self = StObject.set(x, "cross_subdomain_cookie", js.undefined)
      
      inline def setDelete_user(value: Boolean): Self = StObject.set(x, "delete_user", value.asInstanceOf[js.Any])
      
      inline def setDelete_userUndefined: Self = StObject.set(x, "delete_user", js.undefined)
      
      inline def setPersistence_type(value: Persistence): Self = StObject.set(x, "persistence_type", value.asInstanceOf[js.Any])
      
      inline def setPersistence_typeUndefined: Self = StObject.set(x, "persistence_type", js.undefined)
      
      inline def setSecure_cookie(value: Boolean): Self = StObject.set(x, "secure_cookie", value.asInstanceOf[js.Any])
      
      inline def setSecure_cookieUndefined: Self = StObject.set(x, "secure_cookie", js.undefined)
    }
  }
  
  /* Inlined std.Partial<mixpanel-browser.mixpanel-browser.RegisterOptions> */
  trait PartialRegisterOptions extends StObject {
    
    var persistent: js.UndefOr[Boolean] = js.undefined
  }
  object PartialRegisterOptions {
    
    inline def apply(): PartialRegisterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRegisterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRegisterOptions] (val x: Self) extends AnyVal {
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    }
  }
  
  trait Status
    extends StObject
       with VerboseResponse {
    
    var error: String
    
    var status: `0`
  }
  object Status {
    
    inline def apply(error: String): Status = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = 0)
      __obj.asInstanceOf[Status]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: `0`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
