package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.DifferenceFrom
import typings.officeJs.officeJsStrings.Index
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.PercentDifferenceFrom
import typings.officeJs.officeJsStrings.PercentOf
import typings.officeJs.officeJsStrings.PercentOfColumnTotal
import typings.officeJs.officeJsStrings.PercentOfGrandTotal
import typings.officeJs.officeJsStrings.PercentOfParentColumnTotal
import typings.officeJs.officeJsStrings.PercentOfParentRowTotal
import typings.officeJs.officeJsStrings.PercentOfParentTotal
import typings.officeJs.officeJsStrings.PercentOfRowTotal
import typings.officeJs.officeJsStrings.PercentRunningTotal
import typings.officeJs.officeJsStrings.RankAscending
import typings.officeJs.officeJsStrings.RankDecending
import typings.officeJs.officeJsStrings.RunningTotal
import typings.officeJs.officeJsStrings.Unknown_
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

