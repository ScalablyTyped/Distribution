package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * A simple enum that represents a type of filter for a PivotField.
  *
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.PivotFilterType")
@js.native
object PivotFilterType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.PivotFilterType with String] = js.native
  
  /* "Date" */ val date: typings.officeJs.Excel.PivotFilterType.date with String = js.native
  
  /* "Label" */ val label: typings.officeJs.Excel.PivotFilterType.label with String = js.native
  
  /* "Manual" */ val manual: typings.officeJs.Excel.PivotFilterType.manual with String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJs.Excel.PivotFilterType.unknown with String = js.native
  
  /* "Value" */ val value: typings.officeJs.Excel.PivotFilterType.value with String = js.native
}
