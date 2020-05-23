package typings.officeJsPreview.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies whether the document in the associated application is read-only or read-write.
  *
  * @remarks
  *
  * Returned by the mode property of the {@link Office.Document | Document} object.
  */
@JSGlobal("Office.DocumentMode")
@js.native
object DocumentMode extends js.Object {
  /* 0 */ val ReadOnly: typings.officeJsPreview.Office.DocumentMode.ReadOnly with Double = js.native
  /* 1 */ val ReadWrite: typings.officeJsPreview.Office.DocumentMode.ReadWrite with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJsPreview.Office.DocumentMode with Double] = js.native
}

