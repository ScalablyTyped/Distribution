package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoCoordinates extends js.Object {
  var accuracy: js.UndefOr[scala.Double] = js.undefined
  var altitude: js.UndefOr[scala.Double] = js.undefined
  var altitudeAccuracy: js.UndefOr[scala.Double] = js.undefined
  var heading: js.UndefOr[scala.Double] = js.undefined
  var latitude: js.UndefOr[scala.Double] = js.undefined
  var longitude: js.UndefOr[scala.Double] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
}

object IGeoCoordinates {
  @scala.inline
  def apply(
    accuracy: scala.Int | scala.Double = null,
    altitude: scala.Int | scala.Double = null,
    altitudeAccuracy: scala.Int | scala.Double = null,
    heading: scala.Int | scala.Double = null,
    latitude: scala.Int | scala.Double = null,
    longitude: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null
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

