package typings.officeJsPreview.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the type of the binding object that should be returned.
  */
@JSGlobal("Office.BindingType")
@js.native
object BindingType extends js.Object {
  /* 1 */ val Matrix: typings.officeJsPreview.Office.BindingType.Matrix with Double = js.native
  /* 2 */ val Table: typings.officeJsPreview.Office.BindingType.Table with Double = js.native
  /* 0 */ val Text: typings.officeJsPreview.Office.BindingType.Text with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJsPreview.Office.BindingType with Double] = js.native
}

