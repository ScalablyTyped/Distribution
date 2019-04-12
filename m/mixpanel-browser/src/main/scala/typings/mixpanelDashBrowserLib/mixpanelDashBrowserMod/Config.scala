package typings
package mixpanelDashBrowserLib.mixpanelDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var api_host: java.lang.String
  var app_host: java.lang.String
  var autrotrack: scala.Boolean
  var cdn: java.lang.String
  var cookie_expiration: scala.Double
  var cookie_name: java.lang.String
  var cross_subdomain_cookie: scala.Boolean
  var debug: scala.Boolean
  var disable_cookie: scala.Boolean
  var disable_notifications: scala.Boolean
  var disable_persistence: scala.Boolean
  var img: scala.Boolean
  var ip: scala.Boolean
  var opt_out_tracking_by_default: scala.Boolean
  var opt_out_tracking_cookie_prefix: java.lang.String
  var opt_out_tracking_persistence_type: Persistence
  var persistence: Persistence
  var persistence_name: java.lang.String
  var property_blacklist: js.Array[java.lang.String]
  var save_referrer: scala.Boolean
  var secure_cookie: scala.Boolean
  var store_google: scala.Boolean
  var test: scala.Boolean
  var track_links_timeout: scala.Double
  var track_pageview: scala.Boolean
  var upgrade: scala.Boolean
  var verbose: scala.Boolean
  var xhr_headers: XhrHeadersDef
  def loaded(mixpanel: Mixpanel): scala.Unit
}

object Config {
  @scala.inline
  def apply(
    api_host: java.lang.String,
    app_host: java.lang.String,
    autrotrack: scala.Boolean,
    cdn: java.lang.String,
    cookie_expiration: scala.Double,
    cookie_name: java.lang.String,
    cross_subdomain_cookie: scala.Boolean,
    debug: scala.Boolean,
    disable_cookie: scala.Boolean,
    disable_notifications: scala.Boolean,
    disable_persistence: scala.Boolean,
    img: scala.Boolean,
    ip: scala.Boolean,
    loaded: Mixpanel => scala.Unit,
    opt_out_tracking_by_default: scala.Boolean,
    opt_out_tracking_cookie_prefix: java.lang.String,
    opt_out_tracking_persistence_type: Persistence,
    persistence: Persistence,
    persistence_name: java.lang.String,
    property_blacklist: js.Array[java.lang.String],
    save_referrer: scala.Boolean,
    secure_cookie: scala.Boolean,
    store_google: scala.Boolean,
    test: scala.Boolean,
    track_links_timeout: scala.Double,
    track_pageview: scala.Boolean,
    upgrade: scala.Boolean,
    verbose: scala.Boolean,
    xhr_headers: XhrHeadersDef
  ): Config = {
    val __obj = js.Dynamic.literal(api_host = api_host, app_host = app_host, autrotrack = autrotrack, cdn = cdn, cookie_expiration = cookie_expiration, cookie_name = cookie_name, cross_subdomain_cookie = cross_subdomain_cookie, debug = debug, disable_cookie = disable_cookie, disable_notifications = disable_notifications, disable_persistence = disable_persistence, img = img, ip = ip, loaded = js.Any.fromFunction1(loaded), opt_out_tracking_by_default = opt_out_tracking_by_default, opt_out_tracking_cookie_prefix = opt_out_tracking_cookie_prefix, opt_out_tracking_persistence_type = opt_out_tracking_persistence_type, persistence = persistence, persistence_name = persistence_name, property_blacklist = property_blacklist, save_referrer = save_referrer, secure_cookie = secure_cookie, store_google = store_google, test = test, track_links_timeout = track_links_timeout, track_pageview = track_pageview, upgrade = upgrade, verbose = verbose, xhr_headers = xhr_headers)
  
    __obj.asInstanceOf[Config]
  }
}

