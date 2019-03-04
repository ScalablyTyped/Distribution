package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Converter extends js.Object {
  var converter: js.UndefOr[
    atOracleOraclejetLib.ojtimeaxisMod.ojTimeAxisNs.Converters | atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String]
  ] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var scale: atOracleOraclejetLib.atOracleOraclejetLibStrings.seconds | atOracleOraclejetLib.atOracleOraclejetLibStrings.minutes | atOracleOraclejetLib.atOracleOraclejetLibStrings.hours | atOracleOraclejetLib.atOracleOraclejetLibStrings.days | atOracleOraclejetLib.atOracleOraclejetLibStrings.weeks | atOracleOraclejetLib.atOracleOraclejetLibStrings.months | atOracleOraclejetLib.atOracleOraclejetLibStrings.quarters | atOracleOraclejetLib.atOracleOraclejetLibStrings.years
  var zoomOrder: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Converter {
  @scala.inline
  def apply(
    scale: atOracleOraclejetLib.atOracleOraclejetLibStrings.seconds | atOracleOraclejetLib.atOracleOraclejetLibStrings.minutes | atOracleOraclejetLib.atOracleOraclejetLibStrings.hours | atOracleOraclejetLib.atOracleOraclejetLibStrings.days | atOracleOraclejetLib.atOracleOraclejetLibStrings.weeks | atOracleOraclejetLib.atOracleOraclejetLibStrings.months | atOracleOraclejetLib.atOracleOraclejetLibStrings.quarters | atOracleOraclejetLib.atOracleOraclejetLibStrings.years,
    converter: atOracleOraclejetLib.ojtimeaxisMod.ojTimeAxisNs.Converters | atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] = null,
    height: scala.Int | scala.Double = null,
    zoomOrder: js.Array[java.lang.String] = null
  ): Anon_Converter = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (zoomOrder != null) __obj.updateDynamic("zoomOrder")(zoomOrder)
    __obj.asInstanceOf[Anon_Converter]
  }
}

