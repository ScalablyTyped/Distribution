package typings.officeDashJsDashPreview.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NamedItemScope extends js.Object

/**
  * [Api set: ExcelApi 1.4]
  */
@JSGlobal("Excel.NamedItemScope")
@js.native
object NamedItemScope extends js.Object {
  @js.native
  sealed trait workbook extends NamedItemScope
  
  @js.native
  sealed trait worksheet extends NamedItemScope
  
  /* "Workbook" */ val workbook: typings.officeDashJsDashPreview.ExcelNs.NamedItemScope.workbook with String = js.native
  /* "Worksheet" */ val worksheet: typings.officeDashJsDashPreview.ExcelNs.NamedItemScope.worksheet with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NamedItemScope with String] = js.native
}

