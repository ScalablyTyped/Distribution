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
trait PivotValueFilter extends js.Object {
  /**
    *
    * The comparator is the static value to which other values are compared. The type of comparison is defined by the condition.
    For example, if comparator is "50" and condition is "GreaterThan", all item values that are not greater than 50 will be removed by the filter.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var comparator: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the condition for the filter, which defines the necessary filtering criteria.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var condition: ValueFilterCondition | Unknown_ | Equals | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between | TopN | BottomN
  /**
    *
    * If true, filter *excludes* items that meet criteria. The default is false (filter to include items that meet criteria).
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var exclusive: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The lower-bound of the range for the `Between` filter condition.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var lowerBound: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies if the filter is for the top/bottom N items, top/bottom N percent, or top/bottom N sum.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var selectionType: js.UndefOr[TopBottomSelectionType | Items | Percent | Sum] = js.undefined
  /**
    *
    * The "N" threshold number of items, percent, or sum to be filtered for a Top/Bottom filter condition.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var threshold: js.UndefOr[Double] = js.undefined
  /**
    *
    * The upper-bound of the range for the `Between` filter condition.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var upperBound: js.UndefOr[Double] = js.undefined
  /**
    *
    * Name of the chosen "value" in the field by which to filter.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var value: String
}

object PivotValueFilter {
  @scala.inline
  def apply(
    condition: ValueFilterCondition | Unknown_ | Equals | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between | TopN | BottomN,
    value: String,
    comparator: js.UndefOr[Double] = js.undefined,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    lowerBound: js.UndefOr[Double] = js.undefined,
    selectionType: TopBottomSelectionType | Items | Percent | Sum = null,
    threshold: js.UndefOr[Double] = js.undefined,
    upperBound: js.UndefOr[Double] = js.undefined
  ): PivotValueFilter = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(comparator)) __obj.updateDynamic("comparator")(comparator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lowerBound)) __obj.updateDynamic("lowerBound")(lowerBound.get.asInstanceOf[js.Any])
    if (selectionType != null) __obj.updateDynamic("selectionType")(selectionType.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(upperBound)) __obj.updateDynamic("upperBound")(upperBound.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotValueFilter]
  }
}

