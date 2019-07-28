package typings.officeDashJsDashPreview.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartGradientStyleType extends js.Object

/**
  *
  * Represents the gradient style type of a chart series. This is only applicable for region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartGradientStyleType")
@js.native
object ChartGradientStyleType extends js.Object {
  @js.native
  sealed trait extremeValue extends ChartGradientStyleType
  
  @js.native
  sealed trait number extends ChartGradientStyleType
  
  @js.native
  sealed trait percent extends ChartGradientStyleType
  
  /* "ExtremeValue" */ val extremeValue: typings.officeDashJsDashPreview.ExcelNs.ChartGradientStyleType.extremeValue with String = js.native
  /* "Number" */ val number: typings.officeDashJsDashPreview.ExcelNs.ChartGradientStyleType.number with String = js.native
  /* "Percent" */ val percent: typings.officeDashJsDashPreview.ExcelNs.ChartGradientStyleType.percent with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartGradientStyleType with String] = js.native
}

