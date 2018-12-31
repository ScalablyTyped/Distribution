package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SheetVisibility extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.SheetVisibility")
@js.native
object SheetVisibility extends js.Object {
  @js.native
  sealed trait hidden
    extends officeDashJsLib.ExcelNs.SheetVisibility
  
  @js.native
  sealed trait veryHidden
    extends officeDashJsLib.ExcelNs.SheetVisibility
  
  @js.native
  sealed trait visible
    extends officeDashJsLib.ExcelNs.SheetVisibility
  
  /* "Hidden" */ val hidden: hidden with java.lang.String = js.native
  /* "VeryHidden" */ val veryHidden: veryHidden with java.lang.String = js.native
  /* "Visible" */ val visible: visible with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.SheetVisibility with java.lang.String] = js.native
}

