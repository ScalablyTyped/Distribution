package typings.postmark.distClientModelsMessagesOutboundMessageOpenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoLocation extends js.Object {
  var City: js.UndefOr[String] = js.undefined
  var Coords: js.UndefOr[String] = js.undefined
  var Country: js.UndefOr[String] = js.undefined
  var CountryISOCode: js.UndefOr[String] = js.undefined
  var IP: js.UndefOr[String] = js.undefined
  var Region: js.UndefOr[String] = js.undefined
  var RegionISOCode: js.UndefOr[String] = js.undefined
  var Zip: js.UndefOr[String] = js.undefined
}

object GeoLocation {
  @scala.inline
  def apply(
    City: String = null,
    Coords: String = null,
    Country: String = null,
    CountryISOCode: String = null,
    IP: String = null,
    Region: String = null,
    RegionISOCode: String = null,
    Zip: String = null
  ): GeoLocation = {
    val __obj = js.Dynamic.literal()
    if (City != null) __obj.updateDynamic("City")(City)
    if (Coords != null) __obj.updateDynamic("Coords")(Coords)
    if (Country != null) __obj.updateDynamic("Country")(Country)
    if (CountryISOCode != null) __obj.updateDynamic("CountryISOCode")(CountryISOCode)
    if (IP != null) __obj.updateDynamic("IP")(IP)
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (RegionISOCode != null) __obj.updateDynamic("RegionISOCode")(RegionISOCode)
    if (Zip != null) __obj.updateDynamic("Zip")(Zip)
    __obj.asInstanceOf[GeoLocation]
  }
}

