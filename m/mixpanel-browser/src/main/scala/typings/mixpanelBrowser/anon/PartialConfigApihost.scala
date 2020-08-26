package typings.mixpanelBrowser.anon

import typings.mixpanelBrowser.mod.Mixpanel
import typings.mixpanelBrowser.mod.Persistence
import typings.mixpanelBrowser.mod.XhrHeadersDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mixpanel-browser.mixpanel-browser.Config> */
@js.native
trait PartialConfigApihost extends js.Object {
  var api_host: js.UndefOr[String] = js.native
  var api_method: js.UndefOr[String] = js.native
  var api_transport: js.UndefOr[String] = js.native
  var app_host: js.UndefOr[String] = js.native
  var autotrack: js.UndefOr[Boolean] = js.native
  var batch_flush_interval_ms: js.UndefOr[Double] = js.native
  var batch_request_timeout_ms: js.UndefOr[Double] = js.native
  var batch_requests: js.UndefOr[Boolean] = js.native
  var batch_size: js.UndefOr[Double] = js.native
  var cdn: js.UndefOr[String] = js.native
  var cookie_domain: js.UndefOr[String] = js.native
  var cookie_expiration: js.UndefOr[Double] = js.native
  var cookie_name: js.UndefOr[String] = js.native
  var cross_site_cookie: js.UndefOr[Boolean] = js.native
  var cross_subdomain_cookie: js.UndefOr[Boolean] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var disable_cookie: js.UndefOr[Boolean] = js.native
  var disable_notifications: js.UndefOr[Boolean] = js.native
  var disable_persistence: js.UndefOr[Boolean] = js.native
  var ignore_dnt: js.UndefOr[Boolean] = js.native
  var img: js.UndefOr[Boolean] = js.native
  var inapp_link_new_window: js.UndefOr[Boolean] = js.native
  var inapp_protocol: js.UndefOr[String] = js.native
  var ip: js.UndefOr[Boolean] = js.native
  var loaded: js.UndefOr[js.Function1[/* mixpanel */ Mixpanel, Unit]] = js.native
  var opt_out_persistence_by_default: js.UndefOr[Boolean] = js.native
  var opt_out_tracking_by_default: js.UndefOr[Boolean] = js.native
  var opt_out_tracking_cookie_prefix: js.UndefOr[String] = js.native
  var opt_out_tracking_persistence_type: js.UndefOr[Persistence] = js.native
  var persistence: js.UndefOr[Persistence] = js.native
  var persistence_name: js.UndefOr[String] = js.native
  var property_blacklist: js.UndefOr[js.Array[String]] = js.native
  var save_referrer: js.UndefOr[Boolean] = js.native
  var secure_cookie: js.UndefOr[Boolean] = js.native
  var store_google: js.UndefOr[Boolean] = js.native
  var test: js.UndefOr[Boolean] = js.native
  var track_links_timeout: js.UndefOr[Double] = js.native
  var track_pageview: js.UndefOr[Boolean] = js.native
  var upgrade: js.UndefOr[Boolean] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
  var xhr_headers: js.UndefOr[XhrHeadersDef] = js.native
}

