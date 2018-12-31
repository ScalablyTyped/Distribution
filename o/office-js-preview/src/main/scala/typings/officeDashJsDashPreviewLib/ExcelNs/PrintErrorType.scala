package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintErrorType extends js.Object

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.PrintErrorType")
@js.native
object PrintErrorType extends js.Object {
  @js.native
  sealed trait asDisplayed
    extends officeDashJsDashPreviewLib.ExcelNs.PrintErrorType
  
  @js.native
  sealed trait blank
    extends officeDashJsDashPreviewLib.ExcelNs.PrintErrorType
  
  @js.native
  sealed trait dash
    extends officeDashJsDashPreviewLib.ExcelNs.PrintErrorType
  
  @js.native
  sealed trait notAvailable
    extends officeDashJsDashPreviewLib.ExcelNs.PrintErrorType
  
  /* "AsDisplayed" */ val asDisplayed: asDisplayed with java.lang.String = js.native
  /* "Blank" */ val blank: blank with java.lang.String = js.native
  /* "Dash" */ val dash: dash with java.lang.String = js.native
  /* "NotAvailable" */ val notAvailable: notAvailable with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.PrintErrorType with java.lang.String] = js.native
}

