package typings.mixpanelBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.mixpanelBrowser.anon.PartialClearOptOutInOutOp
import typings.mixpanelBrowser.anon.PartialConfig
import typings.mixpanelBrowser.anon.PartialConfigApihost
import typings.mixpanelBrowser.anon.PartialHasOptedInOutOptio
import typings.mixpanelBrowser.anon.PartialInTrackingOptions
import typings.mixpanelBrowser.anon.PartialOutTrackingOptions
import typings.mixpanelBrowser.mixpanelBrowserStrings.sendBeacon
import typings.mixpanelBrowser.mixpanelBrowserStrings.xhr
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mixpanel-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mixpanel-browser", JSImport.Default)
  @js.native
  val default: Mixpanel = js.native
  
  inline def addGroup(group_key: String, group_id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_group")(group_key.asInstanceOf[js.Any], group_id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addGroup(group_key: String, group_id: String, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_group")(group_key.asInstanceOf[js.Any], group_id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def alias(alias: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("alias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def alias(alias: String, original: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alias")(alias.asInstanceOf[js.Any], original.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clearOptInOutTracking(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear_opt_in_out_tracking")().asInstanceOf[Unit]
  inline def clearOptInOutTracking(options: PartialClearOptOutInOutOp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear_opt_in_out_tracking")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
  inline def disable(events: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")(events.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get_config")().asInstanceOf[js.Any]
  inline def getConfig(prop_name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get_config")(prop_name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def getDistinctId(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get_distinct_id")().asInstanceOf[js.Any]
  
  inline def getGroup(group_key: String, group_id: String): Group = (^.asInstanceOf[js.Dynamic].applyDynamic("get_group")(group_key.asInstanceOf[js.Any], group_id.asInstanceOf[js.Any])).asInstanceOf[Group]
  
  inline def getProperty(property_name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get_property")(property_name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def hasOptedInTracking(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("has_opted_in_tracking")().asInstanceOf[Boolean]
  inline def hasOptedInTracking(options: PartialHasOptedInOutOptio): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("has_opted_in_tracking")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasOptedOutTracking(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("has_opted_out_tracking")().asInstanceOf[Boolean]
  inline def hasOptedOutTracking(options: PartialHasOptedInOutOptio): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("has_opted_out_tracking")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def identify(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("identify")().asInstanceOf[js.Any]
  inline def identify(unique_id: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("identify")(unique_id.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def init(token: String): Mixpanel = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(token.asInstanceOf[js.Any]).asInstanceOf[Mixpanel]
  inline def init(token: String, config: Unit, name: String): Mixpanel = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(token.asInstanceOf[js.Any], config.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Mixpanel]
  inline def init(token: String, config: PartialConfigApihost): Mixpanel = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(token.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Mixpanel]
  inline def init(token: String, config: PartialConfigApihost, name: String): Mixpanel = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(token.asInstanceOf[js.Any], config.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Mixpanel]
  
  inline def optInTracking(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("opt_in_tracking")().asInstanceOf[Unit]
  inline def optInTracking(options: PartialInTrackingOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("opt_in_tracking")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def optOutTracking(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("opt_out_tracking")().asInstanceOf[Unit]
  inline def optOutTracking(options: PartialOutTrackingOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("opt_out_tracking")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("mixpanel-browser", "people")
  @js.native
  val people: People_ = js.native
  
  inline def push(item: PushItem): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def register(props: Dict): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def register(props: Dict, days: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(props.asInstanceOf[js.Any], days.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerOnce(props: Dict): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register_once")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def registerOnce(props: Dict, default_value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register_once")(props.asInstanceOf[js.Any], default_value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerOnce(props: Dict, default_value: js.Any, days: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register_once")(props.asInstanceOf[js.Any], default_value.asInstanceOf[js.Any], days.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerOnce(props: Dict, default_value: Unit, days: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register_once")(props.asInstanceOf[js.Any], default_value.asInstanceOf[js.Any], days.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeGroup(group_key: String, group_ids: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove_group")(group_key.asInstanceOf[js.Any], group_ids.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeGroup(group_key: String, group_ids: String, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove_group")(group_key.asInstanceOf[js.Any], group_ids.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeGroup(group_key: String, group_ids: js.Array[Double | String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove_group")(group_key.asInstanceOf[js.Any], group_ids.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeGroup(group_key: String, group_ids: js.Array[Double | String], callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove_group")(group_key.asInstanceOf[js.Any], group_ids.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeGroup(group_key: String, group_ids: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove_group")(group_key.asInstanceOf[js.Any], group_ids.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeGroup(group_key: String, group_ids: Double, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove_group")(group_key.asInstanceOf[js.Any], group_ids.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  inline def setConfig(config: PartialConfigApihost): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set_config")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setGroup(group_key: String, group_ids: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set_group")(group_key.asInstanceOf[js.Any], group_ids.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setGroup(group_key: String, group_ids: String, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set_group")(group_key.asInstanceOf[js.Any], group_ids.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setGroup(group_key: String, group_ids: js.Array[Double | String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set_group")(group_key.asInstanceOf[js.Any], group_ids.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setGroup(group_key: String, group_ids: js.Array[Double | String], callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set_group")(group_key.asInstanceOf[js.Any], group_ids.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setGroup(group_key: String, group_ids: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set_group")(group_key.asInstanceOf[js.Any], group_ids.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setGroup(group_key: String, group_ids: Double, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set_group")(group_key.asInstanceOf[js.Any], group_ids.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def timeEvent(event_name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("time_event")(event_name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def track(event_name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("track")(event_name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def track(event_name: String, properties: Unit, optionsOrCallback: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(event_name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def track(event_name: String, properties: Unit, optionsOrCallback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(event_name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def track(event_name: String, properties: Unit, optionsOrCallback: Callback, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(event_name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def track(event_name: String, properties: Unit, optionsOrCallback: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(event_name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def track(event_name: String, properties: Unit, optionsOrCallback: RequestOptions, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(event_name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def track(event_name: String, properties: Dict): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(event_name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def track(event_name: String, properties: Dict, optionsOrCallback: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(event_name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def track(event_name: String, properties: Dict, optionsOrCallback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(event_name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def track(event_name: String, properties: Dict, optionsOrCallback: Callback, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(event_name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def track(event_name: String, properties: Dict, optionsOrCallback: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(event_name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def track(event_name: String, properties: Dict, optionsOrCallback: RequestOptions, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(event_name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def trackForms(query: Query, event_name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track_forms")(query.asInstanceOf[js.Any], event_name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackForms(query: Query, event_name: String, properties: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track_forms")(query.asInstanceOf[js.Any], event_name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackForms(query: Query, event_name: String, properties: Dict): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track_forms")(query.asInstanceOf[js.Any], event_name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def trackLinks(query: Query, event_name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track_links")(query.asInstanceOf[js.Any], event_name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackLinks(query: Query, event_name: String, properties: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track_links")(query.asInstanceOf[js.Any], event_name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackLinks(query: Query, event_name: String, properties: Dict): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track_links")(query.asInstanceOf[js.Any], event_name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def trackWithGroups(event_name: String, properties: Dict, groups: Dict): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track_with_groups")(event_name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackWithGroups(event_name: String, properties: Dict, groups: Dict, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track_with_groups")(event_name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], groups.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unregister(property: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(property.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type Callback = js.Function1[/* response */ Response, Unit]
  
  trait ClearOptOutInOutOptions
    extends StObject
       with HasOptedInOutOptions {
    
    var cookie_expiration: Double
    
    var cross_subdomain_cookie: Boolean
    
    var secure_cookie: Boolean
  }
  object ClearOptOutInOutOptions {
    
    inline def apply(
      cookie_expiration: Double,
      cookie_prefix: String,
      cross_subdomain_cookie: Boolean,
      persistence_type: Persistence,
      secure_cookie: Boolean
    ): ClearOptOutInOutOptions = {
      val __obj = js.Dynamic.literal(cookie_expiration = cookie_expiration.asInstanceOf[js.Any], cookie_prefix = cookie_prefix.asInstanceOf[js.Any], cross_subdomain_cookie = cross_subdomain_cookie.asInstanceOf[js.Any], persistence_type = persistence_type.asInstanceOf[js.Any], secure_cookie = secure_cookie.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClearOptOutInOutOptions]
    }
    
    extension [Self <: ClearOptOutInOutOptions](x: Self) {
      
      inline def setCookie_expiration(value: Double): Self = StObject.set(x, "cookie_expiration", value.asInstanceOf[js.Any])
      
      inline def setCross_subdomain_cookie(value: Boolean): Self = StObject.set(x, "cross_subdomain_cookie", value.asInstanceOf[js.Any])
      
      inline def setSecure_cookie(value: Boolean): Self = StObject.set(x, "secure_cookie", value.asInstanceOf[js.Any])
    }
  }
  
  trait Config extends StObject {
    
    var api_host: String
    
    var api_method: String
    
    var api_transport: String
    
    var app_host: String
    
    var autotrack: Boolean
    
    var batch_flush_interval_ms: Double
    
    var batch_request_timeout_ms: Double
    
    var batch_requests: Boolean
    
    var batch_size: Double
    
    var cdn: String
    
    var cookie_domain: String
    
    var cookie_expiration: Double
    
    var cookie_name: String
    
    var cross_site_cookie: Boolean
    
    var cross_subdomain_cookie: Boolean
    
    var debug: Boolean
    
    var disable_cookie: Boolean
    
    var disable_notifications: Boolean
    
    var disable_persistence: Boolean
    
    var ignore_dnt: Boolean
    
    var img: Boolean
    
    var inapp_link_new_window: Boolean
    
    var inapp_protocol: String
    
    var ip: Boolean
    
    def loaded(mixpanel: Mixpanel): Unit
    
    var opt_out_persistence_by_default: Boolean
    
    var opt_out_tracking_by_default: Boolean
    
    var opt_out_tracking_cookie_prefix: String
    
    var opt_out_tracking_persistence_type: Persistence
    
    var persistence: Persistence
    
    var persistence_name: String
    
    var property_blacklist: js.Array[String]
    
    var save_referrer: Boolean
    
    var secure_cookie: Boolean
    
    var store_google: Boolean
    
    var test: Boolean
    
    var track_links_timeout: Double
    
    var track_pageview: Boolean
    
    var upgrade: Boolean
    
    var verbose: Boolean
    
    var xhr_headers: XhrHeadersDef
  }
  object Config {
    
    inline def apply(
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
    
    extension [Self <: Config](x: Self) {
      
      inline def setApi_host(value: String): Self = StObject.set(x, "api_host", value.asInstanceOf[js.Any])
      
      inline def setApi_method(value: String): Self = StObject.set(x, "api_method", value.asInstanceOf[js.Any])
      
      inline def setApi_transport(value: String): Self = StObject.set(x, "api_transport", value.asInstanceOf[js.Any])
      
      inline def setApp_host(value: String): Self = StObject.set(x, "app_host", value.asInstanceOf[js.Any])
      
      inline def setAutotrack(value: Boolean): Self = StObject.set(x, "autotrack", value.asInstanceOf[js.Any])
      
      inline def setBatch_flush_interval_ms(value: Double): Self = StObject.set(x, "batch_flush_interval_ms", value.asInstanceOf[js.Any])
      
      inline def setBatch_request_timeout_ms(value: Double): Self = StObject.set(x, "batch_request_timeout_ms", value.asInstanceOf[js.Any])
      
      inline def setBatch_requests(value: Boolean): Self = StObject.set(x, "batch_requests", value.asInstanceOf[js.Any])
      
      inline def setBatch_size(value: Double): Self = StObject.set(x, "batch_size", value.asInstanceOf[js.Any])
      
      inline def setCdn(value: String): Self = StObject.set(x, "cdn", value.asInstanceOf[js.Any])
      
      inline def setCookie_domain(value: String): Self = StObject.set(x, "cookie_domain", value.asInstanceOf[js.Any])
      
      inline def setCookie_expiration(value: Double): Self = StObject.set(x, "cookie_expiration", value.asInstanceOf[js.Any])
      
      inline def setCookie_name(value: String): Self = StObject.set(x, "cookie_name", value.asInstanceOf[js.Any])
      
      inline def setCross_site_cookie(value: Boolean): Self = StObject.set(x, "cross_site_cookie", value.asInstanceOf[js.Any])
      
      inline def setCross_subdomain_cookie(value: Boolean): Self = StObject.set(x, "cross_subdomain_cookie", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDisable_cookie(value: Boolean): Self = StObject.set(x, "disable_cookie", value.asInstanceOf[js.Any])
      
      inline def setDisable_notifications(value: Boolean): Self = StObject.set(x, "disable_notifications", value.asInstanceOf[js.Any])
      
      inline def setDisable_persistence(value: Boolean): Self = StObject.set(x, "disable_persistence", value.asInstanceOf[js.Any])
      
      inline def setIgnore_dnt(value: Boolean): Self = StObject.set(x, "ignore_dnt", value.asInstanceOf[js.Any])
      
      inline def setImg(value: Boolean): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setInapp_link_new_window(value: Boolean): Self = StObject.set(x, "inapp_link_new_window", value.asInstanceOf[js.Any])
      
      inline def setInapp_protocol(value: String): Self = StObject.set(x, "inapp_protocol", value.asInstanceOf[js.Any])
      
      inline def setIp(value: Boolean): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setLoaded(value: Mixpanel => Unit): Self = StObject.set(x, "loaded", js.Any.fromFunction1(value))
      
      inline def setOpt_out_persistence_by_default(value: Boolean): Self = StObject.set(x, "opt_out_persistence_by_default", value.asInstanceOf[js.Any])
      
      inline def setOpt_out_tracking_by_default(value: Boolean): Self = StObject.set(x, "opt_out_tracking_by_default", value.asInstanceOf[js.Any])
      
      inline def setOpt_out_tracking_cookie_prefix(value: String): Self = StObject.set(x, "opt_out_tracking_cookie_prefix", value.asInstanceOf[js.Any])
      
      inline def setOpt_out_tracking_persistence_type(value: Persistence): Self = StObject.set(x, "opt_out_tracking_persistence_type", value.asInstanceOf[js.Any])
      
      inline def setPersistence(value: Persistence): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
      
      inline def setPersistence_name(value: String): Self = StObject.set(x, "persistence_name", value.asInstanceOf[js.Any])
      
      inline def setProperty_blacklist(value: js.Array[String]): Self = StObject.set(x, "property_blacklist", value.asInstanceOf[js.Any])
      
      inline def setProperty_blacklistVarargs(value: String*): Self = StObject.set(x, "property_blacklist", js.Array(value :_*))
      
      inline def setSave_referrer(value: Boolean): Self = StObject.set(x, "save_referrer", value.asInstanceOf[js.Any])
      
      inline def setSecure_cookie(value: Boolean): Self = StObject.set(x, "secure_cookie", value.asInstanceOf[js.Any])
      
      inline def setStore_google(value: Boolean): Self = StObject.set(x, "store_google", value.asInstanceOf[js.Any])
      
      inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTrack_links_timeout(value: Double): Self = StObject.set(x, "track_links_timeout", value.asInstanceOf[js.Any])
      
      inline def setTrack_pageview(value: Boolean): Self = StObject.set(x, "track_pageview", value.asInstanceOf[js.Any])
      
      inline def setUpgrade(value: Boolean): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setXhr_headers(value: XhrHeadersDef): Self = StObject.set(x, "xhr_headers", value.asInstanceOf[js.Any])
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
    def set(prop: String, to: Unit, callback: Callback): Group = js.native
    def set(prop: Dict): Group = js.native
    def set(prop: Dict, to: js.UndefOr[String]): Group = js.native
    def set(prop: Dict, to: js.UndefOr[String], callback: Callback): Group = js.native
    def set(prop: Dict, to: Unit, callback: Callback): Group = js.native
    
    def setOnce(prop: String): Group = js.native
    def setOnce(prop: String, to: js.UndefOr[String]): Group = js.native
    def setOnce(prop: String, to: js.UndefOr[String], callback: Callback): Group = js.native
    def setOnce(prop: String, to: Unit, callback: Callback): Group = js.native
    def setOnce(prop: Dict): Group = js.native
    def setOnce(prop: Dict, to: js.UndefOr[String]): Group = js.native
    def setOnce(prop: Dict, to: js.UndefOr[String], callback: Callback): Group = js.native
    def setOnce(prop: Dict, to: Unit, callback: Callback): Group = js.native
    
    def union(list_name: String, values: js.Array[String | Double]): Group = js.native
    def union(list_name: String, values: js.Array[String | Double], callback: Callback): Group = js.native
    
    def unset(prop: String): Unit = js.native
    def unset(prop: String, callback: Callback): Unit = js.native
  }
  
  trait HasOptedInOutOptions extends StObject {
    
    var cookie_prefix: String
    
    var persistence_type: Persistence
  }
  object HasOptedInOutOptions {
    
    inline def apply(cookie_prefix: String, persistence_type: Persistence): HasOptedInOutOptions = {
      val __obj = js.Dynamic.literal(cookie_prefix = cookie_prefix.asInstanceOf[js.Any], persistence_type = persistence_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasOptedInOutOptions]
    }
    
    extension [Self <: HasOptedInOutOptions](x: Self) {
      
      inline def setCookie_prefix(value: String): Self = StObject.set(x, "cookie_prefix", value.asInstanceOf[js.Any])
      
      inline def setPersistence_type(value: Persistence): Self = StObject.set(x, "persistence_type", value.asInstanceOf[js.Any])
    }
  }
  
  trait InTrackingOptions
    extends StObject
       with ClearOptOutInOutOptions {
    
    def track(): Unit
    
    var track_event_name: String
    
    var track_event_properties: Dict
  }
  object InTrackingOptions {
    
    inline def apply(
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
    
    extension [Self <: InTrackingOptions](x: Self) {
      
      inline def setTrack(value: () => Unit): Self = StObject.set(x, "track", js.Any.fromFunction0(value))
      
      inline def setTrack_event_name(value: String): Self = StObject.set(x, "track_event_name", value.asInstanceOf[js.Any])
      
      inline def setTrack_event_properties(value: Dict): Self = StObject.set(x, "track_event_properties", value.asInstanceOf[js.Any])
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
    def init(token: String, config: Unit, name: String): Mixpanel = js.native
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
    def register_once(props: Dict, default_value: js.Any): Unit = js.native
    def register_once(props: Dict, default_value: js.Any, days: Double): Unit = js.native
    def register_once(props: Dict, default_value: Unit, days: Double): Unit = js.native
    
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
    def track(event_name: String, properties: Unit, optionsOrCallback: Unit, callback: Callback): Unit = js.native
    def track(event_name: String, properties: Unit, optionsOrCallback: Callback): Unit = js.native
    def track(event_name: String, properties: Unit, optionsOrCallback: Callback, callback: Callback): Unit = js.native
    def track(event_name: String, properties: Unit, optionsOrCallback: RequestOptions): Unit = js.native
    def track(event_name: String, properties: Unit, optionsOrCallback: RequestOptions, callback: Callback): Unit = js.native
    def track(event_name: String, properties: Dict): Unit = js.native
    def track(event_name: String, properties: Dict, optionsOrCallback: Unit, callback: Callback): Unit = js.native
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
  trait NormalResponse
    extends StObject
       with Response
  object NormalResponse {
    
    inline def `0`: typings.mixpanelBrowser.mixpanelBrowserNumbers.`0` = 0.asInstanceOf[typings.mixpanelBrowser.mixpanelBrowserNumbers.`0`]
    
    inline def `1`: typings.mixpanelBrowser.mixpanelBrowserNumbers.`1` = 1.asInstanceOf[typings.mixpanelBrowser.mixpanelBrowserNumbers.`1`]
  }
  
  trait OutTrackingOptions
    extends StObject
       with ClearOptOutInOutOptions {
    
    var delete_user: Boolean
  }
  object OutTrackingOptions {
    
    inline def apply(
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
    
    extension [Self <: OutTrackingOptions](x: Self) {
      
      inline def setDelete_user(value: Boolean): Self = StObject.set(x, "delete_user", value.asInstanceOf[js.Any])
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
    def track_charge(amount: Double, propertiesOrCallback: Unit, callback: Callback): Unit = js.native
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
    
    inline def cookie: typings.mixpanelBrowser.mixpanelBrowserStrings.cookie = "cookie".asInstanceOf[typings.mixpanelBrowser.mixpanelBrowserStrings.cookie]
    
    inline def localStorage: typings.mixpanelBrowser.mixpanelBrowserStrings.localStorage = "localStorage".asInstanceOf[typings.mixpanelBrowser.mixpanelBrowserStrings.localStorage]
  }
  
  type PushItem = js.Array[String | Dict]
  
  type Query = String | Element | js.Array[Element]
  
  trait RequestOptions extends StObject {
    
    var transport: js.UndefOr[xhr | sendBeacon] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    extension [Self <: RequestOptions](x: Self) {
      
      inline def setTransport(value: xhr | sendBeacon): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
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
  trait VerboseResponse
    extends StObject
       with Response
  object VerboseResponse {
    
    inline def Error(error: Null): typings.mixpanelBrowser.anon.Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = 1)
      __obj.asInstanceOf[typings.mixpanelBrowser.anon.Error]
    }
    
    inline def Status(error: String): typings.mixpanelBrowser.anon.Status = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = 0)
      __obj.asInstanceOf[typings.mixpanelBrowser.anon.Status]
    }
  }
  
  type XhrHeadersDef = StringDictionary[js.Any]
}
