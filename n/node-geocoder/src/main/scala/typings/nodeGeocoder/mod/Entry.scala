package typings.nodeGeocoder.mod

import typings.nodeGeocoder.anon.Confidence
import typings.nodeGeocoder.anon.Level1long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var administrativeLevels: js.UndefOr[Level1long] = js.undefined
  var building: js.UndefOr[String] = js.undefined
  var city: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var countryCode: js.UndefOr[String] = js.undefined
  var county: js.UndefOr[String] = js.undefined
  var district: js.UndefOr[String] = js.undefined
  var extra: js.UndefOr[Confidence] = js.undefined
  var formattedAddress: js.UndefOr[String] = js.undefined
  var latitude: js.UndefOr[Double] = js.undefined
  var longitude: js.UndefOr[Double] = js.undefined
  var provider: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var stateCode: js.UndefOr[String] = js.undefined
  var streetName: js.UndefOr[String] = js.undefined
  var streetNumber: js.UndefOr[String] = js.undefined
  var zipcode: js.UndefOr[String] = js.undefined
}

object Entry {
  @scala.inline
  def apply(
    administrativeLevels: Level1long = null,
    building: String = null,
    city: String = null,
    country: String = null,
    countryCode: String = null,
    county: String = null,
    district: String = null,
    extra: Confidence = null,
    formattedAddress: String = null,
    latitude: js.UndefOr[Double] = js.undefined,
    longitude: js.UndefOr[Double] = js.undefined,
    provider: String = null,
    state: String = null,
    stateCode: String = null,
    streetName: String = null,
    streetNumber: String = null,
    zipcode: String = null
  ): Entry = {
    val __obj = js.Dynamic.literal()
    if (administrativeLevels != null) __obj.updateDynamic("administrativeLevels")(administrativeLevels.asInstanceOf[js.Any])
    if (building != null) __obj.updateDynamic("building")(building.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (county != null) __obj.updateDynamic("county")(county.asInstanceOf[js.Any])
    if (district != null) __obj.updateDynamic("district")(district.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (formattedAddress != null) __obj.updateDynamic("formattedAddress")(formattedAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (stateCode != null) __obj.updateDynamic("stateCode")(stateCode.asInstanceOf[js.Any])
    if (streetName != null) __obj.updateDynamic("streetName")(streetName.asInstanceOf[js.Any])
    if (streetNumber != null) __obj.updateDynamic("streetNumber")(streetNumber.asInstanceOf[js.Any])
    if (zipcode != null) __obj.updateDynamic("zipcode")(zipcode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
}

