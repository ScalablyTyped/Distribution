package typings.officeDashJsDashPreview.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortDataOption extends js.Object

/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.SortDataOption")
@js.native
object SortDataOption extends js.Object {
  @js.native
  sealed trait normal extends SortDataOption
  
  @js.native
  sealed trait textAsNumber extends SortDataOption
  
  /* "Normal" */ val normal: typings.officeDashJsDashPreview.ExcelNs.SortDataOption.normal with String = js.native
  /* "TextAsNumber" */ val textAsNumber: typings.officeDashJsDashPreview.ExcelNs.SortDataOption.textAsNumber with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SortDataOption with String] = js.native
}

