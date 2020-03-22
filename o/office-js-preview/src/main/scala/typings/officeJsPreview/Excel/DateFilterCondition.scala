package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  /* "Equals" */ @JSName("equals")
  val equals_ : equals with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DateFilterCondition with String] = js.native
  /* "After" */ @js.native
  object after extends TopLevel[after with String]
  
  /* "AfterOrEqualTo" */ @js.native
  object afterOrEqualTo extends TopLevel[afterOrEqualTo with String]
  
  /* "AllDatesInPeriodApril" */ @js.native
  object allDatesInPeriodApril extends TopLevel[allDatesInPeriodApril with String]
  
  /* "AllDatesInPeriodAugust" */ @js.native
  object allDatesInPeriodAugust extends TopLevel[allDatesInPeriodAugust with String]
  
  /* "AllDatesInPeriodDecember" */ @js.native
  object allDatesInPeriodDecember extends TopLevel[allDatesInPeriodDecember with String]
  
  /* "AllDatesInPeriodFebruary" */ @js.native
  object allDatesInPeriodFebruary extends TopLevel[allDatesInPeriodFebruary with String]
  
  /* "AllDatesInPeriodJanuary" */ @js.native
  object allDatesInPeriodJanuary extends TopLevel[allDatesInPeriodJanuary with String]
  
  /* "AllDatesInPeriodJuly" */ @js.native
  object allDatesInPeriodJuly extends TopLevel[allDatesInPeriodJuly with String]
  
  /* "AllDatesInPeriodJune" */ @js.native
  object allDatesInPeriodJune extends TopLevel[allDatesInPeriodJune with String]
  
  /* "AllDatesInPeriodMarch" */ @js.native
  object allDatesInPeriodMarch extends TopLevel[allDatesInPeriodMarch with String]
  
  /* "AllDatesInPeriodMay" */ @js.native
  object allDatesInPeriodMay extends TopLevel[allDatesInPeriodMay with String]
  
  /* "AllDatesInPeriodNovember" */ @js.native
  object allDatesInPeriodNovember extends TopLevel[allDatesInPeriodNovember with String]
  
  /* "AllDatesInPeriodOctober" */ @js.native
  object allDatesInPeriodOctober extends TopLevel[allDatesInPeriodOctober with String]
  
  /* "AllDatesInPeriodQuarter1" */ @js.native
  object allDatesInPeriodQuarter1 extends TopLevel[allDatesInPeriodQuarter1 with String]
  
  /* "AllDatesInPeriodQuarter2" */ @js.native
  object allDatesInPeriodQuarter2 extends TopLevel[allDatesInPeriodQuarter2 with String]
  
  /* "AllDatesInPeriodQuarter3" */ @js.native
  object allDatesInPeriodQuarter3 extends TopLevel[allDatesInPeriodQuarter3 with String]
  
  /* "AllDatesInPeriodQuarter4" */ @js.native
  object allDatesInPeriodQuarter4 extends TopLevel[allDatesInPeriodQuarter4 with String]
  
  /* "AllDatesInPeriodSeptember" */ @js.native
  object allDatesInPeriodSeptember extends TopLevel[allDatesInPeriodSeptember with String]
  
  /* "Before" */ @js.native
  object before extends TopLevel[before with String]
  
  /* "BeforeOrEqualTo" */ @js.native
  object beforeOrEqualTo extends TopLevel[beforeOrEqualTo with String]
  
  /* "Between" */ @js.native
  object between extends TopLevel[between with String]
  
  /* "LastMonth" */ @js.native
  object lastMonth extends TopLevel[lastMonth with String]
  
  /* "LastQuarter" */ @js.native
  object lastQuarter extends TopLevel[lastQuarter with String]
  
  /* "LastWeek" */ @js.native
  object lastWeek extends TopLevel[lastWeek with String]
  
  /* "LastYear" */ @js.native
  object lastYear extends TopLevel[lastYear with String]
  
  /* "NextMonth" */ @js.native
  object nextMonth extends TopLevel[nextMonth with String]
  
  /* "NextQuarter" */ @js.native
  object nextQuarter extends TopLevel[nextQuarter with String]
  
  /* "NextWeek" */ @js.native
  object nextWeek extends TopLevel[nextWeek with String]
  
  /* "NextYear" */ @js.native
  object nextYear extends TopLevel[nextYear with String]
  
  /* "ThisMonth" */ @js.native
  object thisMonth extends TopLevel[thisMonth with String]
  
  /* "ThisQuarter" */ @js.native
  object thisQuarter extends TopLevel[thisQuarter with String]
  
  /* "ThisWeek" */ @js.native
  object thisWeek extends TopLevel[thisWeek with String]
  
  /* "ThisYear" */ @js.native
  object thisYear extends TopLevel[thisYear with String]
  
  /* "Today" */ @js.native
  object today extends TopLevel[today with String]
  
  /* "Tomorrow" */ @js.native
  object tomorrow extends TopLevel[tomorrow with String]
  
  /* "Unknown" */ @js.native
  object unknown extends TopLevel[unknown with String]
  
  /* "YearToDate" */ @js.native
  object yearToDate extends TopLevel[yearToDate with String]
  
  /* "Yesterday" */ @js.native
  object yesterday extends TopLevel[yesterday with String]
  
}

