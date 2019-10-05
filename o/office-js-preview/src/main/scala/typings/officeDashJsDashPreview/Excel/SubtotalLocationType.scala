package typings.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubtotalLocationType extends js.Object

/**
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.SubtotalLocationType")
@js.native
object SubtotalLocationType extends js.Object {
  /**
    *
    * Subtotals are at the bottom.
    *
    */
  @js.native
  sealed trait atBottom extends SubtotalLocationType
  
  /**
    *
    * Subtotals are at the top.
    *
    */
  @js.native
  sealed trait atTop extends SubtotalLocationType
  
  /**
    *
    * Subtotals are off.
    *
    */
  @js.native
  sealed trait off extends SubtotalLocationType
  
  /* "AtBottom" */ val atBottom: typings.officeDashJsDashPreview.Excel.SubtotalLocationType.atBottom with String = js.native
  /* "AtTop" */ val atTop: typings.officeDashJsDashPreview.Excel.SubtotalLocationType.atTop with String = js.native
  /* "Off" */ val off: typings.officeDashJsDashPreview.Excel.SubtotalLocationType.off with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SubtotalLocationType with String] = js.native
}

