package typings.mixpanelBrowser.anon

import typings.mixpanelBrowser.mod.Dict
import typings.mixpanelBrowser.mod.Persistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mixpanel-browser.mixpanel-browser.InTrackingOptions> */
trait PartialInTrackingOptions extends js.Object {
  var cookie_expiration: js.UndefOr[Double] = js.undefined
  var cookie_prefix: js.UndefOr[String] = js.undefined
  var cross_subdomain_cookie: js.UndefOr[Boolean] = js.undefined
  var persistence_type: js.UndefOr[Persistence] = js.undefined
  var secure_cookie: js.UndefOr[Boolean] = js.undefined
  var track: js.UndefOr[js.Function0[Unit]] = js.undefined
  var track_event_name: js.UndefOr[String] = js.undefined
  var track_event_properties: js.UndefOr[Dict] = js.undefined
}

object PartialInTrackingOptions {
  @scala.inline
  def apply(
    cookie_expiration: js.UndefOr[Double] = js.undefined,
    cookie_prefix: String = null,
    cross_subdomain_cookie: js.UndefOr[Boolean] = js.undefined,
    persistence_type: Persistence = null,
    secure_cookie: js.UndefOr[Boolean] = js.undefined,
    track: () => Unit = null,
    track_event_name: String = null,
    track_event_properties: Dict = null
  ): PartialInTrackingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cookie_expiration)) __obj.updateDynamic("cookie_expiration")(cookie_expiration.get.asInstanceOf[js.Any])
    if (cookie_prefix != null) __obj.updateDynamic("cookie_prefix")(cookie_prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(cross_subdomain_cookie)) __obj.updateDynamic("cross_subdomain_cookie")(cross_subdomain_cookie.get.asInstanceOf[js.Any])
    if (persistence_type != null) __obj.updateDynamic("persistence_type")(persistence_type.asInstanceOf[js.Any])
    if (!js.isUndefined(secure_cookie)) __obj.updateDynamic("secure_cookie")(secure_cookie.get.asInstanceOf[js.Any])
    if (track != null) __obj.updateDynamic("track")(js.Any.fromFunction0(track))
    if (track_event_name != null) __obj.updateDynamic("track_event_name")(track_event_name.asInstanceOf[js.Any])
    if (track_event_properties != null) __obj.updateDynamic("track_event_properties")(track_event_properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialInTrackingOptions]
  }
}

