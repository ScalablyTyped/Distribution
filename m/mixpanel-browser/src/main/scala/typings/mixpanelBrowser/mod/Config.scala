package typings.mixpanelBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var api_host: String
  var app_host: String
  var autotrack: Boolean
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
  var img: Boolean
  var ip: Boolean
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
  def loaded(mixpanel: Mixpanel): Unit
}

object Config {
  @scala.inline
  def apply(
    api_host: String,
    app_host: String,
    autotrack: Boolean,
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
    img: Boolean,
    ip: Boolean,
    loaded: Mixpanel => Unit,
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
    val __obj = js.Dynamic.literal(api_host = api_host.asInstanceOf[js.Any], app_host = app_host.asInstanceOf[js.Any], autotrack = autotrack.asInstanceOf[js.Any], cdn = cdn.asInstanceOf[js.Any], cookie_domain = cookie_domain.asInstanceOf[js.Any], cookie_expiration = cookie_expiration.asInstanceOf[js.Any], cookie_name = cookie_name.asInstanceOf[js.Any], cross_site_cookie = cross_site_cookie.asInstanceOf[js.Any], cross_subdomain_cookie = cross_subdomain_cookie.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], disable_cookie = disable_cookie.asInstanceOf[js.Any], disable_notifications = disable_notifications.asInstanceOf[js.Any], disable_persistence = disable_persistence.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], loaded = js.Any.fromFunction1(loaded), opt_out_tracking_by_default = opt_out_tracking_by_default.asInstanceOf[js.Any], opt_out_tracking_cookie_prefix = opt_out_tracking_cookie_prefix.asInstanceOf[js.Any], opt_out_tracking_persistence_type = opt_out_tracking_persistence_type.asInstanceOf[js.Any], persistence = persistence.asInstanceOf[js.Any], persistence_name = persistence_name.asInstanceOf[js.Any], property_blacklist = property_blacklist.asInstanceOf[js.Any], save_referrer = save_referrer.asInstanceOf[js.Any], secure_cookie = secure_cookie.asInstanceOf[js.Any], store_google = store_google.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], track_links_timeout = track_links_timeout.asInstanceOf[js.Any], track_pageview = track_pageview.asInstanceOf[js.Any], upgrade = upgrade.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], xhr_headers = xhr_headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