object PartialConfigApihost {
  @scala.inline
  def apply(): PartialConfigApihost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfigApihost]
  }
  @scala.inline
  implicit class PartialConfigApihostOps[Self <: PartialConfigApihost] (val x: Self) extends AnyVal {
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
    def deleteApi_host: Self = this.set("api_host", js.undefined)
    @scala.inline
    def setApi_method(value: String): Self = this.set("api_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi_method: Self = this.set("api_method", js.undefined)
    @scala.inline
    def setApi_transport(value: String): Self = this.set("api_transport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi_transport: Self = this.set("api_transport", js.undefined)
    @scala.inline
    def setApp_host(value: String): Self = this.set("app_host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp_host: Self = this.set("app_host", js.undefined)
    @scala.inline
    def setAutotrack(value: Boolean): Self = this.set("autotrack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutotrack: Self = this.set("autotrack", js.undefined)
    @scala.inline
    def setBatch_flush_interval_ms(value: Double): Self = this.set("batch_flush_interval_ms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatch_flush_interval_ms: Self = this.set("batch_flush_interval_ms", js.undefined)
    @scala.inline
    def setBatch_request_timeout_ms(value: Double): Self = this.set("batch_request_timeout_ms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatch_request_timeout_ms: Self = this.set("batch_request_timeout_ms", js.undefined)
    @scala.inline
    def setBatch_requests(value: Boolean): Self = this.set("batch_requests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatch_requests: Self = this.set("batch_requests", js.undefined)
    @scala.inline
    def setBatch_size(value: Double): Self = this.set("batch_size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatch_size: Self = this.set("batch_size", js.undefined)
    @scala.inline
    def setCdn(value: String): Self = this.set("cdn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCdn: Self = this.set("cdn", js.undefined)
    @scala.inline
    def setCookie_domain(value: String): Self = this.set("cookie_domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie_domain: Self = this.set("cookie_domain", js.undefined)
    @scala.inline
    def setCookie_expiration(value: Double): Self = this.set("cookie_expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie_expiration: Self = this.set("cookie_expiration", js.undefined)
    @scala.inline
    def setCookie_name(value: String): Self = this.set("cookie_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie_name: Self = this.set("cookie_name", js.undefined)
    @scala.inline
    def setCross_site_cookie(value: Boolean): Self = this.set("cross_site_cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCross_site_cookie: Self = this.set("cross_site_cookie", js.undefined)
    @scala.inline
    def setCross_subdomain_cookie(value: Boolean): Self = this.set("cross_subdomain_cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCross_subdomain_cookie: Self = this.set("cross_subdomain_cookie", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDisable_cookie(value: Boolean): Self = this.set("disable_cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable_cookie: Self = this.set("disable_cookie", js.undefined)
    @scala.inline
    def setDisable_notifications(value: Boolean): Self = this.set("disable_notifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable_notifications: Self = this.set("disable_notifications", js.undefined)
    @scala.inline
    def setDisable_persistence(value: Boolean): Self = this.set("disable_persistence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable_persistence: Self = this.set("disable_persistence", js.undefined)
    @scala.inline
    def setIgnore_dnt(value: Boolean): Self = this.set("ignore_dnt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore_dnt: Self = this.set("ignore_dnt", js.undefined)
    @scala.inline
    def setImg(value: Boolean): Self = this.set("img", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImg: Self = this.set("img", js.undefined)
    @scala.inline
    def setInapp_link_new_window(value: Boolean): Self = this.set("inapp_link_new_window", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInapp_link_new_window: Self = this.set("inapp_link_new_window", js.undefined)
    @scala.inline
    def setInapp_protocol(value: String): Self = this.set("inapp_protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInapp_protocol: Self = this.set("inapp_protocol", js.undefined)
    @scala.inline
    def setIp(value: Boolean): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    @scala.inline
    def setLoaded(value: /* mixpanel */ Mixpanel => Unit): Self = this.set("loaded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    @scala.inline
    def setOpt_out_persistence_by_default(value: Boolean): Self = this.set("opt_out_persistence_by_default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpt_out_persistence_by_default: Self = this.set("opt_out_persistence_by_default", js.undefined)
    @scala.inline
    def setOpt_out_tracking_by_default(value: Boolean): Self = this.set("opt_out_tracking_by_default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpt_out_tracking_by_default: Self = this.set("opt_out_tracking_by_default", js.undefined)
    @scala.inline
    def setOpt_out_tracking_cookie_prefix(value: String): Self = this.set("opt_out_tracking_cookie_prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpt_out_tracking_cookie_prefix: Self = this.set("opt_out_tracking_cookie_prefix", js.undefined)
    @scala.inline
    def setOpt_out_tracking_persistence_type(value: Persistence): Self = this.set("opt_out_tracking_persistence_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpt_out_tracking_persistence_type: Self = this.set("opt_out_tracking_persistence_type", js.undefined)
    @scala.inline
    def setPersistence(value: Persistence): Self = this.set("persistence", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistence: Self = this.set("persistence", js.undefined)
    @scala.inline
    def setPersistence_name(value: String): Self = this.set("persistence_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistence_name: Self = this.set("persistence_name", js.undefined)
    @scala.inline
    def setProperty_blacklistVarargs(value: String*): Self = this.set("property_blacklist", js.Array(value :_*))
    @scala.inline
    def setProperty_blacklist(value: js.Array[String]): Self = this.set("property_blacklist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty_blacklist: Self = this.set("property_blacklist", js.undefined)
    @scala.inline
    def setSave_referrer(value: Boolean): Self = this.set("save_referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSave_referrer: Self = this.set("save_referrer", js.undefined)
    @scala.inline
    def setSecure_cookie(value: Boolean): Self = this.set("secure_cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure_cookie: Self = this.set("secure_cookie", js.undefined)
    @scala.inline
    def setStore_google(value: Boolean): Self = this.set("store_google", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStore_google: Self = this.set("store_google", js.undefined)
    @scala.inline
    def setTest(value: Boolean): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    @scala.inline
    def setTrack_links_timeout(value: Double): Self = this.set("track_links_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrack_links_timeout: Self = this.set("track_links_timeout", js.undefined)
    @scala.inline
    def setTrack_pageview(value: Boolean): Self = this.set("track_pageview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrack_pageview: Self = this.set("track_pageview", js.undefined)
    @scala.inline
    def setUpgrade(value: Boolean): Self = this.set("upgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpgrade: Self = this.set("upgrade", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    @scala.inline
    def setXhr_headers(value: XhrHeadersDef): Self = this.set("xhr_headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhr_headers: Self = this.set("xhr_headers", js.undefined)
  }
  
}

