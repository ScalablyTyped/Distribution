package typings.officeDashJsDashPreview.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortOn extends js.Object

/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.SortOn")
@js.native
object SortOn extends js.Object {
  @js.native
  sealed trait cellColor extends SortOn
  
  @js.native
  sealed trait fontColor extends SortOn
  
  @js.native
  sealed trait icon extends SortOn
  
  @js.native
  sealed trait value extends SortOn
  
  /* "CellColor" */ val cellColor: typings.officeDashJsDashPreview.ExcelNs.SortOn.cellColor with String = js.native
  /* "FontColor" */ val fontColor: typings.officeDashJsDashPreview.ExcelNs.SortOn.fontColor with String = js.native
  /* "Icon" */ val icon: typings.officeDashJsDashPreview.ExcelNs.SortOn.icon with String = js.native
  /* "Value" */ val value: typings.officeDashJsDashPreview.ExcelNs.SortOn.value with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SortOn with String] = js.native
}

