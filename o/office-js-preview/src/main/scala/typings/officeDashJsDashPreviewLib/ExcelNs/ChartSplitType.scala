package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartSplitType extends js.Object

/**
     * [Api set: ExcelApi 1.8]
     */
@JSGlobal("Excel.ChartSplitType")
@js.native
object ChartSplitType extends js.Object {
  @js.native
  sealed trait splitByCustomSplit
    extends officeDashJsDashPreviewLib.ExcelNs.ChartSplitType
  
  @js.native
  sealed trait splitByPercentValue
    extends officeDashJsDashPreviewLib.ExcelNs.ChartSplitType
  
  @js.native
  sealed trait splitByPosition
    extends officeDashJsDashPreviewLib.ExcelNs.ChartSplitType
  
  @js.native
  sealed trait splitByValue
    extends officeDashJsDashPreviewLib.ExcelNs.ChartSplitType
  
  /* "SplitByCustomSplit" */ val splitByCustomSplit: splitByCustomSplit with java.lang.String = js.native
  /* "SplitByPercentValue" */ val splitByPercentValue: splitByPercentValue with java.lang.String = js.native
  /* "SplitByPosition" */ val splitByPosition: splitByPosition with java.lang.String = js.native
  /* "SplitByValue" */ val splitByValue: splitByValue with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ChartSplitType with java.lang.String] = js.native
}

