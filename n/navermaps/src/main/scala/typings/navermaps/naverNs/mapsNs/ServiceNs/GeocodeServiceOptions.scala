package typings.navermaps.naverNs.mapsNs.ServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodeServiceOptions extends ServiceOptions {
  var address: js.UndefOr[String] = js.undefined
}

object GeocodeServiceOptions {
  @scala.inline
  def apply(address: String = null, coordType: js.Any = null, encoding: js.Any = null): GeocodeServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (coordType != null) __obj.updateDynamic("coordType")(coordType)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[GeocodeServiceOptions]
  }
}

