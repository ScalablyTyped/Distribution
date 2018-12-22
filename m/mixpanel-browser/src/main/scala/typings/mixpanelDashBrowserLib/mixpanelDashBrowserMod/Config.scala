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

