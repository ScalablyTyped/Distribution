package typings.nodeGeocoder.mod

import typings.nodeGeocoder.nodeGeocoderStrings.here
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
    val __obj = js.Dynamic.literal(appCode = appCode.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (politicalView != null) __obj.updateDynamic("politicalView")(politicalView.asInstanceOf[js.Any])
    if (!js.isUndefined(production)) __obj.updateDynamic("production")(production.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[HereOptions]
  }
}

