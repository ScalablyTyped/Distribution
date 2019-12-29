package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisScaleType extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisScaleType")
@js.native
object ChartAxisScaleType extends js.Object {
  @js.native
  sealed trait linear extends ChartAxisScaleType
  
  @js.native
  sealed trait logarithmic extends ChartAxisScaleType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartAxisScaleType with String] = js.native
  /* "Linear" */ @js.native
  object linear extends TopLevel[linear with String]
  
  /* "Logarithmic" */ @js.native
  object logarithmic extends TopLevel[logarithmic with String]
  
}

