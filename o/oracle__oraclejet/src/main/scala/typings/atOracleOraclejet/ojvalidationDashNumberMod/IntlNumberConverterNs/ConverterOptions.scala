package typings.atOracleOraclejet.ojvalidationDashNumberMod.IntlNumberConverterNs

import typings.atOracleOraclejet.atOracleOraclejetStrings.HALF_DOWN
import typings.atOracleOraclejet.atOracleOraclejetStrings.HALF_EVEN
import typings.atOracleOraclejet.atOracleOraclejetStrings.HALF_UP
import typings.atOracleOraclejet.atOracleOraclejetStrings.bit
import typings.atOracleOraclejet.atOracleOraclejetStrings.byte
import typings.atOracleOraclejet.atOracleOraclejetStrings.code
import typings.atOracleOraclejet.atOracleOraclejetStrings.currency
import typings.atOracleOraclejet.atOracleOraclejetStrings.decimal
import typings.atOracleOraclejet.atOracleOraclejetStrings.full
import typings.atOracleOraclejet.atOracleOraclejetStrings.long
import typings.atOracleOraclejet.atOracleOraclejetStrings.name
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.percent
import typings.atOracleOraclejet.atOracleOraclejetStrings.short
import typings.atOracleOraclejet.atOracleOraclejetStrings.standard
import typings.atOracleOraclejet.atOracleOraclejetStrings.symbol
import typings.atOracleOraclejet.atOracleOraclejetStrings.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ConverterOptions extends js.Object {
  var currency: js.UndefOr[String] = js.undefined
  var currencyDisplay: js.UndefOr[code | symbol | name] = js.undefined
  var currencyFormat: js.UndefOr[standard | short | long] = js.undefined
  var decimalFormat: js.UndefOr[standard | short | long] = js.undefined
  var lenientParse: js.UndefOr[full | none] = js.undefined
  var maximumFractionDigits: js.UndefOr[Double] = js.undefined
  var minimumFractionDigits: js.UndefOr[Double] = js.undefined
  var minimumIntegerDigits: js.UndefOr[Double] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var roundDuringParse: js.UndefOr[Boolean] = js.undefined
  var roundingMode: js.UndefOr[HALF_UP | HALF_DOWN | HALF_EVEN] = js.undefined
  var separators: js.UndefOr[Separators] = js.undefined
  var style: js.UndefOr[decimal | currency | percent | unit] = js.undefined
  var unit: js.UndefOr[byte | bit] = js.undefined
  var useGrouping: js.UndefOr[Boolean] = js.undefined
}

object ConverterOptions {
  @scala.inline
  def apply(
    currency: String = null,
    currencyDisplay: code | symbol | name = null,
    currencyFormat: standard | short | long = null,
    decimalFormat: standard | short | long = null,
    lenientParse: full | none = null,
    maximumFractionDigits: Int | Double = null,
    minimumFractionDigits: Int | Double = null,
    minimumIntegerDigits: Int | Double = null,
    pattern: String = null,
    roundDuringParse: js.UndefOr[Boolean] = js.undefined,
    roundingMode: HALF_UP | HALF_DOWN | HALF_EVEN = null,
    separators: Separators = null,
    style: decimal | currency | percent | unit = null,
    unit: byte | bit = null,
    useGrouping: js.UndefOr[Boolean] = js.undefined
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

