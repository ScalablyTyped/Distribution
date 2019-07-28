package typings.ngDashCordova.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoCoordinates extends js.Object {
  var accuracy: js.UndefOr[Double] = js.undefined
  var altitude: js.UndefOr[Double] = js.undefined
  var altitudeAccuracy: js.UndefOr[Double] = js.undefined
  var heading: js.UndefOr[Double] = js.undefined
  var latitude: js.UndefOr[Double] = js.undefined
  var longitude: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object IGeoCoordinates {
  @scala.inline
  def apply(
    accuracy: Int | Double = null,
    altitude: Int | Double = null,
    altitudeAccuracy: Int | Double = null,
    heading: Int | Double = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    speed: Int | Double = null
  ): IGeoCoordinates = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (altitudeAccuracy != null) __obj.updateDynamic("altitudeAccuracy")(altitudeAccuracy.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoCoordinates]
  }
}

