package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartParentLabelStrategy extends js.Object

/**
  *
  * Represents the parent label strategy of the chart series layout. This only applies to treemap charts
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartParentLabelStrategy")
@js.native
object ChartParentLabelStrategy extends js.Object {
  @js.native
  sealed trait banner extends ChartParentLabelStrategy
  
  @js.native
  sealed trait none extends ChartParentLabelStrategy
  
  @js.native
  sealed trait overlapping extends ChartParentLabelStrategy
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartParentLabelStrategy with String] = js.native
  /* "Banner" */ @js.native
  object banner extends TopLevel[banner with String]
  
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "Overlapping" */ @js.native
  object overlapping extends TopLevel[overlapping with String]
  
}

