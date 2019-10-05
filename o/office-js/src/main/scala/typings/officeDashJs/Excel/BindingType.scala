package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BindingType extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.BindingType")
@js.native
object BindingType extends js.Object {
  @js.native
  sealed trait range extends BindingType
  
  @js.native
  sealed trait table extends BindingType
  
  @js.native
  sealed trait text extends BindingType
  
  /* "Range" */ val range: typings.officeDashJs.Excel.BindingType.range with String = js.native
  /* "Table" */ val table: typings.officeDashJs.Excel.BindingType.table with String = js.native
  /* "Text" */ val text: typings.officeDashJs.Excel.BindingType.text with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BindingType with String] = js.native
}

