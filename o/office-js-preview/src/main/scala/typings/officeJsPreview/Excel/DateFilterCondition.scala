package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateFilterCondition extends StObject
/**
  * Enum representing all accepted conditions by which a date filter can be applied.
  Used to configure the type of PivotFilter that is applied to the field.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.DateFilterCondition")
@js.native
object DateFilterCondition extends StObject {
  
  /**
    * Date is after comparator date.
    
    Required Criteria: {`comparator`}.
    Optional Criteria: {`wholeDays`}.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait after
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is after or equal to comparator date.
    
    Required Criteria: {`comparator`}.
    Optional Criteria: {`wholeDays`}.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait afterOrEqualTo
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in April.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait allDatesInPeriodApril
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in August.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait allDatesInPeriodAugust
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in December.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait allDatesInPeriodDecember
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in February.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait allDatesInPeriodFebruary
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in January.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait allDatesInPeriodJanuary
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in July.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait allDatesInPeriodJuly
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in June.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait allDatesInPeriodJune
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in March.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait allDatesInPeriodMarch
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in May.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait allDatesInPeriodMay
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in November.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait allDatesInPeriodNovember
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in October.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait allDatesInPeriodOctober
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in Quarter 1.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait allDatesInPeriodQuarter1
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in Quarter 2.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait allDatesInPeriodQuarter2
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in Quarter 3.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait allDatesInPeriodQuarter3
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in Quarter 4.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait allDatesInPeriodQuarter4
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in September.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait allDatesInPeriodSeptember
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is before comparator date.
    
    Required Criteria: {`comparator`}.
    Optional Criteria: {`wholeDays`}.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait before
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is before or equal to comparator date.
    
    Required Criteria: {`comparator`}.
    Optional Criteria: {`wholeDays`}.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait beforeOrEqualTo
    extends StObject
       with DateFilterCondition
  
  /**
    * Between `lowerBound` and `upperBound` dates.
    
    Required Criteria: {`lowerBound`, `upperBound`}.
    Optional Criteria: {`wholeDays`, `exclusive`}.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait between
    extends StObject
       with DateFilterCondition
  
  /**
    * Equals comparator criterion.
    
    Required Criteria: {`comparator`}.
    Optional Criteria: {`wholeDays`, `exclusive`}.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait equals
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is last month.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait lastMonth
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is last quarter.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait lastQuarter
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is last week.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait lastWeek
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is last year.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait lastYear
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is next month.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait nextMonth
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is next quarter.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait nextQuarter
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is next week.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait nextWeek
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is next year.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait nextYear
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is this month.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait thisMonth
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is this quarter.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait thisQuarter
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is this week.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait thisWeek
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is this year.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait thisYear
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is today.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait today
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is tomorrow.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait tomorrow
    extends StObject
       with DateFilterCondition
  
  /**
    * `DateFilterCondition` is unknown or unsupported.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait unknown
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is in the same year to date.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait yearToDate
    extends StObject
       with DateFilterCondition
  
  /**
    * Date is yesterday.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait yesterday
    extends StObject
       with DateFilterCondition
}
