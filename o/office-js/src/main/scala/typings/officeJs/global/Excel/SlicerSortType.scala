package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies the slicer sort behavior for Slicer.sortBy API.
  *
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.SlicerSortType")
@js.native
object SlicerSortType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.SlicerSortType & String] = js.native
  
  /* "Ascending" */ val ascending: typings.officeJs.Excel.SlicerSortType.ascending & String = js.native
  
  /* "DataSourceOrder" */ val dataSourceOrder: typings.officeJs.Excel.SlicerSortType.dataSourceOrder & String = js.native
  
  /* "Descending" */ val descending: typings.officeJs.Excel.SlicerSortType.descending & String = js.native
}
