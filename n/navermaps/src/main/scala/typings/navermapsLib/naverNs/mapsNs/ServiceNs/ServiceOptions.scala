package typings
package navermapsLib.naverNs.mapsNs.ServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceOptions extends js.Object {
  var coordType: js.UndefOr[js.Any] = js.undefined
  var encoding: js.UndefOr[js.Any] = js.undefined
}

object ServiceOptions {
  @scala.inline
  def apply(coordType: js.Any = null, encoding: js.Any = null): ServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (coordType != null) __obj.updateDynamic("coordType")(coordType)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[ServiceOptions]
  }
}

