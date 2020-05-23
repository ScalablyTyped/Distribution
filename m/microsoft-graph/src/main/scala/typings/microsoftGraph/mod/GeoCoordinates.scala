package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoCoordinates extends js.Object {
  // Optional. The altitude (height), in feet, above sea level for the item. Read-only.
  var altitude: js.UndefOr[Double] = js.undefined
  // Optional. The latitude, in decimal, for the item. Read-only.
  var latitude: js.UndefOr[Double] = js.undefined
  // Optional. The longitude, in decimal, for the item. Read-only.
  var longitude: js.UndefOr[Double] = js.undefined
}

object GeoCoordinates {
  @scala.inline
  def apply(
    altitude: js.UndefOr[Double] = js.undefined,
    latitude: js.UndefOr[Double] = js.undefined,
    longitude: js.UndefOr[Double] = js.undefined
  ): GeoCoordinates = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoCoordinates]
  }
}

