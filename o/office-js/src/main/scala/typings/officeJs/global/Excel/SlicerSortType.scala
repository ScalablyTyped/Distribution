package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Specifies the slicer sort behavior for Slicer.sortBy API.
  *
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.SlicerSortType")
@js.native
object SlicerSortType extends js.Object {
  /* "Ascending" */ val ascending: typings.officeJs.Excel.SlicerSortType.ascending with String = js.native
  /* "DataSourceOrder" */ val dataSourceOrder: typings.officeJs.Excel.SlicerSortType.dataSourceOrder with String = js.native
  /* "Descending" */ val descending: typings.officeJs.Excel.SlicerSortType.descending with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.SlicerSortType with String] = js.native
}

