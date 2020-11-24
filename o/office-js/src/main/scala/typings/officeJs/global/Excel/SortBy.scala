package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the sort direction.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.SortBy")
@js.native
object SortBy extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.SortBy with String] = js.native
  
  /* "Ascending" */ val ascending: typings.officeJs.Excel.SortBy.ascending with String = js.native
  
  /* "Descending" */ val descending: typings.officeJs.Excel.SortBy.descending with String = js.native
}
