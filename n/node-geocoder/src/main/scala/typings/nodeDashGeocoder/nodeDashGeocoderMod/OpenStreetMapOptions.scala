package typings.nodeDashGeocoder.nodeDashGeocoderMod

import typings.nodeDashGeocoder.nodeDashGeocoderStrings.openstreetmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenStreetMapOptions extends js.Object {
  var apiKey: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var osmServer: js.UndefOr[String] = js.undefined
  var provider: openstreetmap
}

object OpenStreetMapOptions {
  @scala.inline
  def apply(
    provider: openstreetmap,
    apiKey: String = null,
    email: String = null,
    language: String = null,
    osmServer: String = null
  ): OpenStreetMapOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (osmServer != null) __obj.updateDynamic("osmServer")(osmServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenStreetMapOptions]
  }
}

