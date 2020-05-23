package typings.ngCordova.ngCordova

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
    accuracy: js.UndefOr[Double] = js.undefined,
    altitude: js.UndefOr[Double] = js.undefined,
    altitudeAccuracy: js.UndefOr[Double] = js.undefined,
    heading: js.UndefOr[Double] = js.undefined,
    latitude: js.UndefOr[Double] = js.undefined,
    longitude: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined
  ): IGeoCoordinates = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accuracy)) __obj.updateDynamic("accuracy")(accuracy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(altitudeAccuracy)) __obj.updateDynamic("altitudeAccuracy")(altitudeAccuracy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heading)) __obj.updateDynamic("heading")(heading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoCoordinates]
  }
}

