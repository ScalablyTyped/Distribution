package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DynamicFilterCriteria extends js.Object

/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.DynamicFilterCriteria")
@js.native
object DynamicFilterCriteria extends js.Object {
  @js.native
  sealed trait aboveAverage extends DynamicFilterCriteria
  
  @js.native
  sealed trait allDatesInPeriodApril extends DynamicFilterCriteria
  
  @js.native
  sealed trait allDatesInPeriodAugust extends DynamicFilterCriteria
  
  @js.native
  sealed trait allDatesInPeriodDecember extends DynamicFilterCriteria
  
  @js.native
  sealed trait allDatesInPeriodFebruray extends DynamicFilterCriteria
  
  @js.native
  sealed trait allDatesInPeriodJanuary extends DynamicFilterCriteria
  
  @js.native
  sealed trait allDatesInPeriodJuly extends DynamicFilterCriteria
  
  @js.native
  sealed trait allDatesInPeriodJune extends DynamicFilterCriteria
  
  @js.native
  sealed trait allDatesInPeriodMarch extends DynamicFilterCriteria
  
  @js.native
  sealed trait allDatesInPeriodMay extends DynamicFilterCriteria
  
  @js.native
  sealed trait allDatesInPeriodNovember extends DynamicFilterCriteria
  
  @js.native
  sealed trait allDatesInPeriodOctober extends DynamicFilterCriteria
  
  @js.native
  sealed trait allDatesInPeriodQuarter1 extends DynamicFilterCriteria
  
  @js.native
  sealed trait allDatesInPeriodQuarter2 extends DynamicFilterCriteria
  
  @js.native
  sealed trait allDatesInPeriodQuarter3 extends DynamicFilterCriteria
  
  @js.native
  sealed trait allDatesInPeriodQuarter4 extends DynamicFilterCriteria
  
  @js.native
  sealed trait allDatesInPeriodSeptember extends DynamicFilterCriteria
  
  @js.native
  sealed trait belowAverage extends DynamicFilterCriteria
  
  @js.native
  sealed trait lastMonth extends DynamicFilterCriteria
  
  @js.native
  sealed trait lastQuarter extends DynamicFilterCriteria
  
  @js.native
  sealed trait lastWeek extends DynamicFilterCriteria
  
  @js.native
  sealed trait lastYear extends DynamicFilterCriteria
  
  @js.native
  sealed trait nextMonth extends DynamicFilterCriteria
  
  @js.native
  sealed trait nextQuarter extends DynamicFilterCriteria
  
  @js.native
  sealed trait nextWeek extends DynamicFilterCriteria
  
  @js.native
  sealed trait nextYear extends DynamicFilterCriteria
  
  @js.native
  sealed trait thisMonth extends DynamicFilterCriteria
  
  @js.native
  sealed trait thisQuarter extends DynamicFilterCriteria
  
  @js.native
  sealed trait thisWeek extends DynamicFilterCriteria
  
  @js.native
  sealed trait thisYear extends DynamicFilterCriteria
  
  @js.native
  sealed trait today extends DynamicFilterCriteria
  
  @js.native
  sealed trait tomorrow extends DynamicFilterCriteria
  
  @js.native
  sealed trait unknown extends DynamicFilterCriteria
  
  @js.native
  sealed trait yearToDate extends DynamicFilterCriteria
  
  @js.native
  sealed trait yesterday extends DynamicFilterCriteria
  
