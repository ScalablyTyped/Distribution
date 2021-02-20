package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the gradient style type of a chart series. This is only applicable for region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartGradientStyleType")
@js.native
object ChartGradientStyleType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ChartGradientStyleType with String] = js.native
  
  /* "ExtremeValue" */ val extremeValue: typings.officeJs.Excel.ChartGradientStyleType.extremeValue with String = js.native
  
  /* "Number" */ val number: typings.officeJs.Excel.ChartGradientStyleType.number with String = js.native
  
  /* "Percent" */ val percent: typings.officeJs.Excel.ChartGradientStyleType.percent with String = js.native
}
