package typings.mixpanelDashBrowser.mixpanelDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InTrackingOptions extends ClearOptOutInOutOptions {
  var track_event_name: String
  var track_event_properties: Dict
  def track(): Unit
}

object InTrackingOptions {
  @scala.inline
  def apply(
    cookie_expiration: Double,
    cookie_prefix: String,
    cross_subdomain_cookie: Boolean,
    persistence_type: Persistence,
    secure_cookie: Boolean,
    track: () => Unit,
    track_event_name: String,
    track_event_properties: Dict
  ): InTrackingOptions = {
    val __obj = js.Dynamic.literal(cookie_expiration = cookie_expiration, cookie_prefix = cookie_prefix, cross_subdomain_cookie = cross_subdomain_cookie, persistence_type = persistence_type, secure_cookie = secure_cookie, track = js.Any.fromFunction0(track), track_event_name = track_event_name, track_event_properties = track_event_properties)
  
    __obj.asInstanceOf[InTrackingOptions]
  }
}

