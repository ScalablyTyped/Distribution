package typings.mixpanel.Mixpanel

import typings.mixpanel.mixpanelStrings.cookie
import typings.mixpanel.mixpanelStrings.localStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
    * @default HTTP_PROTOCOL + 'api.mixpanel.com'
    */
  var api_host: js.UndefOr[String] = js.native
  /**
    * @default HTTP_PROTOCOL + 'mixpanel.com'
    */
  var app_host: js.UndefOr[String] = js.native
  /**
    * @default true
    */
  var autotrack: js.UndefOr[Boolean] = js.native
  /**
    * @default HTTP_PROTOCOL + 'cdn.mxpnl.com'
    */
  var cdn: js.UndefOr[String] = js.native
  /**
    * Super properties cookie expiration (in days)
    *
    * @default 365
    */
  var cookie_expiration: js.UndefOr[Double] = js.native
  /**
    * @deprecated Use `persistence_name` instead
    * @default ''
    */
  var cookie_name: js.UndefOr[String] = js.native
  /**
    * Super properties span subdomains
    *
    * @default true
    */
  var cross_subdomain_cookie: js.UndefOr[Boolean] = js.native
  /**
    * Debug mode
    *
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated Use `disable_persistence` instead
    * @default false
    */
  var disable_cookie: js.UndefOr[Boolean] = js.native
  /**
    * If this is true, the mixpanel cookie or localStorage entry
    * will be deleted, and no user persistence will take place
    *
    * @default false
    */
  var disable_persistence: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  var img: js.UndefOr[Boolean] = js.native
  /**
    * If this is true, Mixpanel will automatically determine City,
    * Region and Country data using the IP address of the client
    *
    * @default true
    */
  var ip: js.UndefOr[Boolean] = js.native
  /**
    * @default function() {}
    */
  var loaded: js.UndefOr[js.Function1[/* lib */ typings.mixpanel.Mixpanel, Unit]] = js.native
  /**
    * Type of persistent store for super properties
    *
    * If set to 'localStorage', any existing mixpanel cookie
    * value with the same `persistence_name` will be transferred
    * to localStorage and deleted.
    *
    * @default 'cookie'
    */
  var persistence: js.UndefOr[localStorage | cookie] = js.native
  /**
    * Name for super properties persistent store
    *
    * @default ''
    */
  var persistence_name: js.UndefOr[String] = js.native
  /**
    * Names of (super) properties which should never be sent
    * with track() calls
    *
    * @default []
    */
  var property_blacklist: js.UndefOr[js.Array[String]] = js.native
  /**
    * @default true
    */
  var save_referrer: js.UndefOr[Boolean] = js.native
  /**
    * If this is true, mixpanel cookies will be marked as secure,
    * meaning they will only be transmitted over https
    *
    * @default false
    */
  var secure_cookie: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    */
  var store_google: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  var test: js.UndefOr[Boolean] = js.native
  /**
    * The amount of time track_links will wait for Mixpanel's
    * servers to respond
    *
    * @default 300
    */
  var track_links_timeout: js.UndefOr[Double] = js.native
  /**
    * Should we track a page view on page load
    *
    * @default true
    */
  var track_pageview: js.UndefOr[Boolean] = js.native
  /**
    * If you set upgrade to be true, the library will check for
    * a cookie from our old js library and import super
    * properties from it, then the old cookie is deleted
    * The upgrade config option only works in the initialization,
    * so make sure you set it when you create the library.
    *
    * @default false
    */
  var upgrade: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  var verbose: js.UndefOr[Boolean] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
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
    def deleteApi_host: Self = this.set("api_host", js.undefined)
    @scala.inline
    def setApp_host(value: String): Self = this.set("app_host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp_host: Self = this.set("app_host", js.undefined)
    @scala.inline
    def setAutotrack(value: Boolean): Self = this.set("autotrack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutotrack: Self = this.set("autotrack", js.undefined)
    @scala.inline
    def setCdn(value: String): Self = this.set("cdn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCdn: Self = this.set("cdn", js.undefined)
    @scala.inline
    def setCookie_expiration(value: Double): Self = this.set("cookie_expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie_expiration: Self = this.set("cookie_expiration", js.undefined)
    @scala.inline
    def setCookie_name(value: String): Self = this.set("cookie_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie_name: Self = this.set("cookie_name", js.undefined)
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
    def setDisable_persistence(value: Boolean): Self = this.set("disable_persistence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable_persistence: Self = this.set("disable_persistence", js.undefined)
    @scala.inline
    def setImg(value: Boolean): Self = this.set("img", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImg: Self = this.set("img", js.undefined)
    @scala.inline
    def setIp(value: Boolean): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    @scala.inline
    def setLoaded(value: /* lib */ typings.mixpanel.Mixpanel => Unit): Self = this.set("loaded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    @scala.inline
    def setPersistence(value: localStorage | cookie): Self = this.set("persistence", value.asInstanceOf[js.Any])
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
  }
  
}

