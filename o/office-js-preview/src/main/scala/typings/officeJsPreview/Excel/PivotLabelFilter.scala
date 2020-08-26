package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.BeginsWith
import typings.officeJsPreview.officeJsPreviewStrings.Between
import typings.officeJsPreview.officeJsPreviewStrings.Contains
import typings.officeJsPreview.officeJsPreviewStrings.EndsWith
import typings.officeJsPreview.officeJsPreviewStrings.Equals
import typings.officeJsPreview.officeJsPreviewStrings.GreaterThan
import typings.officeJsPreview.officeJsPreviewStrings.GreaterThanOrEqualTo
import typings.officeJsPreview.officeJsPreviewStrings.LessThan
import typings.officeJsPreview.officeJsPreviewStrings.LessThanOrEqualTo
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Configurable template for a label filter to apply to a PivotField.
  The `condition` defines what criteria need to be set in order for the filter to operate.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait PivotLabelFilter extends js.Object {
  /**
    *
    * The comparator is the static value to which other values are compared. The type of comparison is defined by the condition.
    Note: A numeric string is treated as a number when being compared against other numeric strings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var comparator: js.UndefOr[String] = js.native
  /**
    *
    * Specifies the condition for the filter, which defines the necessary filtering criteria.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var condition: LabelFilterCondition | Unknown_ | Equals | BeginsWith | EndsWith | Contains | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between = js.native
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
    * The lower-bound of the range for the Between filter condition.
    Note: A numeric string is treated as a number when being compared against other numeric strings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var lowerBound: js.UndefOr[String] = js.native
  /**
    *
    * The substring used for `BeginsWith`, `EndsWith`, and `Contains` filter conditions.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var substring: js.UndefOr[String] = js.native
  /**
    *
    * The upper-bound of the range for the Between filter condition.
    Note: A numeric string is treated as a number when being compared against other numeric strings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var upperBound: js.UndefOr[String] = js.native
}

object PivotLabelFilter {
  @scala.inline
  def apply(
    condition: LabelFilterCondition | Unknown_ | Equals | BeginsWith | EndsWith | Contains | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between
  ): PivotLabelFilter = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotLabelFilter]
  }
  @scala.inline
  implicit class PivotLabelFilterOps[Self <: PivotLabelFilter] (val x: Self) extends AnyVal {
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
      value: LabelFilterCondition | Unknown_ | Equals | BeginsWith | EndsWith | Contains | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between
    ): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def setComparator(value: String): Self = this.set("comparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusive: Self = this.set("exclusive", js.undefined)
    @scala.inline
    def setLowerBound(value: String): Self = this.set("lowerBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowerBound: Self = this.set("lowerBound", js.undefined)
    @scala.inline
    def setSubstring(value: String): Self = this.set("substring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubstring: Self = this.set("substring", js.undefined)
    @scala.inline
    def setUpperBound(value: String): Self = this.set("upperBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpperBound: Self = this.set("upperBound", js.undefined)
  }
  
}

