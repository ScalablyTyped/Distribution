package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.ChartErrorBarsInclude.both
import typings.officeDashJsDashPreview.Excel.ChartErrorBarsInclude.minusValues
import typings.officeDashJsDashPreview.Excel.ChartErrorBarsInclude.plusValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartErrorBarsInclude extends js.Object

/**
  *
  * Represents which parts of the error bar to include.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartErrorBarsInclude")
@js.native
object ChartErrorBarsInclude extends js.Object {
  @js.native
  sealed trait both extends ChartErrorBarsInclude
  
  @js.native
  sealed trait minusValues extends ChartErrorBarsInclude
  
  @js.native
  sealed trait plusValues extends ChartErrorBarsInclude
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartErrorBarsInclude with String] = js.native
  /* "Both" */ @js.native
  object both extends TopLevel[both with String]
  
  /* "MinusValues" */ @js.native
  object minusValues extends TopLevel[minusValues with String]
  
  /* "PlusValues" */ @js.native
  object plusValues extends TopLevel[plusValues with String]
  
}

