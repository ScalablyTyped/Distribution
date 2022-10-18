package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StandardDynamicDateRangeKeys extends StObject
@JSImport("sap/m/library", "StandardDynamicDateRangeKeys")
@js.native
object StandardDynamicDateRangeKeys extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StandardDynamicDateRangeKeys & String] = js.native
  
  /**
    * The date will be selected from a calendar.
    */
  @js.native
  sealed trait DATE
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "DATE" */ val DATE: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.DATE & String = js.native
  
  /**
    * The range will be selected from a calendar.
    */
  @js.native
  sealed trait DATERANGE
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "DATERANGE" */ val DATERANGE: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.DATERANGE & String = js.native
  
  /**
    * The date and time will be selected from a calendar and time picker.
    */
  @js.native
  sealed trait DATETIME
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "DATETIME" */ val DATETIME: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.DATETIME & String = js.native
  
  /**
    * The range will be selected from two DateTimePicker controls.
    */
  @js.native
  sealed trait DATETIMERANGE
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "DATETIMERANGE" */ val DATETIMERANGE: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.DATETIMERANGE & String = js.native
  
  /**
    * The range will start from the date selected from a calendar and ends with the last day of the current
    * year.
    */
  @js.native
  sealed trait DATETOYEAR
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "DATETOYEAR" */ val DATETOYEAR: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.DATETOYEAR & String = js.native
  
  /**
    * The date will be the first day of the current month.
    */
  @js.native
  sealed trait FIRSTDAYMONTH
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "FIRSTDAYMONTH" */ val FIRSTDAYMONTH: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.FIRSTDAYMONTH & String = js.native
  
  /**
    * The date will be the first day of the current quarter.
    */
  @js.native
  sealed trait FIRSTDAYQUARTER
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "FIRSTDAYQUARTER" */ val FIRSTDAYQUARTER: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.FIRSTDAYQUARTER & String = js.native
  
  /**
    * The date will be the first day of the current week.
    */
  @js.native
  sealed trait FIRSTDAYWEEK
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "FIRSTDAYWEEK" */ val FIRSTDAYWEEK: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.FIRSTDAYWEEK & String = js.native
  
  /**
    * The date will be the first day of the current year.
    */
  @js.native
  sealed trait FIRSTDAYYEAR
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "FIRSTDAYYEAR" */ val FIRSTDAYYEAR: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.FIRSTDAYYEAR & String = js.native
  
  /**
    * The range will start from a date selected from a calendar.
    */
  @js.native
  sealed trait FROM
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "FROM" */ val FROM: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.FROM & String = js.native
  
  /**
    * The range will start from a date and time selected from a calendar and time picker.
    */
  @js.native
  sealed trait FROMDATETIME
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "FROMDATETIME" */ val FROMDATETIME: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.FROMDATETIME & String = js.native
  
  /**
    * The date will be the last day of the current month.
    */
  @js.native
  sealed trait LASTDAYMONTH
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "LASTDAYMONTH" */ val LASTDAYMONTH: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.LASTDAYMONTH & String = js.native
  
  /**
    * The date will be the last day of the current quarter.
    */
  @js.native
  sealed trait LASTDAYQUARTER
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "LASTDAYQUARTER" */ val LASTDAYQUARTER: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.LASTDAYQUARTER & String = js.native
  
  /**
    * The range will contain the last X days. The count of the days is selected from a StepInput.
    */
  @js.native
  sealed trait LASTDAYS
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "LASTDAYS" */ val LASTDAYS: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.LASTDAYS & String = js.native
  
  /**
    * The date will be the last day of the current week.
    */
  @js.native
  sealed trait LASTDAYWEEK
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "LASTDAYWEEK" */ val LASTDAYWEEK: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.LASTDAYWEEK & String = js.native
  
  /**
    * The date will be the last day of the current year.
    */
  @js.native
  sealed trait LASTDAYYEAR
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "LASTDAYYEAR" */ val LASTDAYYEAR: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.LASTDAYYEAR & String = js.native
  
  /**
    * The range will contain the days in the last month.
    */
  @js.native
  sealed trait LASTMONTH
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "LASTMONTH" */ val LASTMONTH: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.LASTMONTH & String = js.native
  
  /**
    * The range will contain the last X months. The count of the months is selected from a StepInput.
    */
  @js.native
  sealed trait LASTMONTHS
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "LASTMONTHS" */ val LASTMONTHS: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.LASTMONTHS & String = js.native
  
  /**
    * The range will contain the days in the last quarter.
    */
  @js.native
  sealed trait LASTQUARTER
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "LASTQUARTER" */ val LASTQUARTER: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.LASTQUARTER & String = js.native
  
  /**
    * The range will contain the last X quarters. The count of the quarters is selected from a StepInput.
    */
  @js.native
  sealed trait LASTQUARTERS
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "LASTQUARTERS" */ val LASTQUARTERS: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.LASTQUARTERS & String = js.native
  
  /**
    * The range will contain the days of the last week.
    */
  @js.native
  sealed trait LASTWEEK
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "LASTWEEK" */ val LASTWEEK: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.LASTWEEK & String = js.native
  
  /**
    * The range will contain the last X weeks. The count of the weeks is selected from a StepInput.
    */
  @js.native
  sealed trait LASTWEEKS
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "LASTWEEKS" */ val LASTWEEKS: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.LASTWEEKS & String = js.native
  
  /**
    * The range will contain the days in the last year.
    */
  @js.native
  sealed trait LASTYEAR
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "LASTYEAR" */ val LASTYEAR: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.LASTYEAR & String = js.native
  
  /**
    * The range will contain the last X years. The count of the years is selected from a StepInput.
    */
  @js.native
  sealed trait LASTYEARS
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "LASTYEARS" */ val LASTYEARS: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.LASTYEARS & String = js.native
  
  /**
    * The range will contain the next X days. The count of the days is selected from a StepInput.
    */
  @js.native
  sealed trait NEXTDAYS
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "NEXTDAYS" */ val NEXTDAYS: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.NEXTDAYS & String = js.native
  
  /**
    * The range will contain the days in the next month.
    */
  @js.native
  sealed trait NEXTMONTH
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "NEXTMONTH" */ val NEXTMONTH: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.NEXTMONTH & String = js.native
  
  /**
    * The range will contain the next X months. The count of the months is selected from a StepInput.
    */
  @js.native
  sealed trait NEXTMONTHS
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "NEXTMONTHS" */ val NEXTMONTHS: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.NEXTMONTHS & String = js.native
  
  /**
    * The range will contain the days in the next quarter.
    */
  @js.native
  sealed trait NEXTQUARTER
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "NEXTQUARTER" */ val NEXTQUARTER: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.NEXTQUARTER & String = js.native
  
  /**
    * The range will contain the next X quarters. The count of the quarters is selected from a StepInput.
    */
  @js.native
  sealed trait NEXTQUARTERS
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "NEXTQUARTERS" */ val NEXTQUARTERS: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.NEXTQUARTERS & String = js.native
  
  /**
    * The range will contain the days of the next week.
    */
  @js.native
  sealed trait NEXTWEEK
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "NEXTWEEK" */ val NEXTWEEK: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.NEXTWEEK & String = js.native
  
  /**
    * The range will contain the next X weeks. The count of the weeks is selected from a StepInput.
    */
  @js.native
  sealed trait NEXTWEEKS
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "NEXTWEEKS" */ val NEXTWEEKS: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.NEXTWEEKS & String = js.native
  
  /**
    * The range will contain the days in the next year.
    */
  @js.native
  sealed trait NEXTYEAR
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "NEXTYEAR" */ val NEXTYEAR: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.NEXTYEAR & String = js.native
  
  /**
    * The range will contain the next X years. The count of the years is selected from a StepInput.
    */
  @js.native
  sealed trait NEXTYEARS
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "NEXTYEARS" */ val NEXTYEARS: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.NEXTYEARS & String = js.native
  
  /**
    * The range will contain the days in the first quarter.
    */
  @js.native
  sealed trait QUARTER1
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "QUARTER1" */ val QUARTER1: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.QUARTER1 & String = js.native
  
  /**
    * The range will contain the days in the second quarter.
    */
  @js.native
  sealed trait QUARTER2
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "QUARTER2" */ val QUARTER2: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.QUARTER2 & String = js.native
  
  /**
    * The range will contain the days in the third quarter.
    */
  @js.native
  sealed trait QUARTER3
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "QUARTER3" */ val QUARTER3: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.QUARTER3 & String = js.native
  
  /**
    * The range will contain the days in the fourth quarter.
    */
  @js.native
  sealed trait QUARTER4
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "QUARTER4" */ val QUARTER4: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.QUARTER4 & String = js.native
  
  /**
    * The range will contain a month selected from a MonthPicker.
    */
  @js.native
  sealed trait SPECIFICMONTH
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "SPECIFICMONTH" */ val SPECIFICMONTH: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.SPECIFICMONTH & String = js.native
  
  /**
    * The range will contain a month in exact year selected from a MonthPicker.
    */
  @js.native
  sealed trait SPECIFICMONTHINYEAR
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "SPECIFICMONTHINYEAR" */ val SPECIFICMONTHINYEAR: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.SPECIFICMONTHINYEAR & String = js.native
  
  /**
    * The range will contain the days in the current month.
    */
  @js.native
  sealed trait THISMONTH
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "THISMONTH" */ val THISMONTH: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.THISMONTH & String = js.native
  
  /**
    * The range will contain the days in the current quarter.
    */
  @js.native
  sealed trait THISQUARTER
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "THISQUARTER" */ val THISQUARTER: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.THISQUARTER & String = js.native
  
  /**
    * The range will contain the days of the current week.
    */
  @js.native
  sealed trait THISWEEK
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "THISWEEK" */ val THISWEEK: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.THISWEEK & String = js.native
  
  /**
    * The range will contain the days in the current year.
    */
  @js.native
  sealed trait THISYEAR
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "THISYEAR" */ val THISYEAR: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.THISYEAR & String = js.native
  
  /**
    * The range will end in a date selected from a calendar.
    */
  @js.native
  sealed trait TO
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "TO" */ val TO: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.TO & String = js.native
  
  /**
    * The range will end in a date and time selected from a calendar and time picker.
    */
  @js.native
  sealed trait TODATETIME
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "TODATETIME" */ val TODATETIME: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.TODATETIME & String = js.native
  
  /**
    * The date will be the day of selection.
    */
  @js.native
  sealed trait TODAY
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "TODAY" */ val TODAY: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.TODAY & String = js.native
  
  /**
    * The range will contain the last X days and the next Y days. The count of the days is selected from a
    * StepInput.
    */
  @js.native
  sealed trait TODAYFROMTO
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "TODAYFROMTO" */ val TODAYFROMTO: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.TODAYFROMTO & String = js.native
  
  /**
    * The date will be the day after the day of selection.
    */
  @js.native
  sealed trait TOMORROW
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "TOMORROW" */ val TOMORROW: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.TOMORROW & String = js.native
  
  /**
    * The range will start from the first day of the current year and ends with the date selected from a calendar.
    */
  @js.native
  sealed trait YEARTODATE
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "YEARTODATE" */ val YEARTODATE: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.YEARTODATE & String = js.native
  
  /**
    * The date will be the day before the day of selection.
    */
  @js.native
  sealed trait YESTERDAY
    extends StObject
       with StandardDynamicDateRangeKeys
  /* "YESTERDAY" */ val YESTERDAY: typings.openui5.sapMLibraryMod.StandardDynamicDateRangeKeys.YESTERDAY & String = js.native
}
