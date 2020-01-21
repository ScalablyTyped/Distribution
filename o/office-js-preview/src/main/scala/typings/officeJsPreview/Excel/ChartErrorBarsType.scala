package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartErrorBarsType extends js.Object

/**
  *
  * Represents the range type for error bars.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartErrorBarsType")
@js.native
object ChartErrorBarsType extends js.Object {
  @js.native
  sealed trait custom extends ChartErrorBarsType
  
  @js.native
  sealed trait fixedValue extends ChartErrorBarsType
  
  @js.native
  sealed trait percent extends ChartErrorBarsType
  
  @js.native
  sealed trait stDev extends ChartErrorBarsType
  
  @js.native
  sealed trait stError extends ChartErrorBarsType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartErrorBarsType with String] = js.native
  /* "Custom" */ @js.native
  object custom extends TopLevel[custom with String]
  
  /* "FixedValue" */ @js.native
  object fixedValue extends TopLevel[fixedValue with String]
  
  /* "Percent" */ @js.native
  object percent extends TopLevel[percent with String]
  
  /* "StDev" */ @js.native
  object stDev extends TopLevel[stDev with String]
  
  /* "StError" */ @js.native
  object stError extends TopLevel[stError with String]
  
}

