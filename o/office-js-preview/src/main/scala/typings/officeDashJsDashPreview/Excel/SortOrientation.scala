package typings.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortOrientation extends js.Object

/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.SortOrientation")
@js.native
object SortOrientation extends js.Object {
  @js.native
  sealed trait columns extends SortOrientation
  
  @js.native
  sealed trait rows extends SortOrientation
  
  /* "Columns" */ val columns: typings.officeDashJsDashPreview.Excel.SortOrientation.columns with String = js.native
  /* "Rows" */ val rows: typings.officeDashJsDashPreview.Excel.SortOrientation.rows with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SortOrientation with String] = js.native
}

