package typings.officeJsPreview.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Enumerations
/**
  * Specifies the state of the active view of the document, for example, whether the user can edit the document.
  */
@JSGlobal("Office.ActiveView")
@js.native
object ActiveView extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJsPreview.Office.ActiveView with Double] = js.native
  
  /* 1 */ val Edit: typings.officeJsPreview.Office.ActiveView.Edit with Double = js.native
  
  /* 0 */ val Read: typings.officeJsPreview.Office.ActiveView.Read with Double = js.native
}
