package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.openui5Strings.A
import typings.openui5.openui5Strings.B
import typings.openui5.openui5Strings.C
import typings.openui5.openui5Strings.Space
import typings.openui5.openui5Strings.X
import typings.openui5.openui5Strings.Y
import typings.openui5.openui5Strings._empty
import typings.openui5.openui5Strings.`0`
import typings.openui5.openui5Strings.`1`
import typings.openui5.openui5Strings.`2`
import typings.openui5.openui5Strings.`3`
import typings.openui5.openui5Strings.`4`
import typings.openui5.openui5Strings.`5`
import typings.openui5.openui5Strings.`6`
import typings.openui5.openui5Strings.`7`
import typings.openui5.openui5Strings.`8`
import typings.openui5.openui5Strings.`9`
import typings.openui5.openui5Strings.decimal
import typings.openui5.openui5Strings.group
import typings.openui5.openui5Strings.minusSign
import typings.openui5.openui5Strings.plusSign
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiCoreCalendarTypeMod.CalendarType
import typings.openui5.sapUiCoreDateCalendarWeekNumberingMod.CalendarWeekNumbering
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreConfigurationMod extends Shortcut {
  
  @JSImport("sap/ui/core/Configuration", JSImport.Default)
  @js.native
  val default: Configuration = js.native
  
  @js.native
  sealed trait AnimationMode extends StObject
  /**
    * @since 1.50.0
    *
    * Enumerable list with available animation modes.
    *
    * This enumerable is used to validate the animation mode. Animation modes allow to specify different animation
    * scenarios or levels. The implementation of the Control (JavaScript or CSS) has to be done differently
    * for each animation mode.
    */
  @JSImport("sap/ui/core/Configuration", "AnimationMode")
  @js.native
  object AnimationMode extends StObject {
    
    /**
      * `basic` can be used for a reduced, more light-weight set of animations.
      */
    @js.native
    sealed trait basic
      extends StObject
         with AnimationMode
    
    /**
      * `full` represents a mode with unrestricted animation capabilities.
      */
    @js.native
    sealed trait full
      extends StObject
         with AnimationMode
    
    /**
      * `minimal` includes animations of fundamental functionality.
      */
    @js.native
    sealed trait minimal
      extends StObject
         with AnimationMode
    
    /**
      * `none` deactivates the animation completely.
      */
    @js.native
    sealed trait none
      extends StObject
         with AnimationMode
  }
  
  @JSImport("sap/ui/core/Configuration", "FormatSettings")
  @js.native
  open class FormatSettings ()
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    /**
      * Adds custom currencies to the existing entries. E.g. ` { "KWD": {"digits": 3}, "TND" : {"digits": 3 }
      * } `
      * See:
      * 	sap.ui.core.Configuration.FormatSettings#setCustomCurrencies
      *
      * @returns Returns `this` to allow method chaining
      */
    def addCustomCurrencies(/**
      * adds to the currency map
      */
    mCurrencies: Record[String, js.Object]): this.type = js.native
    
    /**
      * Retrieves the custom currencies. E.g. ` { "KWD": {"digits": 3}, "TND" : {"digits": 3} } `
      *
      * @returns the mapping between custom currencies and its digits
      */
    def getCustomCurrencies(): Record[String, js.Object] = js.native
    
    /**
      * Returns the currently set date pattern or undefined if no pattern has been defined.
      */
    def getDatePattern(): Unit = js.native
    
    /**
      * Returns the locale to be used for formatting.
      *
      * If no such locale has been defined, this method falls back to the language, see {@link sap.ui.core.Configuration#getLanguage Configuration.getLanguage()}.
      *
      * If any user preferences for date, time or number formatting have been set, and if no format locale has
      * been specified, then a special private use subtag is added to the locale, indicating to the framework
      * that these user preferences should be applied.
      *
      * @returns the format locale
      */
    def getFormatLocale(): typings.openui5.sapUiCoreLocaleMod.default = js.native
    
    /**
      * Returns the currently set customizing data for Islamic calendar support
      *
      * @returns Returns an array contains the customizing data. For details, please see {@link #setLegacyDateCalendarCustomizing}
      */
    def getLegacyDateCalendarCustomizing(): js.Array[LegacyDateCalendarCustomizing] = js.native
    
    /**
      * Returns the currently set legacy ABAP date format (its id) or undefined if none has been set.
      *
      * @returns ID of the ABAP date format, if not set or set to `""`, `undefined` will be returned
      */
    def getLegacyDateFormat(): js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | A | B | C] = js.native
    
    /**
      * Returns the currently set legacy ABAP number format (its id) or undefined if none has been set.
      *
      * @returns ID of the ABAP number format, if not set or set to `""`, `undefined` will be returned
      */
    def getLegacyNumberFormat(): js.UndefOr[Space | X | Y] = js.native
    
    /**
      * Returns the currently set legacy ABAP time format (its id) or undefined if none has been set.
      *
      * @returns ID of the ABAP date format, if not set or set to `""`, `undefined` will be returned
      */
    def getLegacyTimeFormat(): js.UndefOr[`0` | `1` | `2` | `3` | `4`] = js.native
    
    /**
      * Returns the currently set number symbol of the given type or undefined if no symbol has been defined.
      *
      * @returns A non-numerical symbol used as part of a number for the given type, e.g. for locale de_DE:
      *
      * 	 - "group": "." (grouping separator)
      * 	 - "decimal": "," (decimal separator)
      * 	 - "plusSign": "+" (plus sign)
      * 	 - "minusSign": "-" (minus sign)
      */
    def getNumberSymbol(/**
      * the type of symbol
      */
    sType: group | decimal | plusSign | minusSign): String = js.native
    
    /**
      * Returns the currently set time pattern or undefined if no pattern has been defined.
      */
    def getTimePattern(): Unit = js.native
    
    /**
      * @since 1.75.0
      *
      * Returns current trailingCurrencyCode configuration for new NumberFormatter instances
      *
      * @returns Whether currency codes shall always be placed after the numeric value
      */
    def getTrailingCurrencyCode(): Boolean = js.native
    
    /**
      * Sets custom currencies and replaces existing entries.
      *
      * There is a special currency code named "DEFAULT" that is optional. In case it is set it will be used
      * for all currencies not contained in the list, otherwise currency digits as defined by the CLDR will be
      * used as a fallback.
      *
      * Example: To use CLDR, but override single currencies ` { "KWD": {"digits": 3}, "TND" : {"digits": 3 }
      * } `
      *
      * To replace the CLDR currency digits completely ` { "DEFAULT": {"digits": 2}, "ADP": {"digits": 0}, ...
      * "XPF": {"digits": 0} } `
      *
      * Note: To unset the custom currencies: call with `undefined` Custom currencies must not only consist of
      * digits but contain at least one non-digit character, e.g. "a", so that the measure part can be distinguished
      * from the number part.
      *
      * @returns Returns `this` to allow method chaining
      */
    def setCustomCurrencies(/**
      * currency map which is set
      */
    mCurrencies: Record[String, js.Object]): this.type = js.native
    
    /**
      * Defines the preferred format pattern for the given date format style.
      *
      * Calling this method with a null or undefined pattern removes a previously set pattern.
      *
      * If a pattern is defined, it will be preferred over patterns derived from the current locale.
      *
      * See class {@link sap.ui.core.format.DateFormat} for details about the pattern syntax.
      *
      * After changing the date pattern, the framework tries to update localization specific parts of the UI.
      * See the documentation of {@link sap.ui.core.Configuration#setLanguage} for details and restrictions.
      *
      * @returns Returns `this` to allow method chaining
      */
    def setDatePattern(
      /**
      * must be one of short, medium, long or full.
      */
    sStyle: String,
      /**
      * the format pattern to be used in LDML syntax.
      */
    sPattern: String
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.113.0) - Use {@link sap.ui.core.Configuration#setCalendarWeekNumbering} instead.
      *
      * Defines the day used as the first day of the week.
      *
      * The day is set as an integer value between 0 (Sunday) and 6 (Saturday). Calling this method with a null
      * or undefined symbol removes a previously set value.
      *
      * If a value is defined, it will be preferred over values derived from the current locale.
      *
      * Usually in the US the week starts on Sunday while in most European countries on Monday. There are special
      * cases where you want to have the first day of week set independent of the user locale.
      *
      * After changing the first day of week, the framework tries to update localization specific parts of the
      * UI. See the documentation of {@link sap.ui.core.Configuration#setLanguage} for details and restrictions.
      *
      * @returns Returns `this` to allow method chaining
      */
    def setFirstDayOfWeek(/**
      * must be an integer value between 0 and 6
      */
    iValue: int): this.type = js.native
    
    /**
      * Allows to specify the customizing data for Islamic calendar support
      *
      * @returns Returns `this` to allow method chaining
      */
    def setLegacyDateCalendarCustomizing(
      /**
      * contains the customizing data for the support of Islamic calendar.
      */
    aMappings: js.Array[LegacyDateCalendarCustomizing]
    ): this.type = js.native
    
    /**
      * Allows to specify one of the legacy ABAP date formats.
      *
      * This method modifies the date patterns for 'short' and 'medium' style with the corresponding ABAP format.
      * When called with a null or undefined format id, any previously applied format will be removed.
      *
      * After changing the legacy date format, the framework tries to update localization specific parts of the
      * UI. See the documentation of {@link sap.ui.core.Configuration#setLanguage} for details and restrictions.
      *
      * @returns Returns `this` to allow method chaining
      */
    def setLegacyDateFormat(): this.type = js.native
    def setLegacyDateFormat(
      /**
      * ID of the ABAP date format, `""` will reset the date patterns for 'short' and 'medium' style to the locale-specific
      * ones.
      */
    sFormatId: _empty | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | A | B | C
    ): this.type = js.native
    
    /**
      * Allows to specify one of the legacy ABAP number format.
      *
      * This method will modify the 'group' and 'decimal' symbols. When called with a null or undefined format
      * id, any previously applied format will be removed.
      *
      * After changing the legacy number format, the framework tries to update localization specific parts of
      * the UI. See the documentation of {@link sap.ui.core.Configuration#setLanguage} for details and restrictions.
      *
      * @returns Returns `this` to allow method chaining
      */
    def setLegacyNumberFormat(): this.type = js.native
    def setLegacyNumberFormat(
      /**
      * ID of the ABAP number format set, `""` will reset the 'group' and 'decimal' symbols to the locale-specific
      * ones.
      */
    sFormatId: _empty | Space | X | Y
    ): this.type = js.native
    
    /**
      * Allows to specify one of the legacy ABAP time formats.
      *
      * This method sets the time patterns for 'short' and 'medium' style to the corresponding ABAP formats and
      * sets the day period texts to "AM"/"PM" or "am"/"pm" respectively. When called with a null or undefined
      * format id, any previously applied format will be removed.
      *
      * After changing the legacy time format, the framework tries to update localization specific parts of the
      * UI. See the documentation of {@link sap.ui.core.Configuration#setLanguage} for details and restrictions.
      *
      * @returns Returns `this` to allow method chaining
      */
    def setLegacyTimeFormat(): this.type = js.native
    def setLegacyTimeFormat(
      /**
      * ID of the ABAP time format, `""` will reset the time patterns for 'short' and 'medium' style and the
      * day period texts to the locale-specific ones.
      */
    sFormatId: _empty | `0` | `1` | `2` | `3` | `4`
    ): this.type = js.native
    
    /**
      * Defines the string to be used for the given number symbol.
      *
      * Calling this method with a null or undefined symbol removes a previously set symbol string. Note that
      * an empty string is explicitly allowed.
      *
      * If a symbol is defined, it will be preferred over symbols derived from the current locale.
      *
      * See class {@link sap.ui.core.format.NumberFormat} for details about the symbols.
      *
      * After changing the number symbol, the framework tries to update localization specific parts of the UI.
      * See the documentation of {@link sap.ui.core.Configuration#setLanguage} for details and restrictions.
      *
      * @returns Returns `this` to allow method chaining
      */
    def setNumberSymbol(
      /**
      * the type of symbol
      */
    sType: group | decimal | plusSign | minusSign,
      /**
      * will be used to represent the given symbol type
      */
    sSymbol: String
    ): this.type = js.native
    
    /**
      * Defines the preferred format pattern for the given time format style.
      *
      * Calling this method with a null or undefined pattern removes a previously set pattern.
      *
      * If a pattern is defined, it will be preferred over patterns derived from the current locale.
      *
      * See class {@link sap.ui.core.format.DateFormat} for details about the pattern syntax.
      *
      * After changing the time pattern, the framework tries to update localization specific parts of the UI.
      * See the documentation of {@link sap.ui.core.Configuration#setLanguage} for details and restrictions.
      *
      * @returns Returns `this` to allow method chaining
      */
    def setTimePattern(
      /**
      * must be one of short, medium, long or full.
      */
    sStyle: String,
      /**
      * the format pattern to be used in LDML syntax.
      */
    sPattern: String
    ): this.type = js.native
    
    /**
      * @since 1.75.0
      *
      * Define whether the NumberFormatter shall always place the currency code after the numeric value, with
      * the only exception of right-to-left locales, where the currency code shall be placed before the numeric
      * value. Default configuration setting is `true`.
      *
      * When set to `false` the placement of the currency code is done dynamically, depending on the configured
      * locale using data provided by the Unicode Common Locale Data Repository (CLDR).
      *
      * Each currency instance ({@link sap.ui.core.format.NumberFormat.getCurrencyInstance}) will be created
      * with this setting unless overwritten on instance level.
      *
      * @returns Returns `this` to allow method chaining
      */
    def setTrailingCurrencyCode(
      /**
      * Whether currency codes shall always be placed after the numeric value
      */
    bTrailingCurrencyCode: Boolean
    ): this.type = js.native
  }
  /* static members */
  object FormatSettings {
    
    @JSImport("sap/ui/core/Configuration", "FormatSettings")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.Configuration.FormatSettings with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, FormatSettings]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FormatSettings],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.Configuration.FormatSettings.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  /**
    * Collects and stores the configuration of the current environment.
    *
    * The Configuration is initialized once when the {@link sap.ui.core.Core} is created. There are different
    * ways to set the environment configuration (in ascending priority):
    * 	 - System defined defaults
    * 	 - Server wide defaults, read from /sap-ui-config.json
    * 	 - Properties of the global configuration object window["sap-ui-config"]
    * 	 - A configuration string in the data-sap-ui-config attribute of the bootstrap tag.
    * 	 - Individual data-sap-ui-xyz attributes of the bootstrap tag
    * 	 - Using URL parameters
    * 	 - Setters in this Configuration object (only for some parameters)
    *
    * That is, attributes of the DOM reference override the system defaults, URL parameters override the DOM
    * attributes (where empty URL parameters set the parameter back to its system default). Calling setters
    * at runtime will override any previous settings calculated during object creation.
    *
    * The naming convention for parameters is:
    * 	 - in the URL : sap-ui-PARAMETER-NAME="value"
    * 	 - in the DOM : data-sap-ui-PARAMETER-NAME="value"  where PARAMETER-NAME is the name
    *     of the parameter in lower case.
    *
    * Values of boolean parameters are case insensitive where "true" and "x" are interpreted as true.
    */
  @js.native
  trait Configuration extends StObject {
    
    /**
      * @since 1.50.0
      *
      * Enumerable list with available animation modes.
      *
      * This enumerable is used to validate the animation mode. Animation modes allow to specify different animation
      * scenarios or levels. The implementation of the Control (JavaScript or CSS) has to be done differently
      * for each animation mode.
      */
    var AnimationMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AnimationMode */ Any = js.native
    
    /**
      * @since 1.38.6
      *
      * Applies multiple changes to the configuration at once.
      *
      * If the changed settings contain localization related settings like `language` or calendarType,
      * then only a single `localizationChanged` event will be fired. As the framework has to inform all existing
      * components, elements, models etc. about localization changes, using `applySettings` can significantly
      * reduce the overhead for multiple changes, esp. when they occur after the UI has been created already.
      *
      * The `mSettings` can contain any property `xyz` for which a setter method `setXYZ` exists
      * in the API of this class. Similarly, values for the {@link sap.ui.core.Configuration.FormatSettings format settings }
      * API can be provided in a nested object with name `formatSettings`.
      *
      * @returns Returns `this` to allow method chaining
      */
    def applySettings(/**
      * Configuration options to apply
      */
    mSettings: js.Object): this.type = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.Configuration with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.Object.extend}.
      *
      * @returns Created class / constructor function
      */
    def extend(/**
      * Name of the class being created
      */
    sClassName: String): js.Function = js.native
    def extend(
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: js.Object
    ): js.Function = js.native
    def extend(
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: js.Object,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = js.native
    def extend(
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
    ): js.Function = js.native
    
    /**
      * Returns whether the accessibility mode is used or not.
      *
      * @returns whether the accessibility mode is used or not
      */
    def getAccessibility(): Boolean = js.native
    
    /**
      * @since 1.77.0
      *
      * Returns the list of active terminologies defined via the Configuration.
      *
      * @returns if no active terminologies are set, the default value `undefined` is returned.
      */
    def getActiveTerminologies(): js.UndefOr[js.Array[String]] = js.native
    
    /**
      * URL of the allowlist service.
      *
      * @returns allowlist service URL
      */
    def getAllowlistService(): String = js.native
    
    /**
      * @deprecated (since 1.50.0) - replaced by {@link sap.ui.core.Configuration#getAnimationMode}
      *
      * Returns whether the animations are globally used.
      *
      * @returns whether the animations are globally used
      */
    def getAnimation(): Boolean = js.native
    
    /**
      * @since 1.50.0
      *
      * Returns the current animation mode.
      *
      * @returns The current animationMode
      */
    def getAnimationMode(): AnimationMode = js.native
    
    /**
      * Base URLs to AppCacheBuster ETag-Index files.
      *
      * @returns array of base URLs
      */
    def getAppCacheBuster(): js.Array[String] = js.native
    
    /**
      * The loading mode (sync|async|batch) of the AppCacheBuster (sync is default)
      *
      * @returns "sync" | "async"
      */
    def getAppCacheBusterMode(): String = js.native
    
    /**
      * @deprecated (since 1.15.1) - Please use {@link module:sap/ui/core/ComponentSupport} instead. See also
      * {@link topic:82a0fcecc3cb427c91469bc537ebdddf Declarative API for Initial Components}.
      *
      * The name of the application to start or empty.
      *
      * @returns name of the application
      */
    def getApplication(): String = js.native
    
    /**
      * @since 1.27.0
      *
      * Returns whether the framework automatically adds the ARIA role 'application' to the HTML body or not.
      */
    def getAutoAriaBodyRole(): Boolean = js.native
    
    /**
      * @since 1.113.0
      *
      * Returns the calendar week numbering algorithm used to determine the first day of the week and the first
      * calendar week of the year, see {@link sap.ui.core.date.CalendarWeekNumbering}.
      *
      * @returns The calendar week numbering algorithm
      */
    def getCalendarWeekNumbering(): CalendarWeekNumbering | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarWeekNumbering * / any */ String) = js.native
    
    /**
      * Returns the used compatibility version for the given feature.
      *
      * @returns the used compatibility version
      */
    def getCompatibilityVersion(/**
      * the key of desired feature
      */
    sFeature: String): typings.openui5.sapBaseUtilVersionMod.default = js.native
    
    /**
      * Returns whether the page runs in full debug mode.
      *
      * @returns Whether the page runs in full debug mode
      */
    def getDebug(): Boolean = js.native
    
    /**
      * @since 1.102
      *
      * Name (ID) of a UI5 module that implements file share support.
      *
      * If no implementation is known, `undefined` is returned.
      *
      * The contract of the module is not defined by the configuration API.
      *
      * @returns Module name (ID) of a file share support module
      */
    def getFileShareSupport(): js.UndefOr[String] = js.native
    
    /**
      * Returns whether the Fiori2Adaptation is on.
      *
      * @returns false - no adaptation, true - full adaptation, comma-separated list - partial adaptation Possible
      * values: style, collapse, title, back, hierarchy
      */
    def getFiori2Adaptation(): Boolean | String = js.native
    
    /**
      * @since 1.60.0
      *
      * Returns the URL from where the UI5 flexibility services are called; if empty, the flexibility services
      * are not called.
      *
      * @returns Flexibility services configuration
      */
    def getFlexibilityServices(): js.Array[js.Object] = js.native
    
    /**
      * Returns the format locale string with language and region code. Falls back to language configuration,
      * in case it has not been explicitly defined.
      *
      * @returns the format locale string with language and country code
      */
    def getFormatLocale(): String = js.native
    
    /**
      * Returns a configuration object that bundles the format settings of UI5.
      *
      * @returns A FormatSettings object.
      */
    def getFormatSettings(): FormatSettings = js.native
    
    /**
      * frameOptions mode (allow/deny/trusted).
      *
      * @returns frameOptions mode
      */
    def getFrameOptions(): String = js.native
    
    /**
      * Returns whether the UI5 control inspe ctor is displayed. Has only an effect when the sap-ui-debug module
      * has been loaded
      *
      * @returns whether the UI5 control inspector is displayed
      */
    def getInspect(): Boolean = js.native
    
    /**
      * Returns a string that identifies the current language.
      *
      * The value returned by this method in most cases corresponds to the exact value that has been configured
      * by the user or application or that has been determined from the user agent settings. It has not been
      * normalized, but has been validated against a relaxed version of {@link http://www.ietf.org/rfc/bcp/bcp47.txt BCP47},
      * allowing underscores ('_') instead of the suggested dashes ('-') and not taking the case of letters into
      * account.
      *
      * The exceptions mentioned above affect languages that have been specified via the URL parameter `sap-language`.
      * That parameter by definition represents an SAP logon language code ('ABAP language'). Most but not all
      * of these language codes are valid ISO639 two-letter languages and as such are valid BCP47 language tags.
      * For better BCP47 compliance, the framework maps the following non-BCP47 SAP logon codes to a BCP47 substitute:
      *
      * ```javascript
      *
      *    "ZH"  -->  "zh-Hans"         // script 'Hans' added to distinguish it from zh-Hant
      *    "ZF"  -->  "zh-Hant"         // ZF is not a valid ISO639 code, use the compliant language + script 'Hant'
      *    "1Q"  -->  "en-US-x-saptrc"  // special language code for supportability (tracing),
      *                                    represented as en-US with a private extension
      *    "2Q"  -->  "en-US-x-sappsd"  // special language code for supportability (pseudo translation),
      *                                    represented as en-US with a private extension
      *    "3Q"  -->  "en-US-x-saprigi" // special language code for the Rigi pseudo language,
      *                                    represented as en-US with a private extension
      * ```
      *
      *
      * For a normalized BCP47 tag, call {@link #getLanguageTag} or call {@link #getLocale} to get a {@link sap.ui.core.Locale Locale }
      * object matching the language.
      *
      * @returns Language string as configured
      */
    def getLanguage(): String = js.native
    
    /**
      * Returns a BCP47-compliant language tag for the current language.
      *
      * The return value of this method is especially useful for an HTTP `Accept-Language` header.
      *
      * Retrieves the modern locale, e.g. sr-Latn (Serbian (Cyrillic)), he (Hebrew), yi (Yiddish)
      *
      * @returns The language tag for the current language, conforming to BCP47
      */
    def getLanguageTag(): String = js.native
    
    /**
      * Returns a Locale object for the current language.
      *
      * The Locale is derived from the {@link #getLanguage language} property.
      *
      * @returns The locale
      */
    def getLocale(): typings.openui5.sapUiCoreLocaleMod.default = js.native
    
    /**
      * @since 1.33.0
      *
      * Flag whether a Component should load the manifest first.
      *
      * @returns true if a Component should load the manifest first
      */
    def getManifestFirst(): Boolean = js.native
    
    /**
      * Returns a metadata object for class sap.ui.core.Configuration.
      *
      * @returns Metadata object describing this class
      */
    def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = js.native
    
    /**
      * Returns whether there should be an exception on any duplicate element IDs.
      *
      * @returns whether there should be an exception on any duplicate element IDs
      */
    def getNoDuplicateIds(): Boolean = js.native
    
    /**
      * Returns whether the text origin information is collected.
      *
      * @returns whether the text info is collected
      */
    def getOriginInfo(): Boolean = js.native
    
    /**
      * Returns whether the page uses the RTL text direction.
      *
      * If no mode has been explicitly set (neither `true` nor `false`), the mode is derived from the current
      * language setting.
      *
      * @returns whether the page uses the RTL text direction
      */
    def getRTL(): Boolean = js.native
    
    /**
      * @deprecated (since 1.95) - Please use {@link module:sap/ui/core/ComponentSupport} instead. See also {@link topic:82a0fcecc3cb427c91469bc537ebdddf Declarative API for Initial Components}.
      *
      * The name of the root component to start or empty.
      *
      * @returns name of the root component
      */
    def getRootComponent(): String = js.native
    
    /**
      * Returns an SAP logon language for the current language.
      *
      * It will be returned in uppercase. e.g. "EN", "DE"
      *
      * @returns The SAP logon language code for the current language
      */
    def getSAPLogonLanguage(): String = js.native
    
    /**
      * @since 1.95.0
      *
      * Returns the security token handlers of an OData V4 model.
      * See:
      * 	#setSecurityTokenHandlers
      *
      * @returns the security token handlers (an empty array if there are none)
      */
    def getSecurityTokenHandlers(): js.Array[js.Function1[/* p1 */ URI, js.Promise[Any]]] = js.native
    
    /**
      * @since 1.106.0
      *
      * Flag if statistics are requested.
      *
      * Flag set by TechnicalInfo Popup will also be checked. So its active if set by URL parameter or manually
      * via TechnicalInfo.
      *
      * @returns Whether statistics are enabled
      */
    def getStatisticsEnabled(): Boolean = js.native
    
    /**
      * Returns the theme name
      *
      * @returns the theme name
      */
    def getTheme(): String = js.native
    
    /**
      * @since 1.99.0
      *
      * Retrieves the configured IANA timezone ID.
      *
      * @returns The configured IANA timezone ID, e.g. "America/New_York"
      */
    def getTimezone(): String = js.native
    
    /**
      * Prefix to be used for automatically generated control IDs. Default is a double underscore "__".
      *
      * @returns the prefix to be used
      */
    def getUIDPrefix(): String = js.native
    
    /**
      * Returns the version of the framework.
      *
      * Similar to `sap.ui.version`.
      *
      * @returns the version
      */
    def getVersion(): typings.openui5.sapBaseUtilVersionMod.default = js.native
    
    /**
      * @deprecated (since 1.85.0) - Use {@link sap.ui.core.Configuration#getAllowlistService} instead. SAP strives
      * to replace insensitive terms with inclusive language. Since APIs cannot be renamed or immediately removed
      * for compatibility reasons, this API has been deprecated.
      *
      * URL of the whitelist service.
      *
      * @returns whitelist service URL
      */
    def getWhitelistService(): String = js.native
    
    /**
      * @since 1.50.0
      *
      * Sets the current animation mode.
      *
      * Expects an animation mode as string and validates it. If a wrong animation mode was set, an error is
      * thrown. If the mode is valid it is set, then the attributes `data-sap-ui-animation` and `data-sap-ui-animation-mode`
      * of the HTML document root element are also updated. If the `animationMode` is `Configuration.AnimationMode.none`
      * the old `animation` property is set to `false`, otherwise it is set to `true`.
      */
    def setAnimationMode(/**
      * A valid animation mode
      */
    sAnimationMode: AnimationMode): Unit = js.native
    
    /**
      * @since 1.28.6
      *
      * Sets the new calendar type to be used from now on in locale dependent functionality (for example, formatting,
      * translation texts, etc.).
      *
      * @returns `this` to allow method chaining
      */
    def setCalendarType(): this.type = js.native
    def setCalendarType(
      /**
      * the new calendar type. Set it with null to clear the calendar type and the calendar type is calculated
      * based on the format settings and current locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): this.type = js.native
    def setCalendarType(
      /**
      * the new calendar type. Set it with null to clear the calendar type and the calendar type is calculated
      * based on the format settings and current locale.
      */
    sCalendarType: CalendarType
    ): this.type = js.native
    
    def setCalendarWeekNumbering(
      /**
      * The calendar week numbering algorithm
      */
    sCalendarWeekNumbering: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarWeekNumbering * / any */ String
    ): this.type = js.native
    /**
      * @since 1.113.0
      *
      * Sets the calendar week numbering algorithm which is used to determine the first day of the week and the
      * first calendar week of the year, see {@link sap.ui.core.date.CalendarWeekNumbering}.
      *
      * @returns `this` to allow method chaining
      */
    def setCalendarWeekNumbering(/**
      * The calendar week numbering algorithm
      */
    sCalendarWeekNumbering: CalendarWeekNumbering): this.type = js.native
    
    /**
      * Sets a new format locale to be used from now on for retrieving locale specific formatters. Modifying
      * this setting does not have an impact on the retrieval of translated texts!
      *
      * Can either be set to a concrete value (a BCP47 or Java locale compliant language tag) or to `null`. When
      * set to `null` (default value) then locale specific formatters are retrieved for the current language.
      *
      * After changing the format locale, the framework tries to update localization specific parts of the UI.
      * See the documentation of {@link #setLanguage} for details and restrictions.
      *
      * **Note**: When a format locale is set, it has higher priority than a number, date or time format defined
      * with a call to `setLegacyNumberFormat`, `setLegacyDateFormat` or `setLegacyTimeFormat`.
      *
      * **Note**: See documentation of {@link #setLanguage} for restrictions.
      *
      * @returns `this` to allow method chaining
      */
    def setFormatLocale(): this.type = js.native
    def setFormatLocale(
      /**
      * the new format locale as a BCP47 compliant language tag; case doesn't matter and underscores can be used
      * instead of dashes to separate components (compatibility with Java Locale IDs)
      */
    sFormatLocale: String
    ): this.type = js.native
    
    /**
      * Sets a new language to be used from now on for language/region dependent functionality (e.g. formatting,
      * data types, translated texts, ...).
      *
      * When the language can't be interpreted as a BCP47 language (using the relaxed syntax described in {@link #getLanguage},
      * an error will be thrown.
      *
      * When the language has changed, the Core will fire its {@link sap.ui.core.Core#event:localizationChanged localizationChanged }
      * event.
      *
      * Restrictions:
      *
      * The framework **does not** guarantee that already created, language dependent objects will be updated
      * by this call. It therefore remains best practice for applications to switch the language early, e.g.
      * before any language dependent objects are created. Applications that need to support more dynamic changes
      * of the language should listen to the `localizationChanged` event and adapt all language dependent objects
      * that they use (e.g. by rebuilding their UI).
      *
      * Currently, the framework notifies the following objects about a change of the localization settings before
      * it fires the `localizationChanged` event:
      *
      *
      * 	 - date and number data types that are used in property bindings or composite bindings in existing Elements,
      *     Controls, UIAreas or Components
      * 	 - ResourceModels currently assigned to the Core, a UIArea, Component, Element or Control
      * 	 - Elements or Controls that implement the `onlocalizationChanged` hook (note the lowercase 'l' in onlocalizationChanged)
      *
      *
      * It furthermore derives the RTL mode from the new language, if no explicit RTL mode has been set. If the
      * RTL mode changes, the following additional actions will be taken:
      *
      *
      * 	 - the URLs of already loaded library theme files will be changed
      * 	 - the `dir` attribute of the page will be changed to reflect the new mode.
      * 	 - all UIAreas will be invalidated (which results in a rendering of the whole UI5 UI)
      *
      * This method does not accept SAP language codes for `sLanguage`. Instead, a second parameter `sSAPLogonLanguage`
      * can be provided with an SAP language code corresponding to the given language. A given value will be
      * returned by the {@link #getSAPLogonLanguage} method. It is up to the caller to provide a consistent pair
      * of BCP47 language and SAP language code. The SAP language code is only checked to be of length 2 and
      * must consist of letters or digits only.
      *
      * **Note**: When using this method please take note of and respect the above mentioned restrictions.
      * See:
      * 	http://scn.sap.com/docs/DOC-14377
      *
      * @returns `this` to allow method chaining
      */
    def setLanguage(
      /**
      * the new language as a BCP47 compliant language tag; case doesn't matter and underscores can be used instead
      * of dashes to separate components (compatibility with Java Locale IDs)
      */
    sLanguage: String
    ): this.type = js.native
    def setLanguage(
      /**
      * the new language as a BCP47 compliant language tag; case doesn't matter and underscores can be used instead
      * of dashes to separate components (compatibility with Java Locale IDs)
      */
    sLanguage: String,
      /**
      * SAP language code that corresponds to the `sLanguage`; if a value is specified, future calls to `getSAPLogonLanguage`
      * will return that value; if no value is specified, the framework will use the ISO639 language part of
      * `sLanguage` as SAP Logon language.
      */
    sSAPLogonLanguage: String
    ): this.type = js.native
    
    /**
      * Sets the character orientation mode to be used from now on.
      *
      * Can either be set to a concrete value (true meaning right-to-left, false meaning left-to-right) or to
      * `null` which means that the character orientation mode should be derived from the current language (incl.
      * region) setting.
      *
      * After changing the character orientation mode, the framework tries to update localization specific parts
      * of the UI. See the documentation of {@link #setLanguage} for details and restrictions.
      *
      * **Note**: See documentation of {@link #setLanguage} for restrictions.
      *
      * @returns `this` to allow method chaining
      */
    def setRTL(): this.type = js.native
    def setRTL(/**
      * new character orientation mode or `null`
      */
    bRTL: Boolean): this.type = js.native
    
    /**
      * @since 1.95.0
      *
      * Sets the security token handlers for an OData V4 model. See chapter {@link https://ui5.sap.com/#/topic/9613f1f2d88747cab21896f7216afdac/section_STH Security Token Handling}.
      * See:
      * 	#getSecurityTokenHandlers
      */
    def setSecurityTokenHandlers(
      /**
      * The security token handlers
      */
    aSecurityTokenHandlers: js.Array[js.Function1[/* p1 */ URI, js.Promise[Any]]]
    ): Unit = js.native
    
    /**
      * @since 1.99.0
      *
      * Sets the timezone such that all date and time based calculations use this timezone.
      *
      * **Important:** It is strongly recommended to only use this API at the earliest point of time while initializing
      * a UI5 app. A later adjustment of the time zone should be avoided. It can lead to unexpected data inconsistencies
      * in a running application, because date objects could still be related to a previously configured time
      * zone. Instead, the app should be completely restarted with the new time zone. For more information, see
      * {@link https://ui5.sap.com/#/topic/6c9e61dc157a40c19460660ece8368bc Dates, Times, Timestamps, and Time Zones}.
      *
      * When the timezone has changed, the Core will fire its {@link sap.ui.core.Core#event:localizationChanged localizationChanged }
      * event.
      *
      * @returns `this` to allow method chaining
      */
    def setTimezone(): this.type = js.native
    def setTimezone(
      /**
      * IANA timezone ID, e.g. "America/New_York". Use `null` to reset the timezone to the browser's local timezone.
      * An invalid IANA timezone ID will fall back to the browser's timezone.
      */
    sTimezone: String
    ): this.type = js.native
  }
  
  trait LegacyDateCalendarCustomizing extends StObject {
    
    /**
      * The IO of the date format. It has value "A" or "B".
      */
    var dateFormat: A | B
    
    /**
      * The corresponding Gregorian date in format "yyyyMMdd".
      */
    var gregDate: String
    
    /**
      * The Islamic date in format "yyyyMMdd".
      */
    var islamicMonthStart: String
  }
  object LegacyDateCalendarCustomizing {
    
    inline def apply(dateFormat: A | B, gregDate: String, islamicMonthStart: String): LegacyDateCalendarCustomizing = {
      val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], gregDate = gregDate.asInstanceOf[js.Any], islamicMonthStart = islamicMonthStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegacyDateCalendarCustomizing]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegacyDateCalendarCustomizing] (val x: Self) extends AnyVal {
      
      inline def setDateFormat(value: A | B): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setGregDate(value: String): Self = StObject.set(x, "gregDate", value.asInstanceOf[js.Any])
      
      inline def setIslamicMonthStart(value: String): Self = StObject.set(x, "islamicMonthStart", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Configuration
  
  /* This means you don't have to write `default`, but can instead just say `sapUiCoreConfigurationMod.foo` */
  override def _to: Configuration = default
}
