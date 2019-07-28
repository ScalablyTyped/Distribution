package typings.openui5.sapNs.uiNs.coreNs.formatNs

import typings.openui5.sapNs.uiNs.coreNs.Locale
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.format.DateFormat")
@js.native
/**
  * Constructor for DateFormat - must not be used: To get a DateFormat instance, please use getInstance,
  * getDateTimeInstance or getTimeInstance.
  */
class DateFormat () extends js.Object {
  /**
    * Format a date according to the given format options.
    * @param oDate the value to format
    * @param bUTC whether to use UTC
    * @returns the formatted output value. If an invalid date is given, an empty string is returned.
    */
  def format(oDate: Date, bUTC: Boolean): String = js.native
  /**
    * Get a date instance of the DateFormat, which can be used for formatting.
    * @param oFormatOptions Object which defines the format options
    * @param oLocale Locale to ask for locale specific texts/settings
    * @returns date instance of the DateFormat
    */
  def getDateInstance(oFormatOptions: js.Any): DateFormat = js.native
  def getDateInstance(oFormatOptions: js.Any, oLocale: Locale): DateFormat = js.native
  /**
    * Get a datetime instance of the DateFormat, which can be used for formatting.
    * @param oFormatOptions Object which defines the format options
    * @param oLocale Locale to ask for locale specific texts/settings
    * @returns datetime instance of the DateFormat
    */
  def getDateTimeInstance(oFormatOptions: js.Any): DateFormat = js.native
  def getDateTimeInstance(oFormatOptions: js.Any, oLocale: Locale): DateFormat = js.native
  /**
    * Get a time instance of the DateFormat, which can be used for formatting.
    * @param oFormatOptions Object which defines the format options
    * @param oLocale Locale to ask for locale specific texts/settings
    * @returns time instance of the DateFormat
    */
  def getTimeInstance(oFormatOptions: js.Any): DateFormat = js.native
  def getTimeInstance(oFormatOptions: js.Any, oLocale: Locale): DateFormat = js.native
  /**
    * Parse a string which is formatted according to the given format options.
    * @param sValue the string containing a formatted date/time value
    * @param bUTC whether to use UTC, if no timezone is contained
    * @param bStrict to use strict value check
    * @returns the parsed value
    */
  def parse(sValue: String, bUTC: Boolean, bStrict: Boolean): Date = js.native
}

