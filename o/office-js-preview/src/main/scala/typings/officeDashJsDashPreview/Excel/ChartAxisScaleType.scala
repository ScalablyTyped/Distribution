package typings.officeDashJsDashPreview.Excel

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
  
  /* "Linear" */ val linear: typings.officeDashJsDashPreview.Excel.ChartAxisScaleType.linear with String = js.native
  /* "Logarithmic" */ val logarithmic: typings.officeDashJsDashPreview.Excel.ChartAxisScaleType.logarithmic with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartAxisScaleType with String] = js.native
}

