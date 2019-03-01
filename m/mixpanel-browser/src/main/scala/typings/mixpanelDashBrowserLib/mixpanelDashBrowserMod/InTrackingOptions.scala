package typings
package mixpanelDashBrowserLib.mixpanelDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InTrackingOptions extends ClearOptOutInOutOptions {
  var track_event_name: java.lang.String
  var track_event_properties: Dict
  def track(): scala.Unit
}

object InTrackingOptions {
  @scala.inline
  def apply(
    cookie_expiration: scala.Double,
    cookie_prefix: java.lang.String,
    cross_subdomain_cookie: scala.Boolean,
    persistence_type: Persistence,
    secure_cookie: scala.Boolean,
    track: js.Function0[scala.Unit],
    track_event_name: java.lang.String,
    track_event_properties: Dict
  ): InTrackingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cookie_expiration")(cookie_expiration)
    __obj.updateDynamic("cookie_prefix")(cookie_prefix)
    __obj.updateDynamic("cross_subdomain_cookie")(cross_subdomain_cookie)
    __obj.updateDynamic("persistence_type")(persistence_type)
    __obj.updateDynamic("secure_cookie")(secure_cookie)
    __obj.updateDynamic("track")(track)
    __obj.updateDynamic("track_event_name")(track_event_name)
    __obj.updateDynamic("track_event_properties")(track_event_properties)
    __obj.asInstanceOf[InTrackingOptions]
  }
}

