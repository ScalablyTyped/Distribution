package typings.postmark.outboundMessageOpenMod

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
    if (City != null) __obj.updateDynamic("City")(City.asInstanceOf[js.Any])
    if (Coords != null) __obj.updateDynamic("Coords")(Coords.asInstanceOf[js.Any])
    if (Country != null) __obj.updateDynamic("Country")(Country.asInstanceOf[js.Any])
    if (CountryISOCode != null) __obj.updateDynamic("CountryISOCode")(CountryISOCode.asInstanceOf[js.Any])
    if (IP != null) __obj.updateDynamic("IP")(IP.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (RegionISOCode != null) __obj.updateDynamic("RegionISOCode")(RegionISOCode.asInstanceOf[js.Any])
    if (Zip != null) __obj.updateDynamic("Zip")(Zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoLocation]
  }
}

