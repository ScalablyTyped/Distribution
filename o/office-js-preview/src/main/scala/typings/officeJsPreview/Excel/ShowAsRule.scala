package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.DifferenceFrom
import typings.officeJsPreview.officeJsPreviewStrings.Index
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.PercentDifferenceFrom
import typings.officeJsPreview.officeJsPreviewStrings.PercentOf
import typings.officeJsPreview.officeJsPreviewStrings.PercentOfColumnTotal
import typings.officeJsPreview.officeJsPreviewStrings.PercentOfGrandTotal
import typings.officeJsPreview.officeJsPreviewStrings.PercentOfParentColumnTotal
import typings.officeJsPreview.officeJsPreviewStrings.PercentOfParentRowTotal
import typings.officeJsPreview.officeJsPreviewStrings.PercentOfParentTotal
import typings.officeJsPreview.officeJsPreviewStrings.PercentOfRowTotal
import typings.officeJsPreview.officeJsPreviewStrings.PercentRunningTotal
import typings.officeJsPreview.officeJsPreviewStrings.RankAscending
import typings.officeJsPreview.officeJsPreviewStrings.RankDecending
import typings.officeJsPreview.officeJsPreviewStrings.RunningTotal
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
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

