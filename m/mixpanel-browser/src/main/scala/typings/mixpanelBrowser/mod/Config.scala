package typings.mixpanelBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
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
  def loaded(mixpanel: Mixpanel): Unit = js.native
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
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setApi_host(value: String): Self = this.set("api_host", value.asInstanceOf[js.Any])
    @scala.inline
    def setApi_method(value: String): Self = this.set("api_method", value.asInstanceOf[js.Any])
    @scala.inline
    def setApi_transport(value: String): Self = this.set("api_transport", value.asInstanceOf[js.Any])
    @scala.inline
    def setApp_host(value: String): Self = this.set("app_host", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutotrack(value: Boolean): Self = this.set("autotrack", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatch_flush_interval_ms(value: Double): Self = this.set("batch_flush_interval_ms", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatch_request_timeout_ms(value: Double): Self = this.set("batch_request_timeout_ms", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatch_requests(value: Boolean): Self = this.set("batch_requests", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatch_size(value: Double): Self = this.set("batch_size", value.asInstanceOf[js.Any])
    @scala.inline
    def setCdn(value: String): Self = this.set("cdn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCookie_domain(value: String): Self = this.set("cookie_domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setCookie_expiration(value: Double): Self = this.set("cookie_expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def setCookie_name(value: String): Self = this.set("cookie_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCross_site_cookie(value: Boolean): Self = this.set("cross_site_cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def setCross_subdomain_cookie(value: Boolean): Self = this.set("cross_subdomain_cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisable_cookie(value: Boolean): Self = this.set("disable_cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisable_notifications(value: Boolean): Self = this.set("disable_notifications", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisable_persistence(value: Boolean): Self = this.set("disable_persistence", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnore_dnt(value: Boolean): Self = this.set("ignore_dnt", value.asInstanceOf[js.Any])
    @scala.inline
    def setImg(value: Boolean): Self = this.set("img", value.asInstanceOf[js.Any])
    @scala.inline
    def setInapp_link_new_window(value: Boolean): Self = this.set("inapp_link_new_window", value.asInstanceOf[js.Any])
    @scala.inline
    def setInapp_protocol(value: String): Self = this.set("inapp_protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setIp(value: Boolean): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaded(value: Mixpanel => Unit): Self = this.set("loaded", js.Any.fromFunction1(value))
    @scala.inline
    def setOpt_out_persistence_by_default(value: Boolean): Self = this.set("opt_out_persistence_by_default", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpt_out_tracking_by_default(value: Boolean): Self = this.set("opt_out_tracking_by_default", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpt_out_tracking_cookie_prefix(value: String): Self = this.set("opt_out_tracking_cookie_prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpt_out_tracking_persistence_type(value: Persistence): Self = this.set("opt_out_tracking_persistence_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersistence(value: Persistence): Self = this.set("persistence", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersistence_name(value: String): Self = this.set("persistence_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperty_blacklistVarargs(value: String*): Self = this.set("property_blacklist", js.Array(value :_*))
    @scala.inline
    def setProperty_blacklist(value: js.Array[String]): Self = this.set("property_blacklist", value.asInstanceOf[js.Any])
    @scala.inline
    def setSave_referrer(value: Boolean): Self = this.set("save_referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecure_cookie(value: Boolean): Self = this.set("secure_cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def setStore_google(value: Boolean): Self = this.set("store_google", value.asInstanceOf[js.Any])
    @scala.inline
    def setTest(value: Boolean): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrack_links_timeout(value: Double): Self = this.set("track_links_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrack_pageview(value: Boolean): Self = this.set("track_pageview", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpgrade(value: Boolean): Self = this.set("upgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def setXhr_headers(value: XhrHeadersDef): Self = this.set("xhr_headers", value.asInstanceOf[js.Any])
  }
  
}

