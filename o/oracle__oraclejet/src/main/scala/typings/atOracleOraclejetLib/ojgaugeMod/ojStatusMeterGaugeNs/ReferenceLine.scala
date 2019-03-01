package typings
package atOracleOraclejetLib.ojgaugeMod.ojStatusMeterGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ReferenceLine extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object ReferenceLine {
  @scala.inline
  def apply(color: java.lang.String = null, value: scala.Int | scala.Double = null): ReferenceLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceLine]
  }
}

