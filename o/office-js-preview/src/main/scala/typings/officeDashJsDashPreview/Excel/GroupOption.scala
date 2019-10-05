package typings.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GroupOption extends js.Object

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.GroupOption")
@js.native
object GroupOption extends js.Object {
  /**
    *
    * Group by columns.
    *
    */
  @js.native
  sealed trait byColumns extends GroupOption
  
  /**
    *
    * Group by rows.
    *
    */
  @js.native
  sealed trait byRows extends GroupOption
  
  /* "ByColumns" */ val byColumns: typings.officeDashJsDashPreview.Excel.GroupOption.byColumns with String = js.native
  /* "ByRows" */ val byRows: typings.officeDashJsDashPreview.Excel.GroupOption.byRows with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GroupOption with String] = js.native
}

