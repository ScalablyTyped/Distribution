package typings.openui5.sapNs.uiNs.coreNs.ConfigurationNs

import typings.openui5.sapNs.uiNs.baseNs.Object
import typings.openui5.sapNs.uiNs.coreNs.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.Configuration.FormatSettings")
@js.native
class FormatSettings () extends Object {
  /**
    * Returns the currently set date pattern or undefined if no pattern has been defined.
    */
  def getDatePattern(): Unit = js.native
  /**
    * Returns the locale to be used for formatting.If no such locale has been defined, this method falls
    * back to the language,see {@link sap.ui.core.Configuration#getLanguage
    * Configuration.getLanguage()}.If any user preferences for date, time or number formatting have been
    * set,and if no format locale has been specified, then a special private use subtagis added to the
    * locale, indicating to the framework that these user preferencesshould be applied.
    * @returns the format locale
    */
  def getFormatLocale(): Locale = js.native
  /**
    * Returns the currently set customizing data for Islamic calendar support
    * @returns Returns an array contains the customizing data. Each element in the array has properties:
    * dateFormat, islamicMonthStart, gregDate. For details, please see {@link
    * #setLegacyDateCalendarCustomizing}
    */
  def getLegacyDateCalendarCustomizing(): js.Array[_] = js.native
  /**
    * Returns the currently set legacy ABAP date format (its id) or undefined if none has been set.
    */
  def getLegacyDateFormat(): Unit = js.native
  /**
    * Returns the currently set legacy ABAP number format (its id) or undefined if none has been set.
    */
  def getLegacyNumberFormat(): Unit = js.native
  /**
    * Returns the currently set legacy ABAP time format (its id) or undefined if none has been set.
    */
  def getLegacyTimeFormat(): Unit = js.native
  /**
    * Returns the currently set number symbol of the given type or undefined if no symbol has been
    * defined.
    */
  def getNumberSymbol(): Unit = js.native
  /**
    * Returns the currently set time pattern or undefined if no pattern has been defined.
    */
  def getTimePattern(): Unit = js.native
  /**
    * Defines the preferred format pattern for the given date format style.Calling this method with a null
    * or undefined pattern removes a previously set pattern.If a pattern is defined, it will be preferred
    * over patterns derived from the current locale.See class {@link sap.ui.core.format.DateFormat} for
    * details about the pattern syntax.After changing the date pattern, the framework tries to update
    * localizationspecific parts of the UI. See the documentation of {@link
    * sap.ui.core.Configuration#setLanguage}for details and restrictions.
    * @param sStyle must be one of short, medium, long or full.
    * @param sPattern the format pattern to be used in LDML syntax.
    * @returns Returns <code>this</code> to allow method chaining
    */
  def setDatePattern(sStyle: String, sPattern: String): FormatSettings = js.native
  /**
    * Defines the day used as the first day of the week.The day is set as an integer value between 0
    * (Sunday) and 6 (Saturday).Calling this method with a null or undefined symbol removes a previously
    * set value.If a value is defined, it will be preferred over values derived from the current
    * locale.Usually in the US the week starts on Sunday while in most European countries on Monday.There
    * are special cases where you want to have the first day of week set independent of theuser
    * locale.After changing the first day of week, the framework tries to update localizationspecific
    * parts of the UI. See the documentation of {@link sap.ui.core.Configuration#setLanguage}for details
    * and restrictions.
    * @param iValue must be an integer value between 0 and 6
    * @returns Returns <code>this</code> to allow method chaining
    */
  def setFirstDayOfWeek(iValue: Double): FormatSettings = js.native
  /**
    * Allows to specify the customizing data for Islamic calendar support
    * @param aMappings contains the customizing data for the support of Islamic calendar.
    * @returns Returns <code>this</code> to allow method chaining
    */
  def setLegacyDateCalendarCustomizing(aMappings: js.Array[_]): FormatSettings = js.native
  /**
    * Allows to specify one of the legacy ABAP date formats.This method modifies the date patterns for
    * 'short' and 'medium' style with the corresponding ABAPformat. When called with a null or undefined
    * format id, any previously applied format will be removed.After changing the legacy date format, the
    * framework tries to update localizationspecific parts of the UI. See the documentation of {@link
    * sap.ui.core.Configuration#setLanguage}for details and restrictions.Note: Iranian date format 'C' is
    * NOT yet supported by UI5. It's accepted by this method for convenience(user settings from ABAP
    * system can be used without filtering), but it's ignored. Instead, the formatsfrom the current format
    * locale will be used and a warning will be logged.
    * @param sFormatId id of the ABAP data format (one of '1','2','3','4','5','6','7','8','9','A','B','C')
    * @returns Returns <code>this</code> to allow method chaining
    */
  def setLegacyDateFormat(sFormatId: String): FormatSettings = js.native
  /**
    * Allows to specify one of the legacy ABAP number format.This method will modify the 'group' and
    * 'decimal' symbols. When called with a nullor undefined format id, any previously applied format will
    * be removed.After changing the legacy number format, the framework tries to update
    * localizationspecific parts of the UI. See the documentation of {@link
    * sap.ui.core.Configuration#setLanguage}for details and restrictions.
    * @param sFormatId id of the ABAP number format set (one of ' ','X','Y')
    * @returns Returns <code>this</code> to allow method chaining
    */
  def setLegacyNumberFormat(sFormatId: String): FormatSettings = js.native
  /**
    * Allows to specify one of the legacy ABAP time formats.This method sets the time patterns for 'short'
    * and 'medium' style to the corresponding ABAPformats and sets the day period texts to "AM"/"PM" or
    * "am"/"pm" respectively. When calledwith a null or undefined format id, any previously applied format
    * will be removed.After changing the legacy time format, the framework tries to update
    * localizationspecific parts of the UI. See the documentation of {@link
    * sap.ui.core.Configuration#setLanguage}for details and restrictions.
    * @param sFormatId id of the ABAP time format (one of '0','1','2','3','4')
    * @returns Returns <code>this</code> to allow method chaining
    */
  def setLegacyTimeFormat(sFormatId: String): FormatSettings = js.native
  /**
    * Defines the string to be used for the given number symbol.Calling this method with a null or
    * undefined symbol removes a previously set symbol string.Note that an empty string is explicitly
    * allowed.If a symbol is defined, it will be preferred over symbols derived from the current
    * locale.See class {@link sap.ui.core.format.NumberFormat} for details about the symbols.After
    * changing the number symbol, the framework tries to update localizationspecific parts of the UI. See
    * the documentation of {@link sap.ui.core.Configuration#setLanguage}for details and restrictions.
    * @param sStyle must be one of decimal, group, plusSign, minusSign.
    * @param sSymbol will be used to represent the given symbol type
    * @returns Returns <code>this</code> to allow method chaining
    */
  def setNumberSymbol(sStyle: String, sSymbol: String): FormatSettings = js.native
  /**
    * Defines the preferred format pattern for the given time format style.Calling this method with a null
    * or undefined pattern removes a previously set pattern.If a pattern is defined, it will be preferred
    * over patterns derived from the current locale.See class {@link sap.ui.core.format.DateFormat} for
    * details about the pattern syntax.After changing the time pattern, the framework tries to update
    * localizationspecific parts of the UI. See the documentation of {@link
    * sap.ui.core.Configuration#setLanguage}for details and restrictions.
    * @param sStyle must be one of short, medium, long or full.
    * @param sPattern the format pattern to be used in LDML syntax.
    * @returns Returns <code>this</code> to allow method chaining
    */
  def setTimePattern(sStyle: String, sPattern: String): FormatSettings = js.native
}

