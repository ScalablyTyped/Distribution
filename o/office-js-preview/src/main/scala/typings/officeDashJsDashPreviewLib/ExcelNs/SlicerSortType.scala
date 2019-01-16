package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SlicerSortType extends js.Object

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.SlicerSortType")
@js.native
object SlicerSortType extends js.Object {
  @js.native
  sealed trait ascending
    extends officeDashJsDashPreviewLib.ExcelNs.SlicerSortType
  
  @js.native
  sealed trait dataSourceOrder
    extends officeDashJsDashPreviewLib.ExcelNs.SlicerSortType
  
  @js.native
  sealed trait descending
    extends officeDashJsDashPreviewLib.ExcelNs.SlicerSortType
  
  /* "Ascending" */ val ascending: ascending with java.lang.String = js.native
  /* "DataSourceOrder" */ val dataSourceOrder: dataSourceOrder with java.lang.String = js.native
  /* "Descending" */ val descending: descending with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.SlicerSortType with java.lang.String] = js.native
}

