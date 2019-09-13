package typings.nodeDashGeocoder.nodeDashGeocoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericOptions extends js.Object {
  var apiKey: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var provider: Providers
}

object GenericOptions {
  @scala.inline
  def apply(provider: Providers, apiKey: String = null, host: String = null, language: String = null): GenericOptions = {
    val __obj = js.Dynamic.literal(provider = provider)
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (host != null) __obj.updateDynamic("host")(host)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[GenericOptions]
  }
}

