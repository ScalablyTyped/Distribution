package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintErrorType extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PrintErrorType")
@js.native
object PrintErrorType extends js.Object {
  @js.native
  sealed trait asDisplayed
    extends officeDashJsLib.ExcelNs.PrintErrorType
  
  @js.native
  sealed trait blank
    extends officeDashJsLib.ExcelNs.PrintErrorType
  
  @js.native
  sealed trait dash
    extends officeDashJsLib.ExcelNs.PrintErrorType
  
  @js.native
  sealed trait notAvailable
    extends officeDashJsLib.ExcelNs.PrintErrorType
  
  /* "AsDisplayed" */ val asDisplayed: asDisplayed with java.lang.String = js.native
  /* "Blank" */ val blank: blank with java.lang.String = js.native
  /* "Dash" */ val dash: dash with java.lang.String = js.native
  /* "NotAvailable" */ val notAvailable: notAvailable with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.PrintErrorType with java.lang.String] = js.native
}

