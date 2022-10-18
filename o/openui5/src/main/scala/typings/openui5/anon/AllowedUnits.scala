package typings.openui5.anon

import typings.openui5.int
import typings.openui5.sapUiCoreFormatNumberFormatMod.RoundingMode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedUnits extends StObject {
  
  /**
    * defines the allowed units for formatting and parsing, e.g. ["size-meter", "volume-liter", ...]
    */
  var allowedUnits: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * defines a set of custom units, e.g. {"electric-inductance": { "displayName": "henry", "unitPattern-count-one":
    * "{0} H", "unitPattern-count-other": "{0} H", "perUnitPattern": "{0}/H", "decimals": 2, "precision": 4
    * }}
    */
  var customUnits: js.UndefOr[Record[String, js.Object]] = js.undefined
  
  /**
    * defines the character used as decimal separator. Note: `decimalSeparator` must always be different from
    * `groupingSeparator`.
    */
  var decimalSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * defines the number of decimal digits
    */
  var decimals: js.UndefOr[int] = js.undefined
  
  /**
    * @since 1.30.0 defines what an empty string is parsed as, and what is formatted as an empty string. The
    * allowed values are "" (empty string), NaN, `null`, or 0. The 'format' and 'parse' functions are done
    * in a symmetric way. For example, when this parameter is set to NaN, an empty string is parsed as [NaN,
    * undefined], and NaN is formatted as an empty string.
    */
  var emptyString: js.UndefOr[Double] = js.undefined
  
  /**
    * defines the grouping base size in digits if it is different from the grouping size (e.g. Indian grouping)
    */
  var groupingBaseSize: js.UndefOr[int] = js.undefined
  
  /**
    * defines whether grouping is enabled (grouping separators are shown)
    */
  var groupingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * defines the character used as grouping separator. Note: `groupingSeparator` must always be different
    * from `decimalSeparator`.
    */
  var groupingSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * defines the grouping size in digits; the default is `3`. It must be a positive number.
    */
  var groupingSize: js.UndefOr[int] = js.undefined
  
  /**
    * defines the maximum number of decimal digits
    */
  var maxFractionDigits: js.UndefOr[int] = js.undefined
  
  /**
    * defines the maximum number of non-decimal digits. If the number exceeds this maximum, e.g. 1e+120, "?"
    * characters are shown instead of digits.
    */
  var maxIntegerDigits: js.UndefOr[int] = js.undefined
  
  /**
    * defines the minimal number of decimal digits
    */
  var minFractionDigits: js.UndefOr[int] = js.undefined
  
  /**
    * defines the minimal number of non-decimal digits
    */
  var minIntegerDigits: js.UndefOr[int] = js.undefined
  
  /**
    * defines the used minus symbol
    */
  var minusSign: js.UndefOr[String] = js.undefined
  
  /**
    * @since 1.28.2 defines whether to output the string from the parse function in order to keep the precision
    * for big numbers. Numbers in scientific notation are parsed back to standard notation. For example, "5e-3"
    * is parsed to "0.005".
    */
  var parseAsString: js.UndefOr[Boolean] = js.undefined
  
  /**
    * CLDR number pattern which is used to format the number
    */
  var pattern: js.UndefOr[String] = js.undefined
  
  /**
    * defines the used plus symbol
    */
  var plusSign: js.UndefOr[String] = js.undefined
  
  /**
    * defines the numerical precision; the number of decimals is calculated dependent on the integer digits
    */
  var precision: js.UndefOr[int] = js.undefined
  
  /**
    * Whether {@link #format} preserves decimal digits except trailing zeros in case there are more decimals
    * than the `maxFractionDigits` format option allows. If decimals are not preserved, the formatted number
    * is rounded to `maxFractionDigits`.
    */
  var preserveDecimals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * specifies the rounding behavior for discarding the digits after the maximum fraction digits defined by
    * maxFractionDigits. Rounding will only be applied if the passed value is of type `number`. This can be
    * assigned
    * 	 - by value in {@link sap.ui.core.format.NumberFormat.RoundingMode RoundingMode},
    * 	 - via a function that is used for rounding the number and takes two parameters: the number itself,
    * 			and the number of decimal digits that should be reserved.
    */
  var roundingMode: js.UndefOr[
    RoundingMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RoundingMode * / any */ String)
  ] = js.undefined
  
  /**
    * defines the number of decimals in the shortened format string. If this option isn't specified, the 'decimals'
    * option is used instead.
    */
  var shortDecimals: js.UndefOr[int] = js.undefined
  
  /**
    * defines a limit above which only short number formatting is used
    */
  var shortLimit: js.UndefOr[int] = js.undefined
  
  /**
    * @since 1.40 specifies a number from which the scale factor for the 'short' or 'long' style format is
    * generated. The generated scale factor is used for all numbers which are formatted with this format instance.
    * This option only takes effect when the 'style' option is set to 'short' or 'long'. This option is set
    * to `undefined` by default, which means that the scale factor is selected automatically for each number
    * being formatted.
    */
  var shortRefNumber: js.UndefOr[int] = js.undefined
  
  /**
    * defines whether the unit of measure is shown in the formatted string, e.g. for input 1 and "duration-day"
    * true: "1 day", false: "1". If both `showMeasure` and `showNumber` are false, an empty string is returned
    */
  var showMeasure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * defines whether the number is shown as part of the result string, e.g. 1 day for locale "en" `NumberFormat.getUnitInstance({showNumber:true}).format(1,
    * "duration-day"); // "1 day"` `NumberFormat.getUnitInstance({showNumber:false}).format(1, "duration-day");
    * // "day"` e.g. 2 days for locale "en" `NumberFormat.getUnitInstance({showNumber:true}).format(2, "duration-day");
    * // "2 days"` `NumberFormat.getUnitInstance({showNumber:false}).format(2, "duration-day"); // "days"`
    * If both `showMeasure` and `showNumber` are false, an empty string is returned
    */
  var showNumber: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @since 1.40 specifies whether the scale factor is shown in the formatted number. This option takes effect
    * only when the 'style' options is set to either 'short' or 'long'.
    */
  var showScale: js.UndefOr[Boolean] = js.undefined
  
  /**
    * whether the positions of grouping separators are validated. Space characters used as grouping separators
    * are not validated.
    */
  var strictGroupingValidation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * defines the style of format. Valid values are 'short, 'long' or 'standard' (based on the CLDR decimalFormat).
    * When set to 'short' or 'long', numbers are formatted into compact forms. When this option is set, the
    * default value of the 'precision' option is set to 2. This can be changed by setting either min/maxFractionDigits,
    * decimals, shortDecimals, or the 'precision' option itself.
    */
  var style: js.UndefOr[String] = js.undefined
}
object AllowedUnits {
  
