package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.After
import typings.officeJs.officeJsStrings.AfterOrEqualTo
import typings.officeJs.officeJsStrings.AllDatesInPeriodApril
import typings.officeJs.officeJsStrings.AllDatesInPeriodAugust
import typings.officeJs.officeJsStrings.AllDatesInPeriodDecember
import typings.officeJs.officeJsStrings.AllDatesInPeriodFebruary
import typings.officeJs.officeJsStrings.AllDatesInPeriodJanuary
import typings.officeJs.officeJsStrings.AllDatesInPeriodJuly
import typings.officeJs.officeJsStrings.AllDatesInPeriodJune
import typings.officeJs.officeJsStrings.AllDatesInPeriodMarch
import typings.officeJs.officeJsStrings.AllDatesInPeriodMay
import typings.officeJs.officeJsStrings.AllDatesInPeriodNovember
import typings.officeJs.officeJsStrings.AllDatesInPeriodOctober
import typings.officeJs.officeJsStrings.AllDatesInPeriodQuarter1
import typings.officeJs.officeJsStrings.AllDatesInPeriodQuarter2
import typings.officeJs.officeJsStrings.AllDatesInPeriodQuarter3
import typings.officeJs.officeJsStrings.AllDatesInPeriodQuarter4
import typings.officeJs.officeJsStrings.AllDatesInPeriodSeptember
import typings.officeJs.officeJsStrings.Before
import typings.officeJs.officeJsStrings.BeforeOrEqualTo
import typings.officeJs.officeJsStrings.Between
import typings.officeJs.officeJsStrings.Equals
import typings.officeJs.officeJsStrings.LastMonth
import typings.officeJs.officeJsStrings.LastQuarter
import typings.officeJs.officeJsStrings.LastWeek
import typings.officeJs.officeJsStrings.LastYear
import typings.officeJs.officeJsStrings.NextMonth
import typings.officeJs.officeJsStrings.NextQuarter
import typings.officeJs.officeJsStrings.NextWeek
import typings.officeJs.officeJsStrings.NextYear
import typings.officeJs.officeJsStrings.ThisMonth
import typings.officeJs.officeJsStrings.ThisQuarter
import typings.officeJs.officeJsStrings.ThisWeek
import typings.officeJs.officeJsStrings.ThisYear
import typings.officeJs.officeJsStrings.Today
import typings.officeJs.officeJsStrings.Tomorrow
import typings.officeJs.officeJsStrings.Unknown_
import typings.officeJs.officeJsStrings.YearToDate
import typings.officeJs.officeJsStrings.Yesterday
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Configurable template for a date filter to apply to a PivotField.
  The `condition` defines what criteria need to be set in order for the filter to operate.
  *
  * [Api set: ExcelApi 1.12]
  */
@js.native
trait PivotDateFilter extends StObject {
  
  /**
    *
    * The comparator is the static value to which other values are compared. The type of comparison is defined by the condition.
    *
    * [Api set: ExcelApi 1.12]
    */
  var comparator: js.UndefOr[FilterDatetime] = js.native
  
  /**
    *
    * Specifies the condition for the filter, which defines the necessary filtering criteria.
    *
    * [Api set: ExcelApi 1.12]
    */
  var condition: DateFilterCondition | Unknown_ | Equals | Before | BeforeOrEqualTo | After | AfterOrEqualTo | Between | Tomorrow | Today | Yesterday | NextWeek | ThisWeek | LastWeek | NextMonth | ThisMonth | LastMonth | NextQuarter | ThisQuarter | LastQuarter | NextYear | ThisYear | LastYear | YearToDate | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodJanuary | AllDatesInPeriodFebruary | AllDatesInPeriodMarch | AllDatesInPeriodApril | AllDatesInPeriodMay | AllDatesInPeriodJune | AllDatesInPeriodJuly | AllDatesInPeriodAugust | AllDatesInPeriodSeptember | AllDatesInPeriodOctober | AllDatesInPeriodNovember | AllDatesInPeriodDecember = js.native
  
  /**
    *
    * If true, filter *excludes* items that meet criteria. The default is false (filter to include items that meet criteria).
    *
    * [Api set: ExcelApi 1.12]
    */
  var exclusive: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The lower-bound of the range for the `Between` filter condition.
    *
    * [Api set: ExcelApi 1.12]
    */
  var lowerBound: js.UndefOr[FilterDatetime] = js.native
  
  /**
    *
    * The upper-bound of the range for the `Between` filter condition.
    *
    * [Api set: ExcelApi 1.12]
    */
  var upperBound: js.UndefOr[FilterDatetime] = js.native
  
  /**
    *
    * For `Equals`, `Before`, `After`, and `Between` filter conditions, indicates if comparisons should be made as whole days.
    *
    * [Api set: ExcelApi 1.12]
    */
  var wholeDays: js.UndefOr[Boolean] = js.native
}
object PivotDateFilter {
  
  @scala.inline
  def apply(
    condition: DateFilterCondition | Unknown_ | Equals | Before | BeforeOrEqualTo | After | AfterOrEqualTo | Between | Tomorrow | Today | Yesterday | NextWeek | ThisWeek | LastWeek | NextMonth | ThisMonth | LastMonth | NextQuarter | ThisQuarter | LastQuarter | NextYear | ThisYear | LastYear | YearToDate | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodJanuary | AllDatesInPeriodFebruary | AllDatesInPeriodMarch | AllDatesInPeriodApril | AllDatesInPeriodMay | AllDatesInPeriodJune | AllDatesInPeriodJuly | AllDatesInPeriodAugust | AllDatesInPeriodSeptember | AllDatesInPeriodOctober | AllDatesInPeriodNovember | AllDatesInPeriodDecember
  ): PivotDateFilter = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotDateFilter]
  }
  
  @scala.inline
  implicit class PivotDateFilterMutableBuilder[Self <: PivotDateFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparator(value: FilterDatetime): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    @scala.inline
    def setCondition(
      value: DateFilterCondition | Unknown_ | Equals | Before | BeforeOrEqualTo | After | AfterOrEqualTo | Between | Tomorrow | Today | Yesterday | NextWeek | ThisWeek | LastWeek | NextMonth | ThisMonth | LastMonth | NextQuarter | ThisQuarter | LastQuarter | NextYear | ThisYear | LastYear | YearToDate | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodJanuary | AllDatesInPeriodFebruary | AllDatesInPeriodMarch | AllDatesInPeriodApril | AllDatesInPeriodMay | AllDatesInPeriodJune | AllDatesInPeriodJuly | AllDatesInPeriodAugust | AllDatesInPeriodSeptember | AllDatesInPeriodOctober | AllDatesInPeriodNovember | AllDatesInPeriodDecember
    ): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    @scala.inline
    def setLowerBound(value: FilterDatetime): Self = StObject.set(x, "lowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerBoundUndefined: Self = StObject.set(x, "lowerBound", js.undefined)
    
    @scala.inline
    def setUpperBound(value: FilterDatetime): Self = StObject.set(x, "upperBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperBoundUndefined: Self = StObject.set(x, "upperBound", js.undefined)
    
    @scala.inline
    def setWholeDays(value: Boolean): Self = StObject.set(x, "wholeDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWholeDaysUndefined: Self = StObject.set(x, "wholeDays", js.undefined)
  }
}
