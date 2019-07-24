package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutlookGeoCoordinates extends js.Object {
  /**
    * The accuracy of the latitude and longitude. As an example, the accuracy can be measured in meters, such as the latitude
    * and longitude are accurate to within 50 meters.
    */
  var accuracy: js.UndefOr[scala.Double] = js.undefined
  // The altitude of the location.
  var altitude: js.UndefOr[scala.Double] = js.undefined
  // The accuracy of the altitude.
  var altitudeAccuracy: js.UndefOr[scala.Double] = js.undefined
  // The latitude of the location.
  var latitude: js.UndefOr[scala.Double] = js.undefined
  // The longitude of the location.
  var longitude: js.UndefOr[scala.Double] = js.undefined
}

object OutlookGeoCoordinates {
  @scala.inline
  def apply(
    accuracy: scala.Int | scala.Double = null,
    altitude: scala.Int | scala.Double = null,
    altitudeAccuracy: scala.Int | scala.Double = null,
    latitude: scala.Int | scala.Double = null,
    longitude: scala.Int | scala.Double = null
  ): OutlookGeoCoordinates = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (altitudeAccuracy != null) __obj.updateDynamic("altitudeAccuracy")(altitudeAccuracy.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlookGeoCoordinates]
  }
}

