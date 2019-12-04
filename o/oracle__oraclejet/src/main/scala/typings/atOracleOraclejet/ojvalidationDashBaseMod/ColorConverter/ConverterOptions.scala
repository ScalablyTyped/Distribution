package typings.atOracleOraclejet.ojvalidationDashBaseMod.ColorConverter

import typings.atOracleOraclejet.atOracleOraclejetStrings.hex
import typings.atOracleOraclejet.atOracleOraclejetStrings.hex3
import typings.atOracleOraclejet.atOracleOraclejetStrings.hsl
import typings.atOracleOraclejet.atOracleOraclejetStrings.hsv
import typings.atOracleOraclejet.atOracleOraclejetStrings.rgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ConverterOptions extends js.Object {
  var format: js.UndefOr[rgb | hsl | hsv | hex | hex3] = js.undefined
}

object ConverterOptions {
  @scala.inline
  def apply(format: rgb | hsl | hsv | hex | hex3 = null): ConverterOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterOptions]
  }
}

