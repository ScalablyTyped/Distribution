package typings
package atOracleOraclejetLib.ojgaugeMod.ojLedGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Threshold extends js.Object {
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var shortDesc: js.UndefOr[java.lang.String] = js.undefined
}

object Threshold {
  @scala.inline
  def apply(
    borderColor: java.lang.String = null,
    color: java.lang.String = null,
    max: scala.Int | scala.Double = null,
    shortDesc: java.lang.String = null
  ): Threshold = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (color != null) __obj.updateDynamic("color")(color)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc)
    __obj.asInstanceOf[Threshold]
  }
}

