package typings.atOracleOraclejet.ojgaugeMod.ojStatusMeterGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ReferenceLine extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object ReferenceLine {
  @scala.inline
  def apply(color: String = null, value: Int | Double = null): ReferenceLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceLine]
  }
}

