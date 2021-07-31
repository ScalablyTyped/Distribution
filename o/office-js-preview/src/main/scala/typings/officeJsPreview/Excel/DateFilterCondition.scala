package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateFilterCondition extends StObject
/**
  *
  * Enum representing all accepted conditions by which a date filter can be applied.
  Used to configure the type of PivotFilter that is applied to the field.
  *
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.DateFilterCondition")
@js.native
object DateFilterCondition extends StObject {
  
  /**
    * Date is after comparator date.
    
    Required Criteria: {`comparator`}.
    Optional Criteria: {`wholeDays`}.
    *
    */
  @js.native
  sealed trait after
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is after or equal to comparator date.
    
    Required Criteria: {`comparator`}.
    Optional Criteria: {`wholeDays`}.
    *
    */
  @js.native
  sealed trait afterOrEqualTo
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in April.
    *
    */
  @js.native
  sealed trait allDatesInPeriodApril
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in August.
    *
    */
  @js.native
  sealed trait allDatesInPeriodAugust
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in December.
    *
    */
  @js.native
  sealed trait allDatesInPeriodDecember
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in February.
    *
    */
  @js.native
  sealed trait allDatesInPeriodFebruary
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in January.
    *
    */
  @js.native
  sealed trait allDatesInPeriodJanuary
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in July.
    *
    */
  @js.native
  sealed trait allDatesInPeriodJuly
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in June.
    *
    */
  @js.native
  sealed trait allDatesInPeriodJune
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in March.
    *
    */
  @js.native
  sealed trait allDatesInPeriodMarch
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in May.
    *
    */
  @js.native
  sealed trait allDatesInPeriodMay
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in November.
    *
    */
  @js.native
  sealed trait allDatesInPeriodNovember
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in October.
    *
    */
  @js.native
  sealed trait allDatesInPeriodOctober
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in Quarter 1.
    *
    */
  @js.native
  sealed trait allDatesInPeriodQuarter1
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in Quarter 2.
    *
    */
  @js.native
  sealed trait allDatesInPeriodQuarter2
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in Quarter 3.
    *
    */
  @js.native
  sealed trait allDatesInPeriodQuarter3
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in Quarter 4.
    *
    */
  @js.native
  sealed trait allDatesInPeriodQuarter4
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in September.
    *
    */
  @js.native
  sealed trait allDatesInPeriodSeptember
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is before comparator date.
    
    Required Criteria: {`comparator`}.
    Optional Criteria: {`wholeDays`}.
    *
    */
  @js.native
  sealed trait before
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is before or equal to comparator date.
    
    Required Criteria: {`comparator`}.
    Optional Criteria: {`wholeDays`}.
    *
    */
  @js.native
  sealed trait beforeOrEqualTo
    extends StObject
       with DateFilterCondition
  
  /**
    * Between `lowerBound` and `upperBound` dates.
    
    Required Criteria: {`lowerBound`, `upperBound`}.
    Optional Criteria: {`wholeDays`, `exclusive`}.
    *
    */
  @js.native
  sealed trait between
    extends StObject
       with DateFilterCondition
  
  /**
    * Equals comparator criterion.
    
    Required Criteria: {`comparator`}.
    Optional Criteria: {`wholeDays`, `exclusive`}.
    *
    */
  @js.native
  sealed trait equals
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is last month.
    *
    */
  @js.native
  sealed trait lastMonth
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is last quarter.
    *
    */
  @js.native
  sealed trait lastQuarter
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is last week.
    *
    */
  @js.native
  sealed trait lastWeek
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is last year.
    *
    */
  @js.native
  sealed trait lastYear
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is next month.
    *
    */
  @js.native
  sealed trait nextMonth
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is next quarter.
    *
    */
  @js.native
  sealed trait nextQuarter
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is next week.
    *
    */
  @js.native
  sealed trait nextWeek
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is next year.
    *
    */
  @js.native
  sealed trait nextYear
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is this month.
    *
    */
  @js.native
  sealed trait thisMonth
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is this quarter.
    *
    */
  @js.native
  sealed trait thisQuarter
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is this week.
    *
    */
  @js.native
  sealed trait thisWeek
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is this year.
    *
    */
  @js.native
  sealed trait thisYear
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is today.
    *
    */
  @js.native
  sealed trait today
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is tomorrow.
    *
    */
  @js.native
  sealed trait tomorrow
    extends StObject
       with DateFilterCondition
  
  /**
    * DateFilterCondition is unknown or unsupported.
    *
    */
  @js.native
  sealed trait unknown
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in the same year to date.
    *
    */
  @js.native
  sealed trait yearToDate
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is yesterday.
    *
    */
  @js.native
  sealed trait yesterday
    extends StObject
       with DateFilterCondition
}
