package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateFilterCondition extends js.Object

/**
  *
  * Enum representing all accepted conditions by which a date filter can be applied.
  Used to configure the type of PivotFilter that is applied to the field.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.DateFilterCondition")
@js.native
object DateFilterCondition extends js.Object {
  /**
    * Date is after comparator date.
    Required Criteria: {`comparator`}.
    Optional Criteria: {`wholeDays`}.
    *
    */
  @js.native
  sealed trait after extends DateFilterCondition
  
  /**
    * Date is after or equal to comparator date.
    Required Criteria: {`comparator`}.
    Optional Criteria: {`wholeDays`}.
    *
    */
  @js.native
  sealed trait afterOrEqualTo extends DateFilterCondition
  
  /**
    * Date is in April.
    *
    */
  @js.native
  sealed trait allDatesInPeriodApril extends DateFilterCondition
  
  /**
    * Date is in August.
    *
    */
  @js.native
  sealed trait allDatesInPeriodAugust extends DateFilterCondition
  
  /**
    * Date is in December.
    *
    */
  @js.native
  sealed trait allDatesInPeriodDecember extends DateFilterCondition
  
  /**
    * Date is in February.
    *
    */
  @js.native
  sealed trait allDatesInPeriodFebruary extends DateFilterCondition
  
  /**
    * Date is in January.
    *
    */
  @js.native
  sealed trait allDatesInPeriodJanuary extends DateFilterCondition
  
  /**
    * Date is in July.
    *
    */
  @js.native
  sealed trait allDatesInPeriodJuly extends DateFilterCondition
  
  /**
    * Date is in June.
    *
    */
  @js.native
  sealed trait allDatesInPeriodJune extends DateFilterCondition
  
  /**
    * Date is in March.
    *
    */
  @js.native
  sealed trait allDatesInPeriodMarch extends DateFilterCondition
  
  /**
    * Date is in May.
    *
    */
  @js.native
  sealed trait allDatesInPeriodMay extends DateFilterCondition
  
  /**
    * Date is in November.
    *
    */
  @js.native
  sealed trait allDatesInPeriodNovember extends DateFilterCondition
  
  /**
    * Date is in October.
    *
    */
  @js.native
  sealed trait allDatesInPeriodOctober extends DateFilterCondition
  
  /**
    * Date is in Quarter 1.
    *
    */
  @js.native
  sealed trait allDatesInPeriodQuarter1 extends DateFilterCondition
  
  /**
    * Date is in Quarter 2.
    *
    */
  @js.native
  sealed trait allDatesInPeriodQuarter2 extends DateFilterCondition
  
  /**
    * Date is in Quarter 3.
    *
    */
  @js.native
  sealed trait allDatesInPeriodQuarter3 extends DateFilterCondition
  
  /**
    * Date is in Quarter 4.
    *
    */
  @js.native
  sealed trait allDatesInPeriodQuarter4 extends DateFilterCondition
  
  /**
    * Date is in September.
    *
    */
  @js.native
  sealed trait allDatesInPeriodSeptember extends DateFilterCondition
  
  /**
    * Date is before comparator date.
    Required Criteria: {`comparator`}.
    Optional Criteria: {`wholeDays`}.
    *
    */
  @js.native
  sealed trait before extends DateFilterCondition
  
  /**
    * Date is before or equal to comparator date.
    Required Criteria: {`comparator`}.
    Optional Criteria: {`wholeDays`}.
    *
    */
  @js.native
  sealed trait beforeOrEqualTo extends DateFilterCondition
  
  /**
    * Between `lowerBound` and `upperBound` dates.
    Required Criteria: {`lowerBound`, `upperBound`}.
    Optional Criteria: {`wholeDays`, `exclusive`}.
    *
    */
  @js.native
  sealed trait between extends DateFilterCondition
  
  /**
    * Equals comparator criterion.
    Required Criteria: {`comparator`}.
    Optional Criteria: {`wholeDays`, `exclusive`}.
    *
    */
  @js.native
  sealed trait equals extends DateFilterCondition
  
  /**
    * Date is last month.
    *
    */
  @js.native
  sealed trait lastMonth extends DateFilterCondition
  
  /**
    * Date is last quarter.
    *
    */
  @js.native
  sealed trait lastQuarter extends DateFilterCondition
  
  /**
    * Date is last week.
    *
    */
  @js.native
  sealed trait lastWeek extends DateFilterCondition
  
  /**
    * Date is last year.
    *
    */
  @js.native
  sealed trait lastYear extends DateFilterCondition
  
  /**
    * Date is next month.
    *
    */
  @js.native
  sealed trait nextMonth extends DateFilterCondition
  
  /**
    * Date is next quarter.
    *
    */
  @js.native
  sealed trait nextQuarter extends DateFilterCondition
  
  /**
    * Date is next week.
    *
    */
  @js.native
  sealed trait nextWeek extends DateFilterCondition
  
  /**
    * Date is next year.
    *
    */
  @js.native
  sealed trait nextYear extends DateFilterCondition
  
  /**
    * Date is this month.
    *
    */
  @js.native
  sealed trait thisMonth extends DateFilterCondition
  
  /**
    * Date is this quarter.
    *
    */
  @js.native
  sealed trait thisQuarter extends DateFilterCondition
  
  /**
    * Date is this week.
    *
    */
  @js.native
  sealed trait thisWeek extends DateFilterCondition
  
  /**
    * Date is this year.
    *
    */
  @js.native
  sealed trait thisYear extends DateFilterCondition
  
  /**
    * Date is today.
    *
    */
  @js.native
  sealed trait today extends DateFilterCondition
  
  /**
    * Date is tomorrow.
    *
    */
  @js.native
  sealed trait tomorrow extends DateFilterCondition
  
  /**
    * DateFilterCondition is unknown or unsupported.
    *
    */
  @js.native
  sealed trait unknown extends DateFilterCondition
  
  /**
    * Date is in the same year to date.
    *
    */
  @js.native
  sealed trait yearToDate extends DateFilterCondition
  
  /**
    * Date is yesterday.
    *
    */
  @js.native
  sealed trait yesterday extends DateFilterCondition
  
}

