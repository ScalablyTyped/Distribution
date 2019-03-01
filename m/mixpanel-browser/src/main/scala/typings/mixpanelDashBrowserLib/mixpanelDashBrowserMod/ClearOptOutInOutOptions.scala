package typings
package mixpanelDashBrowserLib.mixpanelDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearOptOutInOutOptions extends HasOptedInOutOptions {
  var cookie_expiration: scala.Double
  var cross_subdomain_cookie: scala.Boolean
  var secure_cookie: scala.Boolean
}

object ClearOptOutInOutOptions {
  @scala.inline
  def apply(
    cookie_expiration: scala.Double,
    cookie_prefix: java.lang.String,
    cross_subdomain_cookie: scala.Boolean,
    persistence_type: Persistence,
    secure_cookie: scala.Boolean
  ): ClearOptOutInOutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cookie_expiration")(cookie_expiration)
    __obj.updateDynamic("cookie_prefix")(cookie_prefix)
    __obj.updateDynamic("cross_subdomain_cookie")(cross_subdomain_cookie)
    __obj.updateDynamic("persistence_type")(persistence_type)
    __obj.updateDynamic("secure_cookie")(secure_cookie)
    __obj.asInstanceOf[ClearOptOutInOutOptions]
  }
}

