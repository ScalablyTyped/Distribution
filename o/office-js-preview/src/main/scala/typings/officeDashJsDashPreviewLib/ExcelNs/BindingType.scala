package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  sealed trait range
    extends officeDashJsDashPreviewLib.ExcelNs.BindingType
  
  @js.native
  sealed trait table
    extends officeDashJsDashPreviewLib.ExcelNs.BindingType
  
  @js.native
  sealed trait text
    extends officeDashJsDashPreviewLib.ExcelNs.BindingType
  
  /* "Range" */ val range: range with java.lang.String = js.native
  /* "Table" */ val table: table with java.lang.String = js.native
  /* "Text" */ val text: text with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.BindingType with java.lang.String] = js.native
}

