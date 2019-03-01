package typings
package atOracleOraclejetLib.ojvalidationDashBaseMod.ColorConverterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ConverterOptions extends js.Object {
  var format: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.rgb | atOracleOraclejetLib.atOracleOraclejetLibStrings.hsl | atOracleOraclejetLib.atOracleOraclejetLibStrings.hsv | atOracleOraclejetLib.atOracleOraclejetLibStrings.hex | atOracleOraclejetLib.atOracleOraclejetLibStrings.hex3
  ] = js.undefined
}

object ConverterOptions {
  @scala.inline
  def apply(
    format: atOracleOraclejetLib.atOracleOraclejetLibStrings.rgb | atOracleOraclejetLib.atOracleOraclejetLibStrings.hsl | atOracleOraclejetLib.atOracleOraclejetLibStrings.hsv | atOracleOraclejetLib.atOracleOraclejetLibStrings.hex | atOracleOraclejetLib.atOracleOraclejetLibStrings.hex3 = null
  ): ConverterOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterOptions]
  }
}

