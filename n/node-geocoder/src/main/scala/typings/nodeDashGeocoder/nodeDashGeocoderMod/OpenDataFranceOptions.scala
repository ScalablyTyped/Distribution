package typings.nodeDashGeocoder.nodeDashGeocoderMod

import typings.nodeDashGeocoder.nodeDashGeocoderStrings.opendatafrance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenDataFranceOptions extends js.Object {
  var apiKey: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var provider: opendatafrance
}

object OpenDataFranceOptions {
  @scala.inline
  def apply(provider: opendatafrance, apiKey: String = null, email: String = null, language: String = null): OpenDataFranceOptions = {
    val __obj = js.Dynamic.literal(provider = provider)
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (email != null) __obj.updateDynamic("email")(email)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[OpenDataFranceOptions]
  }
}

