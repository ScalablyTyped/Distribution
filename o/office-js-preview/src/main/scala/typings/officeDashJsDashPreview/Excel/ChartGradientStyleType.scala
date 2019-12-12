package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.ChartGradientStyleType.extremeValue
import typings.officeDashJsDashPreview.Excel.ChartGradientStyleType.number
import typings.officeDashJsDashPreview.Excel.ChartGradientStyleType.percent
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartGradientStyleType with String] = js.native
  /* "ExtremeValue" */ @js.native
  object extremeValue extends TopLevel[extremeValue with String]
  
  /* "Number" */ @js.native
  object number extends TopLevel[number with String]
  
  /* "Percent" */ @js.native
  object percent extends TopLevel[percent with String]
  
}

