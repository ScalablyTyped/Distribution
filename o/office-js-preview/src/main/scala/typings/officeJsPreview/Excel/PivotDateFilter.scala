package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.After
import typings.officeJsPreview.officeJsPreviewStrings.AfterOrEqualTo
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodApril
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodAugust
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodDecember
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodFebruary
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodJanuary
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodJuly
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodJune
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodMarch
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodMay
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodNovember
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodOctober
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodQuarter1
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodQuarter2
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodQuarter3
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodQuarter4
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodSeptember
import typings.officeJsPreview.officeJsPreviewStrings.Before
import typings.officeJsPreview.officeJsPreviewStrings.BeforeOrEqualTo
import typings.officeJsPreview.officeJsPreviewStrings.Between
import typings.officeJsPreview.officeJsPreviewStrings.Equals
import typings.officeJsPreview.officeJsPreviewStrings.LastMonth
import typings.officeJsPreview.officeJsPreviewStrings.LastQuarter
import typings.officeJsPreview.officeJsPreviewStrings.LastWeek
import typings.officeJsPreview.officeJsPreviewStrings.LastYear
import typings.officeJsPreview.officeJsPreviewStrings.NextMonth
import typings.officeJsPreview.officeJsPreviewStrings.NextQuarter
import typings.officeJsPreview.officeJsPreviewStrings.NextWeek
import typings.officeJsPreview.officeJsPreviewStrings.NextYear
import typings.officeJsPreview.officeJsPreviewStrings.ThisMonth
import typings.officeJsPreview.officeJsPreviewStrings.ThisQuarter
import typings.officeJsPreview.officeJsPreviewStrings.ThisWeek
import typings.officeJsPreview.officeJsPreviewStrings.ThisYear
import typings.officeJsPreview.officeJsPreviewStrings.Today
import typings.officeJsPreview.officeJsPreviewStrings.Tomorrow
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import typings.officeJsPreview.officeJsPreviewStrings.YearToDate
import typings.officeJsPreview.officeJsPreviewStrings.Yesterday
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
trait PivotDateFilter extends js.Object {
  
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
  implicit class PivotDateFilterOps[Self <: PivotDateFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCondition(
      value: DateFilterCondition | Unknown_ | Equals | Before | BeforeOrEqualTo | After | AfterOrEqualTo | Between | Tomorrow | Today | Yesterday | NextWeek | ThisWeek | LastWeek | NextMonth | ThisMonth | LastMonth | NextQuarter | ThisQuarter | LastQuarter | NextYear | ThisYear | LastYear | YearToDate | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodJanuary | AllDatesInPeriodFebruary | AllDatesInPeriodMarch | AllDatesInPeriodApril | AllDatesInPeriodMay | AllDatesInPeriodJune | AllDatesInPeriodJuly | AllDatesInPeriodAugust | AllDatesInPeriodSeptember | AllDatesInPeriodOctober | AllDatesInPeriodNovember | AllDatesInPeriodDecember
    ): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparator(value: FilterDatetime): Self = this.set("comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
    
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusive: Self = this.set("exclusive", js.undefined)
    
    @scala.inline
    def setLowerBound(value: FilterDatetime): Self = this.set("lowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerBound: Self = this.set("lowerBound", js.undefined)
    
    @scala.inline
    def setUpperBound(value: FilterDatetime): Self = this.set("upperBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpperBound: Self = this.set("upperBound", js.undefined)
    
    @scala.inline
    def setWholeDays(value: Boolean): Self = this.set("wholeDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWholeDays: Self = this.set("wholeDays", js.undefined)
  }
}
