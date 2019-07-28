package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoTrackingInfo extends js.Object {
  var City: String
  var Coords: String
  var Country: String
  var CountryISOCode: String
  var IP: String
  var Region: String
  var RegionISOCode: String
  var Zip: String
}

object GeoTrackingInfo {
  @scala.inline
  def apply(
    City: String,
    Coords: String,
    Country: String,
    CountryISOCode: String,
    IP: String,
    Region: String,
    RegionISOCode: String,
    Zip: String
  ): GeoTrackingInfo = {
    val __obj = js.Dynamic.literal(City = City, Coords = Coords, Country = Country, CountryISOCode = CountryISOCode, IP = IP, Region = Region, RegionISOCode = RegionISOCode, Zip = Zip)
  
    __obj.asInstanceOf[GeoTrackingInfo]
  }
}

