package typings.mixpanelBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InTrackingOptions extends ClearOptOutInOutOptions {
  var track_event_name: String = js.native
  var track_event_properties: Dict = js.native
  def track(): Unit = js.native
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
    val __obj = js.Dynamic.literal(cookie_expiration = cookie_expiration.asInstanceOf[js.Any], cookie_prefix = cookie_prefix.asInstanceOf[js.Any], cross_subdomain_cookie = cross_subdomain_cookie.asInstanceOf[js.Any], persistence_type = persistence_type.asInstanceOf[js.Any], secure_cookie = secure_cookie.asInstanceOf[js.Any], track = js.Any.fromFunction0(track), track_event_name = track_event_name.asInstanceOf[js.Any], track_event_properties = track_event_properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[InTrackingOptions]
  }
  @scala.inline
  implicit class InTrackingOptionsOps[Self <: InTrackingOptions] (val x: Self) extends AnyVal {
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
    def setTrack(value: () => Unit): Self = this.set("track", js.Any.fromFunction0(value))
    @scala.inline
    def setTrack_event_name(value: String): Self = this.set("track_event_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrack_event_properties(value: Dict): Self = this.set("track_event_properties", value.asInstanceOf[js.Any])
  }
  
}

