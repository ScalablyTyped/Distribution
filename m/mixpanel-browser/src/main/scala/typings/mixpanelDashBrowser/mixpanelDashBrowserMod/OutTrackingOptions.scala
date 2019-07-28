package typings.mixpanelDashBrowser.mixpanelDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutTrackingOptions extends ClearOptOutInOutOptions {
  var delete_user: Boolean
}

object OutTrackingOptions {
  @scala.inline
  def apply(
    cookie_expiration: Double,
    cookie_prefix: String,
    cross_subdomain_cookie: Boolean,
    delete_user: Boolean,
    persistence_type: Persistence,
    secure_cookie: Boolean
  ): OutTrackingOptions = {
    val __obj = js.Dynamic.literal(cookie_expiration = cookie_expiration, cookie_prefix = cookie_prefix, cross_subdomain_cookie = cross_subdomain_cookie, delete_user = delete_user, persistence_type = persistence_type, secure_cookie = secure_cookie)
  
    __obj.asInstanceOf[OutTrackingOptions]
  }
}

