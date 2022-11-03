package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.FirstDayOfWeek
import typings.openui5.sapUiCoreDateCalendarWeekNumberingMod.CalendarWeekNumbering
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreDateCalendarUtilsMod extends Shortcut {
  
  @JSImport("sap/ui/core/date/CalendarUtils", JSImport.Default)
  @js.native
  val default: CalendarUtils = js.native
  
  /**
    * @SINCE 1.108.0
    *
    * Provides calendar-related utilities.
    */
  @js.native
  trait CalendarUtils extends StObject {
    
    /**
      * @SINCE 1.108.0
      *
      * Resolves calendar week configuration.
      *
      * Returns an object with the following fields:
      * 	 - `firstDayOfWeek`: specifies the first day of the week starting with `0` (which is Sunday)
      * 	 - `minimalDaysInFirstWeek`: minimal days at the beginning of the year which define the first calendar
      * 			week
      *
      * @returns The calendar week configuration, or `undefined for an invalid value of sap.ui.core.date.CalendarWeekNumbering`.
      */
    def getWeekConfigurationValues(): js.UndefOr[FirstDayOfWeek] = js.native
    def getWeekConfigurationValues(
      /**
      * The calendar week numbering; if omitted, `Default` is used.
      */
    sCalendarWeekNumbering: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarWeekNumbering * / any */ String
    ): js.UndefOr[FirstDayOfWeek] = js.native
    def getWeekConfigurationValues(
      /**
      * The calendar week numbering; if omitted, `Default` is used.
      */
    sCalendarWeekNumbering: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarWeekNumbering * / any */ String,
      /**
      * The locale to use; if not provided, this falls back to the format locale from the Configuration; see
      * {@link sap.ui.core.Configuration.FormatSettings#getFormatLocale}. Is only used when `sCalendarWeekNumbering`
      * is set to `Default`.
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): js.UndefOr[FirstDayOfWeek] = js.native
    def getWeekConfigurationValues(
      /**
      * The calendar week numbering; if omitted, `Default` is used.
      */
    sCalendarWeekNumbering: Unit,
      /**
      * The locale to use; if not provided, this falls back to the format locale from the Configuration; see
      * {@link sap.ui.core.Configuration.FormatSettings#getFormatLocale}. Is only used when `sCalendarWeekNumbering`
      * is set to `Default`.
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): js.UndefOr[FirstDayOfWeek] = js.native
    def getWeekConfigurationValues(
      /**
      * The calendar week numbering; if omitted, `Default` is used.
      */
    sCalendarWeekNumbering: CalendarWeekNumbering
    ): js.UndefOr[FirstDayOfWeek] = js.native
    def getWeekConfigurationValues(
      /**
      * The calendar week numbering; if omitted, `Default` is used.
      */
    sCalendarWeekNumbering: CalendarWeekNumbering,
      /**
      * The locale to use; if not provided, this falls back to the format locale from the Configuration; see
      * {@link sap.ui.core.Configuration.FormatSettings#getFormatLocale}. Is only used when `sCalendarWeekNumbering`
      * is set to `Default`.
      */
    oLocale: typings.openui5.sapUiCoreLocaleMod.default
    ): js.UndefOr[FirstDayOfWeek] = js.native
  }
  
  type _To = CalendarUtils
  
  /* This means you don't have to write `default`, but can instead just say `sapUiCoreDateCalendarUtilsMod.foo` */
  override def _to: CalendarUtils = default
}
