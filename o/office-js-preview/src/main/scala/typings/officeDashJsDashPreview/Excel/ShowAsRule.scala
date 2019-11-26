package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DifferenceFrom
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Index
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PercentDifferenceFrom
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PercentOf
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PercentOfColumnTotal
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PercentOfGrandTotal
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PercentOfParentColumnTotal
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PercentOfParentRowTotal
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PercentOfParentTotal
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PercentOfRowTotal
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PercentRunningTotal
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.RankAscending
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.RankDecending
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.RunningTotal
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: ExcelApi 1.8]
  */
trait ShowAsRule extends js.Object {
  /**
    *
    * The base PivotField to base the ShowAs calculation, if applicable based on the ShowAsCalculation type, else null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var baseField: js.UndefOr[PivotField] = js.undefined
  /**
    *
    * The base Item to base the ShowAs calculation on, if applicable based on the ShowAsCalculation type, else null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var baseItem: js.UndefOr[PivotItem] = js.undefined
  /**
    *
    * The ShowAs Calculation to use for the Data PivotField. See Excel.ShowAsCalculation for Details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var calculation: ShowAsCalculation | Unknown_ | None | PercentOfGrandTotal | PercentOfRowTotal | PercentOfColumnTotal | PercentOfParentRowTotal | PercentOfParentColumnTotal | PercentOfParentTotal | PercentOf | RunningTotal | PercentRunningTotal | DifferenceFrom | PercentDifferenceFrom | RankAscending | RankDecending | Index
}

object ShowAsRule {
  @scala.inline
  def apply(
    calculation: ShowAsCalculation | Unknown_ | None | PercentOfGrandTotal | PercentOfRowTotal | PercentOfColumnTotal | PercentOfParentRowTotal | PercentOfParentColumnTotal | PercentOfParentTotal | PercentOf | RunningTotal | PercentRunningTotal | DifferenceFrom | PercentDifferenceFrom | RankAscending | RankDecending | Index,
    baseField: PivotField = null,
    baseItem: PivotItem = null
  ): ShowAsRule = {
    val __obj = js.Dynamic.literal(calculation = calculation.asInstanceOf[js.Any])
    if (baseField != null) __obj.updateDynamic("baseField")(baseField.asInstanceOf[js.Any])
    if (baseItem != null) __obj.updateDynamic("baseItem")(baseItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowAsRule]
  }
}

