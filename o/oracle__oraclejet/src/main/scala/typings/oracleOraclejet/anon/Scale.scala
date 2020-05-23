package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtimeaxisMod.ojTimeAxis.Converters
import typings.oracleOraclejet.oracleOraclejetStrings.days
import typings.oracleOraclejet.oracleOraclejetStrings.hours
import typings.oracleOraclejet.oracleOraclejetStrings.minutes
import typings.oracleOraclejet.oracleOraclejetStrings.months
import typings.oracleOraclejet.oracleOraclejetStrings.quarters
import typings.oracleOraclejet.oracleOraclejetStrings.seconds
import typings.oracleOraclejet.oracleOraclejetStrings.weeks
import typings.oracleOraclejet.oracleOraclejetStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scale extends js.Object {
  var converter: js.UndefOr[Converters | typings.oracleOraclejet.ojvalidationBaseMod.Converter[String]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var scale: seconds | minutes | hours | days | weeks | months | quarters | years
  var zoomOrder: js.UndefOr[js.Array[String]] = js.undefined
}

object Scale {
  @scala.inline
  def apply(
    scale: seconds | minutes | hours | days | weeks | months | quarters | years,
    converter: Converters | typings.oracleOraclejet.ojvalidationBaseMod.Converter[String] = null,
    height: js.UndefOr[Double] = js.undefined,
    zoomOrder: js.Array[String] = null
  ): Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (zoomOrder != null) __obj.updateDynamic("zoomOrder")(zoomOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
}

