package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalFormatDirection extends js.Object

/**
  *
  * Represents the direction for a selection.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatDirection")
@js.native
object ConditionalFormatDirection extends js.Object {
  @js.native
  sealed trait bottom extends ConditionalFormatDirection
  
  @js.native
  sealed trait top extends ConditionalFormatDirection
  
  /* "Bottom" */ val bottom: typings.officeDashJs.Excel.ConditionalFormatDirection.bottom with String = js.native
  /* "Top" */ val top: typings.officeDashJs.Excel.ConditionalFormatDirection.top with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalFormatDirection with String] = js.native
}

