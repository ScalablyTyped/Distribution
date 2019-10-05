package typings.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SlicerSortType extends js.Object

/**
  *
  * Specifies the slicer sort behavior for Slicer.sortBy API.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.SlicerSortType")
@js.native
object SlicerSortType extends js.Object {
  /**
    *
    * Sort slicer items in ascending order by item captions.
    *
    */
  @js.native
  sealed trait ascending extends SlicerSortType
  
  /**
    *
    * Sort slicer items in the order provided by the data source.
    *
    */
  @js.native
  sealed trait dataSourceOrder extends SlicerSortType
  
  /**
    *
    * Sort slicer items in descending order by item captions.
    *
    */
  @js.native
  sealed trait descending extends SlicerSortType
  
  /* "Ascending" */ val ascending: typings.officeDashJsDashPreview.Excel.SlicerSortType.ascending with String = js.native
  /* "DataSourceOrder" */ val dataSourceOrder: typings.officeDashJsDashPreview.Excel.SlicerSortType.dataSourceOrder with String = js.native
  /* "Descending" */ val descending: typings.officeDashJsDashPreview.Excel.SlicerSortType.descending with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SlicerSortType with String] = js.native
}

