package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignInLocation extends js.Object {
  /** Provides the city where the sign-in originated. This is calculated using latitude/longitude information from the sign-in activity. */
  var city: js.UndefOr[java.lang.String] = js.undefined
  /** Provides the country code info (2 letter code) where the sign-in originated.  This is calculated using latitude/longitude information from the sign-in activity. */
  var countryOrRegion: js.UndefOr[java.lang.String] = js.undefined
  /** Provides the latitude, longitude and altitude where the sign-in originated. */
  var geoCoordinates: js.UndefOr[GeoCoordinates] = js.undefined
  /** Provides the State where the sign-in originated. This is calculated using latitude/longitude information from the sign-in activity. */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object SignInLocation {
  @scala.inline
  def apply(
    city: java.lang.String = null,
    countryOrRegion: java.lang.String = null,
    geoCoordinates: GeoCoordinates = null,
    state: java.lang.String = null
  ): SignInLocation = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city)
    if (countryOrRegion != null) __obj.updateDynamic("countryOrRegion")(countryOrRegion)
    if (geoCoordinates != null) __obj.updateDynamic("geoCoordinates")(geoCoordinates)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[SignInLocation]
  }
}

