package typings.officeDashJsDashPreview.ExcelNs

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
  sealed trait asDisplayed extends PrintErrorType
  
  @js.native
  sealed trait blank extends PrintErrorType
  
  @js.native
  sealed trait dash extends PrintErrorType
  
  @js.native
  sealed trait notAvailable extends PrintErrorType
  
  /* "AsDisplayed" */ val asDisplayed: typings.officeDashJsDashPreview.ExcelNs.PrintErrorType.asDisplayed with String = js.native
  /* "Blank" */ val blank: typings.officeDashJsDashPreview.ExcelNs.PrintErrorType.blank with String = js.native
  /* "Dash" */ val dash: typings.officeDashJsDashPreview.ExcelNs.PrintErrorType.dash with String = js.native
  /* "NotAvailable" */ val notAvailable: typings.officeDashJsDashPreview.ExcelNs.PrintErrorType.notAvailable with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PrintErrorType with String] = js.native
}

