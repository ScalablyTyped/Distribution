package typings.nodeDashGeocoder.nodeDashGeocoderMod

import typings.nodeDashGeocoder.Anon_Confidence
import typings.nodeDashGeocoder.Anon_Level1long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var administrativeLevels: js.UndefOr[Anon_Level1long] = js.undefined
  var building: js.UndefOr[String] = js.undefined
  var city: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var countryCode: js.UndefOr[String] = js.undefined
  var county: js.UndefOr[String] = js.undefined
  var district: js.UndefOr[String] = js.undefined
  var extra: js.UndefOr[Anon_Confidence] = js.undefined
  var formattedAddress: js.UndefOr[String] = js.undefined
  var latitude: js.UndefOr[Double] = js.undefined
  var longitude: js.UndefOr[Double] = js.undefined
  var provider: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var streetName: js.UndefOr[String] = js.undefined
  var streetNumber: js.UndefOr[String] = js.undefined
  var zipcode: js.UndefOr[String] = js.undefined
}

object Entry {
  @scala.inline
  def apply(
    administrativeLevels: Anon_Level1long = null,
    building: String = null,
    city: String = null,
    country: String = null,
    countryCode: String = null,
    county: String = null,
    district: String = null,
    extra: Anon_Confidence = null,
    formattedAddress: String = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    provider: String = null,
    state: String = null,
    streetName: String = null,
    streetNumber: String = null,
    zipcode: String = null
  ): Entry = {
    val __obj = js.Dynamic.literal()
    if (administrativeLevels != null) __obj.updateDynamic("administrativeLevels")(administrativeLevels)
    if (building != null) __obj.updateDynamic("building")(building)
    if (city != null) __obj.updateDynamic("city")(city)
    if (country != null) __obj.updateDynamic("country")(country)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (county != null) __obj.updateDynamic("county")(county)
    if (district != null) __obj.updateDynamic("district")(district)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (formattedAddress != null) __obj.updateDynamic("formattedAddress")(formattedAddress)
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (state != null) __obj.updateDynamic("state")(state)
    if (streetName != null) __obj.updateDynamic("streetName")(streetName)
    if (streetNumber != null) __obj.updateDynamic("streetNumber")(streetNumber)
    if (zipcode != null) __obj.updateDynamic("zipcode")(zipcode)
    __obj.asInstanceOf[Entry]
  }
}

