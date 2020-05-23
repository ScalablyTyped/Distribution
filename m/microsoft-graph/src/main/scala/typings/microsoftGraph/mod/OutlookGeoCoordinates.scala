package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutlookGeoCoordinates extends js.Object {
  /**
    * The accuracy of the latitude and longitude. As an example, the accuracy can be measured in meters, such as the latitude
    * and longitude are accurate to within 50 meters.
    */
  var accuracy: js.UndefOr[Double] = js.undefined
  // The altitude of the location.
  var altitude: js.UndefOr[Double] = js.undefined
  // The accuracy of the altitude.
  var altitudeAccuracy: js.UndefOr[Double] = js.undefined
  // The latitude of the location.
  var latitude: js.UndefOr[Double] = js.undefined
  // The longitude of the location.
  var longitude: js.UndefOr[Double] = js.undefined
}

object OutlookGeoCoordinates {
  @scala.inline
  def apply(
    accuracy: js.UndefOr[Double] = js.undefined,
    altitude: js.UndefOr[Double] = js.undefined,
    altitudeAccuracy: js.UndefOr[Double] = js.undefined,
    latitude: js.UndefOr[Double] = js.undefined,
    longitude: js.UndefOr[Double] = js.undefined
  ): OutlookGeoCoordinates = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accuracy)) __obj.updateDynamic("accuracy")(accuracy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(altitudeAccuracy)) __obj.updateDynamic("altitudeAccuracy")(altitudeAccuracy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlookGeoCoordinates]
  }
}

