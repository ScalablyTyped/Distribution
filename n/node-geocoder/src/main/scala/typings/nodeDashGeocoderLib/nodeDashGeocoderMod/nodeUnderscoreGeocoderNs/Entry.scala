package typings
package nodeDashGeocoderLib.nodeDashGeocoderMod.nodeUnderscoreGeocoderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var administrativeLevels: js.UndefOr[nodeDashGeocoderLib.Anon_Level1long] = js.undefined
  var city: js.UndefOr[java.lang.String] = js.undefined
  var country: js.UndefOr[java.lang.String] = js.undefined
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  var extra: js.UndefOr[nodeDashGeocoderLib.Anon_Confidence] = js.undefined
  var formattedAddress: js.UndefOr[java.lang.String] = js.undefined
  var latitude: js.UndefOr[scala.Double] = js.undefined
  var longitude: js.UndefOr[scala.Double] = js.undefined
  var provider: js.UndefOr[java.lang.String] = js.undefined
  var streetName: js.UndefOr[java.lang.String] = js.undefined
  var streetNumber: js.UndefOr[java.lang.String] = js.undefined
  var zipcode: js.UndefOr[java.lang.String] = js.undefined
}

object Entry {
  @scala.inline
  def apply(
    administrativeLevels: nodeDashGeocoderLib.Anon_Level1long = null,
    city: java.lang.String = null,
    country: java.lang.String = null,
    countryCode: java.lang.String = null,
    extra: nodeDashGeocoderLib.Anon_Confidence = null,
    formattedAddress: java.lang.String = null,
    latitude: scala.Int | scala.Double = null,
    longitude: scala.Int | scala.Double = null,
    provider: java.lang.String = null,
    streetName: java.lang.String = null,
    streetNumber: java.lang.String = null,
    zipcode: java.lang.String = null
  ): Entry = {
    val __obj = js.Dynamic.literal()
    if (administrativeLevels != null) __obj.updateDynamic("administrativeLevels")(administrativeLevels)
    if (city != null) __obj.updateDynamic("city")(city)
    if (country != null) __obj.updateDynamic("country")(country)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (formattedAddress != null) __obj.updateDynamic("formattedAddress")(formattedAddress)
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (streetName != null) __obj.updateDynamic("streetName")(streetName)
    if (streetNumber != null) __obj.updateDynamic("streetNumber")(streetNumber)
    if (zipcode != null) __obj.updateDynamic("zipcode")(zipcode)
    __obj.asInstanceOf[Entry]
  }
}

