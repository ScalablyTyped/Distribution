package typings.officeJsPreview.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies the type of the category axis.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisCategoryType")
@js.native
object ChartAxisCategoryType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ChartAxisCategoryType with String] = js.native
  
  /* "Automatic" */ val automatic: typings.officeJsPreview.Excel.ChartAxisCategoryType.automatic with String = js.native
  
  /* "DateAxis" */ val dateAxis: typings.officeJsPreview.Excel.ChartAxisCategoryType.dateAxis with String = js.native
  
  /* "TextAxis" */ val textAxis: typings.officeJsPreview.Excel.ChartAxisCategoryType.textAxis with String = js.native
}
