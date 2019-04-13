package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoTrackingInfo extends js.Object {
  var City: java.lang.String
  var Coords: java.lang.String
  var Country: java.lang.String
  var CountryISOCode: java.lang.String
  var IP: java.lang.String
  var Region: java.lang.String
  var RegionISOCode: java.lang.String
  var Zip: java.lang.String
}

object GeoTrackingInfo {
  @scala.inline
  def apply(
    City: java.lang.String,
    Coords: java.lang.String,
    Country: java.lang.String,
    CountryISOCode: java.lang.String,
    IP: java.lang.String,
    Region: java.lang.String,
    RegionISOCode: java.lang.String,
    Zip: java.lang.String
  ): GeoTrackingInfo = {
    val __obj = js.Dynamic.literal(City = City, Coords = Coords, Country = Country, CountryISOCode = CountryISOCode, IP = IP, Region = Region, RegionISOCode = RegionISOCode, Zip = Zip)
  
    __obj.asInstanceOf[GeoTrackingInfo]
  }
}

