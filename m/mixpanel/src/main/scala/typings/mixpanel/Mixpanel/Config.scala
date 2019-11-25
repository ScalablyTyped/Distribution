package typings.mixpanel.Mixpanel

import typings.mixpanel.mixpanelStrings.cookie
import typings.mixpanel.mixpanelStrings.localStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * @default HTTP_PROTOCOL + 'api.mixpanel.com'
    */
  var api_host: js.UndefOr[String] = js.undefined
  /**
    * @default HTTP_PROTOCOL + 'mixpanel.com'
    */
  var app_host: js.UndefOr[String] = js.undefined
  /**
    * @default true
    */
  var autotrack: js.UndefOr[Boolean] = js.undefined
  /**
    * @default HTTP_PROTOCOL + 'cdn.mxpnl.com'
    */
  var cdn: js.UndefOr[String] = js.undefined
  /**
    * Super properties cookie expiration (in days)
    *
    * @default 365
    */
  var cookie_expiration: js.UndefOr[Double] = js.undefined
  /**
    * @deprecated Use `persistence_name` instead
    * @default ''
    */
  var cookie_name: js.UndefOr[String] = js.undefined
  /**
    * Super properties span subdomains
    *
    * @default true
    */
  var cross_subdomain_cookie: js.UndefOr[Boolean] = js.undefined
  /**
    * Debug mode
    *
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated Use `disable_persistence` instead
    * @default false
    */
  var disable_cookie: js.UndefOr[Boolean] = js.undefined
  /**
    * If this is true, the mixpanel cookie or localStorage entry
    * will be deleted, and no user persistence will take place
    *
    * @default false
    */
  var disable_persistence: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var img: js.UndefOr[Boolean] = js.undefined
  /**
    * If this is true, Mixpanel will automatically determine City,
    * Region and Country data using the IP address of the client
    *
    * @default true
    */
  var ip: js.UndefOr[Boolean] = js.undefined
  /**
    * @default function() {}
    */
  var loaded: js.UndefOr[js.Function1[/* lib */ typings.mixpanel.Mixpanel, Unit]] = js.undefined
  /**
    * Type of persistent store for super properties
    *
    * If set to 'localStorage', any existing mixpanel cookie
    * value with the same `persistence_name` will be transferred
    * to localStorage and deleted.
    *
    * @default 'cookie'
    */
  var persistence: js.UndefOr[localStorage | cookie] = js.undefined
  /**
    * Name for super properties persistent store
    *
    * @default ''
    */
  var persistence_name: js.UndefOr[String] = js.undefined
  /**
    * Names of (super) properties which should never be sent
    * with track() calls
    *
    * @default []
    */
  var property_blacklist: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * @default true
    */
  var save_referrer: js.UndefOr[Boolean] = js.undefined
  /**
    * If this is true, mixpanel cookies will be marked as secure,
    * meaning they will only be transmitted over https
    *
    * @default false
    */
  var secure_cookie: js.UndefOr[Boolean] = js.undefined
  /**
    * @default true
    */
  var store_google: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var test: js.UndefOr[Boolean] = js.undefined
  /**
    * The amount of time track_links will wait for Mixpanel's
    * servers to respond
    *
    * @default 300
    */
  var track_links_timeout: js.UndefOr[Double] = js.undefined
  /**
    * Should we track a page view on page load
    *
    * @default true
    */
  var track_pageview: js.UndefOr[Boolean] = js.undefined
  /**
    * If you set upgrade to be true, the library will check for
    * a cookie from our old js library and import super
    * properties from it, then the old cookie is deleted
    * The upgrade config option only works in the initialization,
    * so make sure you set it when you create the library.
    *
    * @default false
    */
  var upgrade: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    api_host: String = null,
    app_host: String = null,
    autotrack: js.UndefOr[Boolean] = js.undefined,
    cdn: String = null,
    cookie_expiration: Int | Double = null,
    cookie_name: String = null,
    cross_subdomain_cookie: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    disable_cookie: js.UndefOr[Boolean] = js.undefined,
    disable_persistence: js.UndefOr[Boolean] = js.undefined,
    img: js.UndefOr[Boolean] = js.undefined,
    ip: js.UndefOr[Boolean] = js.undefined,
    loaded: /* lib */ typings.mixpanel.Mixpanel => Unit = null,
    persistence: localStorage | cookie = null,
    persistence_name: String = null,
    property_blacklist: js.Array[String] = null,
    save_referrer: js.UndefOr[Boolean] = js.undefined,
    secure_cookie: js.UndefOr[Boolean] = js.undefined,
    store_google: js.UndefOr[Boolean] = js.undefined,
    test: js.UndefOr[Boolean] = js.undefined,
    track_links_timeout: Int | Double = null,
    track_pageview: js.UndefOr[Boolean] = js.undefined,
    upgrade: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (api_host != null) __obj.updateDynamic("api_host")(api_host.asInstanceOf[js.Any])
    if (app_host != null) __obj.updateDynamic("app_host")(app_host.asInstanceOf[js.Any])
    if (!js.isUndefined(autotrack)) __obj.updateDynamic("autotrack")(autotrack.asInstanceOf[js.Any])
    if (cdn != null) __obj.updateDynamic("cdn")(cdn.asInstanceOf[js.Any])
    if (cookie_expiration != null) __obj.updateDynamic("cookie_expiration")(cookie_expiration.asInstanceOf[js.Any])
    if (cookie_name != null) __obj.updateDynamic("cookie_name")(cookie_name.asInstanceOf[js.Any])
    if (!js.isUndefined(cross_subdomain_cookie)) __obj.updateDynamic("cross_subdomain_cookie")(cross_subdomain_cookie.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_cookie)) __obj.updateDynamic("disable_cookie")(disable_cookie.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_persistence)) __obj.updateDynamic("disable_persistence")(disable_persistence.asInstanceOf[js.Any])
    if (!js.isUndefined(img)) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (!js.isUndefined(ip)) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (loaded != null) __obj.updateDynamic("loaded")(js.Any.fromFunction1(loaded))
    if (persistence != null) __obj.updateDynamic("persistence")(persistence.asInstanceOf[js.Any])
    if (persistence_name != null) __obj.updateDynamic("persistence_name")(persistence_name.asInstanceOf[js.Any])
    if (property_blacklist != null) __obj.updateDynamic("property_blacklist")(property_blacklist.asInstanceOf[js.Any])
    if (!js.isUndefined(save_referrer)) __obj.updateDynamic("save_referrer")(save_referrer.asInstanceOf[js.Any])
    if (!js.isUndefined(secure_cookie)) __obj.updateDynamic("secure_cookie")(secure_cookie.asInstanceOf[js.Any])
    if (!js.isUndefined(store_google)) __obj.updateDynamic("store_google")(store_google.asInstanceOf[js.Any])
    if (!js.isUndefined(test)) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (track_links_timeout != null) __obj.updateDynamic("track_links_timeout")(track_links_timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(track_pageview)) __obj.updateDynamic("track_pageview")(track_pageview.asInstanceOf[js.Any])
    if (!js.isUndefined(upgrade)) __obj.updateDynamic("upgrade")(upgrade.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

