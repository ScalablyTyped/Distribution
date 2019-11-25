package typings.navermaps.naver.maps.Service

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
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (coordType != null) __obj.updateDynamic("coordType")(coordType.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeServiceOptions]
  }
}

