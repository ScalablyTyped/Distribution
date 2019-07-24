package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoCoordinates extends js.Object {
  // Optional. The altitude (height), in feet, above sea level for the item. Read-only.
  var altitude: js.UndefOr[scala.Double] = js.undefined
  // Optional. The latitude, in decimal, for the item. Read-only.
  var latitude: js.UndefOr[scala.Double] = js.undefined
  // Optional. The longitude, in decimal, for the item. Read-only.
  var longitude: js.UndefOr[scala.Double] = js.undefined
}

object GeoCoordinates {
  @scala.inline
  def apply(
    altitude: scala.Int | scala.Double = null,
    latitude: scala.Int | scala.Double = null,
    longitude: scala.Int | scala.Double = null
  ): GeoCoordinates = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoCoordinates]
  }
}

