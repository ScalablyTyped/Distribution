package typings.mixpanelBrowser

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.mixpanelBrowser.anon.PartialClearOptOutInOutOp
import typings.mixpanelBrowser.anon.PartialConfig
import typings.mixpanelBrowser.anon.PartialConfigApihost
import typings.mixpanelBrowser.anon.PartialHasOptedInOutOptio
import typings.mixpanelBrowser.anon.PartialInTrackingOptions
import typings.mixpanelBrowser.anon.PartialOutTrackingOptions
import typings.mixpanelBrowser.mixpanelBrowserNumbers.`0`
import typings.mixpanelBrowser.mixpanelBrowserNumbers.`1`
import typings.mixpanelBrowser.mixpanelBrowserStrings.sendBeacon
import typings.mixpanelBrowser.mixpanelBrowserStrings.xhr
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("mixpanel-browser", JSImport.Default)
  @js.native
  val default: Mixpanel = js.native
  
  @JSImport("mixpanel-browser", "add_group")
  @js.native
  def addGroup(group_key: String, group_id: String): Unit = js.native
  @JSImport("mixpanel-browser", "add_group")
  @js.native
  def addGroup(group_key: String, group_id: String, callback: Callback): Unit = js.native
  
  @JSImport("mixpanel-browser", "alias")
  @js.native
  def alias(alias: String): Unit = js.native
  @JSImport("mixpanel-browser", "alias")
  @js.native
  def alias(alias: String, original: String): Unit = js.native
  
  @JSImport("mixpanel-browser", "clear_opt_in_out_tracking")
  @js.native
  def clearOptInOutTracking(): Unit = js.native
  @JSImport("mixpanel-browser", "clear_opt_in_out_tracking")
  @js.native
  def clearOptInOutTracking(options: PartialClearOptOutInOutOp): Unit = js.native
  
  @JSImport("mixpanel-browser", "disable")
  @js.native
  def disable(): Unit = js.native
  @JSImport("mixpanel-browser", "disable")
  @js.native
  def disable(events: js.Array[String]): Unit = js.native
  
  @JSImport("mixpanel-browser", "get_config")
  @js.native
  def getConfig(): js.Any = js.native
  @JSImport("mixpanel-browser", "get_config")
  @js.native
  def getConfig(prop_name: String): js.Any = js.native
  
  @JSImport("mixpanel-browser", "get_distinct_id")
  @js.native
  def getDistinctId(): js.Any = js.native
  
  @JSImport("mixpanel-browser", "get_group")
  @js.native
  def getGroup(group_key: String, group_id: String): Group = js.native
  
  @JSImport("mixpanel-browser", "get_property")
  @js.native
  def getProperty(property_name: String): js.Any = js.native
  
  @JSImport("mixpanel-browser", "has_opted_in_tracking")
  @js.native
  def hasOptedInTracking(): Boolean = js.native
  @JSImport("mixpanel-browser", "has_opted_in_tracking")
  @js.native
  def hasOptedInTracking(options: PartialHasOptedInOutOptio): Boolean = js.native
  
  @JSImport("mixpanel-browser", "has_opted_out_tracking")
  @js.native
  def hasOptedOutTracking(): Boolean = js.native
  @JSImport("mixpanel-browser", "has_opted_out_tracking")
  @js.native
  def hasOptedOutTracking(options: PartialHasOptedInOutOptio): Boolean = js.native
  
  @JSImport("mixpanel-browser", "identify")
  @js.native
  def identify(): js.Any = js.native
  @JSImport("mixpanel-browser", "identify")
  @js.native
  def identify(unique_id: String): js.Any = js.native
  
  @JSImport("mixpanel-browser", "init")
  @js.native
  def init(token: String): Mixpanel = js.native
  @JSImport("mixpanel-browser", "init")
  @js.native
  def init(token: String, config: js.UndefOr[scala.Nothing], name: String): Mixpanel = js.native
  @JSImport("mixpanel-browser", "init")
  @js.native
  def init(token: String, config: PartialConfigApihost): Mixpanel = js.native
  @JSImport("mixpanel-browser", "init")
  @js.native
  def init(token: String, config: PartialConfigApihost, name: String): Mixpanel = js.native
  
  @JSImport("mixpanel-browser", "opt_in_tracking")
  @js.native
  def optInTracking(): Unit = js.native
  @JSImport("mixpanel-browser", "opt_in_tracking")
  @js.native
  def optInTracking(options: PartialInTrackingOptions): Unit = js.native
  
  @JSImport("mixpanel-browser", "opt_out_tracking")
  @js.native
  def optOutTracking(): Unit = js.native
  @JSImport("mixpanel-browser", "opt_out_tracking")
  @js.native
  def optOutTracking(options: PartialOutTrackingOptions): Unit = js.native
  
  @JSImport("mixpanel-browser", "people")
  @js.native
  val people: People_ = js.native
  
  @JSImport("mixpanel-browser", "push")
  @js.native
  def push(item: PushItem): Unit = js.native
  
  @JSImport("mixpanel-browser", "register")
  @js.native
  def register(props: Dict): Unit = js.native
  @JSImport("mixpanel-browser", "register")
  @js.native
  def register(props: Dict, days: Double): Unit = js.native
  
  @JSImport("mixpanel-browser", "register_once")
  @js.native
  def registerOnce(props: Dict): Unit = js.native
  @JSImport("mixpanel-browser", "register_once")
  @js.native
  def registerOnce(props: Dict, default_value: js.UndefOr[scala.Nothing], days: Double): Unit = js.native
  @JSImport("mixpanel-browser", "register_once")
  @js.native
  def registerOnce(props: Dict, default_value: js.Any): Unit = js.native
  @JSImport("mixpanel-browser", "register_once")
  @js.native
  def registerOnce(props: Dict, default_value: js.Any, days: Double): Unit = js.native
  
  @JSImport("mixpanel-browser", "remove_group")
  @js.native
  def removeGroup(group_key: String, group_ids: String): Unit = js.native
  @JSImport("mixpanel-browser", "remove_group")
  @js.native
  def removeGroup(group_key: String, group_ids: String, callback: Callback): Unit = js.native
  @JSImport("mixpanel-browser", "remove_group")
  @js.native
  def removeGroup(group_key: String, group_ids: js.Array[Double | String]): Unit = js.native
  @JSImport("mixpanel-browser", "remove_group")
  @js.native
  def removeGroup(group_key: String, group_ids: js.Array[Double | String], callback: Callback): Unit = js.native
  @JSImport("mixpanel-browser", "remove_group")
  @js.native
  def removeGroup(group_key: String, group_ids: Double): Unit = js.native
  @JSImport("mixpanel-browser", "remove_group")
  @js.native
  def removeGroup(group_key: String, group_ids: Double, callback: Callback): Unit = js.native
  
  @JSImport("mixpanel-browser", "reset")
  @js.native
  def reset(): Unit = js.native
  
  @JSImport("mixpanel-browser", "set_config")
  @js.native
  def setConfig(config: PartialConfigApihost): Unit = js.native
  
  @JSImport("mixpanel-browser", "set_group")
  @js.native
  def setGroup(group_key: String, group_ids: String): Unit = js.native
  @JSImport("mixpanel-browser", "set_group")
  @js.native
  def setGroup(group_key: String, group_ids: String, callback: Callback): Unit = js.native
  @JSImport("mixpanel-browser", "set_group")
  @js.native
  def setGroup(group_key: String, group_ids: js.Array[Double | String]): Unit = js.native
  @JSImport("mixpanel-browser", "set_group")
  @js.native
  def setGroup(group_key: String, group_ids: js.Array[Double | String], callback: Callback): Unit = js.native
  @JSImport("mixpanel-browser", "set_group")
  @js.native
  def setGroup(group_key: String, group_ids: Double): Unit = js.native
  @JSImport("mixpanel-browser", "set_group")
  @js.native
  def setGroup(group_key: String, group_ids: Double, callback: Callback): Unit = js.native
  
  @JSImport("mixpanel-browser", "time_event")
  @js.native
  def timeEvent(event_name: String): Unit = js.native
  
  @JSImport("mixpanel-browser", "track")
  @js.native
  def track(event_name: String): Unit = js.native
  @JSImport("mixpanel-browser", "track")
  @js.native
  def track(
    event_name: String,
    properties: js.UndefOr[scala.Nothing],
    optionsOrCallback: js.UndefOr[scala.Nothing],
    callback: Callback
  ): Unit = js.native
  @JSImport("mixpanel-browser", "track")
  @js.native
  def track(event_name: String, properties: js.UndefOr[scala.Nothing], optionsOrCallback: Callback): Unit = js.native
  @JSImport("mixpanel-browser", "track")
  @js.native
  def track(
    event_name: String,
    properties: js.UndefOr[scala.Nothing],
    optionsOrCallback: Callback,
    callback: Callback
  ): Unit = js.native
  @JSImport("mixpanel-browser", "track")
  @js.native
  def track(event_name: String, properties: js.UndefOr[scala.Nothing], optionsOrCallback: RequestOptions): Unit = js.native
  @JSImport("mixpanel-browser", "track")
  @js.native
  def track(
    event_name: String,
    properties: js.UndefOr[scala.Nothing],
    optionsOrCallback: RequestOptions,
    callback: Callback
  ): Unit = js.native
  @JSImport("mixpanel-browser", "track")
  @js.native
  def track(event_name: String, properties: Dict): Unit = js.native
  @JSImport("mixpanel-browser", "track")
  @js.native
  def track(
    event_name: String,
    properties: Dict,
    optionsOrCallback: js.UndefOr[scala.Nothing],
    callback: Callback
  ): Unit = js.native
  @JSImport("mixpanel-browser", "track")
  @js.native
  def track(event_name: String, properties: Dict, optionsOrCallback: Callback): Unit = js.native
  @JSImport("mixpanel-browser", "track")
  @js.native
  def track(event_name: String, properties: Dict, optionsOrCallback: Callback, callback: Callback): Unit = js.native
  @JSImport("mixpanel-browser", "track")
  @js.native
  def track(event_name: String, properties: Dict, optionsOrCallback: RequestOptions): Unit = js.native
  @JSImport("mixpanel-browser", "track")
  @js.native
  def track(event_name: String, properties: Dict, optionsOrCallback: RequestOptions, callback: Callback): Unit = js.native
  
  @JSImport("mixpanel-browser", "track_forms")
  @js.native
  def trackForms(query: Query, event_name: String): Unit = js.native
  @JSImport("mixpanel-browser", "track_forms")
  @js.native
  def trackForms(query: Query, event_name: String, properties: js.Function0[Unit]): Unit = js.native
  @JSImport("mixpanel-browser", "track_forms")
  @js.native
  def trackForms(query: Query, event_name: String, properties: Dict): Unit = js.native
  
  @JSImport("mixpanel-browser", "track_links")
  @js.native
  def trackLinks(query: Query, event_name: String): Unit = js.native
  @JSImport("mixpanel-browser", "track_links")
  @js.native
  def trackLinks(query: Query, event_name: String, properties: js.Function0[Unit]): Unit = js.native
  @JSImport("mixpanel-browser", "track_links")
  @js.native
  def trackLinks(query: Query, event_name: String, properties: Dict): Unit = js.native
  
  @JSImport("mixpanel-browser", "track_with_groups")
  @js.native
  def trackWithGroups(event_name: String, properties: Dict, groups: Dict): Unit = js.native
  @JSImport("mixpanel-browser", "track_with_groups")
  @js.native
  def trackWithGroups(event_name: String, properties: Dict, groups: Dict, callback: Callback): Unit = js.native
  
  @JSImport("mixpanel-browser", "unregister")
  @js.native
  def unregister(property: String): Unit = js.native
  
  type Callback = js.Function1[/* response */ Response, Unit]
  
  @js.native
  trait ClearOptOutInOutOptions extends HasOptedInOutOptions {
    
    var cookie_expiration: Double = js.native
    
    var cross_subdomain_cookie: Boolean = js.native
    
    var secure_cookie: Boolean = js.native
  }
  object ClearOptOutInOutOptions {
    
    @scala.inline
    def apply(
      cookie_expiration: Double,
      cookie_prefix: String,
      cross_subdomain_cookie: Boolean,
      persistence_type: Persistence,
      secure_cookie: Boolean
    ): ClearOptOutInOutOptions = {
      val __obj = js.Dynamic.literal(cookie_expiration = cookie_expiration.asInstanceOf[js.Any], cookie_prefix = cookie_prefix.asInstanceOf[js.Any], cross_subdomain_cookie = cross_subdomain_cookie.asInstanceOf[js.Any], persistence_type = persistence_type.asInstanceOf[js.Any], secure_cookie = secure_cookie.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClearOptOutInOutOptions]
    }
    
    @scala.inline
    implicit class ClearOptOutInOutOptionsMutableBuilder[Self <: ClearOptOutInOutOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookie_expiration(value: Double): Self = StObject.set(x, "cookie_expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCross_subdomain_cookie(value: Boolean): Self = StObject.set(x, "cross_subdomain_cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecure_cookie(value: Boolean): Self = StObject.set(x, "secure_cookie", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Config extends StObject {
    
    var api_host: String = js.native
    
    var api_method: String = js.native
    
    var api_transport: String = js.native
    
    var app_host: String = js.native
    
    var autotrack: Boolean = js.native
    
    var batch_flush_interval_ms: Double = js.native
    
    var batch_request_timeout_ms: Double = js.native
    
    var batch_requests: Boolean = js.native
    
    var batch_size: Double = js.native
    
    var cdn: String = js.native
    
    var cookie_domain: String = js.native
    
    var cookie_expiration: Double = js.native
    
    var cookie_name: String = js.native
    
    var cross_site_cookie: Boolean = js.native
    
    var cross_subdomain_cookie: Boolean = js.native
    
    var debug: Boolean = js.native
    
    var disable_cookie: Boolean = js.native
    
    var disable_notifications: Boolean = js.native
    
    var disable_persistence: Boolean = js.native
    
    var ignore_dnt: Boolean = js.native
    
    var img: Boolean = js.native
    
    var inapp_link_new_window: Boolean = js.native
    
    var inapp_protocol: String = js.native
    
    var ip: Boolean = js.native
    
    def loaded(mixpanel: Mixpanel): Unit = js.native
    
    var opt_out_persistence_by_default: Boolean = js.native
    
    var opt_out_tracking_by_default: Boolean = js.native
    
    var opt_out_tracking_cookie_prefix: String = js.native
    
    var opt_out_tracking_persistence_type: Persistence = js.native
    
    var persistence: Persistence = js.native
    
    var persistence_name: String = js.native
    
    var property_blacklist: js.Array[String] = js.native
    
    var save_referrer: Boolean = js.native
    
    var secure_cookie: Boolean = js.native
    
    var store_google: Boolean = js.native
    
    var test: Boolean = js.native
    
    var track_links_timeout: Double = js.native
    
    var track_pageview: Boolean = js.native
    
    var upgrade: Boolean = js.native
    
    var verbose: Boolean = js.native
    
    var xhr_headers: XhrHeadersDef = js.native
  }
  object Config {
    
    @scala.inline
    def apply(
      api_host: String,
      api_method: String,
      api_transport: String,
      app_host: String,
      autotrack: Boolean,
      batch_flush_interval_ms: Double,
      batch_request_timeout_ms: Double,
      batch_requests: Boolean,
      batch_size: Double,
      cdn: String,
      cookie_domain: String,
      cookie_expiration: Double,
      cookie_name: String,
      cross_site_cookie: Boolean,
      cross_subdomain_cookie: Boolean,
      debug: Boolean,
      disable_cookie: Boolean,
      disable_notifications: Boolean,
      disable_persistence: Boolean,
      ignore_dnt: Boolean,
      img: Boolean,
      inapp_link_new_window: Boolean,
      inapp_protocol: String,
      ip: Boolean,
      loaded: Mixpanel => Unit,
      opt_out_persistence_by_default: Boolean,
      opt_out_tracking_by_default: Boolean,
      opt_out_tracking_cookie_prefix: String,
      opt_out_tracking_persistence_type: Persistence,
      persistence: Persistence,
      persistence_name: String,
      property_blacklist: js.Array[String],
      save_referrer: Boolean,
      secure_cookie: Boolean,
      store_google: Boolean,
      test: Boolean,
      track_links_timeout: Double,
      track_pageview: Boolean,
      upgrade: Boolean,
      verbose: Boolean,
      xhr_headers: XhrHeadersDef
    ): Config = {
      val __obj = js.Dynamic.literal(api_host = api_host.asInstanceOf[js.Any], api_method = api_method.asInstanceOf[js.Any], api_transport = api_transport.asInstanceOf[js.Any], app_host = app_host.asInstanceOf[js.Any], autotrack = autotrack.asInstanceOf[js.Any], batch_flush_interval_ms = batch_flush_interval_ms.asInstanceOf[js.Any], batch_request_timeout_ms = batch_request_timeout_ms.asInstanceOf[js.Any], batch_requests = batch_requests.asInstanceOf[js.Any], batch_size = batch_size.asInstanceOf[js.Any], cdn = cdn.asInstanceOf[js.Any], cookie_domain = cookie_domain.asInstanceOf[js.Any], cookie_expiration = cookie_expiration.asInstanceOf[js.Any], cookie_name = cookie_name.asInstanceOf[js.Any], cross_site_cookie = cross_site_cookie.asInstanceOf[js.Any], cross_subdomain_cookie = cross_subdomain_cookie.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], disable_cookie = disable_cookie.asInstanceOf[js.Any], disable_notifications = disable_notifications.asInstanceOf[js.Any], disable_persistence = disable_persistence.asInstanceOf[js.Any], ignore_dnt = ignore_dnt.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], inapp_link_new_window = inapp_link_new_window.asInstanceOf[js.Any], inapp_protocol = inapp_protocol.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], loaded = js.Any.fromFunction1(loaded), opt_out_persistence_by_default = opt_out_persistence_by_default.asInstanceOf[js.Any], opt_out_tracking_by_default = opt_out_tracking_by_default.asInstanceOf[js.Any], opt_out_tracking_cookie_prefix = opt_out_tracking_cookie_prefix.asInstanceOf[js.Any], opt_out_tracking_persistence_type = opt_out_tracking_persistence_type.asInstanceOf[js.Any], persistence = persistence.asInstanceOf[js.Any], persistence_name = persistence_name.asInstanceOf[js.Any], property_blacklist = property_blacklist.asInstanceOf[js.Any], save_referrer = save_referrer.asInstanceOf[js.Any], secure_cookie = secure_cookie.asInstanceOf[js.Any], store_google = store_google.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], track_links_timeout = track_links_timeout.asInstanceOf[js.Any], track_pageview = track_pageview.asInstanceOf[js.Any], upgrade = upgrade.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], xhr_headers = xhr_headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi_host(value: String): Self = StObject.set(x, "api_host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi_method(value: String): Self = StObject.set(x, "api_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi_transport(value: String): Self = StObject.set(x, "api_transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApp_host(value: String): Self = StObject.set(x, "app_host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutotrack(value: Boolean): Self = StObject.set(x, "autotrack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatch_flush_interval_ms(value: Double): Self = StObject.set(x, "batch_flush_interval_ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatch_request_timeout_ms(value: Double): Self = StObject.set(x, "batch_request_timeout_ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatch_requests(value: Boolean): Self = StObject.set(x, "batch_requests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatch_size(value: Double): Self = StObject.set(x, "batch_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCdn(value: String): Self = StObject.set(x, "cdn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookie_domain(value: String): Self = StObject.set(x, "cookie_domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookie_expiration(value: Double): Self = StObject.set(x, "cookie_expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookie_name(value: String): Self = StObject.set(x, "cookie_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCross_site_cookie(value: Boolean): Self = StObject.set(x, "cross_site_cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCross_subdomain_cookie(value: Boolean): Self = StObject.set(x, "cross_subdomain_cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable_cookie(value: Boolean): Self = StObject.set(x, "disable_cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable_notifications(value: Boolean): Self = StObject.set(x, "disable_notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable_persistence(value: Boolean): Self = StObject.set(x, "disable_persistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnore_dnt(value: Boolean): Self = StObject.set(x, "ignore_dnt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImg(value: Boolean): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInapp_link_new_window(value: Boolean): Self = StObject.set(x, "inapp_link_new_window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInapp_protocol(value: String): Self = StObject.set(x, "inapp_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIp(value: Boolean): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaded(value: Mixpanel => Unit): Self = StObject.set(x, "loaded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpt_out_persistence_by_default(value: Boolean): Self = StObject.set(x, "opt_out_persistence_by_default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpt_out_tracking_by_default(value: Boolean): Self = StObject.set(x, "opt_out_tracking_by_default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpt_out_tracking_cookie_prefix(value: String): Self = StObject.set(x, "opt_out_tracking_cookie_prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpt_out_tracking_persistence_type(value: Persistence): Self = StObject.set(x, "opt_out_tracking_persistence_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistence(value: Persistence): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistence_name(value: String): Self = StObject.set(x, "persistence_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty_blacklist(value: js.Array[String]): Self = StObject.set(x, "property_blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty_blacklistVarargs(value: String*): Self = StObject.set(x, "property_blacklist", js.Array(value :_*))
      
      @scala.inline
      def setSave_referrer(value: Boolean): Self = StObject.set(x, "save_referrer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecure_cookie(value: Boolean): Self = StObject.set(x, "secure_cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStore_google(value: Boolean): Self = StObject.set(x, "store_google", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_links_timeout(value: Double): Self = StObject.set(x, "track_links_timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_pageview(value: Boolean): Self = StObject.set(x, "track_pageview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpgrade(value: Boolean): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhr_headers(value: XhrHeadersDef): Self = StObject.set(x, "xhr_headers", value.asInstanceOf[js.Any])
    }
  }
  
  type Dict = StringDictionary[js.Any]
  
  @js.native
  trait Group extends StObject {
    
    def remove(list_name: String, value: String): Group = js.native
    def remove(list_name: String, value: String, callback: Callback): Group = js.native
    
    def set(prop: String): Group = js.native
    def set(prop: String, to: js.UndefOr[String]): Group = js.native
    def set(prop: String, to: js.UndefOr[String], callback: Callback): Group = js.native
    def set(prop: Dict): Group = js.native
    def set(prop: Dict, to: js.UndefOr[String]): Group = js.native
    def set(prop: Dict, to: js.UndefOr[String], callback: Callback): Group = js.native
    
    def setOnce(prop: String): Group = js.native
    def setOnce(prop: String, to: js.UndefOr[String]): Group = js.native
    def setOnce(prop: String, to: js.UndefOr[String], callback: Callback): Group = js.native
    def setOnce(prop: Dict): Group = js.native
    def setOnce(prop: Dict, to: js.UndefOr[String]): Group = js.native
    def setOnce(prop: Dict, to: js.UndefOr[String], callback: Callback): Group = js.native
    
    def union(list_name: String, values: js.Array[String | Double]): Group = js.native
    def union(list_name: String, values: js.Array[String | Double], callback: Callback): Group = js.native
    
    def unset(prop: String): Unit = js.native
    def unset(prop: String, callback: Callback): Unit = js.native
  }
  
  @js.native
  trait HasOptedInOutOptions extends StObject {
    
    var cookie_prefix: String = js.native
    
    var persistence_type: Persistence = js.native
  }
  object HasOptedInOutOptions {
    
    @scala.inline
    def apply(cookie_prefix: String, persistence_type: Persistence): HasOptedInOutOptions = {
      val __obj = js.Dynamic.literal(cookie_prefix = cookie_prefix.asInstanceOf[js.Any], persistence_type = persistence_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasOptedInOutOptions]
    }
    
    @scala.inline
    implicit class HasOptedInOutOptionsMutableBuilder[Self <: HasOptedInOutOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookie_prefix(value: String): Self = StObject.set(x, "cookie_prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistence_type(value: Persistence): Self = StObject.set(x, "persistence_type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InTrackingOptions extends ClearOptOutInOutOptions {
    
    def track(): Unit = js.native
    
    var track_event_name: String = js.native
    
    var track_event_properties: Dict = js.native
  }
  object InTrackingOptions {
    
    @scala.inline
    def apply(
      cookie_expiration: Double,
      cookie_prefix: String,
      cross_subdomain_cookie: Boolean,
      persistence_type: Persistence,
      secure_cookie: Boolean,
      track: () => Unit,
      track_event_name: String,
      track_event_properties: Dict
    ): InTrackingOptions = {
      val __obj = js.Dynamic.literal(cookie_expiration = cookie_expiration.asInstanceOf[js.Any], cookie_prefix = cookie_prefix.asInstanceOf[js.Any], cross_subdomain_cookie = cross_subdomain_cookie.asInstanceOf[js.Any], persistence_type = persistence_type.asInstanceOf[js.Any], secure_cookie = secure_cookie.asInstanceOf[js.Any], track = js.Any.fromFunction0(track), track_event_name = track_event_name.asInstanceOf[js.Any], track_event_properties = track_event_properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[InTrackingOptions]
    }
    
    @scala.inline
    implicit class InTrackingOptionsMutableBuilder[Self <: InTrackingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTrack(value: () => Unit): Self = StObject.set(x, "track", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTrack_event_name(value: String): Self = StObject.set(x, "track_event_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_event_properties(value: Dict): Self = StObject.set(x, "track_event_properties", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Mixpanel extends StObject {
    
    def add_group(group_key: String, group_id: String): Unit = js.native
    def add_group(group_key: String, group_id: String, callback: Callback): Unit = js.native
    
    def alias(alias: String): Unit = js.native
    def alias(alias: String, original: String): Unit = js.native
    
    def clear_opt_in_out_tracking(): Unit = js.native
    def clear_opt_in_out_tracking(options: PartialClearOptOutInOutOp): Unit = js.native
    
    def disable(): Unit = js.native
    def disable(events: js.Array[String]): Unit = js.native
    
    def get_config(): js.Any = js.native
    def get_config(prop_name: String): js.Any = js.native
    
    def get_distinct_id(): js.Any = js.native
    
    def get_group(group_key: String, group_id: String): Group = js.native
    
    def get_property(property_name: String): js.Any = js.native
    
    def has_opted_in_tracking(): Boolean = js.native
    def has_opted_in_tracking(options: PartialHasOptedInOutOptio): Boolean = js.native
    
    def has_opted_out_tracking(): Boolean = js.native
    def has_opted_out_tracking(options: PartialHasOptedInOutOptio): Boolean = js.native
    
    def identify(): js.Any = js.native
    def identify(unique_id: String): js.Any = js.native
    
    def init(token: String): Mixpanel = js.native
    def init(token: String, config: js.UndefOr[scala.Nothing], name: String): Mixpanel = js.native
    def init(token: String, config: PartialConfig): Mixpanel = js.native
    def init(token: String, config: PartialConfig, name: String): Mixpanel = js.native
    
    def opt_in_tracking(): Unit = js.native
    def opt_in_tracking(options: PartialInTrackingOptions): Unit = js.native
    
    def opt_out_tracking(): Unit = js.native
    def opt_out_tracking(options: PartialOutTrackingOptions): Unit = js.native
    
    var people: People_ = js.native
    
    def push(item: PushItem): Unit = js.native
    
    def register(props: Dict): Unit = js.native
    def register(props: Dict, days: Double): Unit = js.native
    
    def register_once(props: Dict): Unit = js.native
    def register_once(props: Dict, default_value: js.UndefOr[scala.Nothing], days: Double): Unit = js.native
    def register_once(props: Dict, default_value: js.Any): Unit = js.native
    def register_once(props: Dict, default_value: js.Any, days: Double): Unit = js.native
    
    def remove_group(group_key: String, group_ids: String): Unit = js.native
    def remove_group(group_key: String, group_ids: String, callback: Callback): Unit = js.native
    def remove_group(group_key: String, group_ids: js.Array[Double | String]): Unit = js.native
    def remove_group(group_key: String, group_ids: js.Array[Double | String], callback: Callback): Unit = js.native
    def remove_group(group_key: String, group_ids: Double): Unit = js.native
    def remove_group(group_key: String, group_ids: Double, callback: Callback): Unit = js.native
    
    def reset(): Unit = js.native
    
    def set_config(config: PartialConfig): Unit = js.native
    
    def set_group(group_key: String, group_ids: String): Unit = js.native
    def set_group(group_key: String, group_ids: String, callback: Callback): Unit = js.native
    def set_group(group_key: String, group_ids: js.Array[Double | String]): Unit = js.native
    def set_group(group_key: String, group_ids: js.Array[Double | String], callback: Callback): Unit = js.native
    def set_group(group_key: String, group_ids: Double): Unit = js.native
    def set_group(group_key: String, group_ids: Double, callback: Callback): Unit = js.native
    
    def time_event(event_name: String): Unit = js.native
    
    def track(event_name: String): Unit = js.native
    def track(
      event_name: String,
      properties: js.UndefOr[scala.Nothing],
      optionsOrCallback: js.UndefOr[scala.Nothing],
      callback: Callback
    ): Unit = js.native
    def track(event_name: String, properties: js.UndefOr[scala.Nothing], optionsOrCallback: Callback): Unit = js.native
    def track(
      event_name: String,
      properties: js.UndefOr[scala.Nothing],
      optionsOrCallback: Callback,
      callback: Callback
    ): Unit = js.native
    def track(event_name: String, properties: js.UndefOr[scala.Nothing], optionsOrCallback: RequestOptions): Unit = js.native
    def track(
      event_name: String,
      properties: js.UndefOr[scala.Nothing],
      optionsOrCallback: RequestOptions,
      callback: Callback
    ): Unit = js.native
    def track(event_name: String, properties: Dict): Unit = js.native
    def track(
      event_name: String,
      properties: Dict,
      optionsOrCallback: js.UndefOr[scala.Nothing],
      callback: Callback
    ): Unit = js.native
    def track(event_name: String, properties: Dict, optionsOrCallback: Callback): Unit = js.native
    def track(event_name: String, properties: Dict, optionsOrCallback: Callback, callback: Callback): Unit = js.native
    def track(event_name: String, properties: Dict, optionsOrCallback: RequestOptions): Unit = js.native
    def track(event_name: String, properties: Dict, optionsOrCallback: RequestOptions, callback: Callback): Unit = js.native
    
    def track_forms(query: Query, event_name: String): Unit = js.native
    def track_forms(query: Query, event_name: String, properties: js.Function0[Unit]): Unit = js.native
    def track_forms(query: Query, event_name: String, properties: Dict): Unit = js.native
    
    def track_links(query: Query, event_name: String): Unit = js.native
    def track_links(query: Query, event_name: String, properties: js.Function0[Unit]): Unit = js.native
    def track_links(query: Query, event_name: String, properties: Dict): Unit = js.native
    
    def track_with_groups(event_name: String, properties: Dict, groups: Dict): Unit = js.native
    def track_with_groups(event_name: String, properties: Dict, groups: Dict, callback: Callback): Unit = js.native
    
    def unregister(property: String): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mixpanelBrowser.mixpanelBrowserNumbers.`1`
    - typings.mixpanelBrowser.mixpanelBrowserNumbers.`0`
  */
  trait NormalResponse extends Response
  object NormalResponse {
    
    @scala.inline
    def `0`: typings.mixpanelBrowser.mixpanelBrowserNumbers.`0` = 0.asInstanceOf[typings.mixpanelBrowser.mixpanelBrowserNumbers.`0`]
    
    @scala.inline
    def `1`: typings.mixpanelBrowser.mixpanelBrowserNumbers.`1` = 1.asInstanceOf[typings.mixpanelBrowser.mixpanelBrowserNumbers.`1`]
  }
  
  @js.native
  trait OutTrackingOptions extends ClearOptOutInOutOptions {
    
    var delete_user: Boolean = js.native
  }
  object OutTrackingOptions {
    
    @scala.inline
    def apply(
      cookie_expiration: Double,
      cookie_prefix: String,
      cross_subdomain_cookie: Boolean,
      delete_user: Boolean,
      persistence_type: Persistence,
      secure_cookie: Boolean
    ): OutTrackingOptions = {
      val __obj = js.Dynamic.literal(cookie_expiration = cookie_expiration.asInstanceOf[js.Any], cookie_prefix = cookie_prefix.asInstanceOf[js.Any], cross_subdomain_cookie = cross_subdomain_cookie.asInstanceOf[js.Any], delete_user = delete_user.asInstanceOf[js.Any], persistence_type = persistence_type.asInstanceOf[js.Any], secure_cookie = secure_cookie.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutTrackingOptions]
    }
    
    @scala.inline
    implicit class OutTrackingOptionsMutableBuilder[Self <: OutTrackingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete_user(value: Boolean): Self = StObject.set(x, "delete_user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait People_ extends StObject {
    
    def append(prop: String, value: js.Any): Unit = js.native
    def append(prop: String, value: js.Any, callback: Callback): Unit = js.native
    def append(prop: Dict): Unit = js.native
    def append(prop: Dict, callback: Callback): Unit = js.native
    
    def clear_charges(): Unit = js.native
    def clear_charges(callback: Callback): Unit = js.native
    
    def delete_user(): Unit = js.native
    
    def increment(prop: String): Unit = js.native
    def increment(prop: String, by: Double): Unit = js.native
    def increment(prop: String, by: Double, callback: Callback): Unit = js.native
    def increment(prop: String, callback: Callback): Unit = js.native
    def increment(prop: Dict): Unit = js.native
    def increment(prop: Dict, callback: Callback): Unit = js.native
    
    def remove(prop: String, value: js.Any): Unit = js.native
    def remove(prop: String, value: js.Any, callback: Callback): Unit = js.native
    def remove(prop: Dict): Unit = js.native
    def remove(prop: Dict, callback: Callback): Unit = js.native
    
    def set(prop: String, to: js.Any): Unit = js.native
    def set(prop: String, to: js.Any, callback: Callback): Unit = js.native
    def set(prop: Dict): Unit = js.native
    def set(prop: Dict, callback: Callback): Unit = js.native
    
    def set_once(prop: String, to: js.Any): Unit = js.native
    def set_once(prop: String, to: js.Any, callback: Callback): Unit = js.native
    def set_once(prop: Dict): Unit = js.native
    def set_once(prop: Dict, callback: Callback): Unit = js.native
    
    def track_charge(amount: Double): Unit = js.native
    def track_charge(amount: Double, propertiesOrCallback: js.UndefOr[scala.Nothing], callback: Callback): Unit = js.native
    def track_charge(amount: Double, propertiesOrCallback: Callback): Unit = js.native
    def track_charge(amount: Double, propertiesOrCallback: Callback, callback: Callback): Unit = js.native
    def track_charge(amount: Double, propertiesOrCallback: Dict): Unit = js.native
    def track_charge(amount: Double, propertiesOrCallback: Dict, callback: Callback): Unit = js.native
    
    def union(prop: String, value: js.Any): Unit = js.native
    def union(prop: String, value: js.Any, callback: Callback): Unit = js.native
    def union(prop: Dict): Unit = js.native
    def union(prop: Dict, callback: Callback): Unit = js.native
    
    def unset(prop: String): Unit = js.native
    def unset(prop: String, callback: Callback): Unit = js.native
    def unset(prop: js.Array[String]): Unit = js.native
    def unset(prop: js.Array[String], callback: Callback): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mixpanelBrowser.mixpanelBrowserStrings.cookie
    - typings.mixpanelBrowser.mixpanelBrowserStrings.localStorage
  */
  trait Persistence extends StObject
  object Persistence {
    
    @scala.inline
    def cookie: typings.mixpanelBrowser.mixpanelBrowserStrings.cookie = "cookie".asInstanceOf[typings.mixpanelBrowser.mixpanelBrowserStrings.cookie]
    
    @scala.inline
    def localStorage: typings.mixpanelBrowser.mixpanelBrowserStrings.localStorage = "localStorage".asInstanceOf[typings.mixpanelBrowser.mixpanelBrowserStrings.localStorage]
  }
  
  type PushItem = js.Array[String | Dict]
  
  type Query = String | Element | js.Array[Element]
  
  @js.native
  trait RequestOptions extends StObject {
    
    var transport: js.UndefOr[xhr | sendBeacon] = js.native
  }
  object RequestOptions {
    
    @scala.inline
    def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransport(value: xhr | sendBeacon): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mixpanelBrowser.mod.VerboseResponse
    - typings.mixpanelBrowser.mod.NormalResponse
  */
  trait Response extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.mixpanelBrowser.anon.Error
    - typings.mixpanelBrowser.anon.Status
  */
  trait VerboseResponse extends Response
  object VerboseResponse {
    
    @scala.inline
    def Error(error: Null, status: `1`): typings.mixpanelBrowser.anon.Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mixpanelBrowser.anon.Error]
    }
    
    @scala.inline
    def Status(error: String, status: `0`): typings.mixpanelBrowser.anon.Status = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mixpanelBrowser.anon.Status]
    }
  }
  
  type XhrHeadersDef = StringDictionary[js.Any]
  
  type _To = Mixpanel
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Mixpanel = default
}
