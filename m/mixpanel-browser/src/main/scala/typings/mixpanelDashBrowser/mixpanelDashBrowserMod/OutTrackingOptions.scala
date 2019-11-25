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
    val __obj = js.Dynamic.literal(cookie_expiration = cookie_expiration.asInstanceOf[js.Any], cookie_prefix = cookie_prefix.asInstanceOf[js.Any], cross_subdomain_cookie = cross_subdomain_cookie.asInstanceOf[js.Any], delete_user = delete_user.asInstanceOf[js.Any], persistence_type = persistence_type.asInstanceOf[js.Any], secure_cookie = secure_cookie.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OutTrackingOptions]
  }
}