  inline def apply(): AllowedUnits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedUnits]
  }
  
  extension [Self <: AllowedUnits](x: Self) {
    
    inline def setAllowedUnits(value: js.Array[Any]): Self = StObject.set(x, "allowedUnits", value.asInstanceOf[js.Any])
    
    inline def setAllowedUnitsUndefined: Self = StObject.set(x, "allowedUnits", js.undefined)
    
    inline def setAllowedUnitsVarargs(value: Any*): Self = StObject.set(x, "allowedUnits", js.Array(value*))
    
    inline def setCustomUnits(value: Record[String, js.Object]): Self = StObject.set(x, "customUnits", value.asInstanceOf[js.Any])
    
    inline def setCustomUnitsUndefined: Self = StObject.set(x, "customUnits", js.undefined)
    
    inline def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
    
    inline def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
    
    inline def setDecimals(value: int): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
    
    inline def setEmptyString(value: Double): Self = StObject.set(x, "emptyString", value.asInstanceOf[js.Any])
    
    inline def setEmptyStringUndefined: Self = StObject.set(x, "emptyString", js.undefined)
    
    inline def setGroupingBaseSize(value: int): Self = StObject.set(x, "groupingBaseSize", value.asInstanceOf[js.Any])
    
    inline def setGroupingBaseSizeUndefined: Self = StObject.set(x, "groupingBaseSize", js.undefined)
    
    inline def setGroupingEnabled(value: Boolean): Self = StObject.set(x, "groupingEnabled", value.asInstanceOf[js.Any])
    
    inline def setGroupingEnabledUndefined: Self = StObject.set(x, "groupingEnabled", js.undefined)
    
    inline def setGroupingSeparator(value: String): Self = StObject.set(x, "groupingSeparator", value.asInstanceOf[js.Any])
    
    inline def setGroupingSeparatorUndefined: Self = StObject.set(x, "groupingSeparator", js.undefined)
    
    inline def setGroupingSize(value: int): Self = StObject.set(x, "groupingSize", value.asInstanceOf[js.Any])
    
    inline def setGroupingSizeUndefined: Self = StObject.set(x, "groupingSize", js.undefined)
    
    inline def setMaxFractionDigits(value: int): Self = StObject.set(x, "maxFractionDigits", value.asInstanceOf[js.Any])
    
    inline def setMaxFractionDigitsUndefined: Self = StObject.set(x, "maxFractionDigits", js.undefined)
    
    inline def setMaxIntegerDigits(value: int): Self = StObject.set(x, "maxIntegerDigits", value.asInstanceOf[js.Any])
    
    inline def setMaxIntegerDigitsUndefined: Self = StObject.set(x, "maxIntegerDigits", js.undefined)
    
    inline def setMinFractionDigits(value: int): Self = StObject.set(x, "minFractionDigits", value.asInstanceOf[js.Any])
    
    inline def setMinFractionDigitsUndefined: Self = StObject.set(x, "minFractionDigits", js.undefined)
    
    inline def setMinIntegerDigits(value: int): Self = StObject.set(x, "minIntegerDigits", value.asInstanceOf[js.Any])
    
    inline def setMinIntegerDigitsUndefined: Self = StObject.set(x, "minIntegerDigits", js.undefined)
    
    inline def setMinusSign(value: String): Self = StObject.set(x, "minusSign", value.asInstanceOf[js.Any])
    
    inline def setMinusSignUndefined: Self = StObject.set(x, "minusSign", js.undefined)
    
    inline def setParseAsString(value: Boolean): Self = StObject.set(x, "parseAsString", value.asInstanceOf[js.Any])
    
    inline def setParseAsStringUndefined: Self = StObject.set(x, "parseAsString", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setPlusSign(value: String): Self = StObject.set(x, "plusSign", value.asInstanceOf[js.Any])
    
    inline def setPlusSignUndefined: Self = StObject.set(x, "plusSign", js.undefined)
    
    inline def setPrecision(value: int): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setPreserveDecimals(value: Boolean): Self = StObject.set(x, "preserveDecimals", value.asInstanceOf[js.Any])
    
    inline def setPreserveDecimalsUndefined: Self = StObject.set(x, "preserveDecimals", js.undefined)
    
    inline def setRoundingMode(
      value: RoundingMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RoundingMode * / any */ String)
    ): Self = StObject.set(x, "roundingMode", value.asInstanceOf[js.Any])
    
    inline def setRoundingModeUndefined: Self = StObject.set(x, "roundingMode", js.undefined)
    
    inline def setShortDecimals(value: int): Self = StObject.set(x, "shortDecimals", value.asInstanceOf[js.Any])
    
    inline def setShortDecimalsUndefined: Self = StObject.set(x, "shortDecimals", js.undefined)
    
    inline def setShortLimit(value: int): Self = StObject.set(x, "shortLimit", value.asInstanceOf[js.Any])
    
    inline def setShortLimitUndefined: Self = StObject.set(x, "shortLimit", js.undefined)
    
    inline def setShortRefNumber(value: int): Self = StObject.set(x, "shortRefNumber", value.asInstanceOf[js.Any])
    
    inline def setShortRefNumberUndefined: Self = StObject.set(x, "shortRefNumber", js.undefined)
    
    inline def setShowMeasure(value: Boolean): Self = StObject.set(x, "showMeasure", value.asInstanceOf[js.Any])
    
    inline def setShowMeasureUndefined: Self = StObject.set(x, "showMeasure", js.undefined)
    
    inline def setShowNumber(value: Boolean): Self = StObject.set(x, "showNumber", value.asInstanceOf[js.Any])
    
    inline def setShowNumberUndefined: Self = StObject.set(x, "showNumber", js.undefined)
    
    inline def setShowScale(value: Boolean): Self = StObject.set(x, "showScale", value.asInstanceOf[js.Any])
    
    inline def setShowScaleUndefined: Self = StObject.set(x, "showScale", js.undefined)
    
    inline def setStrictGroupingValidation(value: Boolean): Self = StObject.set(x, "strictGroupingValidation", value.asInstanceOf[js.Any])
    
    inline def setStrictGroupingValidationUndefined: Self = StObject.set(x, "strictGroupingValidation", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
