package typings.mixpanelBrowser.anon

import typings.mixpanelBrowser.mod.Persistence
import typings.mixpanelBrowser.mod.XhrHeadersDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mixpanel-browser.mixpanel-browser.Config> */
trait PartialConfig extends js.Object {
  var api_host: js.UndefOr[String] = js.undefined
  var api_method: js.UndefOr[String] = js.undefined
  var api_transport: js.UndefOr[String] = js.undefined
  var app_host: js.UndefOr[String] = js.undefined
  var autotrack: js.UndefOr[Boolean] = js.undefined
  var batch_flush_interval_ms: js.UndefOr[Double] = js.undefined
  var batch_request_timeout_ms: js.UndefOr[Double] = js.undefined
  var batch_requests: js.UndefOr[Boolean] = js.undefined
  var batch_size: js.UndefOr[Double] = js.undefined
  var cdn: js.UndefOr[String] = js.undefined
  var cookie_domain: js.UndefOr[String] = js.undefined
  var cookie_expiration: js.UndefOr[Double] = js.undefined
  var cookie_name: js.UndefOr[String] = js.undefined
  var cross_site_cookie: js.UndefOr[Boolean] = js.undefined
  var cross_subdomain_cookie: js.UndefOr[Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var disable_cookie: js.UndefOr[Boolean] = js.undefined
  var disable_notifications: js.UndefOr[Boolean] = js.undefined
  var disable_persistence: js.UndefOr[Boolean] = js.undefined
  var ignore_dnt: js.UndefOr[Boolean] = js.undefined
  var img: js.UndefOr[Boolean] = js.undefined
  var inapp_link_new_window: js.UndefOr[Boolean] = js.undefined
  var inapp_protocol: js.UndefOr[String] = js.undefined
  var ip: js.UndefOr[Boolean] = js.undefined
  var loaded: js.UndefOr[js.Function1[/* mixpanel */ this.type, Unit]] = js.undefined
  var opt_out_persistence_by_default: js.UndefOr[Boolean] = js.undefined
  var opt_out_tracking_by_default: js.UndefOr[Boolean] = js.undefined
  var opt_out_tracking_cookie_prefix: js.UndefOr[String] = js.undefined
  var opt_out_tracking_persistence_type: js.UndefOr[Persistence] = js.undefined
  var persistence: js.UndefOr[Persistence] = js.undefined
  var persistence_name: js.UndefOr[String] = js.undefined
  var property_blacklist: js.UndefOr[js.Array[String]] = js.undefined
  var save_referrer: js.UndefOr[Boolean] = js.undefined
  var secure_cookie: js.UndefOr[Boolean] = js.undefined
  var store_google: js.UndefOr[Boolean] = js.undefined
  var test: js.UndefOr[Boolean] = js.undefined
  var track_links_timeout: js.UndefOr[Double] = js.undefined
  var track_pageview: js.UndefOr[Boolean] = js.undefined
  var upgrade: js.UndefOr[Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
  var xhr_headers: js.UndefOr[XhrHeadersDef] = js.undefined
}

object PartialConfig {
  @scala.inline
  def apply(
    api_host: String = null,
    api_method: String = null,
    api_transport: String = null,
    app_host: String = null,
    autotrack: js.UndefOr[Boolean] = js.undefined,
    batch_flush_interval_ms: js.UndefOr[Double] = js.undefined,
    batch_request_timeout_ms: js.UndefOr[Double] = js.undefined,
    batch_requests: js.UndefOr[Boolean] = js.undefined,
    batch_size: js.UndefOr[Double] = js.undefined,
    cdn: String = null,
    cookie_domain: String = null,
    cookie_expiration: js.UndefOr[Double] = js.undefined,
    cookie_name: String = null,
    cross_site_cookie: js.UndefOr[Boolean] = js.undefined,
    cross_subdomain_cookie: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    disable_cookie: js.UndefOr[Boolean] = js.undefined,
    disable_notifications: js.UndefOr[Boolean] = js.undefined,
    disable_persistence: js.UndefOr[Boolean] = js.undefined,
    ignore_dnt: js.UndefOr[Boolean] = js.undefined,
    img: js.UndefOr[Boolean] = js.undefined,
    inapp_link_new_window: js.UndefOr[Boolean] = js.undefined,
    inapp_protocol: String = null,
    ip: js.UndefOr[Boolean] = js.undefined,
    loaded: PartialConfig => Unit = null,
    opt_out_persistence_by_default: js.UndefOr[Boolean] = js.undefined,
    opt_out_tracking_by_default: js.UndefOr[Boolean] = js.undefined,
    opt_out_tracking_cookie_prefix: String = null,
    opt_out_tracking_persistence_type: Persistence = null,
    persistence: Persistence = null,
    persistence_name: String = null,
    property_blacklist: js.Array[String] = null,
    save_referrer: js.UndefOr[Boolean] = js.undefined,
    secure_cookie: js.UndefOr[Boolean] = js.undefined,
    store_google: js.UndefOr[Boolean] = js.undefined,
    test: js.UndefOr[Boolean] = js.undefined,
    track_links_timeout: js.UndefOr[Double] = js.undefined,
    track_pageview: js.UndefOr[Boolean] = js.undefined,
    upgrade: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined,
    xhr_headers: XhrHeadersDef = null
  ): PartialConfig = {
    val __obj = js.Dynamic.literal()
    if (api_host != null) __obj.updateDynamic("api_host")(api_host.asInstanceOf[js.Any])
    if (api_method != null) __obj.updateDynamic("api_method")(api_method.asInstanceOf[js.Any])
    if (api_transport != null) __obj.updateDynamic("api_transport")(api_transport.asInstanceOf[js.Any])
    if (app_host != null) __obj.updateDynamic("app_host")(app_host.asInstanceOf[js.Any])
    if (!js.isUndefined(autotrack)) __obj.updateDynamic("autotrack")(autotrack.get.asInstanceOf[js.Any])
    if (!js.isUndefined(batch_flush_interval_ms)) __obj.updateDynamic("batch_flush_interval_ms")(batch_flush_interval_ms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(batch_request_timeout_ms)) __obj.updateDynamic("batch_request_timeout_ms")(batch_request_timeout_ms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(batch_requests)) __obj.updateDynamic("batch_requests")(batch_requests.get.asInstanceOf[js.Any])
    if (!js.isUndefined(batch_size)) __obj.updateDynamic("batch_size")(batch_size.get.asInstanceOf[js.Any])
    if (cdn != null) __obj.updateDynamic("cdn")(cdn.asInstanceOf[js.Any])
    if (cookie_domain != null) __obj.updateDynamic("cookie_domain")(cookie_domain.asInstanceOf[js.Any])
    if (!js.isUndefined(cookie_expiration)) __obj.updateDynamic("cookie_expiration")(cookie_expiration.get.asInstanceOf[js.Any])
    if (cookie_name != null) __obj.updateDynamic("cookie_name")(cookie_name.asInstanceOf[js.Any])
    if (!js.isUndefined(cross_site_cookie)) __obj.updateDynamic("cross_site_cookie")(cross_site_cookie.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cross_subdomain_cookie)) __obj.updateDynamic("cross_subdomain_cookie")(cross_subdomain_cookie.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_cookie)) __obj.updateDynamic("disable_cookie")(disable_cookie.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_notifications)) __obj.updateDynamic("disable_notifications")(disable_notifications.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_persistence)) __obj.updateDynamic("disable_persistence")(disable_persistence.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_dnt)) __obj.updateDynamic("ignore_dnt")(ignore_dnt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(img)) __obj.updateDynamic("img")(img.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inapp_link_new_window)) __obj.updateDynamic("inapp_link_new_window")(inapp_link_new_window.get.asInstanceOf[js.Any])
    if (inapp_protocol != null) __obj.updateDynamic("inapp_protocol")(inapp_protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(ip)) __obj.updateDynamic("ip")(ip.get.asInstanceOf[js.Any])
    if (loaded != null) __obj.updateDynamic("loaded")(js.Any.fromFunction1(loaded))
    if (!js.isUndefined(opt_out_persistence_by_default)) __obj.updateDynamic("opt_out_persistence_by_default")(opt_out_persistence_by_default.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opt_out_tracking_by_default)) __obj.updateDynamic("opt_out_tracking_by_default")(opt_out_tracking_by_default.get.asInstanceOf[js.Any])
    if (opt_out_tracking_cookie_prefix != null) __obj.updateDynamic("opt_out_tracking_cookie_prefix")(opt_out_tracking_cookie_prefix.asInstanceOf[js.Any])
    if (opt_out_tracking_persistence_type != null) __obj.updateDynamic("opt_out_tracking_persistence_type")(opt_out_tracking_persistence_type.asInstanceOf[js.Any])
    if (persistence != null) __obj.updateDynamic("persistence")(persistence.asInstanceOf[js.Any])
    if (persistence_name != null) __obj.updateDynamic("persistence_name")(persistence_name.asInstanceOf[js.Any])
    if (property_blacklist != null) __obj.updateDynamic("property_blacklist")(property_blacklist.asInstanceOf[js.Any])
    if (!js.isUndefined(save_referrer)) __obj.updateDynamic("save_referrer")(save_referrer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secure_cookie)) __obj.updateDynamic("secure_cookie")(secure_cookie.get.asInstanceOf[js.Any])
    if (!js.isUndefined(store_google)) __obj.updateDynamic("store_google")(store_google.get.asInstanceOf[js.Any])
    if (!js.isUndefined(test)) __obj.updateDynamic("test")(test.get.asInstanceOf[js.Any])
    if (!js.isUndefined(track_links_timeout)) __obj.updateDynamic("track_links_timeout")(track_links_timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(track_pageview)) __obj.updateDynamic("track_pageview")(track_pageview.get.asInstanceOf[js.Any])
    if (!js.isUndefined(upgrade)) __obj.updateDynamic("upgrade")(upgrade.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    if (xhr_headers != null) __obj.updateDynamic("xhr_headers")(xhr_headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConfig]
  }
}

