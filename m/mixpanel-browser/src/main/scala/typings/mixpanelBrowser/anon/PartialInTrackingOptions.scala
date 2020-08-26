package typings.mixpanelBrowser.anon

import typings.mixpanelBrowser.mod.Dict
import typings.mixpanelBrowser.mod.Persistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mixpanel-browser.mixpanel-browser.InTrackingOptions> */
@js.native
trait PartialInTrackingOptions extends js.Object {
  var cookie_expiration: js.UndefOr[Double] = js.native
  var cookie_prefix: js.UndefOr[String] = js.native
  var cross_subdomain_cookie: js.UndefOr[Boolean] = js.native
  var persistence_type: js.UndefOr[Persistence] = js.native
  var secure_cookie: js.UndefOr[Boolean] = js.native
  var track: js.UndefOr[js.Function0[Unit]] = js.native
  var track_event_name: js.UndefOr[String] = js.native
  var track_event_properties: js.UndefOr[Dict] = js.native
}

object PartialInTrackingOptions {
  @scala.inline
  def apply(): PartialInTrackingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInTrackingOptions]
  }
  @scala.inline
  implicit class PartialInTrackingOptionsOps[Self <: PartialInTrackingOptions] (val x: Self) extends AnyVal {
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
    def setCookie_expiration(value: Double): Self = this.set("cookie_expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie_expiration: Self = this.set("cookie_expiration", js.undefined)
    @scala.inline
    def setCookie_prefix(value: String): Self = this.set("cookie_prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie_prefix: Self = this.set("cookie_prefix", js.undefined)
    @scala.inline
    def setCross_subdomain_cookie(value: Boolean): Self = this.set("cross_subdomain_cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCross_subdomain_cookie: Self = this.set("cross_subdomain_cookie", js.undefined)
    @scala.inline
    def setPersistence_type(value: Persistence): Self = this.set("persistence_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistence_type: Self = this.set("persistence_type", js.undefined)
    @scala.inline
    def setSecure_cookie(value: Boolean): Self = this.set("secure_cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure_cookie: Self = this.set("secure_cookie", js.undefined)
    @scala.inline
    def setTrack(value: () => Unit): Self = this.set("track", js.Any.fromFunction0(value))
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
    @scala.inline
    def setTrack_event_name(value: String): Self = this.set("track_event_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrack_event_name: Self = this.set("track_event_name", js.undefined)
    @scala.inline
    def setTrack_event_properties(value: Dict): Self = this.set("track_event_properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrack_event_properties: Self = this.set("track_event_properties", js.undefined)
  }
  
}

