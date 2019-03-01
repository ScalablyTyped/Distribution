package typings
package atOracleOraclejetLib.ojvalidationDashNumberMod.IntlNumberConverterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ConverterOptions extends js.Object {
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var currencyDisplay: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.code | atOracleOraclejetLib.atOracleOraclejetLibStrings.symbol | atOracleOraclejetLib.atOracleOraclejetLibStrings.name
  ] = js.undefined
  var currencyFormat: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.standard | atOracleOraclejetLib.atOracleOraclejetLibStrings.short | atOracleOraclejetLib.atOracleOraclejetLibStrings.long
  ] = js.undefined
  var decimalFormat: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.standard | atOracleOraclejetLib.atOracleOraclejetLibStrings.short | atOracleOraclejetLib.atOracleOraclejetLibStrings.long
  ] = js.undefined
  var lenientParse: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ] = js.undefined
  var maximumFractionDigits: js.UndefOr[scala.Double] = js.undefined
  var minimumFractionDigits: js.UndefOr[scala.Double] = js.undefined
  var minimumIntegerDigits: js.UndefOr[scala.Double] = js.undefined
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  var roundDuringParse: js.UndefOr[scala.Boolean] = js.undefined
  var roundingMode: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.HALF_UP | atOracleOraclejetLib.atOracleOraclejetLibStrings.HALF_DOWN | atOracleOraclejetLib.atOracleOraclejetLibStrings.HALF_EVEN
  ] = js.undefined
  var separators: js.UndefOr[Separators] = js.undefined
  var style: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.decimal | atOracleOraclejetLib.atOracleOraclejetLibStrings.currency | atOracleOraclejetLib.atOracleOraclejetLibStrings.percent | atOracleOraclejetLib.atOracleOraclejetLibStrings.unit
  ] = js.undefined
  var unit: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.byte | atOracleOraclejetLib.atOracleOraclejetLibStrings.bit
  ] = js.undefined
  var useGrouping: js.UndefOr[scala.Boolean] = js.undefined
}

object ConverterOptions {
  @scala.inline
  def apply(
    currency: java.lang.String = null,
    currencyDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.code | atOracleOraclejetLib.atOracleOraclejetLibStrings.symbol | atOracleOraclejetLib.atOracleOraclejetLibStrings.name = null,
    currencyFormat: atOracleOraclejetLib.atOracleOraclejetLibStrings.standard | atOracleOraclejetLib.atOracleOraclejetLibStrings.short | atOracleOraclejetLib.atOracleOraclejetLibStrings.long = null,
    decimalFormat: atOracleOraclejetLib.atOracleOraclejetLibStrings.standard | atOracleOraclejetLib.atOracleOraclejetLibStrings.short | atOracleOraclejetLib.atOracleOraclejetLibStrings.long = null,
    lenientParse: atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = null,
    maximumFractionDigits: scala.Int | scala.Double = null,
    minimumFractionDigits: scala.Int | scala.Double = null,
    minimumIntegerDigits: scala.Int | scala.Double = null,
    pattern: java.lang.String = null,
    roundDuringParse: js.UndefOr[scala.Boolean] = js.undefined,
    roundingMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.HALF_UP | atOracleOraclejetLib.atOracleOraclejetLibStrings.HALF_DOWN | atOracleOraclejetLib.atOracleOraclejetLibStrings.HALF_EVEN = null,
    separators: Separators = null,
    style: atOracleOraclejetLib.atOracleOraclejetLibStrings.decimal | atOracleOraclejetLib.atOracleOraclejetLibStrings.currency | atOracleOraclejetLib.atOracleOraclejetLibStrings.percent | atOracleOraclejetLib.atOracleOraclejetLibStrings.unit = null,
    unit: atOracleOraclejetLib.atOracleOraclejetLibStrings.byte | atOracleOraclejetLib.atOracleOraclejetLibStrings.bit = null,
    useGrouping: js.UndefOr[scala.Boolean] = js.undefined
  ): ConverterOptions = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (currencyDisplay != null) __obj.updateDynamic("currencyDisplay")(currencyDisplay.asInstanceOf[js.Any])
    if (currencyFormat != null) __obj.updateDynamic("currencyFormat")(currencyFormat.asInstanceOf[js.Any])
    if (decimalFormat != null) __obj.updateDynamic("decimalFormat")(decimalFormat.asInstanceOf[js.Any])
    if (lenientParse != null) __obj.updateDynamic("lenientParse")(lenientParse.asInstanceOf[js.Any])
    if (maximumFractionDigits != null) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.asInstanceOf[js.Any])
    if (minimumFractionDigits != null) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.asInstanceOf[js.Any])
    if (minimumIntegerDigits != null) __obj.updateDynamic("minimumIntegerDigits")(minimumIntegerDigits.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (!js.isUndefined(roundDuringParse)) __obj.updateDynamic("roundDuringParse")(roundDuringParse)
    if (roundingMode != null) __obj.updateDynamic("roundingMode")(roundingMode.asInstanceOf[js.Any])
    if (separators != null) __obj.updateDynamic("separators")(separators)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping)
    __obj.asInstanceOf[ConverterOptions]
  }
}

