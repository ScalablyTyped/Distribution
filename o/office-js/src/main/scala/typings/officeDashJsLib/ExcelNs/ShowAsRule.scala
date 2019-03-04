package typings
package officeDashJsLib.ExcelNs

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
  var calculation: ShowAsCalculation | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.PercentOfGrandTotal | officeDashJsLib.officeDashJsLibStrings.PercentOfRowTotal | officeDashJsLib.officeDashJsLibStrings.PercentOfColumnTotal | officeDashJsLib.officeDashJsLibStrings.PercentOfParentRowTotal | officeDashJsLib.officeDashJsLibStrings.PercentOfParentColumnTotal | officeDashJsLib.officeDashJsLibStrings.PercentOfParentTotal | officeDashJsLib.officeDashJsLibStrings.PercentOf | officeDashJsLib.officeDashJsLibStrings.RunningTotal | officeDashJsLib.officeDashJsLibStrings.PercentRunningTotal | officeDashJsLib.officeDashJsLibStrings.DifferenceFrom | officeDashJsLib.officeDashJsLibStrings.PercentDifferenceFrom | officeDashJsLib.officeDashJsLibStrings.RankAscending | officeDashJsLib.officeDashJsLibStrings.RankDecending | officeDashJsLib.officeDashJsLibStrings.Index
}

object ShowAsRule {
  @scala.inline
  def apply(
    calculation: ShowAsCalculation | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.PercentOfGrandTotal | officeDashJsLib.officeDashJsLibStrings.PercentOfRowTotal | officeDashJsLib.officeDashJsLibStrings.PercentOfColumnTotal | officeDashJsLib.officeDashJsLibStrings.PercentOfParentRowTotal | officeDashJsLib.officeDashJsLibStrings.PercentOfParentColumnTotal | officeDashJsLib.officeDashJsLibStrings.PercentOfParentTotal | officeDashJsLib.officeDashJsLibStrings.PercentOf | officeDashJsLib.officeDashJsLibStrings.RunningTotal | officeDashJsLib.officeDashJsLibStrings.PercentRunningTotal | officeDashJsLib.officeDashJsLibStrings.DifferenceFrom | officeDashJsLib.officeDashJsLibStrings.PercentDifferenceFrom | officeDashJsLib.officeDashJsLibStrings.RankAscending | officeDashJsLib.officeDashJsLibStrings.RankDecending | officeDashJsLib.officeDashJsLibStrings.Index,
    baseField: PivotField = null,
    baseItem: PivotItem = null
  ): ShowAsRule = {
    val __obj = js.Dynamic.literal(calculation = calculation.asInstanceOf[js.Any])
    if (baseField != null) __obj.updateDynamic("baseField")(baseField)
    if (baseItem != null) __obj.updateDynamic("baseItem")(baseItem)
    __obj.asInstanceOf[ShowAsRule]
  }
}

