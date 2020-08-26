package typings.mixpanelBrowser.anon

import typings.mixpanelBrowser.mod.Persistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mixpanel-browser.mixpanel-browser.OutTrackingOptions> */
@js.native
trait PartialOutTrackingOptions extends js.Object {
  var cookie_expiration: js.UndefOr[Double] = js.native
  var cookie_prefix: js.UndefOr[String] = js.native
  var cross_subdomain_cookie: js.UndefOr[Boolean] = js.native
  var delete_user: js.UndefOr[Boolean] = js.native
  var persistence_type: js.UndefOr[Persistence] = js.native
  var secure_cookie: js.UndefOr[Boolean] = js.native
}

object PartialOutTrackingOptions {
  @scala.inline
  def apply(): PartialOutTrackingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOutTrackingOptions]
  }
  @scala.inline
  implicit class PartialOutTrackingOptionsOps[Self <: PartialOutTrackingOptions] (val x: Self) extends AnyVal {
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
    def setDelete_user(value: Boolean): Self = this.set("delete_user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelete_user: Self = this.set("delete_user", js.undefined)
    @scala.inline
    def setPersistence_type(value: Persistence): Self = this.set("persistence_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistence_type: Self = this.set("persistence_type", js.undefined)
    @scala.inline
    def setSecure_cookie(value: Boolean): Self = this.set("secure_cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure_cookie: Self = this.set("secure_cookie", js.undefined)
  }
  
}

