package typings.mixpanelDashBrowser.mixpanelDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearOptOutInOutOptions extends HasOptedInOutOptions {
  var cookie_expiration: Double
  var cross_subdomain_cookie: Boolean
  var secure_cookie: Boolean
}

object ClearOptOutInOutOptions {
  @scala.inline
  def apply(
    cookie_expiration: Double,
    cookie_prefix: String,
    cross_subdomain_cookie: Boolean,
    persistence_type: Persistence,
    secure_cookie: Boolean
  ): ClearOptOutInOutOptions = {
    val __obj = js.Dynamic.literal(cookie_expiration = cookie_expiration, cookie_prefix = cookie_prefix, cross_subdomain_cookie = cross_subdomain_cookie, persistence_type = persistence_type, secure_cookie = secure_cookie)
  
    __obj.asInstanceOf[ClearOptOutInOutOptions]
  }
}

