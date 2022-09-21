package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the type of the category axis.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisCategoryType")
@js.native
object ChartAxisCategoryType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ChartAxisCategoryType & String] = js.native
  
  /* "Automatic" */ val automatic: typings.officeJsPreview.Excel.ChartAxisCategoryType.automatic & String = js.native
  
  /* "DateAxis" */ val dateAxis: typings.officeJsPreview.Excel.ChartAxisCategoryType.dateAxis & String = js.native
  
  /* "TextAxis" */ val textAxis: typings.officeJsPreview.Excel.ChartAxisCategoryType.textAxis & String = js.native
}
