package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  var calculation: ShowAsCalculation | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PercentOfGrandTotal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PercentOfRowTotal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PercentOfColumnTotal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PercentOfParentRowTotal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PercentOfParentColumnTotal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PercentOfParentTotal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PercentOf | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RunningTotal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PercentRunningTotal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DifferenceFrom | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PercentDifferenceFrom | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RankAscending | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RankDecending | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Index
}

object ShowAsRule {
  @scala.inline
  def apply(
    calculation: ShowAsCalculation | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PercentOfGrandTotal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PercentOfRowTotal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PercentOfColumnTotal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PercentOfParentRowTotal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PercentOfParentColumnTotal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PercentOfParentTotal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PercentOf | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RunningTotal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PercentRunningTotal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DifferenceFrom | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PercentDifferenceFrom | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RankAscending | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RankDecending | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Index,
    baseField: PivotField = null,
    baseItem: PivotItem = null
  ): ShowAsRule = {
    val __obj = js.Dynamic.literal(calculation = calculation.asInstanceOf[js.Any])
    if (baseField != null) __obj.updateDynamic("baseField")(baseField)
    if (baseItem != null) __obj.updateDynamic("baseItem")(baseItem)
    __obj.asInstanceOf[ShowAsRule]
  }
}

