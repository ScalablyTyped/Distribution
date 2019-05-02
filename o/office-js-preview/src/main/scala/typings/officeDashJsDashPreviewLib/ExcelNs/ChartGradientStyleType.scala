package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  sealed trait extremeValue
    extends officeDashJsDashPreviewLib.ExcelNs.ChartGradientStyleType
  
  @js.native
  sealed trait number
    extends officeDashJsDashPreviewLib.ExcelNs.ChartGradientStyleType
  
  @js.native
  sealed trait percent
    extends officeDashJsDashPreviewLib.ExcelNs.ChartGradientStyleType
  
  /* "ExtremeValue" */ val extremeValue: extremeValue with java.lang.String = js.native
  /* "Number" */ val number: number with java.lang.String = js.native
  /* "Percent" */ val percent: percent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ChartGradientStyleType with java.lang.String] = js.native
}

