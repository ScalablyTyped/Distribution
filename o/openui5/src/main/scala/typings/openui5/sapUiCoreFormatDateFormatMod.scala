package typings.openui5

import typings.openui5.anon.CalendarType
import typings.openui5.anon.FirstDayOfWeek
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreFormatDateFormatMod {
  
  @JSImport("sap/ui/core/format/DateFormat", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with DateFormat
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/format/DateFormat", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get a date instance of the DateFormat, which can be used for formatting.
      *
      * @returns date instance of the DateFormat
      */
    inline def getDateInstance(): DateFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getDateInstance")().asInstanceOf[DateFormat]
    inline def getDateInstance(
      /**
      * Object which defines the format options
      */
    oFormatOptions: Unit,
      /**
      * Locale to ask for locale specific texts/settings
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): DateFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[DateFormat]
    inline def getDateInstance(/**
      * Object which defines the format options
      */
    oFormatOptions: CalendarType): DateFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getDateInstance")(oFormatOptions.asInstanceOf[js.Any]).asInstanceOf[DateFormat]
    inline def getDateInstance(
      /**
      * Object which defines the format options
      */
    oFormatOptions: CalendarType,
      /**
      * Locale to ask for locale specific texts/settings
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): DateFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[DateFormat]
    
    /**
      * Get a datetime instance of the DateFormat, which can be used for formatting.
      *
      * @returns datetime instance of the DateFormat
      */
    inline def getDateTimeInstance(): DateFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getDateTimeInstance")().asInstanceOf[DateFormat]
    inline def getDateTimeInstance(
      /**
      * Object which defines the format options
      */
    oFormatOptions: Unit,
      /**
      * Locale to ask for locale specific texts/settings
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): DateFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateTimeInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[DateFormat]
    inline def getDateTimeInstance(/**
      * Object which defines the format options
      */
    oFormatOptions: CalendarType): DateFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getDateTimeInstance")(oFormatOptions.asInstanceOf[js.Any]).asInstanceOf[DateFormat]
    inline def getDateTimeInstance(
      /**
      * Object which defines the format options
      */
    oFormatOptions: CalendarType,
      /**
      * Locale to ask for locale specific texts/settings
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): DateFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateTimeInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[DateFormat]
    
    /**
      * @SINCE 1.99.0
      *
      * Get a datetimeWithTimezone instance of the DateFormat, which can be used for formatting.
      *
      * @returns dateTimeWithTimezone instance of the DateFormat
      */
    inline def getDateTimeWithTimezoneInstance(): DateTimeWithTimezone = ^.asInstanceOf[js.Dynamic].applyDynamic("getDateTimeWithTimezoneInstance")().asInstanceOf[DateTimeWithTimezone]
    inline def getDateTimeWithTimezoneInstance(
      /**
      * An object which defines the format options
      */
    oFormatOptions: Unit,
      /**
      * Locale to ask for locale-specific texts/settings
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): DateTimeWithTimezone = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateTimeWithTimezoneInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[DateTimeWithTimezone]
    inline def getDateTimeWithTimezoneInstance(/**
      * An object which defines the format options
      */
    oFormatOptions: FirstDayOfWeek): DateTimeWithTimezone = ^.asInstanceOf[js.Dynamic].applyDynamic("getDateTimeWithTimezoneInstance")(oFormatOptions.asInstanceOf[js.Any]).asInstanceOf[DateTimeWithTimezone]
    inline def getDateTimeWithTimezoneInstance(
      /**
      * An object which defines the format options
      */
    oFormatOptions: FirstDayOfWeek,
      /**
      * Locale to ask for locale-specific texts/settings
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): DateTimeWithTimezone = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateTimeWithTimezoneInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[DateTimeWithTimezone]
    
    /**
      * Get a time instance of the DateFormat, which can be used for formatting.
      *
      * @returns time instance of the DateFormat
      */
    inline def getTimeInstance(): DateFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeInstance")().asInstanceOf[DateFormat]
    inline def getTimeInstance(
      /**
      * Object which defines the format options
      */
    oFormatOptions: Unit,
      /**
      * Locale to ask for locale specific texts/settings
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): DateFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[DateFormat]
    inline def getTimeInstance(/**
      * Object which defines the format options
      */
    oFormatOptions: CalendarType): DateFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeInstance")(oFormatOptions.asInstanceOf[js.Any]).asInstanceOf[DateFormat]
    inline def getTimeInstance(
      /**
      * Object which defines the format options
      */
    oFormatOptions: CalendarType,
      /**
      * Locale to ask for locale specific texts/settings
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): DateFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeInstance")(oFormatOptions.asInstanceOf[js.Any], oLocale.asInstanceOf[js.Any])).asInstanceOf[DateFormat]
  }
  
  @js.native
  trait DateFormat extends StObject {
    
    def format(/**
      * the value to format
      */
    vJSDate: js.Array[js.Date]): String = js.native
    def format(
      /**
      * the value to format
      */
    vJSDate: js.Array[js.Date],
      /**
      * whether to use UTC
      */
    bUTC: Boolean
    ): String = js.native
    /**
      * Format a date according to the given format options.
      *
      * Uses the timezone from {@link sap.ui.core.Configuration#getTimezone}, which falls back to the browser's
      * local timezone to convert the given date.
      *
      * When using instances from getDateTimeWithTimezoneInstance, please see the corresponding documentation:
      * {@link sap.ui.core.format.DateFormat.getDateTimeWithTimezoneInstance#format}.
      *
      * @returns the formatted output value. If an invalid date is given, an empty string is returned.
      */
    def format(/**
      * the value to format
      */
    vJSDate: js.Date): String = js.native
    def format(/**
      * the value to format
      */
    vJSDate: js.Date, /**
      * whether to use UTC
      */
    bUTC: Boolean): String = js.native
    
    /**
      * Parse a string which is formatted according to the given format options.
      *
      * Uses the timezone from {@link sap.ui.core.Configuration#getTimezone}, which falls back to the browser's
      * local timezone to convert the given date.
      *
      * When using instances from getDateTimeWithTimezoneInstance, please see the corresponding documentation:
      * {@link sap.ui.core.format.DateFormat.getDateTimeWithTimezoneInstance#parse}.
      *
      * @returns the parsed value(s)
      */
    def parse(
      /**
      * the string containing a formatted date/time value
      */
    sValue: String,
      /**
      * whether to use UTC
      */
    bUTC: Boolean,
      /**
      * whether to use strict value check
      */
    bStrict: Boolean
    ): js.Date | js.Array[js.Date] = js.native
  }
  
  @js.native
  trait DateTimeWithTimezone extends StObject {
    
    var __implements__sap_ui_core_format_DateFormat_DateTimeWithTimezone: Boolean = js.native
    
    /**
      * @SINCE 1.99
      *
      * Format a date object to a string according to the given timezone and format options.
      *
      * @returns the formatted output value. If an invalid date or timezone is given, an empty string is returned.
      */
    def format(/**
      * The date to format
      */
    oJSDate: js.Date): String = js.native
    def format(
      /**
      * The date to format
      */
    oJSDate: js.Date,
      /**
      * The IANA timezone ID in which the date will be calculated and formatted e.g. "America/New_York". If the
      * parameter is omitted, `null` or an empty string, the timezone will be taken from {@link sap.ui.core.Configuration#getTimezone}.
      * For an invalid IANA timezone ID, an empty string will be returned.
      */
    sTimezone: String
    ): String = js.native
    
    /**
      * @SINCE 1.99
      *
      * Parse a string which is formatted according to the given format options to an array containing a date
      * object and the timezone.
      *
      * @returns the parsed values
      * 	 - An array containing datetime and timezone depending on the showDate, showTime and showTimezone options
      *
      * 	(Default): [Date, string], e.g. [new Date("2021-11-13T13:22:33Z"), "America/New_York"]
      * 	 - `showTimezone: false`: [Date, undefined], e.g. [new Date("2021-11-13T13:22:33Z"), undefined]
      * 	 - `showDate: false, showTime: false`: [undefined, string], e.g. [undefined, "America/New_York"]
      */
    def parse(/**
      * the string containing a formatted date/time value
      */
    sValue: String): js.Array[Any] = js.native
    def parse(
      /**
      * the string containing a formatted date/time value
      */
    sValue: String,
      /**
      * The IANA timezone ID which should be used to convert the date e.g. "America/New_York". If the parameter
      * is omitted, `null` or an empty string, the timezone will be taken from {@link sap.ui.core.Configuration#getTimezone}.
      * For an invalid IANA timezone ID, `null` will be returned.
      */
    sTimezone: String
    ): js.Array[Any] = js.native
    def parse(
      /**
      * the string containing a formatted date/time value
      */
    sValue: String,
      /**
      * The IANA timezone ID which should be used to convert the date e.g. "America/New_York". If the parameter
      * is omitted, `null` or an empty string, the timezone will be taken from {@link sap.ui.core.Configuration#getTimezone}.
      * For an invalid IANA timezone ID, `null` will be returned.
      */
    sTimezone: String,
      /**
      * Whether to be strict with regards to the value ranges of date fields, e.g. for a month pattern of `MM`
      * and a value range of [1-12] `strict` ensures that the value is within the range; if it is larger than
      * `12` it cannot be parsed and `null` is returned
      */
    bStrict: Boolean
    ): js.Array[Any] = js.native
    def parse(
      /**
      * the string containing a formatted date/time value
      */
    sValue: String,
      /**
      * The IANA timezone ID which should be used to convert the date e.g. "America/New_York". If the parameter
      * is omitted, `null` or an empty string, the timezone will be taken from {@link sap.ui.core.Configuration#getTimezone}.
      * For an invalid IANA timezone ID, `null` will be returned.
      */
    sTimezone: Unit,
      /**
      * Whether to be strict with regards to the value ranges of date fields, e.g. for a month pattern of `MM`
      * and a value range of [1-12] `strict` ensures that the value is within the range; if it is larger than
      * `12` it cannot be parsed and `null` is returned
      */
    bStrict: Boolean
    ): js.Array[Any] = js.native
  }
}
