package typings.officeJsPreview.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies whether the add-in was just inserted or was already contained in the document.
  */
@JSGlobal("Office.InitializationReason")
@js.native
object InitializationReason extends js.Object {
  /* 1 */ val DocumentOpened: typings.officeJsPreview.Office.InitializationReason.DocumentOpened with Double = js.native
  /* 0 */ val Inserted: typings.officeJsPreview.Office.InitializationReason.Inserted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJsPreview.Office.InitializationReason with Double] = js.native
}

