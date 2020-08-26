package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.Between
import typings.officeJsPreview.officeJsPreviewStrings.BottomN
import typings.officeJsPreview.officeJsPreviewStrings.Equals
import typings.officeJsPreview.officeJsPreviewStrings.GreaterThan
import typings.officeJsPreview.officeJsPreviewStrings.GreaterThanOrEqualTo
import typings.officeJsPreview.officeJsPreviewStrings.Items
import typings.officeJsPreview.officeJsPreviewStrings.LessThan
import typings.officeJsPreview.officeJsPreviewStrings.LessThanOrEqualTo
import typings.officeJsPreview.officeJsPreviewStrings.Percent
import typings.officeJsPreview.officeJsPreviewStrings.Sum
import typings.officeJsPreview.officeJsPreviewStrings.TopN
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Configurable template for a value filter to apply to a PivotField.
  The `condition` defines what criteria need to be set in order for the filter to operate.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait PivotValueFilter extends js.Object {
  /**
    *
    * The comparator is the static value to which other values are compared. The type of comparison is defined by the condition.
    For example, if comparator is "50" and condition is "GreaterThan", all item values that are not greater than 50 will be removed by the filter.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var comparator: js.UndefOr[Double] = js.native
  /**
    *
    * Specifies the condition for the filter, which defines the necessary filtering criteria.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var condition: ValueFilterCondition | Unknown_ | Equals | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between | TopN | BottomN = js.native
  /**
    *
    * If true, filter *excludes* items that meet criteria. The default is false (filter to include items that meet criteria).
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var exclusive: js.UndefOr[Boolean] = js.native
  /**
    *
    * The lower-bound of the range for the `Between` filter condition.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var lowerBound: js.UndefOr[Double] = js.native
  /**
    *
    * Specifies if the filter is for the top/bottom N items, top/bottom N percent, or top/bottom N sum.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var selectionType: js.UndefOr[TopBottomSelectionType | Items | Percent | Sum] = js.native
  /**
    *
    * The "N" threshold number of items, percent, or sum to be filtered for a Top/Bottom filter condition.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var threshold: js.UndefOr[Double] = js.native
  /**
    *
    * The upper-bound of the range for the `Between` filter condition.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var upperBound: js.UndefOr[Double] = js.native
  /**
    *
    * Name of the chosen "value" in the field by which to filter.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var value: String = js.native
}

object PivotValueFilter {
  @scala.inline
  def apply(
    condition: ValueFilterCondition | Unknown_ | Equals | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between | TopN | BottomN,
    value: String
  ): PivotValueFilter = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotValueFilter]
  }
  @scala.inline
  implicit class PivotValueFilterOps[Self <: PivotValueFilter] (val x: Self) extends AnyVal {
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
      value: ValueFilterCondition | Unknown_ | Equals | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between | TopN | BottomN
    ): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setComparator(value: Double): Self = this.set("comparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusive: Self = this.set("exclusive", js.undefined)
    @scala.inline
    def setLowerBound(value: Double): Self = this.set("lowerBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowerBound: Self = this.set("lowerBound", js.undefined)
    @scala.inline
    def setSelectionType(value: TopBottomSelectionType | Items | Percent | Sum): Self = this.set("selectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionType: Self = this.set("selectionType", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    @scala.inline
    def setUpperBound(value: Double): Self = this.set("upperBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpperBound: Self = this.set("upperBound", js.undefined)
  }
  
}

