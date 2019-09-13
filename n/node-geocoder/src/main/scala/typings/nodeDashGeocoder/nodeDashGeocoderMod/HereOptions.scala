package typings.nodeDashGeocoder.nodeDashGeocoderMod

import typings.nodeDashGeocoder.nodeDashGeocoderStrings.here
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HereOptions extends js.Object {
  var appCode: String
  var appId: String
  var country: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var politicalView: js.UndefOr[String] = js.undefined
  var production: js.UndefOr[Boolean] = js.undefined
  var provider: here
  var state: js.UndefOr[String] = js.undefined
}

object HereOptions {
  @scala.inline
  def apply(
    appCode: String,
    appId: String,
    provider: here,
    country: String = null,
    language: String = null,
    politicalView: String = null,
    production: js.UndefOr[Boolean] = js.undefined,
    state: String = null
  ): HereOptions = {
    val __obj = js.Dynamic.literal(appCode = appCode, appId = appId, provider = provider)
    if (country != null) __obj.updateDynamic("country")(country)
    if (language != null) __obj.updateDynamic("language")(language)
    if (politicalView != null) __obj.updateDynamic("politicalView")(politicalView)
    if (!js.isUndefined(production)) __obj.updateDynamic("production")(production)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[HereOptions]
  }
}

