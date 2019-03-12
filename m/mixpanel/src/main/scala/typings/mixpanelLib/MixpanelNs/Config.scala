package typings
package mixpanelLib.MixpanelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * @default HTTP_PROTOCOL + 'api.mixpanel.com'
    */
  var api_host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default HTTP_PROTOCOL + 'mixpanel.com'
    */
  var app_host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default true
    */
  var autotrack: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default HTTP_PROTOCOL + 'cdn.mxpnl.com'
    */
  var cdn: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Super properties cookie expiration (in days)
    *
    * @default 365
    */
  var cookie_expiration: js.UndefOr[scala.Double] = js.undefined
  /**
    * @deprecated Use `persistence_name` instead
    * @default ''
    */
  var cookie_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Super properties span subdomains
    *
    * @default true
    */
  var cross_subdomain_cookie: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Debug mode
    *
    * @default false
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated Use `disable_persistence` instead
    * @default false
    */
  var disable_cookie: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If this is true, the mixpanel cookie or localStorage entry
    * will be deleted, and no user persistence will take place
    *
    * @default false
    */
  var disable_persistence: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default false
    */
  var img: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If this is true, Mixpanel will automatically determine City,
    * Region and Country data using the IP address of the client
    *
    * @default true
    */
  var ip: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default function() {}
    */
  var loaded: js.UndefOr[js.Function1[/* lib */ mixpanelLib.Mixpanel, scala.Unit]] = js.undefined
  /**
    * Type of persistent store for super properties
    *
    * If set to 'localStorage', any existing mixpanel cookie
    * value with the same `persistence_name` will be transferred
    * to localStorage and deleted.
    *
    * @default 'cookie'
    */
  var persistence: js.UndefOr[
    mixpanelLib.mixpanelLibStrings.localStorage | mixpanelLib.mixpanelLibStrings.cookie
  ] = js.undefined
  /**
    * Name for super properties persistent store
    *
    * @default ''
    */
  var persistence_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Names of (super) properties which should never be sent
    * with track() calls
    *
    * @default []
    */
  var property_blacklist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * @default true
    */
  var save_referrer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If this is true, mixpanel cookies will be marked as secure,
    * meaning they will only be transmitted over https
    *
    * @default false
    */
  var secure_cookie: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default true
    */
  var store_google: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default false
    */
  var test: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The amount of time track_links will wait for Mixpanel's
    * servers to respond
    *
    * @default 300
    */
  var track_links_timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Should we track a page view on page load
    *
    * @default true
    */
  var track_pageview: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If you set upgrade to be true, the library will check for
    * a cookie from our old js library and import super
    * properties from it, then the old cookie is deleted
    * The upgrade config option only works in the initialization,
    * so make sure you set it when you create the library.
    *
    * @default false
    */
  var upgrade: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default false
    */
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    api_host: java.lang.String = null,
    app_host: java.lang.String = null,
    autotrack: js.UndefOr[scala.Boolean] = js.undefined,
    cdn: java.lang.String = null,
    cookie_expiration: scala.Int | scala.Double = null,
    cookie_name: java.lang.String = null,
    cross_subdomain_cookie: js.UndefOr[scala.Boolean] = js.undefined,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    disable_cookie: js.UndefOr[scala.Boolean] = js.undefined,
    disable_persistence: js.UndefOr[scala.Boolean] = js.undefined,
    img: js.UndefOr[scala.Boolean] = js.undefined,
    ip: js.UndefOr[scala.Boolean] = js.undefined,
    loaded: /* lib */ mixpanelLib.Mixpanel => scala.Unit = null,
    persistence: mixpanelLib.mixpanelLibStrings.localStorage | mixpanelLib.mixpanelLibStrings.cookie = null,
    persistence_name: java.lang.String = null,
    property_blacklist: js.Array[java.lang.String] = null,
    save_referrer: js.UndefOr[scala.Boolean] = js.undefined,
    secure_cookie: js.UndefOr[scala.Boolean] = js.undefined,
    store_google: js.UndefOr[scala.Boolean] = js.undefined,
    test: js.UndefOr[scala.Boolean] = js.undefined,
    track_links_timeout: scala.Int | scala.Double = null,
    track_pageview: js.UndefOr[scala.Boolean] = js.undefined,
    upgrade: js.UndefOr[scala.Boolean] = js.undefined,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (api_host != null) __obj.updateDynamic("api_host")(api_host)
    if (app_host != null) __obj.updateDynamic("app_host")(app_host)
    if (!js.isUndefined(autotrack)) __obj.updateDynamic("autotrack")(autotrack)
    if (cdn != null) __obj.updateDynamic("cdn")(cdn)
    if (cookie_expiration != null) __obj.updateDynamic("cookie_expiration")(cookie_expiration.asInstanceOf[js.Any])
    if (cookie_name != null) __obj.updateDynamic("cookie_name")(cookie_name)
    if (!js.isUndefined(cross_subdomain_cookie)) __obj.updateDynamic("cross_subdomain_cookie")(cross_subdomain_cookie)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(disable_cookie)) __obj.updateDynamic("disable_cookie")(disable_cookie)
    if (!js.isUndefined(disable_persistence)) __obj.updateDynamic("disable_persistence")(disable_persistence)
    if (!js.isUndefined(img)) __obj.updateDynamic("img")(img)
    if (!js.isUndefined(ip)) __obj.updateDynamic("ip")(ip)
    if (loaded != null) __obj.updateDynamic("loaded")(js.Any.fromFunction1(loaded))
    if (persistence != null) __obj.updateDynamic("persistence")(persistence.asInstanceOf[js.Any])
    if (persistence_name != null) __obj.updateDynamic("persistence_name")(persistence_name)
    if (property_blacklist != null) __obj.updateDynamic("property_blacklist")(property_blacklist)
    if (!js.isUndefined(save_referrer)) __obj.updateDynamic("save_referrer")(save_referrer)
    if (!js.isUndefined(secure_cookie)) __obj.updateDynamic("secure_cookie")(secure_cookie)
    if (!js.isUndefined(store_google)) __obj.updateDynamic("store_google")(store_google)
    if (!js.isUndefined(test)) __obj.updateDynamic("test")(test)
    if (track_links_timeout != null) __obj.updateDynamic("track_links_timeout")(track_links_timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(track_pageview)) __obj.updateDynamic("track_pageview")(track_pageview)
    if (!js.isUndefined(upgrade)) __obj.updateDynamic("upgrade")(upgrade)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Config]
  }
}