  /* "AboveAverage" */ val aboveAverage: typings.officeDashJs.Excel.DynamicFilterCriteria.aboveAverage with String = js.native
  /* "AllDatesInPeriodApril" */ val allDatesInPeriodApril: typings.officeDashJs.Excel.DynamicFilterCriteria.allDatesInPeriodApril with String = js.native
  /* "AllDatesInPeriodAugust" */ val allDatesInPeriodAugust: typings.officeDashJs.Excel.DynamicFilterCriteria.allDatesInPeriodAugust with String = js.native
  /* "AllDatesInPeriodDecember" */ val allDatesInPeriodDecember: typings.officeDashJs.Excel.DynamicFilterCriteria.allDatesInPeriodDecember with String = js.native
  /* "AllDatesInPeriodFebruray" */ val allDatesInPeriodFebruray: typings.officeDashJs.Excel.DynamicFilterCriteria.allDatesInPeriodFebruray with String = js.native
  /* "AllDatesInPeriodJanuary" */ val allDatesInPeriodJanuary: typings.officeDashJs.Excel.DynamicFilterCriteria.allDatesInPeriodJanuary with String = js.native
  /* "AllDatesInPeriodJuly" */ val allDatesInPeriodJuly: typings.officeDashJs.Excel.DynamicFilterCriteria.allDatesInPeriodJuly with String = js.native
  /* "AllDatesInPeriodJune" */ val allDatesInPeriodJune: typings.officeDashJs.Excel.DynamicFilterCriteria.allDatesInPeriodJune with String = js.native
  /* "AllDatesInPeriodMarch" */ val allDatesInPeriodMarch: typings.officeDashJs.Excel.DynamicFilterCriteria.allDatesInPeriodMarch with String = js.native
  /* "AllDatesInPeriodMay" */ val allDatesInPeriodMay: typings.officeDashJs.Excel.DynamicFilterCriteria.allDatesInPeriodMay with String = js.native
  /* "AllDatesInPeriodNovember" */ val allDatesInPeriodNovember: typings.officeDashJs.Excel.DynamicFilterCriteria.allDatesInPeriodNovember with String = js.native
  /* "AllDatesInPeriodOctober" */ val allDatesInPeriodOctober: typings.officeDashJs.Excel.DynamicFilterCriteria.allDatesInPeriodOctober with String = js.native
  /* "AllDatesInPeriodQuarter1" */ val allDatesInPeriodQuarter1: typings.officeDashJs.Excel.DynamicFilterCriteria.allDatesInPeriodQuarter1 with String = js.native
  /* "AllDatesInPeriodQuarter2" */ val allDatesInPeriodQuarter2: typings.officeDashJs.Excel.DynamicFilterCriteria.allDatesInPeriodQuarter2 with String = js.native
  /* "AllDatesInPeriodQuarter3" */ val allDatesInPeriodQuarter3: typings.officeDashJs.Excel.DynamicFilterCriteria.allDatesInPeriodQuarter3 with String = js.native
  /* "AllDatesInPeriodQuarter4" */ val allDatesInPeriodQuarter4: typings.officeDashJs.Excel.DynamicFilterCriteria.allDatesInPeriodQuarter4 with String = js.native
  /* "AllDatesInPeriodSeptember" */ val allDatesInPeriodSeptember: typings.officeDashJs.Excel.DynamicFilterCriteria.allDatesInPeriodSeptember with String = js.native
  /* "BelowAverage" */ val belowAverage: typings.officeDashJs.Excel.DynamicFilterCriteria.belowAverage with String = js.native
  /* "LastMonth" */ val lastMonth: typings.officeDashJs.Excel.DynamicFilterCriteria.lastMonth with String = js.native
  /* "LastQuarter" */ val lastQuarter: typings.officeDashJs.Excel.DynamicFilterCriteria.lastQuarter with String = js.native
  /* "LastWeek" */ val lastWeek: typings.officeDashJs.Excel.DynamicFilterCriteria.lastWeek with String = js.native
  /* "LastYear" */ val lastYear: typings.officeDashJs.Excel.DynamicFilterCriteria.lastYear with String = js.native
  /* "NextMonth" */ val nextMonth: typings.officeDashJs.Excel.DynamicFilterCriteria.nextMonth with String = js.native
  /* "NextQuarter" */ val nextQuarter: typings.officeDashJs.Excel.DynamicFilterCriteria.nextQuarter with String = js.native
  /* "NextWeek" */ val nextWeek: typings.officeDashJs.Excel.DynamicFilterCriteria.nextWeek with String = js.native
  /* "NextYear" */ val nextYear: typings.officeDashJs.Excel.DynamicFilterCriteria.nextYear with String = js.native
  /* "ThisMonth" */ val thisMonth: typings.officeDashJs.Excel.DynamicFilterCriteria.thisMonth with String = js.native
  /* "ThisQuarter" */ val thisQuarter: typings.officeDashJs.Excel.DynamicFilterCriteria.thisQuarter with String = js.native
  /* "ThisWeek" */ val thisWeek: typings.officeDashJs.Excel.DynamicFilterCriteria.thisWeek with String = js.native
  /* "ThisYear" */ val thisYear: typings.officeDashJs.Excel.DynamicFilterCriteria.thisYear with String = js.native
  /* "Today" */ val today: typings.officeDashJs.Excel.DynamicFilterCriteria.today with String = js.native
  /* "Tomorrow" */ val tomorrow: typings.officeDashJs.Excel.DynamicFilterCriteria.tomorrow with String = js.native
  /* "Unknown" */ val unknown: typings.officeDashJs.Excel.DynamicFilterCriteria.unknown with String = js.native
  /* "YearToDate" */ val yearToDate: typings.officeDashJs.Excel.DynamicFilterCriteria.yearToDate with String = js.native
  /* "Yesterday" */ val yesterday: typings.officeDashJs.Excel.DynamicFilterCriteria.yesterday with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DynamicFilterCriteria with String] = js.native
}

