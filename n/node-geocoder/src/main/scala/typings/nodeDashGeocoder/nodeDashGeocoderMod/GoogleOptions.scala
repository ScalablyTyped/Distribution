package typings.nodeDashGeocoder.nodeDashGeocoderMod

import typings.nodeDashGeocoder.nodeDashGeocoderStrings.google
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleOptions extends js.Object {
  var apiKey: js.UndefOr[String] = js.undefined
  var channel: js.UndefOr[String] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
  var excludePartialMatches: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var provider: google
  var region: js.UndefOr[String] = js.undefined
}

object GoogleOptions {
  @scala.inline
  def apply(
    provider: google,
    apiKey: String = null,
    channel: String = null,
    clientId: String = null,
    excludePartialMatches: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    region: String = null
  ): GoogleOptions = {
    val __obj = js.Dynamic.literal(provider = provider)
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (!js.isUndefined(excludePartialMatches)) __obj.updateDynamic("excludePartialMatches")(excludePartialMatches)
    if (language != null) __obj.updateDynamic("language")(language)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[GoogleOptions]
  }
}

