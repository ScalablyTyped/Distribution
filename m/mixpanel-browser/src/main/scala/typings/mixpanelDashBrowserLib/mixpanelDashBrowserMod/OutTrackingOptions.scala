package typings
package mixpanelDashBrowserLib.mixpanelDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutTrackingOptions extends ClearOptOutInOutOptions {
  var delete_user: scala.Boolean
}

object OutTrackingOptions {
  @scala.inline
  def apply(
    cookie_expiration: scala.Double,
    cookie_prefix: java.lang.String,
    cross_subdomain_cookie: scala.Boolean,
    delete_user: scala.Boolean,
    persistence_type: Persistence,
    secure_cookie: scala.Boolean
  ): OutTrackingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cookie_expiration")(cookie_expiration)
    __obj.updateDynamic("cookie_prefix")(cookie_prefix)
    __obj.updateDynamic("cross_subdomain_cookie")(cross_subdomain_cookie)
    __obj.updateDynamic("delete_user")(delete_user)
    __obj.updateDynamic("persistence_type")(persistence_type)
    __obj.updateDynamic("secure_cookie")(secure_cookie)
    __obj.asInstanceOf[OutTrackingOptions]
  }
}

