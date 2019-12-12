package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.ChartSplitType.splitByCustomSplit
import typings.officeDashJsDashPreview.Excel.ChartSplitType.splitByPercentValue
import typings.officeDashJsDashPreview.Excel.ChartSplitType.splitByPosition
import typings.officeDashJsDashPreview.Excel.ChartSplitType.splitByValue
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
  sealed trait splitByCustomSplit extends ChartSplitType
  
  @js.native
  sealed trait splitByPercentValue extends ChartSplitType
  
  @js.native
  sealed trait splitByPosition extends ChartSplitType
  
  @js.native
  sealed trait splitByValue extends ChartSplitType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartSplitType with String] = js.native
  /* "SplitByCustomSplit" */ @js.native
  object splitByCustomSplit extends TopLevel[splitByCustomSplit with String]
  
  /* "SplitByPercentValue" */ @js.native
  object splitByPercentValue extends TopLevel[splitByPercentValue with String]
  
  /* "SplitByPosition" */ @js.native
  object splitByPosition extends TopLevel[splitByPosition with String]
  
  /* "SplitByValue" */ @js.native
  object splitByValue extends TopLevel[splitByValue with String]
  
}

