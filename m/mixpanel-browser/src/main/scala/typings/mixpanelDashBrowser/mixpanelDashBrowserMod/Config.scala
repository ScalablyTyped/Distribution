package typings.mixpanelDashBrowser.mixpanelDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var api_host: String
  var app_host: String
  var autrotrack: Boolean
  var cdn: String
  var cookie_expiration: Double
  var cookie_name: String
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
    autrotrack: Boolean,
    cdn: String,
    cookie_expiration: Double,
    cookie_name: String,
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
    val __obj = js.Dynamic.literal(api_host = api_host, app_host = app_host, autrotrack = autrotrack, cdn = cdn, cookie_expiration = cookie_expiration, cookie_name = cookie_name, cross_subdomain_cookie = cross_subdomain_cookie, debug = debug, disable_cookie = disable_cookie, disable_notifications = disable_notifications, disable_persistence = disable_persistence, img = img, ip = ip, loaded = js.Any.fromFunction1(loaded), opt_out_tracking_by_default = opt_out_tracking_by_default, opt_out_tracking_cookie_prefix = opt_out_tracking_cookie_prefix, opt_out_tracking_persistence_type = opt_out_tracking_persistence_type, persistence = persistence, persistence_name = persistence_name, property_blacklist = property_blacklist, save_referrer = save_referrer, secure_cookie = secure_cookie, store_google = store_google, test = test, track_links_timeout = track_links_timeout, track_pageview = track_pageview, upgrade = upgrade, verbose = verbose, xhr_headers = xhr_headers)
  
    __obj.asInstanceOf[Config]
  }
}

