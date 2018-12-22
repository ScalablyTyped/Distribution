package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  sealed trait workbook
    extends officeDashJsDashPreviewLib.ExcelNs.NamedItemScope
  
  @js.native
  sealed trait worksheet
    extends officeDashJsDashPreviewLib.ExcelNs.NamedItemScope
  
  /* "Workbook" */ val workbook: workbook with java.lang.String = js.native
  /* "Worksheet" */ val worksheet: worksheet with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.NamedItemScope with java.lang.String] = js.native
}

