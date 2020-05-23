package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Specifies the search direction.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.SearchDirection")
@js.native
object SearchDirection extends js.Object {
  /* "Backwards" */ val backwards: typings.officeJs.Excel.SearchDirection.backwards with String = js.native
  /* "Forward" */ val forward: typings.officeJs.Excel.SearchDirection.forward with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.SearchDirection with String] = js.native
}

