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
    disable_persistence: scala.Boolean,
    img: scala.Boolean,
    ip: scala.Boolean,
    loaded: js.Function1[Mixpanel, scala.Unit],
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("api_host")(api_host)
    __obj.updateDynamic("app_host")(app_host)
    __obj.updateDynamic("autrotrack")(autrotrack)
    __obj.updateDynamic("cdn")(cdn)
    __obj.updateDynamic("cookie_expiration")(cookie_expiration)
    __obj.updateDynamic("cookie_name")(cookie_name)
    __obj.updateDynamic("cross_subdomain_cookie")(cross_subdomain_cookie)
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("disable_cookie")(disable_cookie)
    __obj.updateDynamic("disable_persistence")(disable_persistence)
    __obj.updateDynamic("img")(img)
    __obj.updateDynamic("ip")(ip)
    __obj.updateDynamic("loaded")(loaded)
    __obj.updateDynamic("opt_out_tracking_by_default")(opt_out_tracking_by_default)
    __obj.updateDynamic("opt_out_tracking_cookie_prefix")(opt_out_tracking_cookie_prefix)
    __obj.updateDynamic("opt_out_tracking_persistence_type")(opt_out_tracking_persistence_type)
    __obj.updateDynamic("persistence")(persistence)
    __obj.updateDynamic("persistence_name")(persistence_name)
    __obj.updateDynamic("property_blacklist")(property_blacklist)
    __obj.updateDynamic("save_referrer")(save_referrer)
    __obj.updateDynamic("secure_cookie")(secure_cookie)
    __obj.updateDynamic("store_google")(store_google)
    __obj.updateDynamic("test")(test)
    __obj.updateDynamic("track_links_timeout")(track_links_timeout)
    __obj.updateDynamic("track_pageview")(track_pageview)
    __obj.updateDynamic("upgrade")(upgrade)
    __obj.updateDynamic("verbose")(verbose)
    __obj.updateDynamic("xhr_headers")(xhr_headers)
    __obj.asInstanceOf[Config]
  }
}

