package typings.openui5

import typings.openui5.anon.AllowedUnits
import typings.openui5.anon.CurrencyCode
import typings.openui5.anon.DecimalSeparator
import typings.openui5.anon.Decimals
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreFormatNumberFormatMod {
  
  @JSImport("sap/ui/core/format/NumberFormat", JSImport.Default)
  @js.native
  open class default () extends NumberFormat
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/format/NumberFormat", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Specifies a rounding behavior for numerical operations capable of discarding precision. Each rounding
      * mode in this object indicates how the least significant returned digits of rounded result is to be calculated.
      */
    @JSImport("sap/ui/core/format/NumberFormat", "default.RoundingMode")
    @js.native
    def RoundingMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RoundingMode */ Any = js.native
    inline def RoundingMode_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RoundingMode */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RoundingMode")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a new subclass of class sap.ui.core.format.NumberFormat with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.Object.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, NumberFormat]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, NumberFormat],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Get a currency instance of the NumberFormat, which can be used for formatting.
      *
      * If no locale is given, the currently configured {@link sap.ui.core.Configuration.FormatSettings#getFormatLocale formatLocale }
      * will be used.
      *
      *  This instance has HALF_AWAY_FROM_ZERO set as default rounding mode. Please set the roundingMode property
      * in oFormatOptions to change the default value.
      *
      * The currency instance supports locally defined custom currency exclusive to the created instance. The
      * following example shows how to use custom currencies (e.g. for Bitcoins):
      * ```javascript
      *
      * var oFormat = NumberFormat.getCurrencyInstance({
      *     "currencyCode": false,
      *     "customCurrencies": {
      *         "BTC": {
      *             "symbol": "\\u0243",
      *             "decimals": 3
      *         }
      *     }
      * });
      *
      * oFormat.format(123.4567, "BTC"); // "Ƀ 123.457"
      * ```
      *
      *
      * As an alternative to using a fixed `symbol` for your custom currencies, you can also provide an ISO-Code.
      * The provided ISO-Code will be used to look up the currency symbol in the global configuration, either
      * defined in the CLDR or custom defined on the Format Settings (see {@link sap.ui.core.Configuration.FormatSettings#setCustomCurrencies},
      * {@link sap.ui.core.Configuration.FormatSettings#addCustomCurrencies}).
      *
      * If no symbol is given at all, the custom currency key is used for formatting.
      *
      *
      * ```javascript
      *
      * var oFormat = NumberFormat.getCurrencyInstance({
      *     "currencyCode": false,
      *     "customCurrencies": {
      *         "MyDollar": {
      *             "isoCode": "USD",
      *             "decimals": 3
      *         },
      *         "Bitcoin": {
      *             "decimals": 2
      *         }
      *     }
      * });
      *
      * // symbol looked up from global configuration
      * oFormat.format(123.4567, "MyDollar"); // "$123.457"
      *
      * // no symbol available, custom currency key is rendered
      * oFormat.format(777.888, "Bitcoin"); // "Bitcoin 777.89"
      * ```
      *
      *
      * @returns currency instance of the NumberFormat
      */
    inline def getCurrencyInstance(): NumberFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrencyInstance")().asInstanceOf[NumberFormat]
    inline def getCurrencyInstance(
      /**
      * The option object, which supports the following parameters. If no options are given, default values according
      * to the type and locale settings are used.
      */
    oFormatOptions: Unit,
      /**
      * Locale to get the formatter for
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): NumberFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurrencyInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[NumberFormat]
    inline def getCurrencyInstance(
      /**
      * The option object, which supports the following parameters. If no options are given, default values according
      * to the type and locale settings are used.
      */
    oFormatOptions: CurrencyCode
    ): NumberFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrencyInstance")(oFormatOptions.asInstanceOf[js.Any]).asInstanceOf[NumberFormat]
    inline def getCurrencyInstance(
      /**
      * The option object, which supports the following parameters. If no options are given, default values according
      * to the type and locale settings are used.
      */
    oFormatOptions: CurrencyCode,
      /**
      * Locale to get the formatter for
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): NumberFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurrencyInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[NumberFormat]
    
    /**
      * Get a float instance of the NumberFormat, which can be used for formatting.
      *
      * If no locale is given, the currently configured {@link sap.ui.core.Configuration.FormatSettings#getFormatLocale formatLocale }
      * will be used.
      *
      *  This instance has HALF_AWAY_FROM_ZERO set as default rounding mode. Please set the roundingMode property
      * in oFormatOptions to change the default value.
      *
      * The following example shows how grouping is done:
      * ```javascript
      *
      * var oFormat = NumberFormat.getFloatInstance({
      *     "groupingEnabled": true,  // grouping is enabled
      *     "groupingSeparator": '.', // grouping separator is '.'
      *     "groupingSize": 3,        // the amount of digits to be grouped (here: thousand)
      *     "decimalSeparator": ","   // the decimal separator must be different from the grouping separator
      * });
      *
      * oFormat.format(1234.56); // "1.234,56"
      * ```
      *
      *
      * @returns float instance of the NumberFormat
      */
    inline def getFloatInstance(): NumberFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getFloatInstance")().asInstanceOf[NumberFormat]
    inline def getFloatInstance(
      /**
      * The option object, which supports the following parameters. If no options are given, default values according
      * to the type and locale settings are used.
      */
    oFormatOptions: Unit,
      /**
      * Locale to get the formatter for
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): NumberFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getFloatInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[NumberFormat]
    inline def getFloatInstance(
      /**
      * The option object, which supports the following parameters. If no options are given, default values according
      * to the type and locale settings are used.
      */
    oFormatOptions: DecimalSeparator
    ): NumberFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getFloatInstance")(oFormatOptions.asInstanceOf[js.Any]).asInstanceOf[NumberFormat]
    inline def getFloatInstance(
      /**
      * The option object, which supports the following parameters. If no options are given, default values according
      * to the type and locale settings are used.
      */
    oFormatOptions: DecimalSeparator,
      /**
      * Locale to get the formatter for
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): NumberFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getFloatInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[NumberFormat]
    
    /**
      * Get an integer instance of the NumberFormat, which can be used for formatting.
      *
      * If no locale is given, the currently configured {@link sap.ui.core.Configuration.FormatSettings#getFormatLocale formatLocale }
      * will be used.
      *
      *  This instance has TOWARDS_ZERO set as default rounding mode. Please set the roundingMode property
      * in oFormatOptions to change the default value.
      *
      * The following example shows how grouping is done:
      * ```javascript
      *
      * var oFormat = NumberFormat.getIntegerInstance({
      *     "groupingEnabled": true,  // grouping is enabled
      *     "groupingSeparator": '.', // grouping separator is '.'
      *     "groupingSize": 3         // the amount of digits to be grouped (here: thousand)
      * });
      *
      * oFormat.format(1234); // "1.234"
      * ```
      *
      *
      * @returns integer instance of the NumberFormat
      */
    inline def getIntegerInstance(): NumberFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntegerInstance")().asInstanceOf[NumberFormat]
    inline def getIntegerInstance(
      /**
      * The option object, which supports the following parameters. If no options are given, default values according
      * to the type and locale settings are used.
      */
    oFormatOptions: Unit,
      /**
      * Locale to get the formatter for
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): NumberFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntegerInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[NumberFormat]
    inline def getIntegerInstance(
      /**
      * The option object, which supports the following parameters. If no options are given, default values according
      * to the type and locale settings are used.
      */
    oFormatOptions: DecimalSeparator
    ): NumberFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntegerInstance")(oFormatOptions.asInstanceOf[js.Any]).asInstanceOf[NumberFormat]
    inline def getIntegerInstance(
      /**
      * The option object, which supports the following parameters. If no options are given, default values according
      * to the type and locale settings are used.
      */
    oFormatOptions: DecimalSeparator,
      /**
      * Locale to get the formatter for
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): NumberFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntegerInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[NumberFormat]
    
    /**
      * Returns a metadata object for class sap.ui.core.format.NumberFormat.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
    
    /**
      * Get a percent instance of the NumberFormat, which can be used for formatting.
      *
      * If no locale is given, the currently configured {@link sap.ui.core.Configuration.FormatSettings#getFormatLocale formatLocale }
      * will be used.
      *
      *  This instance has HALF_AWAY_FROM_ZERO set as default rounding mode. Please set the roundingMode property
      * in oFormatOptions to change the default value.
      *
      * @returns percentage instance of the NumberFormat
      */
    inline def getPercentInstance(): NumberFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getPercentInstance")().asInstanceOf[NumberFormat]
    inline def getPercentInstance(
      /**
      * The option object, which supports the following parameters. If no options are given, default values according
      * to the type and locale settings are used.
      */
    oFormatOptions: Unit,
      /**
      * Locale to get the formatter for
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): NumberFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getPercentInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[NumberFormat]
    inline def getPercentInstance(
      /**
      * The option object, which supports the following parameters. If no options are given, default values according
      * to the type and locale settings are used.
      */
    oFormatOptions: Decimals
    ): NumberFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getPercentInstance")(oFormatOptions.asInstanceOf[js.Any]).asInstanceOf[NumberFormat]
    inline def getPercentInstance(
      /**
      * The option object, which supports the following parameters. If no options are given, default values according
      * to the type and locale settings are used.
      */
    oFormatOptions: Decimals,
      /**
      * Locale to get the formatter for
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): NumberFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getPercentInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[NumberFormat]
    
    /**
      * Get a unit instance of the NumberFormat, which can be used for formatting units.
      *
      * If no locale is given, the currently configured {@link sap.ui.core.Configuration.FormatSettings#getFormatLocale formatLocale }
      * will be used.
      *
      *  This instance has HALF_AWAY_FROM_ZERO set as default rounding mode. Please set the roundingMode property
      * in oFormatOptions to change the default value.
      *
      * @returns unit instance of the NumberFormat
      */
    inline def getUnitInstance(): NumberFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnitInstance")().asInstanceOf[NumberFormat]
    inline def getUnitInstance(
      /**
      * The option object, which supports the following parameters. If no options are given, default values according
      * to the type and locale settings are used.
      */
    oFormatOptions: Unit,
      /**
      * Locale to get the formatter for
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): NumberFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getUnitInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[NumberFormat]
    inline def getUnitInstance(
      /**
      * The option object, which supports the following parameters. If no options are given, default values according
      * to the type and locale settings are used.
      */
    oFormatOptions: AllowedUnits
    ): NumberFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnitInstance")(oFormatOptions.asInstanceOf[js.Any]).asInstanceOf[NumberFormat]
    inline def getUnitInstance(
      /**
      * The option object, which supports the following parameters. If no options are given, default values according
      * to the type and locale settings are used.
      */
    oFormatOptions: AllowedUnits,
      /**
      * Locale to get the formatter for
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): NumberFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getUnitInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[NumberFormat]
  }
  
  @js.native
  sealed trait RoundingMode extends StObject
  /**
    * Specifies a rounding behavior for numerical operations capable of discarding precision. Each rounding
    * mode in this object indicates how the least significant returned digits of rounded result is to be calculated.
    */
  @JSImport("sap/ui/core/format/NumberFormat", "RoundingMode")
  @js.native
  object RoundingMode extends StObject {
    
    /**
      * Rounding mode to round away from zero
      */
    @js.native
    sealed trait AWAY_FROM_ZERO
      extends StObject
         with RoundingMode
    
    /**
      * Rounding mode to round towards positive infinity
      */
    @js.native
    sealed trait CEILING
      extends StObject
         with RoundingMode
    
    /**
      * Rounding mode to round towards negative infinity
      */
    @js.native
    sealed trait FLOOR
      extends StObject
         with RoundingMode
    
    /**
      * Rounding mode to round towards the nearest neighbor unless both neighbors are equidistant, in which case
      * round away from zero.
      */
    @js.native
    sealed trait HALF_AWAY_FROM_ZERO
      extends StObject
         with RoundingMode
    
    /**
      * Rounding mode to round towards the nearest neighbor unless both neighbors are equidistant, in which case
      * round towards positive infinity.
      */
    @js.native
    sealed trait HALF_CEILING
      extends StObject
         with RoundingMode
    
    /**
      * Rounding mode to round towards the nearest neighbor unless both neighbors are equidistant, in which case
      * round towards negative infinity.
      */
    @js.native
    sealed trait HALF_FLOOR
      extends StObject
         with RoundingMode
    
    /**
      * Rounding mode to round towards the nearest neighbor unless both neighbors are equidistant, in which case
      * round towards zero.
      */
    @js.native
    sealed trait HALF_TOWARDS_ZERO
      extends StObject
         with RoundingMode
    
    /**
      * Rounding mode to round towards zero
      */
    @js.native
    sealed trait TOWARDS_ZERO
      extends StObject
         with RoundingMode
  }
  
  @js.native
  trait NumberFormat
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    def format(
      /**
      * the number to format or an array which contains the number to format and the sMeasure parameter
      */
    vValue: js.Array[Any]
    ): String = js.native
    def format(
      /**
      * the number to format or an array which contains the number to format and the sMeasure parameter
      */
    vValue: js.Array[Any],
      /**
      * an optional unit which has an impact on formatting currencies and units
      */
    sMeasure: String
    ): String = js.native
    /**
      * Format a number according to the given format options.
      *
      * @returns the formatted output value
      */
    def format(
      /**
      * the number to format or an array which contains the number to format and the sMeasure parameter
      */
    vValue: Double
    ): String = js.native
    def format(
      /**
      * the number to format or an array which contains the number to format and the sMeasure parameter
      */
    vValue: Double,
      /**
      * an optional unit which has an impact on formatting currencies and units
      */
    sMeasure: String
    ): String = js.native
    
    /**
      * @since 1.100
      *
      * Returns the scaling factor which is calculated based on the format options and the current locale being
      * used.
      *
      * This function only returns a meaningful scaling factor when the 'style' formatting option is set to 'short'
      * or 'long', and the 'shortRefNumber' option for calculating the scale factor is set.
      *
      * Consider using this function when the 'showScale' option is set to `false`, which causes the scale factor
      * not to appear in every formatted number but in a shared place.
      *
      * @returns The scale string if it exists based on the given 'shortRefNumber' option. Otherwise it returns
      * `undefined`.
      */
    def getScale(): js.UndefOr[String] = js.native
    
    /**
      * Parse a string which is formatted according to the given format options.
      *
      * @returns the parsed value as:
      * 	 - number
      * 	 - array which contains the parsed value and the currency code (symbol) or unit for currency and unit
      *     instances
      * 	 - string when option "parseAsString" is `true`
      * 	 - `NaN` if value cannot be parsed
      * 	 - `null` if value is invalid
      */
    def parse(/**
      * the string containing a formatted numeric value
      */
    sValue: String): Double | js.Array[Any] | String | Null = js.native
  }
}
