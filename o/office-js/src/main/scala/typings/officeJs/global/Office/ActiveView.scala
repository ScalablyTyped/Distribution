package typings.officeJs.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Enumerations
/**
  * Specifies the state of the active view of the document, for example, whether the user can edit the document.
  */
@JSGlobal("Office.ActiveView")
@js.native
object ActiveView extends js.Object {
  /* 1 */ val Edit: typings.officeJs.Office.ActiveView.Edit with Double = js.native
  /* 0 */ val Read: typings.officeJs.Office.ActiveView.Read with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJs.Office.ActiveView with Double] = js.native
}

