package typings
package navermapsLib.naverNs.mapsNs.ServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReverseServiceOptions extends ServiceOptions {
  var location: js.UndefOr[navermapsLib.naverNs.mapsNs.Coord | navermapsLib.naverNs.mapsNs.CoordLiteral] = js.undefined
}

object ReverseServiceOptions {
  @scala.inline
  def apply(
    coordType: js.Any = null,
    encoding: js.Any = null,
    location: navermapsLib.naverNs.mapsNs.Coord | navermapsLib.naverNs.mapsNs.CoordLiteral = null
  ): ReverseServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (coordType != null) __obj.updateDynamic("coordType")(coordType)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseServiceOptions]
  }
}

