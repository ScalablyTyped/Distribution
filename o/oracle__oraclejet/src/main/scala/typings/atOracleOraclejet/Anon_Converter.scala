package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.days
import typings.atOracleOraclejet.atOracleOraclejetStrings.hours
import typings.atOracleOraclejet.atOracleOraclejetStrings.minutes
import typings.atOracleOraclejet.atOracleOraclejetStrings.months
import typings.atOracleOraclejet.atOracleOraclejetStrings.quarters
import typings.atOracleOraclejet.atOracleOraclejetStrings.seconds
import typings.atOracleOraclejet.atOracleOraclejetStrings.weeks
import typings.atOracleOraclejet.atOracleOraclejetStrings.years
import typings.atOracleOraclejet.ojtimeaxisMod.ojTimeAxis.Converters
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Converter extends js.Object {
  var converter: js.UndefOr[Converters | Converter[String]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var scale: seconds | minutes | hours | days | weeks | months | quarters | years
  var zoomOrder: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Converter {
  @scala.inline
  def apply(
    scale: seconds | minutes | hours | days | weeks | months | quarters | years,
    converter: Converters | Converter[String] = null,
    height: Int | Double = null,
    zoomOrder: js.Array[String] = null
  ): Anon_Converter = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (zoomOrder != null) __obj.updateDynamic("zoomOrder")(zoomOrder)
    __obj.asInstanceOf[Anon_Converter]
  }
}

