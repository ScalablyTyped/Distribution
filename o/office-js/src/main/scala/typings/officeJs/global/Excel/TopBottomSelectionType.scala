package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * A simple enum for Top/Bottom filters to select whether to filter by the top N or bottom N percent, number, or sum of values.
  *
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.TopBottomSelectionType")
@js.native
object TopBottomSelectionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.TopBottomSelectionType & String] = js.native
  
  /* "Items" */ val items: typings.officeJs.Excel.TopBottomSelectionType.items & String = js.native
  
  /* "Percent" */ val percent: typings.officeJs.Excel.TopBottomSelectionType.percent & String = js.native
  
  /* "Sum" */ val sum: typings.officeJs.Excel.TopBottomSelectionType.sum & String = js.native
}
