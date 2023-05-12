package typings.openui5

import typings.openui5.anon.TimeZone
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreDateUi5dateMod {
  
  @JSImport("sap/ui/core/date/UI5Date", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with UI5Date
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/date/UI5Date", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a date instance (either JavaScript Date or `UI5Date`) which considers the configured time zone
      * wherever JavaScript Date uses the local browser time zone, for example in `getDate`, `toString`, or `setHours`.
      * The supported parameters are the same as the ones supported by the JavaScript Date constructor.
      * See:
      * 	sap.ui.core.Configuration.getTimezone
      *
      * @returns The date instance that considers the configured time zone in all local getters and setters.
      */
    inline def getInstance(
      /**
      * Same meaning as in the JavaScript Date constructor
      */
    vYearOrValue: js.UndefOr[int | String | js.Date | UI5Date | Null],
      /**
      * Same meaning as in the JavaScript Date constructor
      */
    vMonthIndex: js.UndefOr[int | String],
      /**
      * Same meaning as in the Date constructor
      */
    vDay: js.UndefOr[int | String],
      /**
      * Same meaning as in the Date constructor
      */
    vHours: js.UndefOr[int | String],
      /**
      * Same meaning as in the Date constructor
      */
    vMinutes: js.UndefOr[int | String],
      /**
      * Same meaning as in the Date constructor
      */
    vSeconds: js.UndefOr[int | String],
      /**
      * Same meaning as in the Date constructor
      */
    vMilliseconds: js.UndefOr[int | String]
    ): js.Date | UI5Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(vYearOrValue.asInstanceOf[js.Any], vMonthIndex.asInstanceOf[js.Any], vDay.asInstanceOf[js.Any], vHours.asInstanceOf[js.Any], vMinutes.asInstanceOf[js.Any], vSeconds.asInstanceOf[js.Any], vMilliseconds.asInstanceOf[js.Any])).asInstanceOf[js.Date | UI5Date]
  }
  
  @js.native
  trait UI5Date
    extends StObject
       with Date {
    
    /**
      * @deprecated (since 1.111) - as it is deprecated in the base class JavaScript Date; use {@link #getFullYear}
      * instead
      *
      * Returns the year of this date instance minus 1900 according to the configured time zone, see `Date.prototype.getYear`.
      *
      * @returns The year of this date instance minus 1900 according to the configured time zone
      */
    def getYear(): int = js.native
    
    /**
      * @deprecated (since 1.111) - as it is deprecated in the base class JavaScript Date; use {@link #setFullYear}
      * instead
      *
      * Sets the year for this date instance plus 1900 considering the configured time zone, see `Date.prototype.setYear`.
      *
      * @returns The milliseconds of the new timestamp based on the UNIX epoch, or `NaN` if the timestamp could
      * not be updated
      */
    def setYear(/**
      * The year which is to be set for this date plus 1900
      */
    iYear: int): int = js.native
    
    /**
      * Converts this date to a string, interpreting it in the UTC time zone, see `Date.prototype.toGMTString`.
      *
      * @returns The converted date as string in the UTC time zone
      */
    def toGMTString(): String = js.native
    
    def toLocaleDateString(
      /**
      * The locale used for formatting; the configured locale by default
      */
    sLocale: String,
      /**
      * The options object used for formatting, corresponding to the options parameter of the `Intl.DateTimeFormat`
      * constructor
      */
    oOptions: TimeZone
    ): String = js.native
    def toLocaleDateString(
      /**
      * The locale used for formatting; the configured locale by default
      */
    sLocale: Unit,
      /**
      * The options object used for formatting, corresponding to the options parameter of the `Intl.DateTimeFormat`
      * constructor
      */
    oOptions: TimeZone
    ): String = js.native
    
    def toLocaleString(
      /**
      * The locale used for formatting; the configured locale by default
      */
    sLocale: String,
      /**
      * The options object used for formatting, corresponding to the options parameter of the `Intl.DateTimeFormat`
      * constructor
      */
    oOptions: TimeZone
    ): String = js.native
    def toLocaleString(
      /**
      * The locale used for formatting; the configured locale by default
      */
    sLocale: Unit,
      /**
      * The options object used for formatting, corresponding to the options parameter of the `Intl.DateTimeFormat`
      * constructor
      */
    oOptions: TimeZone
    ): String = js.native
    
    def toLocaleTimeString(
      /**
      * The locale used for formatting; the configured locale by default
      */
    sLocale: String,
      /**
      * The options object used for formatting, corresponding to the options parameter of the `Intl.DateTimeFormat`
      * constructor
      */
    oOptions: TimeZone
    ): String = js.native
    def toLocaleTimeString(
      /**
      * The locale used for formatting; the configured locale by default
      */
    sLocale: Unit,
      /**
      * The options object used for formatting, corresponding to the options parameter of the `Intl.DateTimeFormat`
      * constructor
      */
    oOptions: TimeZone
    ): String = js.native
  }
}
