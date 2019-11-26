package typings.officeDashJs.Excel

import typings.officeDashJs.officeDashJsStrings.DifferenceFrom
import typings.officeDashJs.officeDashJsStrings.Index
import typings.officeDashJs.officeDashJsStrings.None
import typings.officeDashJs.officeDashJsStrings.PercentDifferenceFrom
import typings.officeDashJs.officeDashJsStrings.PercentOf
import typings.officeDashJs.officeDashJsStrings.PercentOfColumnTotal
import typings.officeDashJs.officeDashJsStrings.PercentOfGrandTotal
import typings.officeDashJs.officeDashJsStrings.PercentOfParentColumnTotal
import typings.officeDashJs.officeDashJsStrings.PercentOfParentRowTotal
import typings.officeDashJs.officeDashJsStrings.PercentOfParentTotal
import typings.officeDashJs.officeDashJsStrings.PercentOfRowTotal
import typings.officeDashJs.officeDashJsStrings.PercentRunningTotal
import typings.officeDashJs.officeDashJsStrings.RankAscending
import typings.officeDashJs.officeDashJsStrings.RankDecending
import typings.officeDashJs.officeDashJsStrings.RunningTotal
import typings.officeDashJs.officeDashJsStrings.Unknown_
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

