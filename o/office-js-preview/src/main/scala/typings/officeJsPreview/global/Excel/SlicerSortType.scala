package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.SlicerSortType with String] = js.native
  
  /* "Ascending" */ val ascending: typings.officeJsPreview.Excel.SlicerSortType.ascending with String = js.native
  
  /* "DataSourceOrder" */ val dataSourceOrder: typings.officeJsPreview.Excel.SlicerSortType.dataSourceOrder with String = js.native
  
  /* "Descending" */ val descending: typings.officeJsPreview.Excel.SlicerSortType.descending with String = js.native
}
